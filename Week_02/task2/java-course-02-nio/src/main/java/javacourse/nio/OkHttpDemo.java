package javacourse.nio;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.ResponseBody;

import java.io.IOException;

/**
 * @program: java-course
 * @description:
 * @author: wangbo67@github.com
 * @created: 2021-01-24 02:22
 **/
public class OkHttpDemo {
    private final static String url = "http://localhost:8801";

    public static void main(String[] args) {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().get().url(url).build();
        Call call = okHttpClient.newCall(request);
        try {
            ResponseBody responseBody = call.execute().body();
            System.out.println(responseBody.string()) ;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}