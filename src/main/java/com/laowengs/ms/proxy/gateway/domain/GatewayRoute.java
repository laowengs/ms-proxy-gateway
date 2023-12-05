package com.laowengs.ms.proxy.gateway.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 网关路由信息表
 * @TableName gateway_route
 */
@TableName(value ="gateway_route")
@Data
public class GatewayRoute implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 路由名称
     */
    private String routeName;

    /**
     * 路由顺序
     */
    private Integer routeOrder;

    /**
     * 路由路径
     */
    private String uri;

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