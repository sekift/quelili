package com.quelili.back.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QueSingerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QueSingerInfoExample() {
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

        public Criteria andAartistIsNull() {
            addCriterion("aartist is null");
            return (Criteria) this;
        }

        public Criteria andAartistIsNotNull() {
            addCriterion("aartist is not null");
            return (Criteria) this;
        }

        public Criteria andAartistEqualTo(String value) {
            addCriterion("aartist =", value, "aartist");
            return (Criteria) this;
        }

        public Criteria andAartistNotEqualTo(String value) {
            addCriterion("aartist <>", value, "aartist");
            return (Criteria) this;
        }

        public Criteria andAartistGreaterThan(String value) {
            addCriterion("aartist >", value, "aartist");
            return (Criteria) this;
        }

        public Criteria andAartistGreaterThanOrEqualTo(String value) {
            addCriterion("aartist >=", value, "aartist");
            return (Criteria) this;
        }

        public Criteria andAartistLessThan(String value) {
            addCriterion("aartist <", value, "aartist");
            return (Criteria) this;
        }

        public Criteria andAartistLessThanOrEqualTo(String value) {
            addCriterion("aartist <=", value, "aartist");
            return (Criteria) this;
        }

        public Criteria andAartistLike(String value) {
            addCriterion("aartist like", value, "aartist");
            return (Criteria) this;
        }

        public Criteria andAartistNotLike(String value) {
            addCriterion("aartist not like", value, "aartist");
            return (Criteria) this;
        }

        public Criteria andAartistIn(List<String> values) {
            addCriterion("aartist in", values, "aartist");
            return (Criteria) this;
        }

        public Criteria andAartistNotIn(List<String> values) {
            addCriterion("aartist not in", values, "aartist");
            return (Criteria) this;
        }

        public Criteria andAartistBetween(String value1, String value2) {
            addCriterion("aartist between", value1, value2, "aartist");
            return (Criteria) this;
        }

        public Criteria andAartistNotBetween(String value1, String value2) {
            addCriterion("aartist not between", value1, value2, "aartist");
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

        public Criteria andAlbumnumIsNull() {
            addCriterion("albumNum is null");
            return (Criteria) this;
        }

        public Criteria andAlbumnumIsNotNull() {
            addCriterion("albumNum is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumnumEqualTo(Integer value) {
            addCriterion("albumNum =", value, "albumnum");
            return (Criteria) this;
        }

        public Criteria andAlbumnumNotEqualTo(Integer value) {
            addCriterion("albumNum <>", value, "albumnum");
            return (Criteria) this;
        }

        public Criteria andAlbumnumGreaterThan(Integer value) {
            addCriterion("albumNum >", value, "albumnum");
            return (Criteria) this;
        }

        public Criteria andAlbumnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("albumNum >=", value, "albumnum");
            return (Criteria) this;
        }

        public Criteria andAlbumnumLessThan(Integer value) {
            addCriterion("albumNum <", value, "albumnum");
            return (Criteria) this;
        }

        public Criteria andAlbumnumLessThanOrEqualTo(Integer value) {
            addCriterion("albumNum <=", value, "albumnum");
            return (Criteria) this;
        }

        public Criteria andAlbumnumIn(List<Integer> values) {
            addCriterion("albumNum in", values, "albumnum");
            return (Criteria) this;
        }

        public Criteria andAlbumnumNotIn(List<Integer> values) {
            addCriterion("albumNum not in", values, "albumnum");
            return (Criteria) this;
        }

        public Criteria andAlbumnumBetween(Integer value1, Integer value2) {
            addCriterion("albumNum between", value1, value2, "albumnum");
            return (Criteria) this;
        }

        public Criteria andAlbumnumNotBetween(Integer value1, Integer value2) {
            addCriterion("albumNum not between", value1, value2, "albumnum");
            return (Criteria) this;
        }

        public Criteria andMvnumIsNull() {
            addCriterion("mvNum is null");
            return (Criteria) this;
        }

        public Criteria andMvnumIsNotNull() {
            addCriterion("mvNum is not null");
            return (Criteria) this;
        }

        public Criteria andMvnumEqualTo(Integer value) {
            addCriterion("mvNum =", value, "mvnum");
            return (Criteria) this;
        }

        public Criteria andMvnumNotEqualTo(Integer value) {
            addCriterion("mvNum <>", value, "mvnum");
            return (Criteria) this;
        }

        public Criteria andMvnumGreaterThan(Integer value) {
            addCriterion("mvNum >", value, "mvnum");
            return (Criteria) this;
        }

        public Criteria andMvnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("mvNum >=", value, "mvnum");
            return (Criteria) this;
        }

        public Criteria andMvnumLessThan(Integer value) {
            addCriterion("mvNum <", value, "mvnum");
            return (Criteria) this;
        }

        public Criteria andMvnumLessThanOrEqualTo(Integer value) {
            addCriterion("mvNum <=", value, "mvnum");
            return (Criteria) this;
        }

        public Criteria andMvnumIn(List<Integer> values) {
            addCriterion("mvNum in", values, "mvnum");
            return (Criteria) this;
        }

        public Criteria andMvnumNotIn(List<Integer> values) {
            addCriterion("mvNum not in", values, "mvnum");
            return (Criteria) this;
        }

        public Criteria andMvnumBetween(Integer value1, Integer value2) {
            addCriterion("mvNum between", value1, value2, "mvnum");
            return (Criteria) this;
        }

        public Criteria andMvnumNotBetween(Integer value1, Integer value2) {
            addCriterion("mvNum not between", value1, value2, "mvnum");
            return (Criteria) this;
        }

        public Criteria andMusicnumIsNull() {
            addCriterion("musicNum is null");
            return (Criteria) this;
        }

        public Criteria andMusicnumIsNotNull() {
            addCriterion("musicNum is not null");
            return (Criteria) this;
        }

        public Criteria andMusicnumEqualTo(Integer value) {
            addCriterion("musicNum =", value, "musicnum");
            return (Criteria) this;
        }

        public Criteria andMusicnumNotEqualTo(Integer value) {
            addCriterion("musicNum <>", value, "musicnum");
            return (Criteria) this;
        }

        public Criteria andMusicnumGreaterThan(Integer value) {
            addCriterion("musicNum >", value, "musicnum");
            return (Criteria) this;
        }

        public Criteria andMusicnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("musicNum >=", value, "musicnum");
            return (Criteria) this;
        }

        public Criteria andMusicnumLessThan(Integer value) {
            addCriterion("musicNum <", value, "musicnum");
            return (Criteria) this;
        }

        public Criteria andMusicnumLessThanOrEqualTo(Integer value) {
            addCriterion("musicNum <=", value, "musicnum");
            return (Criteria) this;
        }

        public Criteria andMusicnumIn(List<Integer> values) {
            addCriterion("musicNum in", values, "musicnum");
            return (Criteria) this;
        }

        public Criteria andMusicnumNotIn(List<Integer> values) {
            addCriterion("musicNum not in", values, "musicnum");
            return (Criteria) this;
        }

        public Criteria andMusicnumBetween(Integer value1, Integer value2) {
            addCriterion("musicNum between", value1, value2, "musicnum");
            return (Criteria) this;
        }

        public Criteria andMusicnumNotBetween(Integer value1, Integer value2) {
            addCriterion("musicNum not between", value1, value2, "musicnum");
            return (Criteria) this;
        }

        public Criteria andArtistfansIsNull() {
            addCriterion("artistFans is null");
            return (Criteria) this;
        }

        public Criteria andArtistfansIsNotNull() {
            addCriterion("artistFans is not null");
            return (Criteria) this;
        }

        public Criteria andArtistfansEqualTo(Integer value) {
            addCriterion("artistFans =", value, "artistfans");
            return (Criteria) this;
        }

        public Criteria andArtistfansNotEqualTo(Integer value) {
            addCriterion("artistFans <>", value, "artistfans");
            return (Criteria) this;
        }

        public Criteria andArtistfansGreaterThan(Integer value) {
            addCriterion("artistFans >", value, "artistfans");
            return (Criteria) this;
        }

        public Criteria andArtistfansGreaterThanOrEqualTo(Integer value) {
            addCriterion("artistFans >=", value, "artistfans");
            return (Criteria) this;
        }

        public Criteria andArtistfansLessThan(Integer value) {
            addCriterion("artistFans <", value, "artistfans");
            return (Criteria) this;
        }

        public Criteria andArtistfansLessThanOrEqualTo(Integer value) {
            addCriterion("artistFans <=", value, "artistfans");
            return (Criteria) this;
        }

        public Criteria andArtistfansIn(List<Integer> values) {
            addCriterion("artistFans in", values, "artistfans");
            return (Criteria) this;
        }

        public Criteria andArtistfansNotIn(List<Integer> values) {
            addCriterion("artistFans not in", values, "artistfans");
            return (Criteria) this;
        }

        public Criteria andArtistfansBetween(Integer value1, Integer value2) {
            addCriterion("artistFans between", value1, value2, "artistfans");
            return (Criteria) this;
        }

        public Criteria andArtistfansNotBetween(Integer value1, Integer value2) {
            addCriterion("artistFans not between", value1, value2, "artistfans");
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

        public Criteria andPic70IsNull() {
            addCriterion("pic70 is null");
            return (Criteria) this;
        }

        public Criteria andPic70IsNotNull() {
            addCriterion("pic70 is not null");
            return (Criteria) this;
        }

        public Criteria andPic70EqualTo(String value) {
            addCriterion("pic70 =", value, "pic70");
            return (Criteria) this;
        }

        public Criteria andPic70NotEqualTo(String value) {
            addCriterion("pic70 <>", value, "pic70");
            return (Criteria) this;
        }

        public Criteria andPic70GreaterThan(String value) {
            addCriterion("pic70 >", value, "pic70");
            return (Criteria) this;
        }

        public Criteria andPic70GreaterThanOrEqualTo(String value) {
            addCriterion("pic70 >=", value, "pic70");
            return (Criteria) this;
        }

        public Criteria andPic70LessThan(String value) {
            addCriterion("pic70 <", value, "pic70");
            return (Criteria) this;
        }

        public Criteria andPic70LessThanOrEqualTo(String value) {
            addCriterion("pic70 <=", value, "pic70");
            return (Criteria) this;
        }

        public Criteria andPic70Like(String value) {
            addCriterion("pic70 like", value, "pic70");
            return (Criteria) this;
        }

        public Criteria andPic70NotLike(String value) {
            addCriterion("pic70 not like", value, "pic70");
            return (Criteria) this;
        }

        public Criteria andPic70In(List<String> values) {
            addCriterion("pic70 in", values, "pic70");
            return (Criteria) this;
        }

        public Criteria andPic70NotIn(List<String> values) {
            addCriterion("pic70 not in", values, "pic70");
            return (Criteria) this;
        }

        public Criteria andPic70Between(String value1, String value2) {
            addCriterion("pic70 between", value1, value2, "pic70");
            return (Criteria) this;
        }

        public Criteria andPic70NotBetween(String value1, String value2) {
            addCriterion("pic70 not between", value1, value2, "pic70");
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

        public Criteria andPic300IsNull() {
            addCriterion("pic300 is null");
            return (Criteria) this;
        }

        public Criteria andPic300IsNotNull() {
            addCriterion("pic300 is not null");
            return (Criteria) this;
        }

        public Criteria andPic300EqualTo(String value) {
            addCriterion("pic300 =", value, "pic300");
            return (Criteria) this;
        }

        public Criteria andPic300NotEqualTo(String value) {
            addCriterion("pic300 <>", value, "pic300");
            return (Criteria) this;
        }

        public Criteria andPic300GreaterThan(String value) {
            addCriterion("pic300 >", value, "pic300");
            return (Criteria) this;
        }

        public Criteria andPic300GreaterThanOrEqualTo(String value) {
            addCriterion("pic300 >=", value, "pic300");
            return (Criteria) this;
        }

        public Criteria andPic300LessThan(String value) {
            addCriterion("pic300 <", value, "pic300");
            return (Criteria) this;
        }

        public Criteria andPic300LessThanOrEqualTo(String value) {
            addCriterion("pic300 <=", value, "pic300");
            return (Criteria) this;
        }

        public Criteria andPic300Like(String value) {
            addCriterion("pic300 like", value, "pic300");
            return (Criteria) this;
        }

        public Criteria andPic300NotLike(String value) {
            addCriterion("pic300 not like", value, "pic300");
            return (Criteria) this;
        }

        public Criteria andPic300In(List<String> values) {
            addCriterion("pic300 in", values, "pic300");
            return (Criteria) this;
        }

        public Criteria andPic300NotIn(List<String> values) {
            addCriterion("pic300 not in", values, "pic300");
            return (Criteria) this;
        }

        public Criteria andPic300Between(String value1, String value2) {
            addCriterion("pic300 between", value1, value2, "pic300");
            return (Criteria) this;
        }

        public Criteria andPic300NotBetween(String value1, String value2) {
            addCriterion("pic300 not between", value1, value2, "pic300");
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

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andGenerIsNull() {
            addCriterion("gener is null");
            return (Criteria) this;
        }

        public Criteria andGenerIsNotNull() {
            addCriterion("gener is not null");
            return (Criteria) this;
        }

        public Criteria andGenerEqualTo(String value) {
            addCriterion("gener =", value, "gener");
            return (Criteria) this;
        }

        public Criteria andGenerNotEqualTo(String value) {
            addCriterion("gener <>", value, "gener");
            return (Criteria) this;
        }

        public Criteria andGenerGreaterThan(String value) {
            addCriterion("gener >", value, "gener");
            return (Criteria) this;
        }

        public Criteria andGenerGreaterThanOrEqualTo(String value) {
            addCriterion("gener >=", value, "gener");
            return (Criteria) this;
        }

        public Criteria andGenerLessThan(String value) {
            addCriterion("gener <", value, "gener");
            return (Criteria) this;
        }

        public Criteria andGenerLessThanOrEqualTo(String value) {
            addCriterion("gener <=", value, "gener");
            return (Criteria) this;
        }

        public Criteria andGenerLike(String value) {
            addCriterion("gener like", value, "gener");
            return (Criteria) this;
        }

        public Criteria andGenerNotLike(String value) {
            addCriterion("gener not like", value, "gener");
            return (Criteria) this;
        }

        public Criteria andGenerIn(List<String> values) {
            addCriterion("gener in", values, "gener");
            return (Criteria) this;
        }

        public Criteria andGenerNotIn(List<String> values) {
            addCriterion("gener not in", values, "gener");
            return (Criteria) this;
        }

        public Criteria andGenerBetween(String value1, String value2) {
            addCriterion("gener between", value1, value2, "gener");
            return (Criteria) this;
        }

        public Criteria andGenerNotBetween(String value1, String value2) {
            addCriterion("gener not between", value1, value2, "gener");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(String value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(String value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(String value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(String value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(String value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(String value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLike(String value) {
            addCriterion("weight like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotLike(String value) {
            addCriterion("weight not like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<String> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<String> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(String value1, String value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(String value1, String value2) {
            addCriterion("weight not between", value1, value2, "weight");
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

        public Criteria andUppcurlIsNull() {
            addCriterion("upPcUrl is null");
            return (Criteria) this;
        }

        public Criteria andUppcurlIsNotNull() {
            addCriterion("upPcUrl is not null");
            return (Criteria) this;
        }

        public Criteria andUppcurlEqualTo(String value) {
            addCriterion("upPcUrl =", value, "uppcurl");
            return (Criteria) this;
        }

        public Criteria andUppcurlNotEqualTo(String value) {
            addCriterion("upPcUrl <>", value, "uppcurl");
            return (Criteria) this;
        }

        public Criteria andUppcurlGreaterThan(String value) {
            addCriterion("upPcUrl >", value, "uppcurl");
            return (Criteria) this;
        }

        public Criteria andUppcurlGreaterThanOrEqualTo(String value) {
            addCriterion("upPcUrl >=", value, "uppcurl");
            return (Criteria) this;
        }

        public Criteria andUppcurlLessThan(String value) {
            addCriterion("upPcUrl <", value, "uppcurl");
            return (Criteria) this;
        }

        public Criteria andUppcurlLessThanOrEqualTo(String value) {
            addCriterion("upPcUrl <=", value, "uppcurl");
            return (Criteria) this;
        }

        public Criteria andUppcurlLike(String value) {
            addCriterion("upPcUrl like", value, "uppcurl");
            return (Criteria) this;
        }

        public Criteria andUppcurlNotLike(String value) {
            addCriterion("upPcUrl not like", value, "uppcurl");
            return (Criteria) this;
        }

        public Criteria andUppcurlIn(List<String> values) {
            addCriterion("upPcUrl in", values, "uppcurl");
            return (Criteria) this;
        }

        public Criteria andUppcurlNotIn(List<String> values) {
            addCriterion("upPcUrl not in", values, "uppcurl");
            return (Criteria) this;
        }

        public Criteria andUppcurlBetween(String value1, String value2) {
            addCriterion("upPcUrl between", value1, value2, "uppcurl");
            return (Criteria) this;
        }

        public Criteria andUppcurlNotBetween(String value1, String value2) {
            addCriterion("upPcUrl not between", value1, value2, "uppcurl");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIsNull() {
            addCriterion("birthplace is null");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIsNotNull() {
            addCriterion("birthplace is not null");
            return (Criteria) this;
        }

        public Criteria andBirthplaceEqualTo(String value) {
            addCriterion("birthplace =", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotEqualTo(String value) {
            addCriterion("birthplace <>", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceGreaterThan(String value) {
            addCriterion("birthplace >", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceGreaterThanOrEqualTo(String value) {
            addCriterion("birthplace >=", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLessThan(String value) {
            addCriterion("birthplace <", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLessThanOrEqualTo(String value) {
            addCriterion("birthplace <=", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLike(String value) {
            addCriterion("birthplace like", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotLike(String value) {
            addCriterion("birthplace not like", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIn(List<String> values) {
            addCriterion("birthplace in", values, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotIn(List<String> values) {
            addCriterion("birthplace not in", values, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceBetween(String value1, String value2) {
            addCriterion("birthplace between", value1, value2, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotBetween(String value1, String value2) {
            addCriterion("birthplace not between", value1, value2, "birthplace");
            return (Criteria) this;
        }

        public Criteria andConstellationIsNull() {
            addCriterion("constellation is null");
            return (Criteria) this;
        }

        public Criteria andConstellationIsNotNull() {
            addCriterion("constellation is not null");
            return (Criteria) this;
        }

        public Criteria andConstellationEqualTo(String value) {
            addCriterion("constellation =", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationNotEqualTo(String value) {
            addCriterion("constellation <>", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationGreaterThan(String value) {
            addCriterion("constellation >", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationGreaterThanOrEqualTo(String value) {
            addCriterion("constellation >=", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationLessThan(String value) {
            addCriterion("constellation <", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationLessThanOrEqualTo(String value) {
            addCriterion("constellation <=", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationLike(String value) {
            addCriterion("constellation like", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationNotLike(String value) {
            addCriterion("constellation not like", value, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationIn(List<String> values) {
            addCriterion("constellation in", values, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationNotIn(List<String> values) {
            addCriterion("constellation not in", values, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationBetween(String value1, String value2) {
            addCriterion("constellation between", value1, value2, "constellation");
            return (Criteria) this;
        }

        public Criteria andConstellationNotBetween(String value1, String value2) {
            addCriterion("constellation not between", value1, value2, "constellation");
            return (Criteria) this;
        }

        public Criteria andTallIsNull() {
            addCriterion("tall is null");
            return (Criteria) this;
        }

        public Criteria andTallIsNotNull() {
            addCriterion("tall is not null");
            return (Criteria) this;
        }

        public Criteria andTallEqualTo(String value) {
            addCriterion("tall =", value, "tall");
            return (Criteria) this;
        }

        public Criteria andTallNotEqualTo(String value) {
            addCriterion("tall <>", value, "tall");
            return (Criteria) this;
        }

        public Criteria andTallGreaterThan(String value) {
            addCriterion("tall >", value, "tall");
            return (Criteria) this;
        }

        public Criteria andTallGreaterThanOrEqualTo(String value) {
            addCriterion("tall >=", value, "tall");
            return (Criteria) this;
        }

        public Criteria andTallLessThan(String value) {
            addCriterion("tall <", value, "tall");
            return (Criteria) this;
        }

        public Criteria andTallLessThanOrEqualTo(String value) {
            addCriterion("tall <=", value, "tall");
            return (Criteria) this;
        }

        public Criteria andTallLike(String value) {
            addCriterion("tall like", value, "tall");
            return (Criteria) this;
        }

        public Criteria andTallNotLike(String value) {
            addCriterion("tall not like", value, "tall");
            return (Criteria) this;
        }

        public Criteria andTallIn(List<String> values) {
            addCriterion("tall in", values, "tall");
            return (Criteria) this;
        }

        public Criteria andTallNotIn(List<String> values) {
            addCriterion("tall not in", values, "tall");
            return (Criteria) this;
        }

        public Criteria andTallBetween(String value1, String value2) {
            addCriterion("tall between", value1, value2, "tall");
            return (Criteria) this;
        }

        public Criteria andTallNotBetween(String value1, String value2) {
            addCriterion("tall not between", value1, value2, "tall");
            return (Criteria) this;
        }

        public Criteria andInfoIsNull() {
            addCriterion("info is null");
            return (Criteria) this;
        }

        public Criteria andInfoIsNotNull() {
            addCriterion("info is not null");
            return (Criteria) this;
        }

        public Criteria andInfoEqualTo(String value) {
            addCriterion("info =", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotEqualTo(String value) {
            addCriterion("info <>", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThan(String value) {
            addCriterion("info >", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoGreaterThanOrEqualTo(String value) {
            addCriterion("info >=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThan(String value) {
            addCriterion("info <", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLessThanOrEqualTo(String value) {
            addCriterion("info <=", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoLike(String value) {
            addCriterion("info like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotLike(String value) {
            addCriterion("info not like", value, "info");
            return (Criteria) this;
        }

        public Criteria andInfoIn(List<String> values) {
            addCriterion("info in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotIn(List<String> values) {
            addCriterion("info not in", values, "info");
            return (Criteria) this;
        }

        public Criteria andInfoBetween(String value1, String value2) {
            addCriterion("info between", value1, value2, "info");
            return (Criteria) this;
        }

        public Criteria andInfoNotBetween(String value1, String value2) {
            addCriterion("info not between", value1, value2, "info");
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