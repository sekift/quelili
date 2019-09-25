package com.quelili.back.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QueAlbumExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QueAlbumExample() {
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

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
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

        public Criteria andAlbuminfoIsNull() {
            addCriterion("albumInfo is null");
            return (Criteria) this;
        }

        public Criteria andAlbuminfoIsNotNull() {
            addCriterion("albumInfo is not null");
            return (Criteria) this;
        }

        public Criteria andAlbuminfoEqualTo(String value) {
            addCriterion("albumInfo =", value, "albuminfo");
            return (Criteria) this;
        }

        public Criteria andAlbuminfoNotEqualTo(String value) {
            addCriterion("albumInfo <>", value, "albuminfo");
            return (Criteria) this;
        }

        public Criteria andAlbuminfoGreaterThan(String value) {
            addCriterion("albumInfo >", value, "albuminfo");
            return (Criteria) this;
        }

        public Criteria andAlbuminfoGreaterThanOrEqualTo(String value) {
            addCriterion("albumInfo >=", value, "albuminfo");
            return (Criteria) this;
        }

        public Criteria andAlbuminfoLessThan(String value) {
            addCriterion("albumInfo <", value, "albuminfo");
            return (Criteria) this;
        }

        public Criteria andAlbuminfoLessThanOrEqualTo(String value) {
            addCriterion("albumInfo <=", value, "albuminfo");
            return (Criteria) this;
        }

        public Criteria andAlbuminfoLike(String value) {
            addCriterion("albumInfo like", value, "albuminfo");
            return (Criteria) this;
        }

        public Criteria andAlbuminfoNotLike(String value) {
            addCriterion("albumInfo not like", value, "albuminfo");
            return (Criteria) this;
        }

        public Criteria andAlbuminfoIn(List<String> values) {
            addCriterion("albumInfo in", values, "albuminfo");
            return (Criteria) this;
        }

        public Criteria andAlbuminfoNotIn(List<String> values) {
            addCriterion("albumInfo not in", values, "albuminfo");
            return (Criteria) this;
        }

        public Criteria andAlbuminfoBetween(String value1, String value2) {
            addCriterion("albumInfo between", value1, value2, "albuminfo");
            return (Criteria) this;
        }

        public Criteria andAlbuminfoNotBetween(String value1, String value2) {
            addCriterion("albumInfo not between", value1, value2, "albuminfo");
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