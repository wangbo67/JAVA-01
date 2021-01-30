package javacourse.nio.task.week0302.gateway.filter;

import io.netty.handler.codec.http.FullHttpResponse;

/**
 * @program: java-course
 * @description:
 * @author: wangbo67@github.com
 * @created: 2021-01-31 01:46
 **/
public class HeaderHttpResponseFilter implements HttpResponseFilter {
    @Override
    public void filter(FullHttpResponse response) {
        response.headers().set("gateway", "gateway-netty");
    }
}