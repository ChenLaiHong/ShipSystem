package com.lh.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BluePrintExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BluePrintExample() {
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

        public Criteria andPrintIdIsNull() {
            addCriterion("print_id is null");
            return (Criteria) this;
        }

        public Criteria andPrintIdIsNotNull() {
            addCriterion("print_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrintIdEqualTo(Integer value) {
            addCriterion("print_id =", value, "printId");
            return (Criteria) this;
        }

        public Criteria andPrintIdNotEqualTo(Integer value) {
            addCriterion("print_id <>", value, "printId");
            return (Criteria) this;
        }

        public Criteria andPrintIdGreaterThan(Integer value) {
            addCriterion("print_id >", value, "printId");
            return (Criteria) this;
        }

        public Criteria andPrintIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("print_id >=", value, "printId");
            return (Criteria) this;
        }

        public Criteria andPrintIdLessThan(Integer value) {
            addCriterion("print_id <", value, "printId");
            return (Criteria) this;
        }

        public Criteria andPrintIdLessThanOrEqualTo(Integer value) {
            addCriterion("print_id <=", value, "printId");
            return (Criteria) this;
        }

        public Criteria andPrintIdIn(List<Integer> values) {
            addCriterion("print_id in", values, "printId");
            return (Criteria) this;
        }

        public Criteria andPrintIdNotIn(List<Integer> values) {
            addCriterion("print_id not in", values, "printId");
            return (Criteria) this;
        }

        public Criteria andPrintIdBetween(Integer value1, Integer value2) {
            addCriterion("print_id between", value1, value2, "printId");
            return (Criteria) this;
        }

        public Criteria andPrintIdNotBetween(Integer value1, Integer value2) {
            addCriterion("print_id not between", value1, value2, "printId");
            return (Criteria) this;
        }

        public Criteria andPrintNameIsNull() {
            addCriterion("print_name is null");
            return (Criteria) this;
        }

        public Criteria andPrintNameIsNotNull() {
            addCriterion("print_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrintNameEqualTo(String value) {
            addCriterion("print_name =", value, "printName");
            return (Criteria) this;
        }

        public Criteria andPrintNameNotEqualTo(String value) {
            addCriterion("print_name <>", value, "printName");
            return (Criteria) this;
        }

        public Criteria andPrintNameGreaterThan(String value) {
            addCriterion("print_name >", value, "printName");
            return (Criteria) this;
        }

        public Criteria andPrintNameGreaterThanOrEqualTo(String value) {
            addCriterion("print_name >=", value, "printName");
            return (Criteria) this;
        }

        public Criteria andPrintNameLessThan(String value) {
            addCriterion("print_name <", value, "printName");
            return (Criteria) this;
        }

        public Criteria andPrintNameLessThanOrEqualTo(String value) {
            addCriterion("print_name <=", value, "printName");
            return (Criteria) this;
        }

        public Criteria andPrintNameLike(String value) {
            addCriterion("print_name like", value, "printName");
            return (Criteria) this;
        }

        public Criteria andPrintNameNotLike(String value) {
            addCriterion("print_name not like", value, "printName");
            return (Criteria) this;
        }

        public Criteria andPrintNameIn(List<String> values) {
            addCriterion("print_name in", values, "printName");
            return (Criteria) this;
        }

        public Criteria andPrintNameNotIn(List<String> values) {
            addCriterion("print_name not in", values, "printName");
            return (Criteria) this;
        }

        public Criteria andPrintNameBetween(String value1, String value2) {
            addCriterion("print_name between", value1, value2, "printName");
            return (Criteria) this;
        }

        public Criteria andPrintNameNotBetween(String value1, String value2) {
            addCriterion("print_name not between", value1, value2, "printName");
            return (Criteria) this;
        }

        public Criteria andPrintUrlIsNull() {
            addCriterion("print_url is null");
            return (Criteria) this;
        }

        public Criteria andPrintUrlIsNotNull() {
            addCriterion("print_url is not null");
            return (Criteria) this;
        }

        public Criteria andPrintUrlEqualTo(String value) {
            addCriterion("print_url =", value, "printUrl");
            return (Criteria) this;
        }

        public Criteria andPrintUrlNotEqualTo(String value) {
            addCriterion("print_url <>", value, "printUrl");
            return (Criteria) this;
        }

        public Criteria andPrintUrlGreaterThan(String value) {
            addCriterion("print_url >", value, "printUrl");
            return (Criteria) this;
        }

        public Criteria andPrintUrlGreaterThanOrEqualTo(String value) {
            addCriterion("print_url >=", value, "printUrl");
            return (Criteria) this;
        }

        public Criteria andPrintUrlLessThan(String value) {
            addCriterion("print_url <", value, "printUrl");
            return (Criteria) this;
        }

        public Criteria andPrintUrlLessThanOrEqualTo(String value) {
            addCriterion("print_url <=", value, "printUrl");
            return (Criteria) this;
        }

        public Criteria andPrintUrlLike(String value) {
            addCriterion("print_url like", value, "printUrl");
            return (Criteria) this;
        }

        public Criteria andPrintUrlNotLike(String value) {
            addCriterion("print_url not like", value, "printUrl");
            return (Criteria) this;
        }

        public Criteria andPrintUrlIn(List<String> values) {
            addCriterion("print_url in", values, "printUrl");
            return (Criteria) this;
        }

        public Criteria andPrintUrlNotIn(List<String> values) {
            addCriterion("print_url not in", values, "printUrl");
            return (Criteria) this;
        }

        public Criteria andPrintUrlBetween(String value1, String value2) {
            addCriterion("print_url between", value1, value2, "printUrl");
            return (Criteria) this;
        }

        public Criteria andPrintUrlNotBetween(String value1, String value2) {
            addCriterion("print_url not between", value1, value2, "printUrl");
            return (Criteria) this;
        }

        public Criteria andPrintAliasNameIsNull() {
            addCriterion("print_alias_name is null");
            return (Criteria) this;
        }

        public Criteria andPrintAliasNameIsNotNull() {
            addCriterion("print_alias_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrintAliasNameEqualTo(String value) {
            addCriterion("print_alias_name =", value, "printAliasName");
            return (Criteria) this;
        }

        public Criteria andPrintAliasNameNotEqualTo(String value) {
            addCriterion("print_alias_name <>", value, "printAliasName");
            return (Criteria) this;
        }

        public Criteria andPrintAliasNameGreaterThan(String value) {
            addCriterion("print_alias_name >", value, "printAliasName");
            return (Criteria) this;
        }

        public Criteria andPrintAliasNameGreaterThanOrEqualTo(String value) {
            addCriterion("print_alias_name >=", value, "printAliasName");
            return (Criteria) this;
        }

        public Criteria andPrintAliasNameLessThan(String value) {
            addCriterion("print_alias_name <", value, "printAliasName");
            return (Criteria) this;
        }

        public Criteria andPrintAliasNameLessThanOrEqualTo(String value) {
            addCriterion("print_alias_name <=", value, "printAliasName");
            return (Criteria) this;
        }

        public Criteria andPrintAliasNameLike(String value) {
            addCriterion("print_alias_name like", value, "printAliasName");
            return (Criteria) this;
        }

        public Criteria andPrintAliasNameNotLike(String value) {
            addCriterion("print_alias_name not like", value, "printAliasName");
            return (Criteria) this;
        }

        public Criteria andPrintAliasNameIn(List<String> values) {
            addCriterion("print_alias_name in", values, "printAliasName");
            return (Criteria) this;
        }

        public Criteria andPrintAliasNameNotIn(List<String> values) {
            addCriterion("print_alias_name not in", values, "printAliasName");
            return (Criteria) this;
        }

        public Criteria andPrintAliasNameBetween(String value1, String value2) {
            addCriterion("print_alias_name between", value1, value2, "printAliasName");
            return (Criteria) this;
        }

        public Criteria andPrintAliasNameNotBetween(String value1, String value2) {
            addCriterion("print_alias_name not between", value1, value2, "printAliasName");
            return (Criteria) this;
        }

        public Criteria andPrintTypeIsNull() {
            addCriterion("print_type is null");
            return (Criteria) this;
        }

        public Criteria andPrintTypeIsNotNull() {
            addCriterion("print_type is not null");
            return (Criteria) this;
        }

        public Criteria andPrintTypeEqualTo(String value) {
            addCriterion("print_type =", value, "printType");
            return (Criteria) this;
        }

        public Criteria andPrintTypeNotEqualTo(String value) {
            addCriterion("print_type <>", value, "printType");
            return (Criteria) this;
        }

        public Criteria andPrintTypeGreaterThan(String value) {
            addCriterion("print_type >", value, "printType");
            return (Criteria) this;
        }

        public Criteria andPrintTypeGreaterThanOrEqualTo(String value) {
            addCriterion("print_type >=", value, "printType");
            return (Criteria) this;
        }

        public Criteria andPrintTypeLessThan(String value) {
            addCriterion("print_type <", value, "printType");
            return (Criteria) this;
        }

        public Criteria andPrintTypeLessThanOrEqualTo(String value) {
            addCriterion("print_type <=", value, "printType");
            return (Criteria) this;
        }

        public Criteria andPrintTypeLike(String value) {
            addCriterion("print_type like", value, "printType");
            return (Criteria) this;
        }

        public Criteria andPrintTypeNotLike(String value) {
            addCriterion("print_type not like", value, "printType");
            return (Criteria) this;
        }

        public Criteria andPrintTypeIn(List<String> values) {
            addCriterion("print_type in", values, "printType");
            return (Criteria) this;
        }

        public Criteria andPrintTypeNotIn(List<String> values) {
            addCriterion("print_type not in", values, "printType");
            return (Criteria) this;
        }

        public Criteria andPrintTypeBetween(String value1, String value2) {
            addCriterion("print_type between", value1, value2, "printType");
            return (Criteria) this;
        }

        public Criteria andPrintTypeNotBetween(String value1, String value2) {
            addCriterion("print_type not between", value1, value2, "printType");
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