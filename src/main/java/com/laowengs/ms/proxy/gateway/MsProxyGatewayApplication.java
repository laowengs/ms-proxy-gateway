package com.laowengs.ms.proxy.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsProxyGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsProxyGatewayApplication.class, args);
    }

}
