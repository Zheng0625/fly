package com.ict.fly.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class FSeattypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public FSeattypeExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andSeatIdIsNull() {
            addCriterion("seat_id is null");
            return (Criteria) this;
        }

        public Criteria andSeatIdIsNotNull() {
            addCriterion("seat_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeatIdEqualTo(Integer value) {
            addCriterion("seat_id =", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotEqualTo(Integer value) {
            addCriterion("seat_id <>", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThan(Integer value) {
            addCriterion("seat_id >", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_id >=", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThan(Integer value) {
            addCriterion("seat_id <", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdLessThanOrEqualTo(Integer value) {
            addCriterion("seat_id <=", value, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdIn(List<Integer> values) {
            addCriterion("seat_id in", values, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotIn(List<Integer> values) {
            addCriterion("seat_id not in", values, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdBetween(Integer value1, Integer value2) {
            addCriterion("seat_id between", value1, value2, "seatId");
            return (Criteria) this;
        }

        public Criteria andSeatIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_id not between", value1, value2, "seatId");
            return (Criteria) this;
        }

        public Criteria andPlaneIdIsNull() {
            addCriterion("plane_id is null");
            return (Criteria) this;
        }

        public Criteria andPlaneIdIsNotNull() {
            addCriterion("plane_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlaneIdEqualTo(Integer value) {
            addCriterion("plane_id =", value, "planeId");
            return (Criteria) this;
        }

        public Criteria andPlaneIdNotEqualTo(Integer value) {
            addCriterion("plane_id <>", value, "planeId");
            return (Criteria) this;
        }

        public Criteria andPlaneIdGreaterThan(Integer value) {
            addCriterion("plane_id >", value, "planeId");
            return (Criteria) this;
        }

        public Criteria andPlaneIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plane_id >=", value, "planeId");
            return (Criteria) this;
        }

        public Criteria andPlaneIdLessThan(Integer value) {
            addCriterion("plane_id <", value, "planeId");
            return (Criteria) this;
        }

        public Criteria andPlaneIdLessThanOrEqualTo(Integer value) {
            addCriterion("plane_id <=", value, "planeId");
            return (Criteria) this;
        }

        public Criteria andPlaneIdIn(List<Integer> values) {
            addCriterion("plane_id in", values, "planeId");
            return (Criteria) this;
        }

        public Criteria andPlaneIdNotIn(List<Integer> values) {
            addCriterion("plane_id not in", values, "planeId");
            return (Criteria) this;
        }

        public Criteria andPlaneIdBetween(Integer value1, Integer value2) {
            addCriterion("plane_id between", value1, value2, "planeId");
            return (Criteria) this;
        }

        public Criteria andPlaneIdNotBetween(Integer value1, Integer value2) {
            addCriterion("plane_id not between", value1, value2, "planeId");
            return (Criteria) this;
        }

        public Criteria andSeatYnIsNull() {
            addCriterion("seat_yn is null");
            return (Criteria) this;
        }

        public Criteria andSeatYnIsNotNull() {
            addCriterion("seat_yn is not null");
            return (Criteria) this;
        }

        public Criteria andSeatYnEqualTo(Integer value) {
            addCriterion("seat_yn =", value, "seatYn");
            return (Criteria) this;
        }

        public Criteria andSeatYnNotEqualTo(Integer value) {
            addCriterion("seat_yn <>", value, "seatYn");
            return (Criteria) this;
        }

        public Criteria andSeatYnGreaterThan(Integer value) {
            addCriterion("seat_yn >", value, "seatYn");
            return (Criteria) this;
        }

        public Criteria andSeatYnGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_yn >=", value, "seatYn");
            return (Criteria) this;
        }

        public Criteria andSeatYnLessThan(Integer value) {
            addCriterion("seat_yn <", value, "seatYn");
            return (Criteria) this;
        }

        public Criteria andSeatYnLessThanOrEqualTo(Integer value) {
            addCriterion("seat_yn <=", value, "seatYn");
            return (Criteria) this;
        }

        public Criteria andSeatYnIn(List<Integer> values) {
            addCriterion("seat_yn in", values, "seatYn");
            return (Criteria) this;
        }

        public Criteria andSeatYnNotIn(List<Integer> values) {
            addCriterion("seat_yn not in", values, "seatYn");
            return (Criteria) this;
        }

        public Criteria andSeatYnBetween(Integer value1, Integer value2) {
            addCriterion("seat_yn between", value1, value2, "seatYn");
            return (Criteria) this;
        }

        public Criteria andSeatYnNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_yn not between", value1, value2, "seatYn");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIsNull() {
            addCriterion("seat_type is null");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIsNotNull() {
            addCriterion("seat_type is not null");
            return (Criteria) this;
        }

        public Criteria andSeatTypeEqualTo(Integer value) {
            addCriterion("seat_type =", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeNotEqualTo(Integer value) {
            addCriterion("seat_type <>", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeGreaterThan(Integer value) {
            addCriterion("seat_type >", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_type >=", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeLessThan(Integer value) {
            addCriterion("seat_type <", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeLessThanOrEqualTo(Integer value) {
            addCriterion("seat_type <=", value, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeIn(List<Integer> values) {
            addCriterion("seat_type in", values, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeNotIn(List<Integer> values) {
            addCriterion("seat_type not in", values, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeBetween(Integer value1, Integer value2) {
            addCriterion("seat_type between", value1, value2, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_type not between", value1, value2, "seatType");
            return (Criteria) this;
        }

        public Criteria andSeatWindowIsNull() {
            addCriterion("seat_window is null");
            return (Criteria) this;
        }

        public Criteria andSeatWindowIsNotNull() {
            addCriterion("seat_window is not null");
            return (Criteria) this;
        }

        public Criteria andSeatWindowEqualTo(Integer value) {
            addCriterion("seat_window =", value, "seatWindow");
            return (Criteria) this;
        }

        public Criteria andSeatWindowNotEqualTo(Integer value) {
            addCriterion("seat_window <>", value, "seatWindow");
            return (Criteria) this;
        }

        public Criteria andSeatWindowGreaterThan(Integer value) {
            addCriterion("seat_window >", value, "seatWindow");
            return (Criteria) this;
        }

        public Criteria andSeatWindowGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_window >=", value, "seatWindow");
            return (Criteria) this;
        }

        public Criteria andSeatWindowLessThan(Integer value) {
            addCriterion("seat_window <", value, "seatWindow");
            return (Criteria) this;
        }

        public Criteria andSeatWindowLessThanOrEqualTo(Integer value) {
            addCriterion("seat_window <=", value, "seatWindow");
            return (Criteria) this;
        }

        public Criteria andSeatWindowIn(List<Integer> values) {
            addCriterion("seat_window in", values, "seatWindow");
            return (Criteria) this;
        }

        public Criteria andSeatWindowNotIn(List<Integer> values) {
            addCriterion("seat_window not in", values, "seatWindow");
            return (Criteria) this;
        }

        public Criteria andSeatWindowBetween(Integer value1, Integer value2) {
            addCriterion("seat_window between", value1, value2, "seatWindow");
            return (Criteria) this;
        }

        public Criteria andSeatWindowNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_window not between", value1, value2, "seatWindow");
            return (Criteria) this;
        }

        public Criteria andSeatAisleIsNull() {
            addCriterion("seat_aisle is null");
            return (Criteria) this;
        }

        public Criteria andSeatAisleIsNotNull() {
            addCriterion("seat_aisle is not null");
            return (Criteria) this;
        }

        public Criteria andSeatAisleEqualTo(Integer value) {
            addCriterion("seat_aisle =", value, "seatAisle");
            return (Criteria) this;
        }

        public Criteria andSeatAisleNotEqualTo(Integer value) {
            addCriterion("seat_aisle <>", value, "seatAisle");
            return (Criteria) this;
        }

        public Criteria andSeatAisleGreaterThan(Integer value) {
            addCriterion("seat_aisle >", value, "seatAisle");
            return (Criteria) this;
        }

        public Criteria andSeatAisleGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_aisle >=", value, "seatAisle");
            return (Criteria) this;
        }

        public Criteria andSeatAisleLessThan(Integer value) {
            addCriterion("seat_aisle <", value, "seatAisle");
            return (Criteria) this;
        }

        public Criteria andSeatAisleLessThanOrEqualTo(Integer value) {
            addCriterion("seat_aisle <=", value, "seatAisle");
            return (Criteria) this;
        }

        public Criteria andSeatAisleIn(List<Integer> values) {
            addCriterion("seat_aisle in", values, "seatAisle");
            return (Criteria) this;
        }

        public Criteria andSeatAisleNotIn(List<Integer> values) {
            addCriterion("seat_aisle not in", values, "seatAisle");
            return (Criteria) this;
        }

        public Criteria andSeatAisleBetween(Integer value1, Integer value2) {
            addCriterion("seat_aisle between", value1, value2, "seatAisle");
            return (Criteria) this;
        }

        public Criteria andSeatAisleNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_aisle not between", value1, value2, "seatAisle");
            return (Criteria) this;
        }

        public Criteria andSeatFrontIsNull() {
            addCriterion("seat_front is null");
            return (Criteria) this;
        }

        public Criteria andSeatFrontIsNotNull() {
            addCriterion("seat_front is not null");
            return (Criteria) this;
        }

        public Criteria andSeatFrontEqualTo(Integer value) {
            addCriterion("seat_front =", value, "seatFront");
            return (Criteria) this;
        }

        public Criteria andSeatFrontNotEqualTo(Integer value) {
            addCriterion("seat_front <>", value, "seatFront");
            return (Criteria) this;
        }

        public Criteria andSeatFrontGreaterThan(Integer value) {
            addCriterion("seat_front >", value, "seatFront");
            return (Criteria) this;
        }

        public Criteria andSeatFrontGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_front >=", value, "seatFront");
            return (Criteria) this;
        }

        public Criteria andSeatFrontLessThan(Integer value) {
            addCriterion("seat_front <", value, "seatFront");
            return (Criteria) this;
        }

        public Criteria andSeatFrontLessThanOrEqualTo(Integer value) {
            addCriterion("seat_front <=", value, "seatFront");
            return (Criteria) this;
        }

        public Criteria andSeatFrontIn(List<Integer> values) {
            addCriterion("seat_front in", values, "seatFront");
            return (Criteria) this;
        }

        public Criteria andSeatFrontNotIn(List<Integer> values) {
            addCriterion("seat_front not in", values, "seatFront");
            return (Criteria) this;
        }

        public Criteria andSeatFrontBetween(Integer value1, Integer value2) {
            addCriterion("seat_front between", value1, value2, "seatFront");
            return (Criteria) this;
        }

        public Criteria andSeatFrontNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_front not between", value1, value2, "seatFront");
            return (Criteria) this;
        }

        public Criteria andSeatExitIsNull() {
            addCriterion("seat_exit is null");
            return (Criteria) this;
        }

        public Criteria andSeatExitIsNotNull() {
            addCriterion("seat_exit is not null");
            return (Criteria) this;
        }

        public Criteria andSeatExitEqualTo(Integer value) {
            addCriterion("seat_exit =", value, "seatExit");
            return (Criteria) this;
        }

        public Criteria andSeatExitNotEqualTo(Integer value) {
            addCriterion("seat_exit <>", value, "seatExit");
            return (Criteria) this;
        }

        public Criteria andSeatExitGreaterThan(Integer value) {
            addCriterion("seat_exit >", value, "seatExit");
            return (Criteria) this;
        }

        public Criteria andSeatExitGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_exit >=", value, "seatExit");
            return (Criteria) this;
        }

        public Criteria andSeatExitLessThan(Integer value) {
            addCriterion("seat_exit <", value, "seatExit");
            return (Criteria) this;
        }

        public Criteria andSeatExitLessThanOrEqualTo(Integer value) {
            addCriterion("seat_exit <=", value, "seatExit");
            return (Criteria) this;
        }

        public Criteria andSeatExitIn(List<Integer> values) {
            addCriterion("seat_exit in", values, "seatExit");
            return (Criteria) this;
        }

        public Criteria andSeatExitNotIn(List<Integer> values) {
            addCriterion("seat_exit not in", values, "seatExit");
            return (Criteria) this;
        }

        public Criteria andSeatExitBetween(Integer value1, Integer value2) {
            addCriterion("seat_exit between", value1, value2, "seatExit");
            return (Criteria) this;
        }

        public Criteria andSeatExitNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_exit not between", value1, value2, "seatExit");
            return (Criteria) this;
        }

        public Criteria andSeatSpaciousIsNull() {
            addCriterion("seat_spacious is null");
            return (Criteria) this;
        }

        public Criteria andSeatSpaciousIsNotNull() {
            addCriterion("seat_spacious is not null");
            return (Criteria) this;
        }

        public Criteria andSeatSpaciousEqualTo(Integer value) {
            addCriterion("seat_spacious =", value, "seatSpacious");
            return (Criteria) this;
        }

        public Criteria andSeatSpaciousNotEqualTo(Integer value) {
            addCriterion("seat_spacious <>", value, "seatSpacious");
            return (Criteria) this;
        }

        public Criteria andSeatSpaciousGreaterThan(Integer value) {
            addCriterion("seat_spacious >", value, "seatSpacious");
            return (Criteria) this;
        }

        public Criteria andSeatSpaciousGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_spacious >=", value, "seatSpacious");
            return (Criteria) this;
        }

        public Criteria andSeatSpaciousLessThan(Integer value) {
            addCriterion("seat_spacious <", value, "seatSpacious");
            return (Criteria) this;
        }

        public Criteria andSeatSpaciousLessThanOrEqualTo(Integer value) {
            addCriterion("seat_spacious <=", value, "seatSpacious");
            return (Criteria) this;
        }

        public Criteria andSeatSpaciousIn(List<Integer> values) {
            addCriterion("seat_spacious in", values, "seatSpacious");
            return (Criteria) this;
        }

        public Criteria andSeatSpaciousNotIn(List<Integer> values) {
            addCriterion("seat_spacious not in", values, "seatSpacious");
            return (Criteria) this;
        }

        public Criteria andSeatSpaciousBetween(Integer value1, Integer value2) {
            addCriterion("seat_spacious between", value1, value2, "seatSpacious");
            return (Criteria) this;
        }

        public Criteria andSeatSpaciousNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_spacious not between", value1, value2, "seatSpacious");
            return (Criteria) this;
        }

        public Criteria andSeatGateIsNull() {
            addCriterion("seat_gate is null");
            return (Criteria) this;
        }

        public Criteria andSeatGateIsNotNull() {
            addCriterion("seat_gate is not null");
            return (Criteria) this;
        }

        public Criteria andSeatGateEqualTo(Integer value) {
            addCriterion("seat_gate =", value, "seatGate");
            return (Criteria) this;
        }

        public Criteria andSeatGateNotEqualTo(Integer value) {
            addCriterion("seat_gate <>", value, "seatGate");
            return (Criteria) this;
        }

        public Criteria andSeatGateGreaterThan(Integer value) {
            addCriterion("seat_gate >", value, "seatGate");
            return (Criteria) this;
        }

        public Criteria andSeatGateGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_gate >=", value, "seatGate");
            return (Criteria) this;
        }

        public Criteria andSeatGateLessThan(Integer value) {
            addCriterion("seat_gate <", value, "seatGate");
            return (Criteria) this;
        }

        public Criteria andSeatGateLessThanOrEqualTo(Integer value) {
            addCriterion("seat_gate <=", value, "seatGate");
            return (Criteria) this;
        }

        public Criteria andSeatGateIn(List<Integer> values) {
            addCriterion("seat_gate in", values, "seatGate");
            return (Criteria) this;
        }

        public Criteria andSeatGateNotIn(List<Integer> values) {
            addCriterion("seat_gate not in", values, "seatGate");
            return (Criteria) this;
        }

        public Criteria andSeatGateBetween(Integer value1, Integer value2) {
            addCriterion("seat_gate between", value1, value2, "seatGate");
            return (Criteria) this;
        }

        public Criteria andSeatGateNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_gate not between", value1, value2, "seatGate");
            return (Criteria) this;
        }

        public Criteria andSeatBabyIsNull() {
            addCriterion("seat_baby is null");
            return (Criteria) this;
        }

        public Criteria andSeatBabyIsNotNull() {
            addCriterion("seat_baby is not null");
            return (Criteria) this;
        }

        public Criteria andSeatBabyEqualTo(Integer value) {
            addCriterion("seat_baby =", value, "seatBaby");
            return (Criteria) this;
        }

        public Criteria andSeatBabyNotEqualTo(Integer value) {
            addCriterion("seat_baby <>", value, "seatBaby");
            return (Criteria) this;
        }

        public Criteria andSeatBabyGreaterThan(Integer value) {
            addCriterion("seat_baby >", value, "seatBaby");
            return (Criteria) this;
        }

        public Criteria andSeatBabyGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_baby >=", value, "seatBaby");
            return (Criteria) this;
        }

        public Criteria andSeatBabyLessThan(Integer value) {
            addCriterion("seat_baby <", value, "seatBaby");
            return (Criteria) this;
        }

        public Criteria andSeatBabyLessThanOrEqualTo(Integer value) {
            addCriterion("seat_baby <=", value, "seatBaby");
            return (Criteria) this;
        }

        public Criteria andSeatBabyIn(List<Integer> values) {
            addCriterion("seat_baby in", values, "seatBaby");
            return (Criteria) this;
        }

        public Criteria andSeatBabyNotIn(List<Integer> values) {
            addCriterion("seat_baby not in", values, "seatBaby");
            return (Criteria) this;
        }

        public Criteria andSeatBabyBetween(Integer value1, Integer value2) {
            addCriterion("seat_baby between", value1, value2, "seatBaby");
            return (Criteria) this;
        }

        public Criteria andSeatBabyNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_baby not between", value1, value2, "seatBaby");
            return (Criteria) this;
        }

        public Criteria andSeatLocationxIsNull() {
            addCriterion("seat_locationx is null");
            return (Criteria) this;
        }

        public Criteria andSeatLocationxIsNotNull() {
            addCriterion("seat_locationx is not null");
            return (Criteria) this;
        }

        public Criteria andSeatLocationxEqualTo(Integer value) {
            addCriterion("seat_locationx =", value, "seatLocationx");
            return (Criteria) this;
        }

        public Criteria andSeatLocationxNotEqualTo(Integer value) {
            addCriterion("seat_locationx <>", value, "seatLocationx");
            return (Criteria) this;
        }

        public Criteria andSeatLocationxGreaterThan(Integer value) {
            addCriterion("seat_locationx >", value, "seatLocationx");
            return (Criteria) this;
        }

        public Criteria andSeatLocationxGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_locationx >=", value, "seatLocationx");
            return (Criteria) this;
        }

        public Criteria andSeatLocationxLessThan(Integer value) {
            addCriterion("seat_locationx <", value, "seatLocationx");
            return (Criteria) this;
        }

        public Criteria andSeatLocationxLessThanOrEqualTo(Integer value) {
            addCriterion("seat_locationx <=", value, "seatLocationx");
            return (Criteria) this;
        }

        public Criteria andSeatLocationxIn(List<Integer> values) {
            addCriterion("seat_locationx in", values, "seatLocationx");
            return (Criteria) this;
        }

        public Criteria andSeatLocationxNotIn(List<Integer> values) {
            addCriterion("seat_locationx not in", values, "seatLocationx");
            return (Criteria) this;
        }

        public Criteria andSeatLocationxBetween(Integer value1, Integer value2) {
            addCriterion("seat_locationx between", value1, value2, "seatLocationx");
            return (Criteria) this;
        }

        public Criteria andSeatLocationxNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_locationx not between", value1, value2, "seatLocationx");
            return (Criteria) this;
        }

        public Criteria andSeatLocationyIsNull() {
            addCriterion("seat_locationy is null");
            return (Criteria) this;
        }

        public Criteria andSeatLocationyIsNotNull() {
            addCriterion("seat_locationy is not null");
            return (Criteria) this;
        }

        public Criteria andSeatLocationyEqualTo(Integer value) {
            addCriterion("seat_locationy =", value, "seatLocationy");
            return (Criteria) this;
        }

        public Criteria andSeatLocationyNotEqualTo(Integer value) {
            addCriterion("seat_locationy <>", value, "seatLocationy");
            return (Criteria) this;
        }

        public Criteria andSeatLocationyGreaterThan(Integer value) {
            addCriterion("seat_locationy >", value, "seatLocationy");
            return (Criteria) this;
        }

        public Criteria andSeatLocationyGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_locationy >=", value, "seatLocationy");
            return (Criteria) this;
        }

        public Criteria andSeatLocationyLessThan(Integer value) {
            addCriterion("seat_locationy <", value, "seatLocationy");
            return (Criteria) this;
        }

        public Criteria andSeatLocationyLessThanOrEqualTo(Integer value) {
            addCriterion("seat_locationy <=", value, "seatLocationy");
            return (Criteria) this;
        }

        public Criteria andSeatLocationyIn(List<Integer> values) {
            addCriterion("seat_locationy in", values, "seatLocationy");
            return (Criteria) this;
        }

        public Criteria andSeatLocationyNotIn(List<Integer> values) {
            addCriterion("seat_locationy not in", values, "seatLocationy");
            return (Criteria) this;
        }

        public Criteria andSeatLocationyBetween(Integer value1, Integer value2) {
            addCriterion("seat_locationy between", value1, value2, "seatLocationy");
            return (Criteria) this;
        }

        public Criteria andSeatLocationyNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_locationy not between", value1, value2, "seatLocationy");
            return (Criteria) this;
        }

        public Criteria andSeatLocationnameIsNull() {
            addCriterion("seat_locationname is null");
            return (Criteria) this;
        }

        public Criteria andSeatLocationnameIsNotNull() {
            addCriterion("seat_locationname is not null");
            return (Criteria) this;
        }

        public Criteria andSeatLocationnameEqualTo(Integer value) {
            addCriterion("seat_locationname =", value, "seatLocationname");
            return (Criteria) this;
        }

        public Criteria andSeatLocationnameNotEqualTo(Integer value) {
            addCriterion("seat_locationname <>", value, "seatLocationname");
            return (Criteria) this;
        }

        public Criteria andSeatLocationnameGreaterThan(Integer value) {
            addCriterion("seat_locationname >", value, "seatLocationname");
            return (Criteria) this;
        }

        public Criteria andSeatLocationnameGreaterThanOrEqualTo(Integer value) {
            addCriterion("seat_locationname >=", value, "seatLocationname");
            return (Criteria) this;
        }

        public Criteria andSeatLocationnameLessThan(Integer value) {
            addCriterion("seat_locationname <", value, "seatLocationname");
            return (Criteria) this;
        }

        public Criteria andSeatLocationnameLessThanOrEqualTo(Integer value) {
            addCriterion("seat_locationname <=", value, "seatLocationname");
            return (Criteria) this;
        }

        public Criteria andSeatLocationnameIn(List<Integer> values) {
            addCriterion("seat_locationname in", values, "seatLocationname");
            return (Criteria) this;
        }

        public Criteria andSeatLocationnameNotIn(List<Integer> values) {
            addCriterion("seat_locationname not in", values, "seatLocationname");
            return (Criteria) this;
        }

        public Criteria andSeatLocationnameBetween(Integer value1, Integer value2) {
            addCriterion("seat_locationname between", value1, value2, "seatLocationname");
            return (Criteria) this;
        }

        public Criteria andSeatLocationnameNotBetween(Integer value1, Integer value2) {
            addCriterion("seat_locationname not between", value1, value2, "seatLocationname");
            return (Criteria) this;
        }
    }

    /**
     */
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