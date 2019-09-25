package com.quelili.back.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QueLyricExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QueLyricExample() {
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

        public Criteria andLrclistIsNull() {
            addCriterion("lrcList is null");
            return (Criteria) this;
        }

        public Criteria andLrclistIsNotNull() {
            addCriterion("lrcList is not null");
            return (Criteria) this;
        }

        public Criteria andLrclistEqualTo(String value) {
            addCriterion("lrcList =", value, "lrclist");
            return (Criteria) this;
        }

        public Criteria andLrclistNotEqualTo(String value) {
            addCriterion("lrcList <>", value, "lrclist");
            return (Criteria) this;
        }

        public Criteria andLrclistGreaterThan(String value) {
            addCriterion("lrcList >", value, "lrclist");
            return (Criteria) this;
        }

        public Criteria andLrclistGreaterThanOrEqualTo(String value) {
            addCriterion("lrcList >=", value, "lrclist");
            return (Criteria) this;
        }

        public Criteria andLrclistLessThan(String value) {
            addCriterion("lrcList <", value, "lrclist");
            return (Criteria) this;
        }

        public Criteria andLrclistLessThanOrEqualTo(String value) {
            addCriterion("lrcList <=", value, "lrclist");
            return (Criteria) this;
        }

        public Criteria andLrclistLike(String value) {
            addCriterion("lrcList like", value, "lrclist");
            return (Criteria) this;
        }

        public Criteria andLrclistNotLike(String value) {
            addCriterion("lrcList not like", value, "lrclist");
            return (Criteria) this;
        }

        public Criteria andLrclistIn(List<String> values) {
            addCriterion("lrcList in", values, "lrclist");
            return (Criteria) this;
        }

        public Criteria andLrclistNotIn(List<String> values) {
            addCriterion("lrcList not in", values, "lrclist");
            return (Criteria) this;
        }

        public Criteria andLrclistBetween(String value1, String value2) {
            addCriterion("lrcList between", value1, value2, "lrclist");
            return (Criteria) this;
        }

        public Criteria andLrclistNotBetween(String value1, String value2) {
            addCriterion("lrcList not between", value1, value2, "lrclist");
            return (Criteria) this;
        }

        public Criteria andNsig1IsNull() {
            addCriterion("nsig1 is null");
            return (Criteria) this;
        }

        public Criteria andNsig1IsNotNull() {
            addCriterion("nsig1 is not null");
            return (Criteria) this;
        }

        public Criteria andNsig1EqualTo(String value) {
            addCriterion("nsig1 =", value, "nsig1");
            return (Criteria) this;
        }

        public Criteria andNsig1NotEqualTo(String value) {
            addCriterion("nsig1 <>", value, "nsig1");
            return (Criteria) this;
        }

        public Criteria andNsig1GreaterThan(String value) {
            addCriterion("nsig1 >", value, "nsig1");
            return (Criteria) this;
        }

        public Criteria andNsig1GreaterThanOrEqualTo(String value) {
            addCriterion("nsig1 >=", value, "nsig1");
            return (Criteria) this;
        }

        public Criteria andNsig1LessThan(String value) {
            addCriterion("nsig1 <", value, "nsig1");
            return (Criteria) this;
        }

        public Criteria andNsig1LessThanOrEqualTo(String value) {
            addCriterion("nsig1 <=", value, "nsig1");
            return (Criteria) this;
        }

        public Criteria andNsig1Like(String value) {
            addCriterion("nsig1 like", value, "nsig1");
            return (Criteria) this;
        }

        public Criteria andNsig1NotLike(String value) {
            addCriterion("nsig1 not like", value, "nsig1");
            return (Criteria) this;
        }

        public Criteria andNsig1In(List<String> values) {
            addCriterion("nsig1 in", values, "nsig1");
            return (Criteria) this;
        }

        public Criteria andNsig1NotIn(List<String> values) {
            addCriterion("nsig1 not in", values, "nsig1");
            return (Criteria) this;
        }

        public Criteria andNsig1Between(String value1, String value2) {
            addCriterion("nsig1 between", value1, value2, "nsig1");
            return (Criteria) this;
        }

        public Criteria andNsig1NotBetween(String value1, String value2) {
            addCriterion("nsig1 not between", value1, value2, "nsig1");
            return (Criteria) this;
        }

        public Criteria andNsig2IsNull() {
            addCriterion("nsig2 is null");
            return (Criteria) this;
        }

        public Criteria andNsig2IsNotNull() {
            addCriterion("nsig2 is not null");
            return (Criteria) this;
        }

        public Criteria andNsig2EqualTo(String value) {
            addCriterion("nsig2 =", value, "nsig2");
            return (Criteria) this;
        }

        public Criteria andNsig2NotEqualTo(String value) {
            addCriterion("nsig2 <>", value, "nsig2");
            return (Criteria) this;
        }

        public Criteria andNsig2GreaterThan(String value) {
            addCriterion("nsig2 >", value, "nsig2");
            return (Criteria) this;
        }

        public Criteria andNsig2GreaterThanOrEqualTo(String value) {
            addCriterion("nsig2 >=", value, "nsig2");
            return (Criteria) this;
        }

        public Criteria andNsig2LessThan(String value) {
            addCriterion("nsig2 <", value, "nsig2");
            return (Criteria) this;
        }

        public Criteria andNsig2LessThanOrEqualTo(String value) {
            addCriterion("nsig2 <=", value, "nsig2");
            return (Criteria) this;
        }

        public Criteria andNsig2Like(String value) {
            addCriterion("nsig2 like", value, "nsig2");
            return (Criteria) this;
        }

        public Criteria andNsig2NotLike(String value) {
            addCriterion("nsig2 not like", value, "nsig2");
            return (Criteria) this;
        }

        public Criteria andNsig2In(List<String> values) {
            addCriterion("nsig2 in", values, "nsig2");
            return (Criteria) this;
        }

        public Criteria andNsig2NotIn(List<String> values) {
            addCriterion("nsig2 not in", values, "nsig2");
            return (Criteria) this;
        }

        public Criteria andNsig2Between(String value1, String value2) {
            addCriterion("nsig2 between", value1, value2, "nsig2");
            return (Criteria) this;
        }

        public Criteria andNsig2NotBetween(String value1, String value2) {
            addCriterion("nsig2 not between", value1, value2, "nsig2");
            return (Criteria) this;
        }

        public Criteria andScore100IsNull() {
            addCriterion("score100 is null");
            return (Criteria) this;
        }

        public Criteria andScore100IsNotNull() {
            addCriterion("score100 is not null");
            return (Criteria) this;
        }

        public Criteria andScore100EqualTo(Integer value) {
            addCriterion("score100 =", value, "score100");
            return (Criteria) this;
        }

        public Criteria andScore100NotEqualTo(Integer value) {
            addCriterion("score100 <>", value, "score100");
            return (Criteria) this;
        }

        public Criteria andScore100GreaterThan(Integer value) {
            addCriterion("score100 >", value, "score100");
            return (Criteria) this;
        }

        public Criteria andScore100GreaterThanOrEqualTo(Integer value) {
            addCriterion("score100 >=", value, "score100");
            return (Criteria) this;
        }

        public Criteria andScore100LessThan(Integer value) {
            addCriterion("score100 <", value, "score100");
            return (Criteria) this;
        }

        public Criteria andScore100LessThanOrEqualTo(Integer value) {
            addCriterion("score100 <=", value, "score100");
            return (Criteria) this;
        }

        public Criteria andScore100In(List<Integer> values) {
            addCriterion("score100 in", values, "score100");
            return (Criteria) this;
        }

        public Criteria andScore100NotIn(List<Integer> values) {
            addCriterion("score100 not in", values, "score100");
            return (Criteria) this;
        }

        public Criteria andScore100Between(Integer value1, Integer value2) {
            addCriterion("score100 between", value1, value2, "score100");
            return (Criteria) this;
        }

        public Criteria andScore100NotBetween(Integer value1, Integer value2) {
            addCriterion("score100 not between", value1, value2, "score100");
            return (Criteria) this;
        }

        public Criteria andPlaycntIsNull() {
            addCriterion("playCnt is null");
            return (Criteria) this;
        }

        public Criteria andPlaycntIsNotNull() {
            addCriterion("playCnt is not null");
            return (Criteria) this;
        }

        public Criteria andPlaycntEqualTo(Integer value) {
            addCriterion("playCnt =", value, "playcnt");
            return (Criteria) this;
        }

        public Criteria andPlaycntNotEqualTo(Integer value) {
            addCriterion("playCnt <>", value, "playcnt");
            return (Criteria) this;
        }

        public Criteria andPlaycntGreaterThan(Integer value) {
            addCriterion("playCnt >", value, "playcnt");
            return (Criteria) this;
        }

        public Criteria andPlaycntGreaterThanOrEqualTo(Integer value) {
            addCriterion("playCnt >=", value, "playcnt");
            return (Criteria) this;
        }

        public Criteria andPlaycntLessThan(Integer value) {
            addCriterion("playCnt <", value, "playcnt");
            return (Criteria) this;
        }

        public Criteria andPlaycntLessThanOrEqualTo(Integer value) {
            addCriterion("playCnt <=", value, "playcnt");
            return (Criteria) this;
        }

        public Criteria andPlaycntIn(List<Integer> values) {
            addCriterion("playCnt in", values, "playcnt");
            return (Criteria) this;
        }

        public Criteria andPlaycntNotIn(List<Integer> values) {
            addCriterion("playCnt not in", values, "playcnt");
            return (Criteria) this;
        }

        public Criteria andPlaycntBetween(Integer value1, Integer value2) {
            addCriterion("playCnt between", value1, value2, "playcnt");
            return (Criteria) this;
        }

        public Criteria andPlaycntNotBetween(Integer value1, Integer value2) {
            addCriterion("playCnt not between", value1, value2, "playcnt");
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