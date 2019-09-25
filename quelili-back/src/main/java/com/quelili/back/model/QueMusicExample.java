package com.quelili.back.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QueMusicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QueMusicExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMusicidIsNull() {
            addCriterion("musicId is null");
            return (Criteria) this;
        }

        public Criteria andMusicidIsNotNull() {
            addCriterion("musicId is not null");
            return (Criteria) this;
        }

        public Criteria andMusicidEqualTo(Integer value) {
            addCriterion("musicId =", value, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidNotEqualTo(Integer value) {
            addCriterion("musicId <>", value, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidGreaterThan(Integer value) {
            addCriterion("musicId >", value, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("musicId >=", value, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidLessThan(Integer value) {
            addCriterion("musicId <", value, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidLessThanOrEqualTo(Integer value) {
            addCriterion("musicId <=", value, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidIn(List<Integer> values) {
            addCriterion("musicId in", values, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidNotIn(List<Integer> values) {
            addCriterion("musicId not in", values, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidBetween(Integer value1, Integer value2) {
            addCriterion("musicId between", value1, value2, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicidNotBetween(Integer value1, Integer value2) {
            addCriterion("musicId not between", value1, value2, "musicid");
            return (Criteria) this;
        }

        public Criteria andMusicridIsNull() {
            addCriterion("musicRid is null");
            return (Criteria) this;
        }

        public Criteria andMusicridIsNotNull() {
            addCriterion("musicRid is not null");
            return (Criteria) this;
        }

        public Criteria andMusicridEqualTo(String value) {
            addCriterion("musicRid =", value, "musicrid");
            return (Criteria) this;
        }

        public Criteria andMusicridNotEqualTo(String value) {
            addCriterion("musicRid <>", value, "musicrid");
            return (Criteria) this;
        }

        public Criteria andMusicridGreaterThan(String value) {
            addCriterion("musicRid >", value, "musicrid");
            return (Criteria) this;
        }

        public Criteria andMusicridGreaterThanOrEqualTo(String value) {
            addCriterion("musicRid >=", value, "musicrid");
            return (Criteria) this;
        }

        public Criteria andMusicridLessThan(String value) {
            addCriterion("musicRid <", value, "musicrid");
            return (Criteria) this;
        }

        public Criteria andMusicridLessThanOrEqualTo(String value) {
            addCriterion("musicRid <=", value, "musicrid");
            return (Criteria) this;
        }

        public Criteria andMusicridLike(String value) {
            addCriterion("musicRid like", value, "musicrid");
            return (Criteria) this;
        }

        public Criteria andMusicridNotLike(String value) {
            addCriterion("musicRid not like", value, "musicrid");
            return (Criteria) this;
        }

        public Criteria andMusicridIn(List<String> values) {
            addCriterion("musicRid in", values, "musicrid");
            return (Criteria) this;
        }

        public Criteria andMusicridNotIn(List<String> values) {
            addCriterion("musicRid not in", values, "musicrid");
            return (Criteria) this;
        }

        public Criteria andMusicridBetween(String value1, String value2) {
            addCriterion("musicRid between", value1, value2, "musicrid");
            return (Criteria) this;
        }

        public Criteria andMusicridNotBetween(String value1, String value2) {
            addCriterion("musicRid not between", value1, value2, "musicrid");
            return (Criteria) this;
        }

        public Criteria andMusicnameIsNull() {
            addCriterion("musicName is null");
            return (Criteria) this;
        }

        public Criteria andMusicnameIsNotNull() {
            addCriterion("musicName is not null");
            return (Criteria) this;
        }

        public Criteria andMusicnameEqualTo(String value) {
            addCriterion("musicName =", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameNotEqualTo(String value) {
            addCriterion("musicName <>", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameGreaterThan(String value) {
            addCriterion("musicName >", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameGreaterThanOrEqualTo(String value) {
            addCriterion("musicName >=", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameLessThan(String value) {
            addCriterion("musicName <", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameLessThanOrEqualTo(String value) {
            addCriterion("musicName <=", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameLike(String value) {
            addCriterion("musicName like", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameNotLike(String value) {
            addCriterion("musicName not like", value, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameIn(List<String> values) {
            addCriterion("musicName in", values, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameNotIn(List<String> values) {
            addCriterion("musicName not in", values, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameBetween(String value1, String value2) {
            addCriterion("musicName between", value1, value2, "musicname");
            return (Criteria) this;
        }

        public Criteria andMusicnameNotBetween(String value1, String value2) {
            addCriterion("musicName not between", value1, value2, "musicname");
            return (Criteria) this;
        }

        public Criteria andAlbumidIsNull() {
            addCriterion("albumId is null");
            return (Criteria) this;
        }

        public Criteria andAlbumidIsNotNull() {
            addCriterion("albumId is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumidEqualTo(Integer value) {
            addCriterion("albumId =", value, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidNotEqualTo(Integer value) {
            addCriterion("albumId <>", value, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidGreaterThan(Integer value) {
            addCriterion("albumId >", value, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidGreaterThanOrEqualTo(Integer value) {
            addCriterion("albumId >=", value, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidLessThan(Integer value) {
            addCriterion("albumId <", value, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidLessThanOrEqualTo(Integer value) {
            addCriterion("albumId <=", value, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidIn(List<Integer> values) {
            addCriterion("albumId in", values, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidNotIn(List<Integer> values) {
            addCriterion("albumId not in", values, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidBetween(Integer value1, Integer value2) {
            addCriterion("albumId between", value1, value2, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumidNotBetween(Integer value1, Integer value2) {
            addCriterion("albumId not between", value1, value2, "albumid");
            return (Criteria) this;
        }

        public Criteria andAlbumnameIsNull() {
            addCriterion("albumName is null");
            return (Criteria) this;
        }

        public Criteria andAlbumnameIsNotNull() {
            addCriterion("albumName is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumnameEqualTo(String value) {
            addCriterion("albumName =", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameNotEqualTo(String value) {
            addCriterion("albumName <>", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameGreaterThan(String value) {
            addCriterion("albumName >", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameGreaterThanOrEqualTo(String value) {
            addCriterion("albumName >=", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameLessThan(String value) {
            addCriterion("albumName <", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameLessThanOrEqualTo(String value) {
            addCriterion("albumName <=", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameLike(String value) {
            addCriterion("albumName like", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameNotLike(String value) {
            addCriterion("albumName not like", value, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameIn(List<String> values) {
            addCriterion("albumName in", values, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameNotIn(List<String> values) {
            addCriterion("albumName not in", values, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameBetween(String value1, String value2) {
            addCriterion("albumName between", value1, value2, "albumname");
            return (Criteria) this;
        }

        public Criteria andAlbumnameNotBetween(String value1, String value2) {
            addCriterion("albumName not between", value1, value2, "albumname");
            return (Criteria) this;
        }

        public Criteria andArtistidIsNull() {
            addCriterion("artistId is null");
            return (Criteria) this;
        }

        public Criteria andArtistidIsNotNull() {
            addCriterion("artistId is not null");
            return (Criteria) this;
        }

        public Criteria andArtistidEqualTo(Integer value) {
            addCriterion("artistId =", value, "artistid");
            return (Criteria) this;
        }

        public Criteria andArtistidNotEqualTo(Integer value) {
            addCriterion("artistId <>", value, "artistid");
            return (Criteria) this;
        }

        public Criteria andArtistidGreaterThan(Integer value) {
            addCriterion("artistId >", value, "artistid");
            return (Criteria) this;
        }

        public Criteria andArtistidGreaterThanOrEqualTo(Integer value) {
            addCriterion("artistId >=", value, "artistid");
            return (Criteria) this;
        }

        public Criteria andArtistidLessThan(Integer value) {
            addCriterion("artistId <", value, "artistid");
            return (Criteria) this;
        }

        public Criteria andArtistidLessThanOrEqualTo(Integer value) {
            addCriterion("artistId <=", value, "artistid");
            return (Criteria) this;
        }

        public Criteria andArtistidIn(List<Integer> values) {
            addCriterion("artistId in", values, "artistid");
            return (Criteria) this;
        }

        public Criteria andArtistidNotIn(List<Integer> values) {
            addCriterion("artistId not in", values, "artistid");
            return (Criteria) this;
        }

        public Criteria andArtistidBetween(Integer value1, Integer value2) {
            addCriterion("artistId between", value1, value2, "artistid");
            return (Criteria) this;
        }

        public Criteria andArtistidNotBetween(Integer value1, Integer value2) {
            addCriterion("artistId not between", value1, value2, "artistid");
            return (Criteria) this;
        }

        public Criteria andArtistnameIsNull() {
            addCriterion("artistName is null");
            return (Criteria) this;
        }

        public Criteria andArtistnameIsNotNull() {
            addCriterion("artistName is not null");
            return (Criteria) this;
        }

        public Criteria andArtistnameEqualTo(String value) {
            addCriterion("artistName =", value, "artistname");
            return (Criteria) this;
        }

        public Criteria andArtistnameNotEqualTo(String value) {
            addCriterion("artistName <>", value, "artistname");
            return (Criteria) this;
        }

        public Criteria andArtistnameGreaterThan(String value) {
            addCriterion("artistName >", value, "artistname");
            return (Criteria) this;
        }

        public Criteria andArtistnameGreaterThanOrEqualTo(String value) {
            addCriterion("artistName >=", value, "artistname");
            return (Criteria) this;
        }

        public Criteria andArtistnameLessThan(String value) {
            addCriterion("artistName <", value, "artistname");
            return (Criteria) this;
        }

        public Criteria andArtistnameLessThanOrEqualTo(String value) {
            addCriterion("artistName <=", value, "artistname");
            return (Criteria) this;
        }

        public Criteria andArtistnameLike(String value) {
            addCriterion("artistName like", value, "artistname");
            return (Criteria) this;
        }

        public Criteria andArtistnameNotLike(String value) {
            addCriterion("artistName not like", value, "artistname");
            return (Criteria) this;
        }

        public Criteria andArtistnameIn(List<String> values) {
            addCriterion("artistName in", values, "artistname");
            return (Criteria) this;
        }

        public Criteria andArtistnameNotIn(List<String> values) {
            addCriterion("artistName not in", values, "artistname");
            return (Criteria) this;
        }

        public Criteria andArtistnameBetween(String value1, String value2) {
            addCriterion("artistName between", value1, value2, "artistname");
            return (Criteria) this;
        }

        public Criteria andArtistnameNotBetween(String value1, String value2) {
            addCriterion("artistName not between", value1, value2, "artistname");
            return (Criteria) this;
        }

        public Criteria andHasmvIsNull() {
            addCriterion("hasMv is null");
            return (Criteria) this;
        }

        public Criteria andHasmvIsNotNull() {
            addCriterion("hasMv is not null");
            return (Criteria) this;
        }

        public Criteria andHasmvEqualTo(Byte value) {
            addCriterion("hasMv =", value, "hasmv");
            return (Criteria) this;
        }

        public Criteria andHasmvNotEqualTo(Byte value) {
            addCriterion("hasMv <>", value, "hasmv");
            return (Criteria) this;
        }

        public Criteria andHasmvGreaterThan(Byte value) {
            addCriterion("hasMv >", value, "hasmv");
            return (Criteria) this;
        }

        public Criteria andHasmvGreaterThanOrEqualTo(Byte value) {
            addCriterion("hasMv >=", value, "hasmv");
            return (Criteria) this;
        }

        public Criteria andHasmvLessThan(Byte value) {
            addCriterion("hasMv <", value, "hasmv");
            return (Criteria) this;
        }

        public Criteria andHasmvLessThanOrEqualTo(Byte value) {
            addCriterion("hasMv <=", value, "hasmv");
            return (Criteria) this;
        }

        public Criteria andHasmvIn(List<Byte> values) {
            addCriterion("hasMv in", values, "hasmv");
            return (Criteria) this;
        }

        public Criteria andHasmvNotIn(List<Byte> values) {
            addCriterion("hasMv not in", values, "hasmv");
            return (Criteria) this;
        }

        public Criteria andHasmvBetween(Byte value1, Byte value2) {
            addCriterion("hasMv between", value1, value2, "hasmv");
            return (Criteria) this;
        }

        public Criteria andHasmvNotBetween(Byte value1, Byte value2) {
            addCriterion("hasMv not between", value1, value2, "hasmv");
            return (Criteria) this;
        }

        public Criteria andIsstarIsNull() {
            addCriterion("isStar is null");
            return (Criteria) this;
        }

        public Criteria andIsstarIsNotNull() {
            addCriterion("isStar is not null");
            return (Criteria) this;
        }

        public Criteria andIsstarEqualTo(Byte value) {
            addCriterion("isStar =", value, "isstar");
            return (Criteria) this;
        }

        public Criteria andIsstarNotEqualTo(Byte value) {
            addCriterion("isStar <>", value, "isstar");
            return (Criteria) this;
        }

        public Criteria andIsstarGreaterThan(Byte value) {
            addCriterion("isStar >", value, "isstar");
            return (Criteria) this;
        }

        public Criteria andIsstarGreaterThanOrEqualTo(Byte value) {
            addCriterion("isStar >=", value, "isstar");
            return (Criteria) this;
        }

        public Criteria andIsstarLessThan(Byte value) {
            addCriterion("isStar <", value, "isstar");
            return (Criteria) this;
        }

        public Criteria andIsstarLessThanOrEqualTo(Byte value) {
            addCriterion("isStar <=", value, "isstar");
            return (Criteria) this;
        }

        public Criteria andIsstarIn(List<Byte> values) {
            addCriterion("isStar in", values, "isstar");
            return (Criteria) this;
        }

        public Criteria andIsstarNotIn(List<Byte> values) {
            addCriterion("isStar not in", values, "isstar");
            return (Criteria) this;
        }

        public Criteria andIsstarBetween(Byte value1, Byte value2) {
            addCriterion("isStar between", value1, value2, "isstar");
            return (Criteria) this;
        }

        public Criteria andIsstarNotBetween(Byte value1, Byte value2) {
            addCriterion("isStar not between", value1, value2, "isstar");
            return (Criteria) this;
        }

        public Criteria andIslistenfeeIsNull() {
            addCriterion("isListenFee is null");
            return (Criteria) this;
        }

        public Criteria andIslistenfeeIsNotNull() {
            addCriterion("isListenFee is not null");
            return (Criteria) this;
        }

        public Criteria andIslistenfeeEqualTo(Byte value) {
            addCriterion("isListenFee =", value, "islistenfee");
            return (Criteria) this;
        }

        public Criteria andIslistenfeeNotEqualTo(Byte value) {
            addCriterion("isListenFee <>", value, "islistenfee");
            return (Criteria) this;
        }

        public Criteria andIslistenfeeGreaterThan(Byte value) {
            addCriterion("isListenFee >", value, "islistenfee");
            return (Criteria) this;
        }

        public Criteria andIslistenfeeGreaterThanOrEqualTo(Byte value) {
            addCriterion("isListenFee >=", value, "islistenfee");
            return (Criteria) this;
        }

        public Criteria andIslistenfeeLessThan(Byte value) {
            addCriterion("isListenFee <", value, "islistenfee");
            return (Criteria) this;
        }

        public Criteria andIslistenfeeLessThanOrEqualTo(Byte value) {
            addCriterion("isListenFee <=", value, "islistenfee");
            return (Criteria) this;
        }

        public Criteria andIslistenfeeIn(List<Byte> values) {
            addCriterion("isListenFee in", values, "islistenfee");
            return (Criteria) this;
        }

        public Criteria andIslistenfeeNotIn(List<Byte> values) {
            addCriterion("isListenFee not in", values, "islistenfee");
            return (Criteria) this;
        }

        public Criteria andIslistenfeeBetween(Byte value1, Byte value2) {
            addCriterion("isListenFee between", value1, value2, "islistenfee");
            return (Criteria) this;
        }

        public Criteria andIslistenfeeNotBetween(Byte value1, Byte value2) {
            addCriterion("isListenFee not between", value1, value2, "islistenfee");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNull() {
            addCriterion("online is null");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNotNull() {
            addCriterion("online is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineEqualTo(Byte value) {
            addCriterion("online =", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotEqualTo(Byte value) {
            addCriterion("online <>", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThan(Byte value) {
            addCriterion("online >", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThanOrEqualTo(Byte value) {
            addCriterion("online >=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThan(Byte value) {
            addCriterion("online <", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThanOrEqualTo(Byte value) {
            addCriterion("online <=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineIn(List<Byte> values) {
            addCriterion("online in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotIn(List<Byte> values) {
            addCriterion("online not in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineBetween(Byte value1, Byte value2) {
            addCriterion("online between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotBetween(Byte value1, Byte value2) {
            addCriterion("online not between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andPayIsNull() {
            addCriterion("pay is null");
            return (Criteria) this;
        }

        public Criteria andPayIsNotNull() {
            addCriterion("pay is not null");
            return (Criteria) this;
        }

        public Criteria andPayEqualTo(Integer value) {
            addCriterion("pay =", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotEqualTo(Integer value) {
            addCriterion("pay <>", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThan(Integer value) {
            addCriterion("pay >", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay >=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThan(Integer value) {
            addCriterion("pay <", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThanOrEqualTo(Integer value) {
            addCriterion("pay <=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayIn(List<Integer> values) {
            addCriterion("pay in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotIn(List<Integer> values) {
            addCriterion("pay not in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayBetween(Integer value1, Integer value2) {
            addCriterion("pay between", value1, value2, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotBetween(Integer value1, Integer value2) {
            addCriterion("pay not between", value1, value2, "pay");
            return (Criteria) this;
        }

        public Criteria andNationidIsNull() {
            addCriterion("nationId is null");
            return (Criteria) this;
        }

        public Criteria andNationidIsNotNull() {
            addCriterion("nationId is not null");
            return (Criteria) this;
        }

        public Criteria andNationidEqualTo(String value) {
            addCriterion("nationId =", value, "nationid");
            return (Criteria) this;
        }

        public Criteria andNationidNotEqualTo(String value) {
            addCriterion("nationId <>", value, "nationid");
            return (Criteria) this;
        }

        public Criteria andNationidGreaterThan(String value) {
            addCriterion("nationId >", value, "nationid");
            return (Criteria) this;
        }

        public Criteria andNationidGreaterThanOrEqualTo(String value) {
            addCriterion("nationId >=", value, "nationid");
            return (Criteria) this;
        }

        public Criteria andNationidLessThan(String value) {
            addCriterion("nationId <", value, "nationid");
            return (Criteria) this;
        }

        public Criteria andNationidLessThanOrEqualTo(String value) {
            addCriterion("nationId <=", value, "nationid");
            return (Criteria) this;
        }

        public Criteria andNationidLike(String value) {
            addCriterion("nationId like", value, "nationid");
            return (Criteria) this;
        }

        public Criteria andNationidNotLike(String value) {
            addCriterion("nationId not like", value, "nationid");
            return (Criteria) this;
        }

        public Criteria andNationidIn(List<String> values) {
            addCriterion("nationId in", values, "nationid");
            return (Criteria) this;
        }

        public Criteria andNationidNotIn(List<String> values) {
            addCriterion("nationId not in", values, "nationid");
            return (Criteria) this;
        }

        public Criteria andNationidBetween(String value1, String value2) {
            addCriterion("nationId between", value1, value2, "nationid");
            return (Criteria) this;
        }

        public Criteria andNationidNotBetween(String value1, String value2) {
            addCriterion("nationId not between", value1, value2, "nationid");
            return (Criteria) this;
        }

        public Criteria andTrackIsNull() {
            addCriterion("track is null");
            return (Criteria) this;
        }

        public Criteria andTrackIsNotNull() {
            addCriterion("track is not null");
            return (Criteria) this;
        }

        public Criteria andTrackEqualTo(Integer value) {
            addCriterion("track =", value, "track");
            return (Criteria) this;
        }

        public Criteria andTrackNotEqualTo(Integer value) {
            addCriterion("track <>", value, "track");
            return (Criteria) this;
        }

        public Criteria andTrackGreaterThan(Integer value) {
            addCriterion("track >", value, "track");
            return (Criteria) this;
        }

        public Criteria andTrackGreaterThanOrEqualTo(Integer value) {
            addCriterion("track >=", value, "track");
            return (Criteria) this;
        }

        public Criteria andTrackLessThan(Integer value) {
            addCriterion("track <", value, "track");
            return (Criteria) this;
        }

        public Criteria andTrackLessThanOrEqualTo(Integer value) {
            addCriterion("track <=", value, "track");
            return (Criteria) this;
        }

        public Criteria andTrackIn(List<Integer> values) {
            addCriterion("track in", values, "track");
            return (Criteria) this;
        }

        public Criteria andTrackNotIn(List<Integer> values) {
            addCriterion("track not in", values, "track");
            return (Criteria) this;
        }

        public Criteria andTrackBetween(Integer value1, Integer value2) {
            addCriterion("track between", value1, value2, "track");
            return (Criteria) this;
        }

        public Criteria andTrackNotBetween(Integer value1, Integer value2) {
            addCriterion("track not between", value1, value2, "track");
            return (Criteria) this;
        }

        public Criteria andAlbumpicIsNull() {
            addCriterion("albumPic is null");
            return (Criteria) this;
        }

        public Criteria andAlbumpicIsNotNull() {
            addCriterion("albumPic is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumpicEqualTo(String value) {
            addCriterion("albumPic =", value, "albumpic");
            return (Criteria) this;
        }

        public Criteria andAlbumpicNotEqualTo(String value) {
            addCriterion("albumPic <>", value, "albumpic");
            return (Criteria) this;
        }

        public Criteria andAlbumpicGreaterThan(String value) {
            addCriterion("albumPic >", value, "albumpic");
            return (Criteria) this;
        }

        public Criteria andAlbumpicGreaterThanOrEqualTo(String value) {
            addCriterion("albumPic >=", value, "albumpic");
            return (Criteria) this;
        }

        public Criteria andAlbumpicLessThan(String value) {
            addCriterion("albumPic <", value, "albumpic");
            return (Criteria) this;
        }

        public Criteria andAlbumpicLessThanOrEqualTo(String value) {
            addCriterion("albumPic <=", value, "albumpic");
            return (Criteria) this;
        }

        public Criteria andAlbumpicLike(String value) {
            addCriterion("albumPic like", value, "albumpic");
            return (Criteria) this;
        }

        public Criteria andAlbumpicNotLike(String value) {
            addCriterion("albumPic not like", value, "albumpic");
            return (Criteria) this;
        }

        public Criteria andAlbumpicIn(List<String> values) {
            addCriterion("albumPic in", values, "albumpic");
            return (Criteria) this;
        }

        public Criteria andAlbumpicNotIn(List<String> values) {
            addCriterion("albumPic not in", values, "albumpic");
            return (Criteria) this;
        }

        public Criteria andAlbumpicBetween(String value1, String value2) {
            addCriterion("albumPic between", value1, value2, "albumpic");
            return (Criteria) this;
        }

        public Criteria andAlbumpicNotBetween(String value1, String value2) {
            addCriterion("albumPic not between", value1, value2, "albumpic");
            return (Criteria) this;
        }

        public Criteria andPicIsNull() {
            addCriterion("pic is null");
            return (Criteria) this;
        }

        public Criteria andPicIsNotNull() {
            addCriterion("pic is not null");
            return (Criteria) this;
        }

        public Criteria andPicEqualTo(String value) {
            addCriterion("pic =", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotEqualTo(String value) {
            addCriterion("pic <>", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThan(String value) {
            addCriterion("pic >", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicGreaterThanOrEqualTo(String value) {
            addCriterion("pic >=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThan(String value) {
            addCriterion("pic <", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLessThanOrEqualTo(String value) {
            addCriterion("pic <=", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicLike(String value) {
            addCriterion("pic like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotLike(String value) {
            addCriterion("pic not like", value, "pic");
            return (Criteria) this;
        }

        public Criteria andPicIn(List<String> values) {
            addCriterion("pic in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotIn(List<String> values) {
            addCriterion("pic not in", values, "pic");
            return (Criteria) this;
        }

        public Criteria andPicBetween(String value1, String value2) {
            addCriterion("pic between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPicNotBetween(String value1, String value2) {
            addCriterion("pic not between", value1, value2, "pic");
            return (Criteria) this;
        }

        public Criteria andPic120IsNull() {
            addCriterion("pic120 is null");
            return (Criteria) this;
        }

        public Criteria andPic120IsNotNull() {
            addCriterion("pic120 is not null");
            return (Criteria) this;
        }

        public Criteria andPic120EqualTo(String value) {
            addCriterion("pic120 =", value, "pic120");
            return (Criteria) this;
        }

        public Criteria andPic120NotEqualTo(String value) {
            addCriterion("pic120 <>", value, "pic120");
            return (Criteria) this;
        }

        public Criteria andPic120GreaterThan(String value) {
            addCriterion("pic120 >", value, "pic120");
            return (Criteria) this;
        }

        public Criteria andPic120GreaterThanOrEqualTo(String value) {
            addCriterion("pic120 >=", value, "pic120");
            return (Criteria) this;
        }

        public Criteria andPic120LessThan(String value) {
            addCriterion("pic120 <", value, "pic120");
            return (Criteria) this;
        }

        public Criteria andPic120LessThanOrEqualTo(String value) {
            addCriterion("pic120 <=", value, "pic120");
            return (Criteria) this;
        }

        public Criteria andPic120Like(String value) {
            addCriterion("pic120 like", value, "pic120");
            return (Criteria) this;
        }

        public Criteria andPic120NotLike(String value) {
            addCriterion("pic120 not like", value, "pic120");
            return (Criteria) this;
        }

        public Criteria andPic120In(List<String> values) {
            addCriterion("pic120 in", values, "pic120");
            return (Criteria) this;
        }

        public Criteria andPic120NotIn(List<String> values) {
            addCriterion("pic120 not in", values, "pic120");
            return (Criteria) this;
        }

        public Criteria andPic120Between(String value1, String value2) {
            addCriterion("pic120 between", value1, value2, "pic120");
            return (Criteria) this;
        }

        public Criteria andPic120NotBetween(String value1, String value2) {
            addCriterion("pic120 not between", value1, value2, "pic120");
            return (Criteria) this;
        }

        public Criteria andHaslosslessIsNull() {
            addCriterion("hasLossless is null");
            return (Criteria) this;
        }

        public Criteria andHaslosslessIsNotNull() {
            addCriterion("hasLossless is not null");
            return (Criteria) this;
        }

        public Criteria andHaslosslessEqualTo(Byte value) {
            addCriterion("hasLossless =", value, "haslossless");
            return (Criteria) this;
        }

        public Criteria andHaslosslessNotEqualTo(Byte value) {
            addCriterion("hasLossless <>", value, "haslossless");
            return (Criteria) this;
        }

        public Criteria andHaslosslessGreaterThan(Byte value) {
            addCriterion("hasLossless >", value, "haslossless");
            return (Criteria) this;
        }

        public Criteria andHaslosslessGreaterThanOrEqualTo(Byte value) {
            addCriterion("hasLossless >=", value, "haslossless");
            return (Criteria) this;
        }

        public Criteria andHaslosslessLessThan(Byte value) {
            addCriterion("hasLossless <", value, "haslossless");
            return (Criteria) this;
        }

        public Criteria andHaslosslessLessThanOrEqualTo(Byte value) {
            addCriterion("hasLossless <=", value, "haslossless");
            return (Criteria) this;
        }

        public Criteria andHaslosslessIn(List<Byte> values) {
            addCriterion("hasLossless in", values, "haslossless");
            return (Criteria) this;
        }

        public Criteria andHaslosslessNotIn(List<Byte> values) {
            addCriterion("hasLossless not in", values, "haslossless");
            return (Criteria) this;
        }

        public Criteria andHaslosslessBetween(Byte value1, Byte value2) {
            addCriterion("hasLossless between", value1, value2, "haslossless");
            return (Criteria) this;
        }

        public Criteria andHaslosslessNotBetween(Byte value1, Byte value2) {
            addCriterion("hasLossless not between", value1, value2, "haslossless");
            return (Criteria) this;
        }

        public Criteria andSongtimeminutesIsNull() {
            addCriterion("songTimeMinutes is null");
            return (Criteria) this;
        }

        public Criteria andSongtimeminutesIsNotNull() {
            addCriterion("songTimeMinutes is not null");
            return (Criteria) this;
        }

        public Criteria andSongtimeminutesEqualTo(String value) {
            addCriterion("songTimeMinutes =", value, "songtimeminutes");
            return (Criteria) this;
        }

        public Criteria andSongtimeminutesNotEqualTo(String value) {
            addCriterion("songTimeMinutes <>", value, "songtimeminutes");
            return (Criteria) this;
        }

        public Criteria andSongtimeminutesGreaterThan(String value) {
            addCriterion("songTimeMinutes >", value, "songtimeminutes");
            return (Criteria) this;
        }

        public Criteria andSongtimeminutesGreaterThanOrEqualTo(String value) {
            addCriterion("songTimeMinutes >=", value, "songtimeminutes");
            return (Criteria) this;
        }

        public Criteria andSongtimeminutesLessThan(String value) {
            addCriterion("songTimeMinutes <", value, "songtimeminutes");
            return (Criteria) this;
        }

        public Criteria andSongtimeminutesLessThanOrEqualTo(String value) {
            addCriterion("songTimeMinutes <=", value, "songtimeminutes");
            return (Criteria) this;
        }

        public Criteria andSongtimeminutesLike(String value) {
            addCriterion("songTimeMinutes like", value, "songtimeminutes");
            return (Criteria) this;
        }

        public Criteria andSongtimeminutesNotLike(String value) {
            addCriterion("songTimeMinutes not like", value, "songtimeminutes");
            return (Criteria) this;
        }

        public Criteria andSongtimeminutesIn(List<String> values) {
            addCriterion("songTimeMinutes in", values, "songtimeminutes");
            return (Criteria) this;
        }

        public Criteria andSongtimeminutesNotIn(List<String> values) {
            addCriterion("songTimeMinutes not in", values, "songtimeminutes");
            return (Criteria) this;
        }

        public Criteria andSongtimeminutesBetween(String value1, String value2) {
            addCriterion("songTimeMinutes between", value1, value2, "songtimeminutes");
            return (Criteria) this;
        }

        public Criteria andSongtimeminutesNotBetween(String value1, String value2) {
            addCriterion("songTimeMinutes not between", value1, value2, "songtimeminutes");
            return (Criteria) this;
        }

        public Criteria andReleasedateIsNull() {
            addCriterion("releaseDate is null");
            return (Criteria) this;
        }

        public Criteria andReleasedateIsNotNull() {
            addCriterion("releaseDate is not null");
            return (Criteria) this;
        }

        public Criteria andReleasedateEqualTo(String value) {
            addCriterion("releaseDate =", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotEqualTo(String value) {
            addCriterion("releaseDate <>", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateGreaterThan(String value) {
            addCriterion("releaseDate >", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateGreaterThanOrEqualTo(String value) {
            addCriterion("releaseDate >=", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateLessThan(String value) {
            addCriterion("releaseDate <", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateLessThanOrEqualTo(String value) {
            addCriterion("releaseDate <=", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateLike(String value) {
            addCriterion("releaseDate like", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotLike(String value) {
            addCriterion("releaseDate not like", value, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateIn(List<String> values) {
            addCriterion("releaseDate in", values, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotIn(List<String> values) {
            addCriterion("releaseDate not in", values, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateBetween(String value1, String value2) {
            addCriterion("releaseDate between", value1, value2, "releasedate");
            return (Criteria) this;
        }

        public Criteria andReleasedateNotBetween(String value1, String value2) {
            addCriterion("releaseDate not between", value1, value2, "releasedate");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Integer value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Integer value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Integer value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Integer value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Integer value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Integer> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Integer> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Integer value1, Integer value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andCururlIsNull() {
            addCriterion("curUrl is null");
            return (Criteria) this;
        }

        public Criteria andCururlIsNotNull() {
            addCriterion("curUrl is not null");
            return (Criteria) this;
        }

        public Criteria andCururlEqualTo(String value) {
            addCriterion("curUrl =", value, "cururl");
            return (Criteria) this;
        }

        public Criteria andCururlNotEqualTo(String value) {
            addCriterion("curUrl <>", value, "cururl");
            return (Criteria) this;
        }

        public Criteria andCururlGreaterThan(String value) {
            addCriterion("curUrl >", value, "cururl");
            return (Criteria) this;
        }

        public Criteria andCururlGreaterThanOrEqualTo(String value) {
            addCriterion("curUrl >=", value, "cururl");
            return (Criteria) this;
        }

        public Criteria andCururlLessThan(String value) {
            addCriterion("curUrl <", value, "cururl");
            return (Criteria) this;
        }

        public Criteria andCururlLessThanOrEqualTo(String value) {
            addCriterion("curUrl <=", value, "cururl");
            return (Criteria) this;
        }

        public Criteria andCururlLike(String value) {
            addCriterion("curUrl like", value, "cururl");
            return (Criteria) this;
        }

        public Criteria andCururlNotLike(String value) {
            addCriterion("curUrl not like", value, "cururl");
            return (Criteria) this;
        }

        public Criteria andCururlIn(List<String> values) {
            addCriterion("curUrl in", values, "cururl");
            return (Criteria) this;
        }

        public Criteria andCururlNotIn(List<String> values) {
            addCriterion("curUrl not in", values, "cururl");
            return (Criteria) this;
        }

        public Criteria andCururlBetween(String value1, String value2) {
            addCriterion("curUrl between", value1, value2, "cururl");
            return (Criteria) this;
        }

        public Criteria andCururlNotBetween(String value1, String value2) {
            addCriterion("curUrl not between", value1, value2, "cururl");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}