package javacourse.nio.task.week0302.gateway.filter;

import io.netty.handler.codec.http.FullHttpResponse;

/**
 * @program: java-course
 * @description:
 * @author: wangbo67@github.com
 * @created: 2021-01-31 01:45
 **/
public interface HttpResponseFilter {
    void filter(FullHttpResponse response);
}