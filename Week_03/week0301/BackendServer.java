package javacourse.nio.task.week0301;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @program: java-course
 * @description:
 * @author: wangbo67@github.com
 * @created: 2021-01-30 23:57
 **/
public class BackendServer {
    private static final Integer PORT = 8088;

    // 运行标志位
    public static final AtomicBoolean RunningFlag = new AtomicBoolean(true);

    public static void main(String[] args) throws IOException {
        ExecutorService executorService =
                Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() + 2);
        final ServerSocket serverSocket = new ServerSocket(PORT);
        while (RunningFlag.get()) {
            final Socket socket = serverSocket.accept();
            executorService.execute(() -> service(socket));
        }

        serverSocket.close();
        executorService.shutdown();

    }

    private static void service(Socket socket) {
        // TODO - 接收报文-解析Http头
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            InputStream inputStream = socket.getInputStream();
            byte[] buffer = new byte[8 * 1024];
            int len = inputStream.read(buffer);
            outputStream.write(buffer, 0, len);
            byte[] input = outputStream.toByteArray();
            String inputContent = new String(input, "UTF-8");
            System.out.println("BackendServer收到请求: " + inputContent);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println("HTTP/1.1 200 OK");
            printWriter.println("Content-Type:text/html;charset=utf-8");
            String body = "hello,nio";
            printWriter.println("Content-Length:" + body.getBytes().length);
            printWriter.println();
            printWriter.write(body);
            printWriter.flush();
            printWriter.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
