package com.hh.libsemreserve.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author 黄华
 * @since 2024-02-06 12:00:00
 */
@Data
@Accessors(chain = true)
@TableName("repairrequest")
@ApiModel(value = "Repairrequest对象", description = "")
public class Repairrequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("userId")
    private Integer userId;

    @TableField("roomId")
    private Integer roomId;

    @TableField("time")
    private Date time;

    @TableField("content")
    private String content;

    @TableField("state")
    private String state;


}
