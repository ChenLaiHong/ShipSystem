package com.lh.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentExample() {
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

        public Criteria andEidIsNull() {
            addCriterion("eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(Integer value) {
            addCriterion("eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(Integer value) {
            addCriterion("eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(Integer value) {
            addCriterion("eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(Integer value) {
            addCriterion("eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(Integer value) {
            addCriterion("eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(Integer value) {
            addCriterion("eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<Integer> values) {
            addCriterion("eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<Integer> values) {
            addCriterion("eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(Integer value1, Integer value2) {
            addCriterion("eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(Integer value1, Integer value2) {
            addCriterion("eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andPoissonRatioIsNull() {
            addCriterion("poisson_ratio is null");
            return (Criteria) this;
        }

        public Criteria andPoissonRatioIsNotNull() {
            addCriterion("poisson_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andPoissonRatioEqualTo(BigDecimal value) {
            addCriterion("poisson_ratio =", value, "poissonRatio");
            return (Criteria) this;
        }

        public Criteria andPoissonRatioNotEqualTo(BigDecimal value) {
            addCriterion("poisson_ratio <>", value, "poissonRatio");
            return (Criteria) this;
        }

        public Criteria andPoissonRatioGreaterThan(BigDecimal value) {
            addCriterion("poisson_ratio >", value, "poissonRatio");
            return (Criteria) this;
        }

        public Criteria andPoissonRatioGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("poisson_ratio >=", value, "poissonRatio");
            return (Criteria) this;
        }

        public Criteria andPoissonRatioLessThan(BigDecimal value) {
            addCriterion("poisson_ratio <", value, "poissonRatio");
            return (Criteria) this;
        }

        public Criteria andPoissonRatioLessThanOrEqualTo(BigDecimal value) {
            addCriterion("poisson_ratio <=", value, "poissonRatio");
            return (Criteria) this;
        }

        public Criteria andPoissonRatioIn(List<BigDecimal> values) {
            addCriterion("poisson_ratio in", values, "poissonRatio");
            return (Criteria) this;
        }

        public Criteria andPoissonRatioNotIn(List<BigDecimal> values) {
            addCriterion("poisson_ratio not in", values, "poissonRatio");
            return (Criteria) this;
        }

        public Criteria andPoissonRatioBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("poisson_ratio between", value1, value2, "poissonRatio");
            return (Criteria) this;
        }

        public Criteria andPoissonRatioNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("poisson_ratio not between", value1, value2, "poissonRatio");
            return (Criteria) this;
        }

        public Criteria andElasticModulusIsNull() {
            addCriterion("elastic_modulus is null");
            return (Criteria) this;
        }

        public Criteria andElasticModulusIsNotNull() {
            addCriterion("elastic_modulus is not null");
            return (Criteria) this;
        }

        public Criteria andElasticModulusEqualTo(String value) {
            addCriterion("elastic_modulus =", value, "elasticModulus");
            return (Criteria) this;
        }

        public Criteria andElasticModulusNotEqualTo(String value) {
            addCriterion("elastic_modulus <>", value, "elasticModulus");
            return (Criteria) this;
        }

        public Criteria andElasticModulusGreaterThan(String value) {
            addCriterion("elastic_modulus >", value, "elasticModulus");
            return (Criteria) this;
        }

        public Criteria andElasticModulusGreaterThanOrEqualTo(String value) {
            addCriterion("elastic_modulus >=", value, "elasticModulus");
            return (Criteria) this;
        }

        public Criteria andElasticModulusLessThan(String value) {
            addCriterion("elastic_modulus <", value, "elasticModulus");
            return (Criteria) this;
        }

        public Criteria andElasticModulusLessThanOrEqualTo(String value) {
            addCriterion("elastic_modulus <=", value, "elasticModulus");
            return (Criteria) this;
        }

        public Criteria andElasticModulusLike(String value) {
            addCriterion("elastic_modulus like", value, "elasticModulus");
            return (Criteria) this;
        }

        public Criteria andElasticModulusNotLike(String value) {
            addCriterion("elastic_modulus not like", value, "elasticModulus");
            return (Criteria) this;
        }

        public Criteria andElasticModulusIn(List<String> values) {
            addCriterion("elastic_modulus in", values, "elasticModulus");
            return (Criteria) this;
        }

        public Criteria andElasticModulusNotIn(List<String> values) {
            addCriterion("elastic_modulus not in", values, "elasticModulus");
            return (Criteria) this;
        }

        public Criteria andElasticModulusBetween(String value1, String value2) {
            addCriterion("elastic_modulus between", value1, value2, "elasticModulus");
            return (Criteria) this;
        }

        public Criteria andElasticModulusNotBetween(String value1, String value2) {
            addCriterion("elastic_modulus not between", value1, value2, "elasticModulus");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelIsNull() {
            addCriterion("equipment_model is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelIsNotNull() {
            addCriterion("equipment_model is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelEqualTo(String value) {
            addCriterion("equipment_model =", value, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelNotEqualTo(String value) {
            addCriterion("equipment_model <>", value, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelGreaterThan(String value) {
            addCriterion("equipment_model >", value, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_model >=", value, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelLessThan(String value) {
            addCriterion("equipment_model <", value, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelLessThanOrEqualTo(String value) {
            addCriterion("equipment_model <=", value, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelLike(String value) {
            addCriterion("equipment_model like", value, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelNotLike(String value) {
            addCriterion("equipment_model not like", value, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelIn(List<String> values) {
            addCriterion("equipment_model in", values, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelNotIn(List<String> values) {
            addCriterion("equipment_model not in", values, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelBetween(String value1, String value2) {
            addCriterion("equipment_model between", value1, value2, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andEquipmentModelNotBetween(String value1, String value2) {
            addCriterion("equipment_model not between", value1, value2, "equipmentModel");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceIsNull() {
            addCriterion("equipment_price is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceIsNotNull() {
            addCriterion("equipment_price is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceEqualTo(BigDecimal value) {
            addCriterion("equipment_price =", value, "equipmentPrice");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceNotEqualTo(BigDecimal value) {
            addCriterion("equipment_price <>", value, "equipmentPrice");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceGreaterThan(BigDecimal value) {
            addCriterion("equipment_price >", value, "equipmentPrice");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("equipment_price >=", value, "equipmentPrice");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceLessThan(BigDecimal value) {
            addCriterion("equipment_price <", value, "equipmentPrice");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("equipment_price <=", value, "equipmentPrice");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceIn(List<BigDecimal> values) {
            addCriterion("equipment_price in", values, "equipmentPrice");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceNotIn(List<BigDecimal> values) {
            addCriterion("equipment_price not in", values, "equipmentPrice");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("equipment_price between", value1, value2, "equipmentPrice");
            return (Criteria) this;
        }

        public Criteria andEquipmentPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("equipment_price not between", value1, value2, "equipmentPrice");
            return (Criteria) this;
        }

        public Criteria andShipIdIsNull() {
            addCriterion("ship_id is null");
            return (Criteria) this;
        }

        public Criteria andShipIdIsNotNull() {
            addCriterion("ship_id is not null");
            return (Criteria) this;
        }

        public Criteria andShipIdEqualTo(Integer value) {
            addCriterion("ship_id =", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdNotEqualTo(Integer value) {
            addCriterion("ship_id <>", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdGreaterThan(Integer value) {
            addCriterion("ship_id >", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ship_id >=", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdLessThan(Integer value) {
            addCriterion("ship_id <", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdLessThanOrEqualTo(Integer value) {
            addCriterion("ship_id <=", value, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdIn(List<Integer> values) {
            addCriterion("ship_id in", values, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdNotIn(List<Integer> values) {
            addCriterion("ship_id not in", values, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdBetween(Integer value1, Integer value2) {
            addCriterion("ship_id between", value1, value2, "shipId");
            return (Criteria) this;
        }

        public Criteria andShipIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ship_id not between", value1, value2, "shipId");
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