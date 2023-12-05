package com.laowengs.ms.proxy.gateway.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 网关路由断言表
 * @TableName gateway_route_predicate
 */
@TableName(value ="gateway_route_predicate")
@Data
public class GatewayRoutePredicate implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 路由ID
     */
    private Long routeId;

    /**
     * 路由名称
     */
    private String routeName;

    /**
     * 断言名称
     */
    private String predicateName;

    /**
     * 断言类型Cookie,Header,Host,Path等
     */
    private String predicateType;

    /**
     * 断言参数
     */
    private String predicateParam;

    /**
     * 创建人
     */
    private String userCreate;

    /**
     * 创建时间
     */
    private Long timeCreate;

    /**
     * 修改人
     */
    private String userUpdate;

    /**
     * 修改时间
     */
    private Long timeUpdate;

    /**
     * 是否删除：0否 1是
     */
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}