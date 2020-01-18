package com.lh.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShipInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShipInfoExample() {
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

        public Criteria andTotalLengthIsNull() {
            addCriterion("total_length is null");
            return (Criteria) this;
        }

        public Criteria andTotalLengthIsNotNull() {
            addCriterion("total_length is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLengthEqualTo(BigDecimal value) {
            addCriterion("total_length =", value, "totalLength");
            return (Criteria) this;
        }

        public Criteria andTotalLengthNotEqualTo(BigDecimal value) {
            addCriterion("total_length <>", value, "totalLength");
            return (Criteria) this;
        }

        public Criteria andTotalLengthGreaterThan(BigDecimal value) {
            addCriterion("total_length >", value, "totalLength");
            return (Criteria) this;
        }

        public Criteria andTotalLengthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_length >=", value, "totalLength");
            return (Criteria) this;
        }

        public Criteria andTotalLengthLessThan(BigDecimal value) {
            addCriterion("total_length <", value, "totalLength");
            return (Criteria) this;
        }

        public Criteria andTotalLengthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_length <=", value, "totalLength");
            return (Criteria) this;
        }

        public Criteria andTotalLengthIn(List<BigDecimal> values) {
            addCriterion("total_length in", values, "totalLength");
            return (Criteria) this;
        }

        public Criteria andTotalLengthNotIn(List<BigDecimal> values) {
            addCriterion("total_length not in", values, "totalLength");
            return (Criteria) this;
        }

        public Criteria andTotalLengthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_length between", value1, value2, "totalLength");
            return (Criteria) this;
        }

        public Criteria andTotalLengthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_length not between", value1, value2, "totalLength");
            return (Criteria) this;
        }

        public Criteria andTypeWidthIsNull() {
            addCriterion("type_width is null");
            return (Criteria) this;
        }

        public Criteria andTypeWidthIsNotNull() {
            addCriterion("type_width is not null");
            return (Criteria) this;
        }

        public Criteria andTypeWidthEqualTo(BigDecimal value) {
            addCriterion("type_width =", value, "typeWidth");
            return (Criteria) this;
        }

        public Criteria andTypeWidthNotEqualTo(BigDecimal value) {
            addCriterion("type_width <>", value, "typeWidth");
            return (Criteria) this;
        }

        public Criteria andTypeWidthGreaterThan(BigDecimal value) {
            addCriterion("type_width >", value, "typeWidth");
            return (Criteria) this;
        }

        public Criteria andTypeWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("type_width >=", value, "typeWidth");
            return (Criteria) this;
        }

        public Criteria andTypeWidthLessThan(BigDecimal value) {
            addCriterion("type_width <", value, "typeWidth");
            return (Criteria) this;
        }

        public Criteria andTypeWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("type_width <=", value, "typeWidth");
            return (Criteria) this;
        }

        public Criteria andTypeWidthIn(List<BigDecimal> values) {
            addCriterion("type_width in", values, "typeWidth");
            return (Criteria) this;
        }

        public Criteria andTypeWidthNotIn(List<BigDecimal> values) {
            addCriterion("type_width not in", values, "typeWidth");
            return (Criteria) this;
        }

        public Criteria andTypeWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("type_width between", value1, value2, "typeWidth");
            return (Criteria) this;
        }

        public Criteria andTypeWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("type_width not between", value1, value2, "typeWidth");
            return (Criteria) this;
        }

        public Criteria andTypeDepthIsNull() {
            addCriterion("type_depth is null");
            return (Criteria) this;
        }

        public Criteria andTypeDepthIsNotNull() {
            addCriterion("type_depth is not null");
            return (Criteria) this;
        }

        public Criteria andTypeDepthEqualTo(BigDecimal value) {
            addCriterion("type_depth =", value, "typeDepth");
            return (Criteria) this;
        }

        public Criteria andTypeDepthNotEqualTo(BigDecimal value) {
            addCriterion("type_depth <>", value, "typeDepth");
            return (Criteria) this;
        }

        public Criteria andTypeDepthGreaterThan(BigDecimal value) {
            addCriterion("type_depth >", value, "typeDepth");
            return (Criteria) this;
        }

        public Criteria andTypeDepthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("type_depth >=", value, "typeDepth");
            return (Criteria) this;
        }

        public Criteria andTypeDepthLessThan(BigDecimal value) {
            addCriterion("type_depth <", value, "typeDepth");
            return (Criteria) this;
        }

        public Criteria andTypeDepthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("type_depth <=", value, "typeDepth");
            return (Criteria) this;
        }

        public Criteria andTypeDepthIn(List<BigDecimal> values) {
            addCriterion("type_depth in", values, "typeDepth");
            return (Criteria) this;
        }

        public Criteria andTypeDepthNotIn(List<BigDecimal> values) {
            addCriterion("type_depth not in", values, "typeDepth");
            return (Criteria) this;
        }

        public Criteria andTypeDepthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("type_depth between", value1, value2, "typeDepth");
            return (Criteria) this;
        }

        public Criteria andTypeDepthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("type_depth not between", value1, value2, "typeDepth");
            return (Criteria) this;
        }

        public Criteria andDisplacementIsNull() {
            addCriterion("displacement is null");
            return (Criteria) this;
        }

        public Criteria andDisplacementIsNotNull() {
            addCriterion("displacement is not null");
            return (Criteria) this;
        }

        public Criteria andDisplacementEqualTo(BigDecimal value) {
            addCriterion("displacement =", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementNotEqualTo(BigDecimal value) {
            addCriterion("displacement <>", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementGreaterThan(BigDecimal value) {
            addCriterion("displacement >", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("displacement >=", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementLessThan(BigDecimal value) {
            addCriterion("displacement <", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementLessThanOrEqualTo(BigDecimal value) {
            addCriterion("displacement <=", value, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementIn(List<BigDecimal> values) {
            addCriterion("displacement in", values, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementNotIn(List<BigDecimal> values) {
            addCriterion("displacement not in", values, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("displacement between", value1, value2, "displacement");
            return (Criteria) this;
        }

        public Criteria andDisplacementNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("displacement not between", value1, value2, "displacement");
            return (Criteria) this;
        }

        public Criteria andDesignDraftIsNull() {
            addCriterion("design_draft is null");
            return (Criteria) this;
        }

        public Criteria andDesignDraftIsNotNull() {
            addCriterion("design_draft is not null");
            return (Criteria) this;
        }

        public Criteria andDesignDraftEqualTo(BigDecimal value) {
            addCriterion("design_draft =", value, "designDraft");
            return (Criteria) this;
        }

        public Criteria andDesignDraftNotEqualTo(BigDecimal value) {
            addCriterion("design_draft <>", value, "designDraft");
            return (Criteria) this;
        }

        public Criteria andDesignDraftGreaterThan(BigDecimal value) {
            addCriterion("design_draft >", value, "designDraft");
            return (Criteria) this;
        }

        public Criteria andDesignDraftGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("design_draft >=", value, "designDraft");
            return (Criteria) this;
        }

        public Criteria andDesignDraftLessThan(BigDecimal value) {
            addCriterion("design_draft <", value, "designDraft");
            return (Criteria) this;
        }

        public Criteria andDesignDraftLessThanOrEqualTo(BigDecimal value) {
            addCriterion("design_draft <=", value, "designDraft");
            return (Criteria) this;
        }

        public Criteria andDesignDraftIn(List<BigDecimal> values) {
            addCriterion("design_draft in", values, "designDraft");
            return (Criteria) this;
        }

        public Criteria andDesignDraftNotIn(List<BigDecimal> values) {
            addCriterion("design_draft not in", values, "designDraft");
            return (Criteria) this;
        }

        public Criteria andDesignDraftBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("design_draft between", value1, value2, "designDraft");
            return (Criteria) this;
        }

        public Criteria andDesignDraftNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("design_draft not between", value1, value2, "designDraft");
            return (Criteria) this;
        }

        public Criteria andStructuralDraftIsNull() {
            addCriterion("structural_draft is null");
            return (Criteria) this;
        }

        public Criteria andStructuralDraftIsNotNull() {
            addCriterion("structural_draft is not null");
            return (Criteria) this;
        }

        public Criteria andStructuralDraftEqualTo(BigDecimal value) {
            addCriterion("structural_draft =", value, "structuralDraft");
            return (Criteria) this;
        }

        public Criteria andStructuralDraftNotEqualTo(BigDecimal value) {
            addCriterion("structural_draft <>", value, "structuralDraft");
            return (Criteria) this;
        }

        public Criteria andStructuralDraftGreaterThan(BigDecimal value) {
            addCriterion("structural_draft >", value, "structuralDraft");
            return (Criteria) this;
        }

        public Criteria andStructuralDraftGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("structural_draft >=", value, "structuralDraft");
            return (Criteria) this;
        }

        public Criteria andStructuralDraftLessThan(BigDecimal value) {
            addCriterion("structural_draft <", value, "structuralDraft");
            return (Criteria) this;
        }

        public Criteria andStructuralDraftLessThanOrEqualTo(BigDecimal value) {
            addCriterion("structural_draft <=", value, "structuralDraft");
            return (Criteria) this;
        }

        public Criteria andStructuralDraftIn(List<BigDecimal> values) {
            addCriterion("structural_draft in", values, "structuralDraft");
            return (Criteria) this;
        }

        public Criteria andStructuralDraftNotIn(List<BigDecimal> values) {
            addCriterion("structural_draft not in", values, "structuralDraft");
            return (Criteria) this;
        }

        public Criteria andStructuralDraftBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("structural_draft between", value1, value2, "structuralDraft");
            return (Criteria) this;
        }

        public Criteria andStructuralDraftNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("structural_draft not between", value1, value2, "structuralDraft");
            return (Criteria) this;
        }

        public Criteria andHoldNumberIsNull() {
            addCriterion("hold_number is null");
            return (Criteria) this;
        }

        public Criteria andHoldNumberIsNotNull() {
            addCriterion("hold_number is not null");
            return (Criteria) this;
        }

        public Criteria andHoldNumberEqualTo(Integer value) {
            addCriterion("hold_number =", value, "holdNumber");
            return (Criteria) this;
        }

        public Criteria andHoldNumberNotEqualTo(Integer value) {
            addCriterion("hold_number <>", value, "holdNumber");
            return (Criteria) this;
        }

        public Criteria andHoldNumberGreaterThan(Integer value) {
            addCriterion("hold_number >", value, "holdNumber");
            return (Criteria) this;
        }

        public Criteria andHoldNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("hold_number >=", value, "holdNumber");
            return (Criteria) this;
        }

        public Criteria andHoldNumberLessThan(Integer value) {
            addCriterion("hold_number <", value, "holdNumber");
            return (Criteria) this;
        }

        public Criteria andHoldNumberLessThanOrEqualTo(Integer value) {
            addCriterion("hold_number <=", value, "holdNumber");
            return (Criteria) this;
        }

        public Criteria andHoldNumberIn(List<Integer> values) {
            addCriterion("hold_number in", values, "holdNumber");
            return (Criteria) this;
        }

        public Criteria andHoldNumberNotIn(List<Integer> values) {
            addCriterion("hold_number not in", values, "holdNumber");
            return (Criteria) this;
        }

        public Criteria andHoldNumberBetween(Integer value1, Integer value2) {
            addCriterion("hold_number between", value1, value2, "holdNumber");
            return (Criteria) this;
        }

        public Criteria andHoldNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("hold_number not between", value1, value2, "holdNumber");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(String value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(String value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(String value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(String value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(String value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLike(String value) {
            addCriterion("temperature like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotLike(String value) {
            addCriterion("temperature not like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<String> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<String> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(String value1, String value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(String value1, String value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andCargoProportionIsNull() {
            addCriterion("cargo_proportion is null");
            return (Criteria) this;
        }

        public Criteria andCargoProportionIsNotNull() {
            addCriterion("cargo_proportion is not null");
            return (Criteria) this;
        }

        public Criteria andCargoProportionEqualTo(String value) {
            addCriterion("cargo_proportion =", value, "cargoProportion");
            return (Criteria) this;
        }

        public Criteria andCargoProportionNotEqualTo(String value) {
            addCriterion("cargo_proportion <>", value, "cargoProportion");
            return (Criteria) this;
        }

        public Criteria andCargoProportionGreaterThan(String value) {
            addCriterion("cargo_proportion >", value, "cargoProportion");
            return (Criteria) this;
        }

        public Criteria andCargoProportionGreaterThanOrEqualTo(String value) {
            addCriterion("cargo_proportion >=", value, "cargoProportion");
            return (Criteria) this;
        }

        public Criteria andCargoProportionLessThan(String value) {
            addCriterion("cargo_proportion <", value, "cargoProportion");
            return (Criteria) this;
        }

        public Criteria andCargoProportionLessThanOrEqualTo(String value) {
            addCriterion("cargo_proportion <=", value, "cargoProportion");
            return (Criteria) this;
        }

        public Criteria andCargoProportionLike(String value) {
            addCriterion("cargo_proportion like", value, "cargoProportion");
            return (Criteria) this;
        }

        public Criteria andCargoProportionNotLike(String value) {
            addCriterion("cargo_proportion not like", value, "cargoProportion");
            return (Criteria) this;
        }

        public Criteria andCargoProportionIn(List<String> values) {
            addCriterion("cargo_proportion in", values, "cargoProportion");
            return (Criteria) this;
        }

        public Criteria andCargoProportionNotIn(List<String> values) {
            addCriterion("cargo_proportion not in", values, "cargoProportion");
            return (Criteria) this;
        }

        public Criteria andCargoProportionBetween(String value1, String value2) {
            addCriterion("cargo_proportion between", value1, value2, "cargoProportion");
            return (Criteria) this;
        }

        public Criteria andCargoProportionNotBetween(String value1, String value2) {
            addCriterion("cargo_proportion not between", value1, value2, "cargoProportion");
            return (Criteria) this;
        }

        public Criteria andSteamPressureIsNull() {
            addCriterion("steam_pressure is null");
            return (Criteria) this;
        }

        public Criteria andSteamPressureIsNotNull() {
            addCriterion("steam_pressure is not null");
            return (Criteria) this;
        }

        public Criteria andSteamPressureEqualTo(String value) {
            addCriterion("steam_pressure =", value, "steamPressure");
            return (Criteria) this;
        }

        public Criteria andSteamPressureNotEqualTo(String value) {
            addCriterion("steam_pressure <>", value, "steamPressure");
            return (Criteria) this;
        }

        public Criteria andSteamPressureGreaterThan(String value) {
            addCriterion("steam_pressure >", value, "steamPressure");
            return (Criteria) this;
        }

        public Criteria andSteamPressureGreaterThanOrEqualTo(String value) {
            addCriterion("steam_pressure >=", value, "steamPressure");
            return (Criteria) this;
        }

        public Criteria andSteamPressureLessThan(String value) {
            addCriterion("steam_pressure <", value, "steamPressure");
            return (Criteria) this;
        }

        public Criteria andSteamPressureLessThanOrEqualTo(String value) {
            addCriterion("steam_pressure <=", value, "steamPressure");
            return (Criteria) this;
        }

        public Criteria andSteamPressureLike(String value) {
            addCriterion("steam_pressure like", value, "steamPressure");
            return (Criteria) this;
        }

        public Criteria andSteamPressureNotLike(String value) {
            addCriterion("steam_pressure not like", value, "steamPressure");
            return (Criteria) this;
        }

        public Criteria andSteamPressureIn(List<String> values) {
            addCriterion("steam_pressure in", values, "steamPressure");
            return (Criteria) this;
        }

        public Criteria andSteamPressureNotIn(List<String> values) {
            addCriterion("steam_pressure not in", values, "steamPressure");
            return (Criteria) this;
        }

        public Criteria andSteamPressureBetween(String value1, String value2) {
            addCriterion("steam_pressure between", value1, value2, "steamPressure");
            return (Criteria) this;
        }

        public Criteria andSteamPressureNotBetween(String value1, String value2) {
            addCriterion("steam_pressure not between", value1, value2, "steamPressure");
            return (Criteria) this;
        }

        public Criteria andShipImageIsNull() {
            addCriterion("ship_image is null");
            return (Criteria) this;
        }

        public Criteria andShipImageIsNotNull() {
            addCriterion("ship_image is not null");
            return (Criteria) this;
        }

        public Criteria andShipImageEqualTo(String value) {
            addCriterion("ship_image =", value, "shipImage");
            return (Criteria) this;
        }

        public Criteria andShipImageNotEqualTo(String value) {
            addCriterion("ship_image <>", value, "shipImage");
            return (Criteria) this;
        }

        public Criteria andShipImageGreaterThan(String value) {
            addCriterion("ship_image >", value, "shipImage");
            return (Criteria) this;
        }

        public Criteria andShipImageGreaterThanOrEqualTo(String value) {
            addCriterion("ship_image >=", value, "shipImage");
            return (Criteria) this;
        }

        public Criteria andShipImageLessThan(String value) {
            addCriterion("ship_image <", value, "shipImage");
            return (Criteria) this;
        }

        public Criteria andShipImageLessThanOrEqualTo(String value) {
            addCriterion("ship_image <=", value, "shipImage");
            return (Criteria) this;
        }

        public Criteria andShipImageLike(String value) {
            addCriterion("ship_image like", value, "shipImage");
            return (Criteria) this;
        }

        public Criteria andShipImageNotLike(String value) {
            addCriterion("ship_image not like", value, "shipImage");
            return (Criteria) this;
        }

        public Criteria andShipImageIn(List<String> values) {
            addCriterion("ship_image in", values, "shipImage");
            return (Criteria) this;
        }

        public Criteria andShipImageNotIn(List<String> values) {
            addCriterion("ship_image not in", values, "shipImage");
            return (Criteria) this;
        }

        public Criteria andShipImageBetween(String value1, String value2) {
            addCriterion("ship_image between", value1, value2, "shipImage");
            return (Criteria) this;
        }

        public Criteria andShipImageNotBetween(String value1, String value2) {
            addCriterion("ship_image not between", value1, value2, "shipImage");
            return (Criteria) this;
        }

        public Criteria andOtherFileIsNull() {
            addCriterion("other_file is null");
            return (Criteria) this;
        }

        public Criteria andOtherFileIsNotNull() {
            addCriterion("other_file is not null");
            return (Criteria) this;
        }

        public Criteria andOtherFileEqualTo(String value) {
            addCriterion("other_file =", value, "otherFile");
            return (Criteria) this;
        }

        public Criteria andOtherFileNotEqualTo(String value) {
            addCriterion("other_file <>", value, "otherFile");
            return (Criteria) this;
        }

        public Criteria andOtherFileGreaterThan(String value) {
            addCriterion("other_file >", value, "otherFile");
            return (Criteria) this;
        }

        public Criteria andOtherFileGreaterThanOrEqualTo(String value) {
            addCriterion("other_file >=", value, "otherFile");
            return (Criteria) this;
        }

        public Criteria andOtherFileLessThan(String value) {
            addCriterion("other_file <", value, "otherFile");
            return (Criteria) this;
        }

        public Criteria andOtherFileLessThanOrEqualTo(String value) {
            addCriterion("other_file <=", value, "otherFile");
            return (Criteria) this;
        }

        public Criteria andOtherFileLike(String value) {
            addCriterion("other_file like", value, "otherFile");
            return (Criteria) this;
        }

        public Criteria andOtherFileNotLike(String value) {
            addCriterion("other_file not like", value, "otherFile");
            return (Criteria) this;
        }

        public Criteria andOtherFileIn(List<String> values) {
            addCriterion("other_file in", values, "otherFile");
            return (Criteria) this;
        }

        public Criteria andOtherFileNotIn(List<String> values) {
            addCriterion("other_file not in", values, "otherFile");
            return (Criteria) this;
        }

        public Criteria andOtherFileBetween(String value1, String value2) {
            addCriterion("other_file between", value1, value2, "otherFile");
            return (Criteria) this;
        }

        public Criteria andOtherFileNotBetween(String value1, String value2) {
            addCriterion("other_file not between", value1, value2, "otherFile");
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