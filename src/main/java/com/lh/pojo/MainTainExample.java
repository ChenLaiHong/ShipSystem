package com.lh.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainTainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MainTainExample() {
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

        public Criteria andMainTainIdIsNull() {
            addCriterion("main_tain_id is null");
            return (Criteria) this;
        }

        public Criteria andMainTainIdIsNotNull() {
            addCriterion("main_tain_id is not null");
            return (Criteria) this;
        }

        public Criteria andMainTainIdEqualTo(Integer value) {
            addCriterion("main_tain_id =", value, "mainTainId");
            return (Criteria) this;
        }

        public Criteria andMainTainIdNotEqualTo(Integer value) {
            addCriterion("main_tain_id <>", value, "mainTainId");
            return (Criteria) this;
        }

        public Criteria andMainTainIdGreaterThan(Integer value) {
            addCriterion("main_tain_id >", value, "mainTainId");
            return (Criteria) this;
        }

        public Criteria andMainTainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("main_tain_id >=", value, "mainTainId");
            return (Criteria) this;
        }

        public Criteria andMainTainIdLessThan(Integer value) {
            addCriterion("main_tain_id <", value, "mainTainId");
            return (Criteria) this;
        }

        public Criteria andMainTainIdLessThanOrEqualTo(Integer value) {
            addCriterion("main_tain_id <=", value, "mainTainId");
            return (Criteria) this;
        }

        public Criteria andMainTainIdIn(List<Integer> values) {
            addCriterion("main_tain_id in", values, "mainTainId");
            return (Criteria) this;
        }

        public Criteria andMainTainIdNotIn(List<Integer> values) {
            addCriterion("main_tain_id not in", values, "mainTainId");
            return (Criteria) this;
        }

        public Criteria andMainTainIdBetween(Integer value1, Integer value2) {
            addCriterion("main_tain_id between", value1, value2, "mainTainId");
            return (Criteria) this;
        }

        public Criteria andMainTainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("main_tain_id not between", value1, value2, "mainTainId");
            return (Criteria) this;
        }

        public Criteria andMainTainNameIsNull() {
            addCriterion("main_tain_name is null");
            return (Criteria) this;
        }

        public Criteria andMainTainNameIsNotNull() {
            addCriterion("main_tain_name is not null");
            return (Criteria) this;
        }

        public Criteria andMainTainNameEqualTo(String value) {
            addCriterion("main_tain_name =", value, "mainTainName");
            return (Criteria) this;
        }

        public Criteria andMainTainNameNotEqualTo(String value) {
            addCriterion("main_tain_name <>", value, "mainTainName");
            return (Criteria) this;
        }

        public Criteria andMainTainNameGreaterThan(String value) {
            addCriterion("main_tain_name >", value, "mainTainName");
            return (Criteria) this;
        }

        public Criteria andMainTainNameGreaterThanOrEqualTo(String value) {
            addCriterion("main_tain_name >=", value, "mainTainName");
            return (Criteria) this;
        }

        public Criteria andMainTainNameLessThan(String value) {
            addCriterion("main_tain_name <", value, "mainTainName");
            return (Criteria) this;
        }

        public Criteria andMainTainNameLessThanOrEqualTo(String value) {
            addCriterion("main_tain_name <=", value, "mainTainName");
            return (Criteria) this;
        }

        public Criteria andMainTainNameLike(String value) {
            addCriterion("main_tain_name like", value, "mainTainName");
            return (Criteria) this;
        }

        public Criteria andMainTainNameNotLike(String value) {
            addCriterion("main_tain_name not like", value, "mainTainName");
            return (Criteria) this;
        }

        public Criteria andMainTainNameIn(List<String> values) {
            addCriterion("main_tain_name in", values, "mainTainName");
            return (Criteria) this;
        }

        public Criteria andMainTainNameNotIn(List<String> values) {
            addCriterion("main_tain_name not in", values, "mainTainName");
            return (Criteria) this;
        }

        public Criteria andMainTainNameBetween(String value1, String value2) {
            addCriterion("main_tain_name between", value1, value2, "mainTainName");
            return (Criteria) this;
        }

        public Criteria andMainTainNameNotBetween(String value1, String value2) {
            addCriterion("main_tain_name not between", value1, value2, "mainTainName");
            return (Criteria) this;
        }

        public Criteria andMainTainRemarkIsNull() {
            addCriterion("main_tain_remark is null");
            return (Criteria) this;
        }

        public Criteria andMainTainRemarkIsNotNull() {
            addCriterion("main_tain_remark is not null");
            return (Criteria) this;
        }

        public Criteria andMainTainRemarkEqualTo(String value) {
            addCriterion("main_tain_remark =", value, "mainTainRemark");
            return (Criteria) this;
        }

        public Criteria andMainTainRemarkNotEqualTo(String value) {
            addCriterion("main_tain_remark <>", value, "mainTainRemark");
            return (Criteria) this;
        }

        public Criteria andMainTainRemarkGreaterThan(String value) {
            addCriterion("main_tain_remark >", value, "mainTainRemark");
            return (Criteria) this;
        }

        public Criteria andMainTainRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("main_tain_remark >=", value, "mainTainRemark");
            return (Criteria) this;
        }

        public Criteria andMainTainRemarkLessThan(String value) {
            addCriterion("main_tain_remark <", value, "mainTainRemark");
            return (Criteria) this;
        }

        public Criteria andMainTainRemarkLessThanOrEqualTo(String value) {
            addCriterion("main_tain_remark <=", value, "mainTainRemark");
            return (Criteria) this;
        }

        public Criteria andMainTainRemarkLike(String value) {
            addCriterion("main_tain_remark like", value, "mainTainRemark");
            return (Criteria) this;
        }

        public Criteria andMainTainRemarkNotLike(String value) {
            addCriterion("main_tain_remark not like", value, "mainTainRemark");
            return (Criteria) this;
        }

        public Criteria andMainTainRemarkIn(List<String> values) {
            addCriterion("main_tain_remark in", values, "mainTainRemark");
            return (Criteria) this;
        }

        public Criteria andMainTainRemarkNotIn(List<String> values) {
            addCriterion("main_tain_remark not in", values, "mainTainRemark");
            return (Criteria) this;
        }

        public Criteria andMainTainRemarkBetween(String value1, String value2) {
            addCriterion("main_tain_remark between", value1, value2, "mainTainRemark");
            return (Criteria) this;
        }

        public Criteria andMainTainRemarkNotBetween(String value1, String value2) {
            addCriterion("main_tain_remark not between", value1, value2, "mainTainRemark");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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