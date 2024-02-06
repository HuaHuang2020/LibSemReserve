package com.hh.libsemreserve.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
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
@TableName("news")
@ApiModel(value = "News对象", description = "")
public class News implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("title")
    private String title;

    @TableField("content")
    private String content;

    @TableField("publishTime")
    //想用本地时间，所以用LocalDateTime，试试行不行
    private LocalDateTime publishTime;

    @TableField("publisher")
    private String publisher;

    @TableField("isOnTop")
    private Boolean isOnTop;


}
