package com.laowengs.ms.proxy.gateway.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.laowengs.ms.proxy.gateway.domain.GatewayRoutePredicate;
import com.laowengs.ms.proxy.gateway.service.GatewayRoutePredicateService;
import com.laowengs.ms.proxy.gateway.mapper.GatewayRoutePredicateMapper;
import org.springframework.stereotype.Service;

/**
* @author weng
* @description 针对表【gateway_route_predicate(网关路由断言表)】的数据库操作Service实现
* @createDate 2023-12-05 22:50:14
*/
@Service
public class GatewayRoutePredicateServiceImpl extends ServiceImpl<GatewayRoutePredicateMapper, GatewayRoutePredicate>
    implements GatewayRoutePredicateService{

}




