package javacourse.nio.task.week0302.gateway.filter;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;

/**
 * @program: java-course
 * @description:
 * @author: wangbo67@github.com
 * @created: 2021-01-31 01:43
 **/
public class HeaderHttpRequestFilter implements HttpRequestFilter {
    @Override
    public void filter(FullHttpRequest fullRequest, ChannelHandlerContext ctx) {
        if (!fullRequest.uri().contains("/api")) {
            throw new RuntimeException("地址错误");
        }

        fullRequest.headers().set("gateway-type", "netty");
    }
}