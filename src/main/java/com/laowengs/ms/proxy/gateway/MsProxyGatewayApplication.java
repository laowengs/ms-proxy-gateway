package com.laowengs.ms.proxy.gateway;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableApolloConfig
@MapperScan({"com.laowengs.ms.proxy.gateway"})
public class MsProxyGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsProxyGatewayApplication.class, args);
    }

}
