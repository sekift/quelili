package com.quelili.back.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description="歌词信息（无）")
public class QueLyricNoneVO extends BaseEntity {
    private Integer musicid;

    private String musicname;

    private Integer albumid;

    private String albumname;

    private Integer artistid;

    private String artistname;

    private String lrclist;

    private String nsig1;

    private String nsig2;

    private Integer score100;

    private Integer playcnt;

    private String cururl;

    @ApiModelProperty(required = false, name="createtime", dataType = "date", value = "时间（yyyy-MM-dd HH:mm:ss）",
            example = "2019-07-02 12:53:18", position = 25)
    private Date createtime;

    @ApiModelProperty(required = false, name="updatetime", dataType = "date", value = "时间（yyyy-MM-dd HH:mm:ss）",
            example = "2019-07-02 12:53:18", position = 26)
    private Date updatetime;

    private String remark;
}