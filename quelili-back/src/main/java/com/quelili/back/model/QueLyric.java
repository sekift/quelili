package com.quelili.back.model;

import java.util.Date;

public class QueLyric {
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

    private Date createtime;

    private Date updatetime;

    private String remark;

    public Integer getMusicid() {
        return musicid;
    }

    public void setMusicid(Integer musicid) {
        this.musicid = musicid;
    }

    public String getMusicname() {
        return musicname;
    }

    public void setMusicname(String musicname) {
        this.musicname = musicname == null ? null : musicname.trim();
    }

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

    public String getLrclist() {
        return lrclist;
    }

    public void setLrclist(String lrclist) {
        this.lrclist = lrclist == null ? null : lrclist.trim();
    }

    public String getNsig1() {
        return nsig1;
    }

    public void setNsig1(String nsig1) {
        this.nsig1 = nsig1 == null ? null : nsig1.trim();
    }

    public String getNsig2() {
        return nsig2;
    }

    public void setNsig2(String nsig2) {
        this.nsig2 = nsig2 == null ? null : nsig2.trim();
    }

    public Integer getScore100() {
        return score100;
    }

    public void setScore100(Integer score100) {
        this.score100 = score100;
    }

    public Integer getPlaycnt() {
        return playcnt;
    }

    public void setPlaycnt(Integer playcnt) {
        this.playcnt = playcnt;
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