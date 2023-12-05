package com.laowengs.ms.proxy.gateway.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 网关路由过滤器表
 * @TableName gateway_route_filter
 */
@TableName(value ="gateway_route_filter")
@Data
public class GatewayRouteFilter implements Serializable {
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
     * 过滤器名称
     */
    private String filterName;

    /**
     * 过滤器类型AddRequestParameter,StripPrefix等
     */
    private String filterType;

    /**
     * 过滤器参数
     */
    private String filterParam;

    /**
     * 过滤器参数
     */
    private String filterArg;

    /**
     * 是否全局过滤器：0否 1是
     */
    private Integer isGlobal;

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