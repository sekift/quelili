package com.quelili.back.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description="歌手总数信息")
public class QueSingerTotalVO extends BaseEntity {
    private String prefix;

    private Integer total;

    private Date createtime;

    private Date updatetime;

    private String remark;
}