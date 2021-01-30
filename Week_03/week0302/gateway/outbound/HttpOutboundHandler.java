package javacourse.nio.task.week0302.gateway.outbound;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;
import javacourse.nio.task.week0302.gateway.filter.HttpRequestFilter;

import java.util.List;

/**
 * @program: java-course
 * @description:
 * @author: wangbo67@github.com
 * @created: 2021-01-31 01:43
 **/
public class HttpOutboundHandler {
    private List<String> proxyServer;

    public HttpOutboundHandler(List<String> proxyServer) {
        this.proxyServer = proxyServer;
    }

    public void handle(FullHttpRequest fullRequest, ChannelHandlerContext ctx, HttpRequestFilter filter) {

        System.out.println(fullRequest.headers().get("gateway-type"));
    }
}