package com.quelili.back.vo;

import io.swagger.annotations.ApiModel;
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

    private Date createtime;

    private Date updatetime;

    private String invitecode;

    private String note;

    private String newuserpass;
}