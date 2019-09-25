package com.quelili.back.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
@ApiModel(description="用户信息")
public class SysUserVO  extends BaseEntity {
    private Long userid;

    private String usercode;

    private String username;

    private String userpass;

    private String email;

    private String mobile;

    private Short unbl;

    private Long entid;

    private Long parententid;

    @ApiModelProperty(required = false, name="createtime", dataType = "date", value = "时间（yyyy-MM-dd HH:mm:ss）",
            example = "2019-07-02 12:53:18", position = 25)
    private Date createtime;

    @ApiModelProperty(required = false, name="updatetime", dataType = "date", value = "时间（yyyy-MM-dd HH:mm:ss）",
            example = "2019-07-02 12:53:18", position = 26)
    private Date updatetime;

    private String invitecode;

    private String note;

    private String newuserpass;
}