package com.quelili.back.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
* @author  sekift
* @date 2018-06-22 11:32
* @desc
**/
@Data
@ApiModel(description="基础实例")
public class BaseEntity {
    /**
     * 当前页码
     */
    @ApiModelProperty(value = "当前页码", notes = "默认1", example = "1", position = 100)
    private Integer page = 1;
    /**
     * 每页行数
     */
    @ApiModelProperty(value = "每页行数", notes = "默认30", example = "30", position = 101)
    private Integer rows = 30;
}
