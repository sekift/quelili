package com.quelili.back.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author  sekift
 * @date 2018-06-22 11:32
 * @desc
 **/
@Data
@ApiModel(description="歌手信息")
public class QueSingerInfoVO extends BaseEntity {
    private Integer artistid;

    private String aartist;

    private String artistname;

    private Byte isstar;

    private Integer albumnum;

    private Integer mvnum;

    private Integer musicnum;

    private Integer artistfans;

    private String pic;

    private String pic70;

    private String pic120;

    private String pic300;

    private String cururl;

    @ApiModelProperty(required = false, name="createtime", dataType = "date", value = "时间（yyyy-MM-dd HH:mm:ss）",
            example = "2019-07-02 12:53:18", position = 25)
    private Date createtime;

    @ApiModelProperty(required = false, name="updatetime", dataType = "date", value = "时间（yyyy-MM-dd HH:mm:ss）",
            example = "2019-07-02 12:53:18", position = 26)
    private Date updatetime;

    private String remark;

    private String birthday;

    private String country;

    private String gener;

    private String weight;

    private String language;

    private String uppcurl;

    private String birthplace;

    private String constellation;

    private String tall;

    private String info;
}