package com.quelili.back.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(description="用户Session信息")
public class SessionInfo implements Serializable {

    private static final long serialVersionUID = -7228411899857984722L;
    // 用户ID
    private Long userid;
    private String usercode;
    private String username;
    private String email;
    private String mobile;
    private Long entid;
    private Long parententid;
    private String note;

    // 多语言
    private Integer langid;

    //用户可查看以及编辑的菜单列表
    //private List<Menu> resourceList;

}
