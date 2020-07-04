package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class CheziExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheziExample() {
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

        public Criteria andChangshangIsNull() {
            addCriterion("changshang is null");
            return (Criteria) this;
        }

        public Criteria andChangshangIsNotNull() {
            addCriterion("changshang is not null");
            return (Criteria) this;
        }

        public Criteria andChangshangEqualTo(String value) {
            addCriterion("changshang =", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangNotEqualTo(String value) {
            addCriterion("changshang <>", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangGreaterThan(String value) {
            addCriterion("changshang >", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangGreaterThanOrEqualTo(String value) {
            addCriterion("changshang >=", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangLessThan(String value) {
            addCriterion("changshang <", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangLessThanOrEqualTo(String value) {
            addCriterion("changshang <=", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangLike(String value) {
            addCriterion("changshang like", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangNotLike(String value) {
            addCriterion("changshang not like", value, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangIn(List<String> values) {
            addCriterion("changshang in", values, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangNotIn(List<String> values) {
            addCriterion("changshang not in", values, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangBetween(String value1, String value2) {
            addCriterion("changshang between", value1, value2, "changshang");
            return (Criteria) this;
        }

        public Criteria andChangshangNotBetween(String value1, String value2) {
            addCriterion("changshang not between", value1, value2, "changshang");
            return (Criteria) this;
        }

        public Criteria andCsjiegouIsNull() {
            addCriterion("csjiegou is null");
            return (Criteria) this;
        }

        public Criteria andCsjiegouIsNotNull() {
            addCriterion("csjiegou is not null");
            return (Criteria) this;
        }

        public Criteria andCsjiegouEqualTo(String value) {
            addCriterion("csjiegou =", value, "csjiegou");
            return (Criteria) this;
        }

        public Criteria andCsjiegouNotEqualTo(String value) {
            addCriterion("csjiegou <>", value, "csjiegou");
            return (Criteria) this;
        }

        public Criteria andCsjiegouGreaterThan(String value) {
            addCriterion("csjiegou >", value, "csjiegou");
            return (Criteria) this;
        }

        public Criteria andCsjiegouGreaterThanOrEqualTo(String value) {
            addCriterion("csjiegou >=", value, "csjiegou");
            return (Criteria) this;
        }

        public Criteria andCsjiegouLessThan(String value) {
            addCriterion("csjiegou <", value, "csjiegou");
            return (Criteria) this;
        }

        public Criteria andCsjiegouLessThanOrEqualTo(String value) {
            addCriterion("csjiegou <=", value, "csjiegou");
            return (Criteria) this;
        }

        public Criteria andCsjiegouLike(String value) {
            addCriterion("csjiegou like", value, "csjiegou");
            return (Criteria) this;
        }

        public Criteria andCsjiegouNotLike(String value) {
            addCriterion("csjiegou not like", value, "csjiegou");
            return (Criteria) this;
        }

        public Criteria andCsjiegouIn(List<String> values) {
            addCriterion("csjiegou in", values, "csjiegou");
            return (Criteria) this;
        }

        public Criteria andCsjiegouNotIn(List<String> values) {
            addCriterion("csjiegou not in", values, "csjiegou");
            return (Criteria) this;
        }

        public Criteria andCsjiegouBetween(String value1, String value2) {
            addCriterion("csjiegou between", value1, value2, "csjiegou");
            return (Criteria) this;
        }

        public Criteria andCsjiegouNotBetween(String value1, String value2) {
            addCriterion("csjiegou not between", value1, value2, "csjiegou");
            return (Criteria) this;
        }

        public Criteria andCkgIsNull() {
            addCriterion("ckg is null");
            return (Criteria) this;
        }

        public Criteria andCkgIsNotNull() {
            addCriterion("ckg is not null");
            return (Criteria) this;
        }

        public Criteria andCkgEqualTo(String value) {
            addCriterion("ckg =", value, "ckg");
            return (Criteria) this;
        }

        public Criteria andCkgNotEqualTo(String value) {
            addCriterion("ckg <>", value, "ckg");
            return (Criteria) this;
        }

        public Criteria andCkgGreaterThan(String value) {
            addCriterion("ckg >", value, "ckg");
            return (Criteria) this;
        }

        public Criteria andCkgGreaterThanOrEqualTo(String value) {
            addCriterion("ckg >=", value, "ckg");
            return (Criteria) this;
        }

        public Criteria andCkgLessThan(String value) {
            addCriterion("ckg <", value, "ckg");
            return (Criteria) this;
        }

        public Criteria andCkgLessThanOrEqualTo(String value) {
            addCriterion("ckg <=", value, "ckg");
            return (Criteria) this;
        }

        public Criteria andCkgLike(String value) {
            addCriterion("ckg like", value, "ckg");
            return (Criteria) this;
        }

        public Criteria andCkgNotLike(String value) {
            addCriterion("ckg not like", value, "ckg");
            return (Criteria) this;
        }

        public Criteria andCkgIn(List<String> values) {
            addCriterion("ckg in", values, "ckg");
            return (Criteria) this;
        }

        public Criteria andCkgNotIn(List<String> values) {
            addCriterion("ckg not in", values, "ckg");
            return (Criteria) this;
        }

        public Criteria andCkgBetween(String value1, String value2) {
            addCriterion("ckg between", value1, value2, "ckg");
            return (Criteria) this;
        }

        public Criteria andCkgNotBetween(String value1, String value2) {
            addCriterion("ckg not between", value1, value2, "ckg");
            return (Criteria) this;
        }

        public Criteria andFadongjiIsNull() {
            addCriterion("fadongji is null");
            return (Criteria) this;
        }

        public Criteria andFadongjiIsNotNull() {
            addCriterion("fadongji is not null");
            return (Criteria) this;
        }

        public Criteria andFadongjiEqualTo(String value) {
            addCriterion("fadongji =", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiNotEqualTo(String value) {
            addCriterion("fadongji <>", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiGreaterThan(String value) {
            addCriterion("fadongji >", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiGreaterThanOrEqualTo(String value) {
            addCriterion("fadongji >=", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiLessThan(String value) {
            addCriterion("fadongji <", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiLessThanOrEqualTo(String value) {
            addCriterion("fadongji <=", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiLike(String value) {
            addCriterion("fadongji like", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiNotLike(String value) {
            addCriterion("fadongji not like", value, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiIn(List<String> values) {
            addCriterion("fadongji in", values, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiNotIn(List<String> values) {
            addCriterion("fadongji not in", values, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiBetween(String value1, String value2) {
            addCriterion("fadongji between", value1, value2, "fadongji");
            return (Criteria) this;
        }

        public Criteria andFadongjiNotBetween(String value1, String value2) {
            addCriterion("fadongji not between", value1, value2, "fadongji");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangIsNull() {
            addCriterion("biansuxiang is null");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangIsNotNull() {
            addCriterion("biansuxiang is not null");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangEqualTo(String value) {
            addCriterion("biansuxiang =", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangNotEqualTo(String value) {
            addCriterion("biansuxiang <>", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangGreaterThan(String value) {
            addCriterion("biansuxiang >", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangGreaterThanOrEqualTo(String value) {
            addCriterion("biansuxiang >=", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangLessThan(String value) {
            addCriterion("biansuxiang <", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangLessThanOrEqualTo(String value) {
            addCriterion("biansuxiang <=", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangLike(String value) {
            addCriterion("biansuxiang like", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangNotLike(String value) {
            addCriterion("biansuxiang not like", value, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangIn(List<String> values) {
            addCriterion("biansuxiang in", values, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangNotIn(List<String> values) {
            addCriterion("biansuxiang not in", values, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangBetween(String value1, String value2) {
            addCriterion("biansuxiang between", value1, value2, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andBiansuxiangNotBetween(String value1, String value2) {
            addCriterion("biansuxiang not between", value1, value2, "biansuxiang");
            return (Criteria) this;
        }

        public Criteria andKmhIsNull() {
            addCriterion("kmh is null");
            return (Criteria) this;
        }

        public Criteria andKmhIsNotNull() {
            addCriterion("kmh is not null");
            return (Criteria) this;
        }

        public Criteria andKmhEqualTo(Integer value) {
            addCriterion("kmh =", value, "kmh");
            return (Criteria) this;
        }

        public Criteria andKmhNotEqualTo(Integer value) {
            addCriterion("kmh <>", value, "kmh");
            return (Criteria) this;
        }

        public Criteria andKmhGreaterThan(Integer value) {
            addCriterion("kmh >", value, "kmh");
            return (Criteria) this;
        }

        public Criteria andKmhGreaterThanOrEqualTo(Integer value) {
            addCriterion("kmh >=", value, "kmh");
            return (Criteria) this;
        }

        public Criteria andKmhLessThan(Integer value) {
            addCriterion("kmh <", value, "kmh");
            return (Criteria) this;
        }

        public Criteria andKmhLessThanOrEqualTo(Integer value) {
            addCriterion("kmh <=", value, "kmh");
            return (Criteria) this;
        }

        public Criteria andKmhIn(List<Integer> values) {
            addCriterion("kmh in", values, "kmh");
            return (Criteria) this;
        }

        public Criteria andKmhNotIn(List<Integer> values) {
            addCriterion("kmh not in", values, "kmh");
            return (Criteria) this;
        }

        public Criteria andKmhBetween(Integer value1, Integer value2) {
            addCriterion("kmh between", value1, value2, "kmh");
            return (Criteria) this;
        }

        public Criteria andKmhNotBetween(Integer value1, Integer value2) {
            addCriterion("kmh not between", value1, value2, "kmh");
            return (Criteria) this;
        }

        public Criteria andJstimeIsNull() {
            addCriterion("jstime is null");
            return (Criteria) this;
        }

        public Criteria andJstimeIsNotNull() {
            addCriterion("jstime is not null");
            return (Criteria) this;
        }

        public Criteria andJstimeEqualTo(Double value) {
            addCriterion("jstime =", value, "jstime");
            return (Criteria) this;
        }

        public Criteria andJstimeNotEqualTo(Double value) {
            addCriterion("jstime <>", value, "jstime");
            return (Criteria) this;
        }

        public Criteria andJstimeGreaterThan(Double value) {
            addCriterion("jstime >", value, "jstime");
            return (Criteria) this;
        }

        public Criteria andJstimeGreaterThanOrEqualTo(Double value) {
            addCriterion("jstime >=", value, "jstime");
            return (Criteria) this;
        }

        public Criteria andJstimeLessThan(Double value) {
            addCriterion("jstime <", value, "jstime");
            return (Criteria) this;
        }

        public Criteria andJstimeLessThanOrEqualTo(Double value) {
            addCriterion("jstime <=", value, "jstime");
            return (Criteria) this;
        }

        public Criteria andJstimeIn(List<Double> values) {
            addCriterion("jstime in", values, "jstime");
            return (Criteria) this;
        }

        public Criteria andJstimeNotIn(List<Double> values) {
            addCriterion("jstime not in", values, "jstime");
            return (Criteria) this;
        }

        public Criteria andJstimeBetween(Double value1, Double value2) {
            addCriterion("jstime between", value1, value2, "jstime");
            return (Criteria) this;
        }

        public Criteria andJstimeNotBetween(Double value1, Double value2) {
            addCriterion("jstime not between", value1, value2, "jstime");
            return (Criteria) this;
        }

        public Criteria andGfyhIsNull() {
            addCriterion("gfyh is null");
            return (Criteria) this;
        }

        public Criteria andGfyhIsNotNull() {
            addCriterion("gfyh is not null");
            return (Criteria) this;
        }

        public Criteria andGfyhEqualTo(String value) {
            addCriterion("gfyh =", value, "gfyh");
            return (Criteria) this;
        }

        public Criteria andGfyhNotEqualTo(String value) {
            addCriterion("gfyh <>", value, "gfyh");
            return (Criteria) this;
        }

        public Criteria andGfyhGreaterThan(String value) {
            addCriterion("gfyh >", value, "gfyh");
            return (Criteria) this;
        }

        public Criteria andGfyhGreaterThanOrEqualTo(String value) {
            addCriterion("gfyh >=", value, "gfyh");
            return (Criteria) this;
        }

        public Criteria andGfyhLessThan(String value) {
            addCriterion("gfyh <", value, "gfyh");
            return (Criteria) this;
        }

        public Criteria andGfyhLessThanOrEqualTo(String value) {
            addCriterion("gfyh <=", value, "gfyh");
            return (Criteria) this;
        }

        public Criteria andGfyhLike(String value) {
            addCriterion("gfyh like", value, "gfyh");
            return (Criteria) this;
        }

        public Criteria andGfyhNotLike(String value) {
            addCriterion("gfyh not like", value, "gfyh");
            return (Criteria) this;
        }

        public Criteria andGfyhIn(List<String> values) {
            addCriterion("gfyh in", values, "gfyh");
            return (Criteria) this;
        }

        public Criteria andGfyhNotIn(List<String> values) {
            addCriterion("gfyh not in", values, "gfyh");
            return (Criteria) this;
        }

        public Criteria andGfyhBetween(String value1, String value2) {
            addCriterion("gfyh between", value1, value2, "gfyh");
            return (Criteria) this;
        }

        public Criteria andGfyhNotBetween(String value1, String value2) {
            addCriterion("gfyh not between", value1, value2, "gfyh");
            return (Criteria) this;
        }

        public Criteria andBaoxiuIsNull() {
            addCriterion("baoxiu is null");
            return (Criteria) this;
        }

        public Criteria andBaoxiuIsNotNull() {
            addCriterion("baoxiu is not null");
            return (Criteria) this;
        }

        public Criteria andBaoxiuEqualTo(String value) {
            addCriterion("baoxiu =", value, "baoxiu");
            return (Criteria) this;
        }

        public Criteria andBaoxiuNotEqualTo(String value) {
            addCriterion("baoxiu <>", value, "baoxiu");
            return (Criteria) this;
        }

        public Criteria andBaoxiuGreaterThan(String value) {
            addCriterion("baoxiu >", value, "baoxiu");
            return (Criteria) this;
        }

        public Criteria andBaoxiuGreaterThanOrEqualTo(String value) {
            addCriterion("baoxiu >=", value, "baoxiu");
            return (Criteria) this;
        }

        public Criteria andBaoxiuLessThan(String value) {
            addCriterion("baoxiu <", value, "baoxiu");
            return (Criteria) this;
        }

        public Criteria andBaoxiuLessThanOrEqualTo(String value) {
            addCriterion("baoxiu <=", value, "baoxiu");
            return (Criteria) this;
        }

        public Criteria andBaoxiuLike(String value) {
            addCriterion("baoxiu like", value, "baoxiu");
            return (Criteria) this;
        }

        public Criteria andBaoxiuNotLike(String value) {
            addCriterion("baoxiu not like", value, "baoxiu");
            return (Criteria) this;
        }

        public Criteria andBaoxiuIn(List<String> values) {
            addCriterion("baoxiu in", values, "baoxiu");
            return (Criteria) this;
        }

        public Criteria andBaoxiuNotIn(List<String> values) {
            addCriterion("baoxiu not in", values, "baoxiu");
            return (Criteria) this;
        }

        public Criteria andBaoxiuBetween(String value1, String value2) {
            addCriterion("baoxiu between", value1, value2, "baoxiu");
            return (Criteria) this;
        }

        public Criteria andBaoxiuNotBetween(String value1, String value2) {
            addCriterion("baoxiu not between", value1, value2, "baoxiu");
            return (Criteria) this;
        }

        public Criteria andDongliIsNull() {
            addCriterion("dongli is null");
            return (Criteria) this;
        }

        public Criteria andDongliIsNotNull() {
            addCriterion("dongli is not null");
            return (Criteria) this;
        }

        public Criteria andDongliEqualTo(String value) {
            addCriterion("dongli =", value, "dongli");
            return (Criteria) this;
        }

        public Criteria andDongliNotEqualTo(String value) {
            addCriterion("dongli <>", value, "dongli");
            return (Criteria) this;
        }

        public Criteria andDongliGreaterThan(String value) {
            addCriterion("dongli >", value, "dongli");
            return (Criteria) this;
        }

        public Criteria andDongliGreaterThanOrEqualTo(String value) {
            addCriterion("dongli >=", value, "dongli");
            return (Criteria) this;
        }

        public Criteria andDongliLessThan(String value) {
            addCriterion("dongli <", value, "dongli");
            return (Criteria) this;
        }

        public Criteria andDongliLessThanOrEqualTo(String value) {
            addCriterion("dongli <=", value, "dongli");
            return (Criteria) this;
        }

        public Criteria andDongliLike(String value) {
            addCriterion("dongli like", value, "dongli");
            return (Criteria) this;
        }

        public Criteria andDongliNotLike(String value) {
            addCriterion("dongli not like", value, "dongli");
            return (Criteria) this;
        }

        public Criteria andDongliIn(List<String> values) {
            addCriterion("dongli in", values, "dongli");
            return (Criteria) this;
        }

        public Criteria andDongliNotIn(List<String> values) {
            addCriterion("dongli not in", values, "dongli");
            return (Criteria) this;
        }

        public Criteria andDongliBetween(String value1, String value2) {
            addCriterion("dongli between", value1, value2, "dongli");
            return (Criteria) this;
        }

        public Criteria andDongliNotBetween(String value1, String value2) {
            addCriterion("dongli not between", value1, value2, "dongli");
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