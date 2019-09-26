package com.quelili.back.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description="歌曲信息")
public class QueMusicVO extends BaseEntity {
    private Integer musicid;

    private String musicrid;

    private String musicname;

    private Integer albumid;

    private String albumname;

    private Integer artistid;

    private String artistname;

    private Byte hasmv;

    private Byte isstar;

    private Byte islistenfee;

    private Byte online;

    private Integer pay;

    private String nationid;

    private Integer track;

    private String albumpic;

    private String pic;

    private String pic120;

    private Byte haslossless;

    private String songtimeminutes;

    private String releasedate;

    private Integer duration;

    private String cururl;

    @ApiModelProperty(required = false, name="createtime", dataType = "date", value = "时间（yyyy-MM-dd HH:mm:ss）",
            example = "2019-07-02 12:53:18", position = 25)
    private Date createtime;

    @ApiModelProperty(required = false, name="updatetime", dataType = "date", value = "时间（yyyy-MM-dd HH:mm:ss）",
            example = "2019-07-02 12:53:18", position = 26)
    private Date updatetime;

    private String remark;

}