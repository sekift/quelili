package com.quelili.back.model;

import java.util.Date;

public class QueAlbum {
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

    private Date createtime;

    private Date updatetime;

    private String remark;

    public Integer getAlbumid() {
        return albumid;
    }

    public void setAlbumid(Integer albumid) {
        this.albumid = albumid;
    }

    public String getAlbumname() {
        return albumname;
    }

    public void setAlbumname(String albumname) {
        this.albumname = albumname == null ? null : albumname.trim();
    }

    public Integer getArtistid() {
        return artistid;
    }

    public void setArtistid(Integer artistid) {
        this.artistid = artistid;
    }

    public String getArtistname() {
        return artistname;
    }

    public void setArtistname(String artistname) {
        this.artistname = artistname == null ? null : artistname.trim();
    }

    public Byte getIsstar() {
        return isstar;
    }

    public void setIsstar(Byte isstar) {
        this.isstar = isstar;
    }

    public Integer getPay() {
        return pay;
    }

    public void setPay(Integer pay) {
        this.pay = pay;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate == null ? null : releasedate.trim();
    }

    public String getAlbuminfo() {
        return albuminfo;
    }

    public void setAlbuminfo(String albuminfo) {
        this.albuminfo = albuminfo == null ? null : albuminfo.trim();
    }

    public String getCururl() {
        return cururl;
    }

    public void setCururl(String cururl) {
        this.cururl = cururl == null ? null : cururl.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}