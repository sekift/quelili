package com.quelili.back.model;

import java.util.Date;

public class QueMusic {
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

    private Date createtime;

    private Date updatetime;

    private String remark;

    public Integer getMusicid() {
        return musicid;
    }

    public void setMusicid(Integer musicid) {
        this.musicid = musicid;
    }

    public String getMusicrid() {
        return musicrid;
    }

    public void setMusicrid(String musicrid) {
        this.musicrid = musicrid == null ? null : musicrid.trim();
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

    public Byte getHasmv() {
        return hasmv;
    }

    public void setHasmv(Byte hasmv) {
        this.hasmv = hasmv;
    }

    public Byte getIsstar() {
        return isstar;
    }

    public void setIsstar(Byte isstar) {
        this.isstar = isstar;
    }

    public Byte getIslistenfee() {
        return islistenfee;
    }

    public void setIslistenfee(Byte islistenfee) {
        this.islistenfee = islistenfee;
    }

    public Byte getOnline() {
        return online;
    }

    public void setOnline(Byte online) {
        this.online = online;
    }

    public Integer getPay() {
        return pay;
    }

    public void setPay(Integer pay) {
        this.pay = pay;
    }

    public String getNationid() {
        return nationid;
    }

    public void setNationid(String nationid) {
        this.nationid = nationid == null ? null : nationid.trim();
    }

    public Integer getTrack() {
        return track;
    }

    public void setTrack(Integer track) {
        this.track = track;
    }

    public String getAlbumpic() {
        return albumpic;
    }

    public void setAlbumpic(String albumpic) {
        this.albumpic = albumpic == null ? null : albumpic.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getPic120() {
        return pic120;
    }

    public void setPic120(String pic120) {
        this.pic120 = pic120 == null ? null : pic120.trim();
    }

    public Byte getHaslossless() {
        return haslossless;
    }

    public void setHaslossless(Byte haslossless) {
        this.haslossless = haslossless;
    }

    public String getSongtimeminutes() {
        return songtimeminutes;
    }

    public void setSongtimeminutes(String songtimeminutes) {
        this.songtimeminutes = songtimeminutes == null ? null : songtimeminutes.trim();
    }

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate == null ? null : releasedate.trim();
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
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