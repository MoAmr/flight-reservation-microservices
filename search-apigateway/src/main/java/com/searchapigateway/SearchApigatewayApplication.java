package com.searchapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class SearchApigatewayApplication {

    @Bean
    public CustomZuulFilter customZuulFilter() {
        return new CustomZuulFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(SearchApigatewayApplication.class, args);
    }

}
