package com.omlucy.chatper17product.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lucy
 * @date 2021/11/28
 */
@Configuration
public class RestTemplateConfig {
    @LoadBalanced
    @Bean("restTemplate")
    public RestTemplate initRestTemplate() {
        return new RestTemplate();
    }
}
