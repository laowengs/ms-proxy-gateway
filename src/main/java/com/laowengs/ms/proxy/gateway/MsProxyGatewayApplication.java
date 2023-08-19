package com.laowengs.ms.proxy.gateway;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableApolloConfig
public class MsProxyGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsProxyGatewayApplication.class, args);
    }

}
