package com.lh.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepairExample() {
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

        public Criteria andRepairIdIsNull() {
            addCriterion("repair_id is null");
            return (Criteria) this;
        }

        public Criteria andRepairIdIsNotNull() {
            addCriterion("repair_id is not null");
            return (Criteria) this;
        }

        public Criteria andRepairIdEqualTo(Integer value) {
            addCriterion("repair_id =", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdNotEqualTo(Integer value) {
            addCriterion("repair_id <>", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdGreaterThan(Integer value) {
            addCriterion("repair_id >", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("repair_id >=", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdLessThan(Integer value) {
            addCriterion("repair_id <", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdLessThanOrEqualTo(Integer value) {
            addCriterion("repair_id <=", value, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdIn(List<Integer> values) {
            addCriterion("repair_id in", values, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdNotIn(List<Integer> values) {
            addCriterion("repair_id not in", values, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdBetween(Integer value1, Integer value2) {
            addCriterion("repair_id between", value1, value2, "repairId");
            return (Criteria) this;
        }

        public Criteria andRepairIdNotBetween(Integer value1, Integer value2) {
            addCriterion("repair_id not between", value1, value2, "repairId");
            return (Criteria) this;
        }

        public Criteria andUseYearIsNull() {
            addCriterion("use_year is null");
            return (Criteria) this;
        }

        public Criteria andUseYearIsNotNull() {
            addCriterion("use_year is not null");
            return (Criteria) this;
        }

        public Criteria andUseYearEqualTo(String value) {
            addCriterion("use_year =", value, "useYear");
            return (Criteria) this;
        }

        public Criteria andUseYearNotEqualTo(String value) {
            addCriterion("use_year <>", value, "useYear");
            return (Criteria) this;
        }

        public Criteria andUseYearGreaterThan(String value) {
            addCriterion("use_year >", value, "useYear");
            return (Criteria) this;
        }

        public Criteria andUseYearGreaterThanOrEqualTo(String value) {
            addCriterion("use_year >=", value, "useYear");
            return (Criteria) this;
        }

        public Criteria andUseYearLessThan(String value) {
            addCriterion("use_year <", value, "useYear");
            return (Criteria) this;
        }

        public Criteria andUseYearLessThanOrEqualTo(String value) {
            addCriterion("use_year <=", value, "useYear");
            return (Criteria) this;
        }

        public Criteria andUseYearLike(String value) {
            addCriterion("use_year like", value, "useYear");
            return (Criteria) this;
        }

        public Criteria andUseYearNotLike(String value) {
            addCriterion("use_year not like", value, "useYear");
            return (Criteria) this;
        }

        public Criteria andUseYearIn(List<String> values) {
            addCriterion("use_year in", values, "useYear");
            return (Criteria) this;
        }

        public Criteria andUseYearNotIn(List<String> values) {
            addCriterion("use_year not in", values, "useYear");
            return (Criteria) this;
        }

        public Criteria andUseYearBetween(String value1, String value2) {
            addCriterion("use_year between", value1, value2, "useYear");
            return (Criteria) this;
        }

        public Criteria andUseYearNotBetween(String value1, String value2) {
            addCriterion("use_year not between", value1, value2, "useYear");
            return (Criteria) this;
        }

        public Criteria andManageIsNull() {
            addCriterion("manage is null");
            return (Criteria) this;
        }

        public Criteria andManageIsNotNull() {
            addCriterion("manage is not null");
            return (Criteria) this;
        }

        public Criteria andManageEqualTo(String value) {
            addCriterion("manage =", value, "manage");
            return (Criteria) this;
        }

        public Criteria andManageNotEqualTo(String value) {
            addCriterion("manage <>", value, "manage");
            return (Criteria) this;
        }

        public Criteria andManageGreaterThan(String value) {
            addCriterion("manage >", value, "manage");
            return (Criteria) this;
        }

        public Criteria andManageGreaterThanOrEqualTo(String value) {
            addCriterion("manage >=", value, "manage");
            return (Criteria) this;
        }

        public Criteria andManageLessThan(String value) {
            addCriterion("manage <", value, "manage");
            return (Criteria) this;
        }

        public Criteria andManageLessThanOrEqualTo(String value) {
            addCriterion("manage <=", value, "manage");
            return (Criteria) this;
        }

        public Criteria andManageLike(String value) {
            addCriterion("manage like", value, "manage");
            return (Criteria) this;
        }

        public Criteria andManageNotLike(String value) {
            addCriterion("manage not like", value, "manage");
            return (Criteria) this;
        }

        public Criteria andManageIn(List<String> values) {
            addCriterion("manage in", values, "manage");
            return (Criteria) this;
        }

        public Criteria andManageNotIn(List<String> values) {
            addCriterion("manage not in", values, "manage");
            return (Criteria) this;
        }

        public Criteria andManageBetween(String value1, String value2) {
            addCriterion("manage between", value1, value2, "manage");
            return (Criteria) this;
        }

        public Criteria andManageNotBetween(String value1, String value2) {
            addCriterion("manage not between", value1, value2, "manage");
            return (Criteria) this;
        }

        public Criteria andShipMaintenanceIsNull() {
            addCriterion("ship_maintenance is null");
            return (Criteria) this;
        }

        public Criteria andShipMaintenanceIsNotNull() {
            addCriterion("ship_maintenance is not null");
            return (Criteria) this;
        }

        public Criteria andShipMaintenanceEqualTo(String value) {
            addCriterion("ship_maintenance =", value, "shipMaintenance");
            return (Criteria) this;
        }

        public Criteria andShipMaintenanceNotEqualTo(String value) {
            addCriterion("ship_maintenance <>", value, "shipMaintenance");
            return (Criteria) this;
        }

        public Criteria andShipMaintenanceGreaterThan(String value) {
            addCriterion("ship_maintenance >", value, "shipMaintenance");
            return (Criteria) this;
        }

        public Criteria andShipMaintenanceGreaterThanOrEqualTo(String value) {
            addCriterion("ship_maintenance >=", value, "shipMaintenance");
            return (Criteria) this;
        }

        public Criteria andShipMaintenanceLessThan(String value) {
            addCriterion("ship_maintenance <", value, "shipMaintenance");
            return (Criteria) this;
        }

        public Criteria andShipMaintenanceLessThanOrEqualTo(String value) {
            addCriterion("ship_maintenance <=", value, "shipMaintenance");
            return (Criteria) this;
        }

        public Criteria andShipMaintenanceLike(String value) {
            addCriterion("ship_maintenance like", value, "shipMaintenance");
            return (Criteria) this;
        }

        public Criteria andShipMaintenanceNotLike(String value) {
            addCriterion("ship_maintenance not like", value, "shipMaintenance");
            return (Criteria) this;
        }

        public Criteria andShipMaintenanceIn(List<String> values) {
            addCriterion("ship_maintenance in", values, "shipMaintenance");
            return (Criteria) this;
        }

        public Criteria andShipMaintenanceNotIn(List<String> values) {
            addCriterion("ship_maintenance not in", values, "shipMaintenance");
            return (Criteria) this;
        }

        public Criteria andShipMaintenanceBetween(String value1, String value2) {
            addCriterion("ship_maintenance between", value1, value2, "shipMaintenance");
            return (Criteria) this;
        }

        public Criteria andShipMaintenanceNotBetween(String value1, String value2) {
            addCriterion("ship_maintenance not between", value1, value2, "shipMaintenance");
            return (Criteria) this;
        }

        public Criteria andShipReportIsNull() {
            addCriterion("ship_report is null");
            return (Criteria) this;
        }

        public Criteria andShipReportIsNotNull() {
            addCriterion("ship_report is not null");
            return (Criteria) this;
        }

        public Criteria andShipReportEqualTo(String value) {
            addCriterion("ship_report =", value, "shipReport");
            return (Criteria) this;
        }

        public Criteria andShipReportNotEqualTo(String value) {
            addCriterion("ship_report <>", value, "shipReport");
            return (Criteria) this;
        }

        public Criteria andShipReportGreaterThan(String value) {
            addCriterion("ship_report >", value, "shipReport");
            return (Criteria) this;
        }

        public Criteria andShipReportGreaterThanOrEqualTo(String value) {
            addCriterion("ship_report >=", value, "shipReport");
            return (Criteria) this;
        }

        public Criteria andShipReportLessThan(String value) {
            addCriterion("ship_report <", value, "shipReport");
            return (Criteria) this;
        }

        public Criteria andShipReportLessThanOrEqualTo(String value) {
            addCriterion("ship_report <=", value, "shipReport");
            return (Criteria) this;
        }

        public Criteria andShipReportLike(String value) {
            addCriterion("ship_report like", value, "shipReport");
            return (Criteria) this;
        }

        public Criteria andShipReportNotLike(String value) {
            addCriterion("ship_report not like", value, "shipReport");
            return (Criteria) this;
        }

        public Criteria andShipReportIn(List<String> values) {
            addCriterion("ship_report in", values, "shipReport");
            return (Criteria) this;
        }

        public Criteria andShipReportNotIn(List<String> values) {
            addCriterion("ship_report not in", values, "shipReport");
            return (Criteria) this;
        }

        public Criteria andShipReportBetween(String value1, String value2) {
            addCriterion("ship_report between", value1, value2, "shipReport");
            return (Criteria) this;
        }

        public Criteria andShipReportNotBetween(String value1, String value2) {
            addCriterion("ship_report not between", value1, value2, "shipReport");
            return (Criteria) this;
        }

        public Criteria andConsumptionIsNull() {
            addCriterion("consumption is null");
            return (Criteria) this;
        }

        public Criteria andConsumptionIsNotNull() {
            addCriterion("consumption is not null");
            return (Criteria) this;
        }

        public Criteria andConsumptionEqualTo(String value) {
            addCriterion("consumption =", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionNotEqualTo(String value) {
            addCriterion("consumption <>", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionGreaterThan(String value) {
            addCriterion("consumption >", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionGreaterThanOrEqualTo(String value) {
            addCriterion("consumption >=", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionLessThan(String value) {
            addCriterion("consumption <", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionLessThanOrEqualTo(String value) {
            addCriterion("consumption <=", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionLike(String value) {
            addCriterion("consumption like", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionNotLike(String value) {
            addCriterion("consumption not like", value, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionIn(List<String> values) {
            addCriterion("consumption in", values, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionNotIn(List<String> values) {
            addCriterion("consumption not in", values, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionBetween(String value1, String value2) {
            addCriterion("consumption between", value1, value2, "consumption");
            return (Criteria) this;
        }

        public Criteria andConsumptionNotBetween(String value1, String value2) {
            addCriterion("consumption not between", value1, value2, "consumption");
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