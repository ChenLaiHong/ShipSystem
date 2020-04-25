package com.lh.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TainItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TainItemsExample() {
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

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemDemandIsNull() {
            addCriterion("item_demand is null");
            return (Criteria) this;
        }

        public Criteria andItemDemandIsNotNull() {
            addCriterion("item_demand is not null");
            return (Criteria) this;
        }

        public Criteria andItemDemandEqualTo(String value) {
            addCriterion("item_demand =", value, "itemDemand");
            return (Criteria) this;
        }

        public Criteria andItemDemandNotEqualTo(String value) {
            addCriterion("item_demand <>", value, "itemDemand");
            return (Criteria) this;
        }

        public Criteria andItemDemandGreaterThan(String value) {
            addCriterion("item_demand >", value, "itemDemand");
            return (Criteria) this;
        }

        public Criteria andItemDemandGreaterThanOrEqualTo(String value) {
            addCriterion("item_demand >=", value, "itemDemand");
            return (Criteria) this;
        }

        public Criteria andItemDemandLessThan(String value) {
            addCriterion("item_demand <", value, "itemDemand");
            return (Criteria) this;
        }

        public Criteria andItemDemandLessThanOrEqualTo(String value) {
            addCriterion("item_demand <=", value, "itemDemand");
            return (Criteria) this;
        }

        public Criteria andItemDemandLike(String value) {
            addCriterion("item_demand like", value, "itemDemand");
            return (Criteria) this;
        }

        public Criteria andItemDemandNotLike(String value) {
            addCriterion("item_demand not like", value, "itemDemand");
            return (Criteria) this;
        }

        public Criteria andItemDemandIn(List<String> values) {
            addCriterion("item_demand in", values, "itemDemand");
            return (Criteria) this;
        }

        public Criteria andItemDemandNotIn(List<String> values) {
            addCriterion("item_demand not in", values, "itemDemand");
            return (Criteria) this;
        }

        public Criteria andItemDemandBetween(String value1, String value2) {
            addCriterion("item_demand between", value1, value2, "itemDemand");
            return (Criteria) this;
        }

        public Criteria andItemDemandNotBetween(String value1, String value2) {
            addCriterion("item_demand not between", value1, value2, "itemDemand");
            return (Criteria) this;
        }

        public Criteria andItemCycleIsNull() {
            addCriterion("item_cycle is null");
            return (Criteria) this;
        }

        public Criteria andItemCycleIsNotNull() {
            addCriterion("item_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andItemCycleEqualTo(String value) {
            addCriterion("item_cycle =", value, "itemCycle");
            return (Criteria) this;
        }

        public Criteria andItemCycleNotEqualTo(String value) {
            addCriterion("item_cycle <>", value, "itemCycle");
            return (Criteria) this;
        }

        public Criteria andItemCycleGreaterThan(String value) {
            addCriterion("item_cycle >", value, "itemCycle");
            return (Criteria) this;
        }

        public Criteria andItemCycleGreaterThanOrEqualTo(String value) {
            addCriterion("item_cycle >=", value, "itemCycle");
            return (Criteria) this;
        }

        public Criteria andItemCycleLessThan(String value) {
            addCriterion("item_cycle <", value, "itemCycle");
            return (Criteria) this;
        }

        public Criteria andItemCycleLessThanOrEqualTo(String value) {
            addCriterion("item_cycle <=", value, "itemCycle");
            return (Criteria) this;
        }

        public Criteria andItemCycleLike(String value) {
            addCriterion("item_cycle like", value, "itemCycle");
            return (Criteria) this;
        }

        public Criteria andItemCycleNotLike(String value) {
            addCriterion("item_cycle not like", value, "itemCycle");
            return (Criteria) this;
        }

        public Criteria andItemCycleIn(List<String> values) {
            addCriterion("item_cycle in", values, "itemCycle");
            return (Criteria) this;
        }

        public Criteria andItemCycleNotIn(List<String> values) {
            addCriterion("item_cycle not in", values, "itemCycle");
            return (Criteria) this;
        }

        public Criteria andItemCycleBetween(String value1, String value2) {
            addCriterion("item_cycle between", value1, value2, "itemCycle");
            return (Criteria) this;
        }

        public Criteria andItemCycleNotBetween(String value1, String value2) {
            addCriterion("item_cycle not between", value1, value2, "itemCycle");
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