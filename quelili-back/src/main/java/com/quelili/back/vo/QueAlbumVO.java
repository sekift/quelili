package com.quelili.back.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description="专辑信息")
public class QueAlbumVO extends BaseEntity {

    private Integer albumid;

    private String albumname;

    private Integer artistid;

    private String artistname;

    private Byte isstar;

    private Integer pay;

    private String pic;

    private String language;

    private String releasedate;

    private String albuminfo;

    private String cururl;

    @ApiModelProperty(required = false, name="createtime", dataType = "date", value = "时间（yyyy-MM-dd HH:mm:ss）",
            example = "2019-07-02 12:53:18", position = 25)
    private Date createtime;

    @ApiModelProperty(required = false, name="updatetime", dataType = "date", value = "时间（yyyy-MM-dd HH:mm:ss）",
            example = "2019-07-02 12:53:18", position = 26)
    private Date updatetime;

    private String remark;
}