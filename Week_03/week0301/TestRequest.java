package javacourse.nio.task.week0301;

/**
 * @program: java-course
 * @description:
 * @author: wangbo67@github.com
 * @created: 2021-01-31 01:03
 **/
public class TestRequest {
    private static final int port = 8089;

    // 测试步骤：1、启动后端 BackendServer -> 2、运行 TestRequest 启动 NettyHttpServer -> 浏览器输入 http://127.0.0.1:8089/hello
    public static void main(String[] args) {
        NettyHttpServer nettyHttpServer = new NettyHttpServer();
        nettyHttpServer.runServer(port);
    }
}