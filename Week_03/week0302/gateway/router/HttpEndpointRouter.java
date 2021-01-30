package javacourse.nio.task.week0302.gateway.router;

import java.util.List;

/**
 * @program: java-course
 * @description:
 * @author: wangbo67@github.com
 * @created: 2021-01-31 01:50
 **/
public interface HttpEndpointRouter {
    String route(List<String> endpoints);
    // Load Balance
    // Random
    // RoundRibbon
    // Weight
    // - server01,20
    // - server02,30
    // - server03,50
}