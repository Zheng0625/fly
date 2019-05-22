package com.ict.fly.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class FPersonDemandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public FPersonDemandExample() {
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

        public Criteria andDemandIdIsNull() {
            addCriterion("demand_id is null");
            return (Criteria) this;
        }

        public Criteria andDemandIdIsNotNull() {
            addCriterion("demand_id is not null");
            return (Criteria) this;
        }

        public Criteria andDemandIdEqualTo(Integer value) {
            addCriterion("demand_id =", value, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdNotEqualTo(Integer value) {
            addCriterion("demand_id <>", value, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdGreaterThan(Integer value) {
            addCriterion("demand_id >", value, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("demand_id >=", value, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdLessThan(Integer value) {
            addCriterion("demand_id <", value, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdLessThanOrEqualTo(Integer value) {
            addCriterion("demand_id <=", value, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdIn(List<Integer> values) {
            addCriterion("demand_id in", values, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdNotIn(List<Integer> values) {
            addCriterion("demand_id not in", values, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdBetween(Integer value1, Integer value2) {
            addCriterion("demand_id between", value1, value2, "demandId");
            return (Criteria) this;
        }

        public Criteria andDemandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("demand_id not between", value1, value2, "demandId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdIsNull() {
            addCriterion("userinfo_id is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdIsNotNull() {
            addCriterion("userinfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdEqualTo(Integer value) {
            addCriterion("userinfo_id =", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotEqualTo(Integer value) {
            addCriterion("userinfo_id <>", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdGreaterThan(Integer value) {
            addCriterion("userinfo_id >", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userinfo_id >=", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdLessThan(Integer value) {
            addCriterion("userinfo_id <", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("userinfo_id <=", value, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdIn(List<Integer> values) {
            addCriterion("userinfo_id in", values, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotIn(List<Integer> values) {
            addCriterion("userinfo_id not in", values, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("userinfo_id between", value1, value2, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andUserinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userinfo_id not between", value1, value2, "userinfoId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andDemandRenshuIsNull() {
            addCriterion("demand_renshu is null");
            return (Criteria) this;
        }

        public Criteria andDemandRenshuIsNotNull() {
            addCriterion("demand_renshu is not null");
            return (Criteria) this;
        }

        public Criteria andDemandRenshuEqualTo(Integer value) {
            addCriterion("demand_renshu =", value, "demandRenshu");
            return (Criteria) this;
        }

        public Criteria andDemandRenshuNotEqualTo(Integer value) {
            addCriterion("demand_renshu <>", value, "demandRenshu");
            return (Criteria) this;
        }

        public Criteria andDemandRenshuGreaterThan(Integer value) {
            addCriterion("demand_renshu >", value, "demandRenshu");
            return (Criteria) this;
        }

        public Criteria andDemandRenshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("demand_renshu >=", value, "demandRenshu");
            return (Criteria) this;
        }

        public Criteria andDemandRenshuLessThan(Integer value) {
            addCriterion("demand_renshu <", value, "demandRenshu");
            return (Criteria) this;
        }

        public Criteria andDemandRenshuLessThanOrEqualTo(Integer value) {
            addCriterion("demand_renshu <=", value, "demandRenshu");
            return (Criteria) this;
        }

        public Criteria andDemandRenshuIn(List<Integer> values) {
            addCriterion("demand_renshu in", values, "demandRenshu");
            return (Criteria) this;
        }

        public Criteria andDemandRenshuNotIn(List<Integer> values) {
            addCriterion("demand_renshu not in", values, "demandRenshu");
            return (Criteria) this;
        }

        public Criteria andDemandRenshuBetween(Integer value1, Integer value2) {
            addCriterion("demand_renshu between", value1, value2, "demandRenshu");
            return (Criteria) this;
        }

        public Criteria andDemandRenshuNotBetween(Integer value1, Integer value2) {
            addCriterion("demand_renshu not between", value1, value2, "demandRenshu");
            return (Criteria) this;
        }

        public Criteria andDemandWomenIsNull() {
            addCriterion("demand_women is null");
            return (Criteria) this;
        }

        public Criteria andDemandWomenIsNotNull() {
            addCriterion("demand_women is not null");
            return (Criteria) this;
        }

        public Criteria andDemandWomenEqualTo(Integer value) {
            addCriterion("demand_women =", value, "demandWomen");
            return (Criteria) this;
        }

        public Criteria andDemandWomenNotEqualTo(Integer value) {
            addCriterion("demand_women <>", value, "demandWomen");
            return (Criteria) this;
        }

        public Criteria andDemandWomenGreaterThan(Integer value) {
            addCriterion("demand_women >", value, "demandWomen");
            return (Criteria) this;
        }

        public Criteria andDemandWomenGreaterThanOrEqualTo(Integer value) {
            addCriterion("demand_women >=", value, "demandWomen");
            return (Criteria) this;
        }

        public Criteria andDemandWomenLessThan(Integer value) {
            addCriterion("demand_women <", value, "demandWomen");
            return (Criteria) this;
        }

        public Criteria andDemandWomenLessThanOrEqualTo(Integer value) {
            addCriterion("demand_women <=", value, "demandWomen");
            return (Criteria) this;
        }

        public Criteria andDemandWomenIn(List<Integer> values) {
            addCriterion("demand_women in", values, "demandWomen");
            return (Criteria) this;
        }

        public Criteria andDemandWomenNotIn(List<Integer> values) {
            addCriterion("demand_women not in", values, "demandWomen");
            return (Criteria) this;
        }

        public Criteria andDemandWomenBetween(Integer value1, Integer value2) {
            addCriterion("demand_women between", value1, value2, "demandWomen");
            return (Criteria) this;
        }

        public Criteria andDemandWomenNotBetween(Integer value1, Integer value2) {
            addCriterion("demand_women not between", value1, value2, "demandWomen");
            return (Criteria) this;
        }

        public Criteria andDemandMenIsNull() {
            addCriterion("demand_men is null");
            return (Criteria) this;
        }

        public Criteria andDemandMenIsNotNull() {
            addCriterion("demand_men is not null");
            return (Criteria) this;
        }

        public Criteria andDemandMenEqualTo(Integer value) {
            addCriterion("demand_men =", value, "demandMen");
            return (Criteria) this;
        }

        public Criteria andDemandMenNotEqualTo(Integer value) {
            addCriterion("demand_men <>", value, "demandMen");
            return (Criteria) this;
        }

        public Criteria andDemandMenGreaterThan(Integer value) {
            addCriterion("demand_men >", value, "demandMen");
            return (Criteria) this;
        }

        public Criteria andDemandMenGreaterThanOrEqualTo(Integer value) {
            addCriterion("demand_men >=", value, "demandMen");
            return (Criteria) this;
        }

        public Criteria andDemandMenLessThan(Integer value) {
            addCriterion("demand_men <", value, "demandMen");
            return (Criteria) this;
        }

        public Criteria andDemandMenLessThanOrEqualTo(Integer value) {
            addCriterion("demand_men <=", value, "demandMen");
            return (Criteria) this;
        }

        public Criteria andDemandMenIn(List<Integer> values) {
            addCriterion("demand_men in", values, "demandMen");
            return (Criteria) this;
        }

        public Criteria andDemandMenNotIn(List<Integer> values) {
            addCriterion("demand_men not in", values, "demandMen");
            return (Criteria) this;
        }

        public Criteria andDemandMenBetween(Integer value1, Integer value2) {
            addCriterion("demand_men between", value1, value2, "demandMen");
            return (Criteria) this;
        }

        public Criteria andDemandMenNotBetween(Integer value1, Integer value2) {
            addCriterion("demand_men not between", value1, value2, "demandMen");
            return (Criteria) this;
        }

        public Criteria andDemandNobabyIsNull() {
            addCriterion("demand_nobaby is null");
            return (Criteria) this;
        }

        public Criteria andDemandNobabyIsNotNull() {
            addCriterion("demand_nobaby is not null");
            return (Criteria) this;
        }

        public Criteria andDemandNobabyEqualTo(Integer value) {
            addCriterion("demand_nobaby =", value, "demandNobaby");
            return (Criteria) this;
        }

        public Criteria andDemandNobabyNotEqualTo(Integer value) {
            addCriterion("demand_nobaby <>", value, "demandNobaby");
            return (Criteria) this;
        }

        public Criteria andDemandNobabyGreaterThan(Integer value) {
            addCriterion("demand_nobaby >", value, "demandNobaby");
            return (Criteria) this;
        }

        public Criteria andDemandNobabyGreaterThanOrEqualTo(Integer value) {
            addCriterion("demand_nobaby >=", value, "demandNobaby");
            return (Criteria) this;
        }

        public Criteria andDemandNobabyLessThan(Integer value) {
            addCriterion("demand_nobaby <", value, "demandNobaby");
            return (Criteria) this;
        }

        public Criteria andDemandNobabyLessThanOrEqualTo(Integer value) {
            addCriterion("demand_nobaby <=", value, "demandNobaby");
            return (Criteria) this;
        }

        public Criteria andDemandNobabyIn(List<Integer> values) {
            addCriterion("demand_nobaby in", values, "demandNobaby");
            return (Criteria) this;
        }

        public Criteria andDemandNobabyNotIn(List<Integer> values) {
            addCriterion("demand_nobaby not in", values, "demandNobaby");
            return (Criteria) this;
        }

        public Criteria andDemandNobabyBetween(Integer value1, Integer value2) {
            addCriterion("demand_nobaby between", value1, value2, "demandNobaby");
            return (Criteria) this;
        }

        public Criteria andDemandNobabyNotBetween(Integer value1, Integer value2) {
            addCriterion("demand_nobaby not between", value1, value2, "demandNobaby");
            return (Criteria) this;
        }

        public Criteria andDemandWindowIsNull() {
            addCriterion("demand_window is null");
            return (Criteria) this;
        }

        public Criteria andDemandWindowIsNotNull() {
            addCriterion("demand_window is not null");
            return (Criteria) this;
        }

        public Criteria andDemandWindowEqualTo(Integer value) {
            addCriterion("demand_window =", value, "demandWindow");
            return (Criteria) this;
        }

        public Criteria andDemandWindowNotEqualTo(Integer value) {
            addCriterion("demand_window <>", value, "demandWindow");
            return (Criteria) this;
        }

        public Criteria andDemandWindowGreaterThan(Integer value) {
            addCriterion("demand_window >", value, "demandWindow");
            return (Criteria) this;
        }

        public Criteria andDemandWindowGreaterThanOrEqualTo(Integer value) {
            addCriterion("demand_window >=", value, "demandWindow");
            return (Criteria) this;
        }

        public Criteria andDemandWindowLessThan(Integer value) {
            addCriterion("demand_window <", value, "demandWindow");
            return (Criteria) this;
        }

        public Criteria andDemandWindowLessThanOrEqualTo(Integer value) {
            addCriterion("demand_window <=", value, "demandWindow");
            return (Criteria) this;
        }

        public Criteria andDemandWindowIn(List<Integer> values) {
            addCriterion("demand_window in", values, "demandWindow");
            return (Criteria) this;
        }

        public Criteria andDemandWindowNotIn(List<Integer> values) {
            addCriterion("demand_window not in", values, "demandWindow");
            return (Criteria) this;
        }

        public Criteria andDemandWindowBetween(Integer value1, Integer value2) {
            addCriterion("demand_window between", value1, value2, "demandWindow");
            return (Criteria) this;
        }

        public Criteria andDemandWindowNotBetween(Integer value1, Integer value2) {
            addCriterion("demand_window not between", value1, value2, "demandWindow");
            return (Criteria) this;
        }

        public Criteria andDemandAisleIsNull() {
            addCriterion("demand_aisle is null");
            return (Criteria) this;
        }

        public Criteria andDemandAisleIsNotNull() {
            addCriterion("demand_aisle is not null");
            return (Criteria) this;
        }

        public Criteria andDemandAisleEqualTo(Integer value) {
            addCriterion("demand_aisle =", value, "demandAisle");
            return (Criteria) this;
        }

        public Criteria andDemandAisleNotEqualTo(Integer value) {
            addCriterion("demand_aisle <>", value, "demandAisle");
            return (Criteria) this;
        }

        public Criteria andDemandAisleGreaterThan(Integer value) {
            addCriterion("demand_aisle >", value, "demandAisle");
            return (Criteria) this;
        }

        public Criteria andDemandAisleGreaterThanOrEqualTo(Integer value) {
            addCriterion("demand_aisle >=", value, "demandAisle");
            return (Criteria) this;
        }

        public Criteria andDemandAisleLessThan(Integer value) {
            addCriterion("demand_aisle <", value, "demandAisle");
            return (Criteria) this;
        }

        public Criteria andDemandAisleLessThanOrEqualTo(Integer value) {
            addCriterion("demand_aisle <=", value, "demandAisle");
            return (Criteria) this;
        }

        public Criteria andDemandAisleIn(List<Integer> values) {
            addCriterion("demand_aisle in", values, "demandAisle");
            return (Criteria) this;
        }

        public Criteria andDemandAisleNotIn(List<Integer> values) {
            addCriterion("demand_aisle not in", values, "demandAisle");
            return (Criteria) this;
        }

        public Criteria andDemandAisleBetween(Integer value1, Integer value2) {
            addCriterion("demand_aisle between", value1, value2, "demandAisle");
            return (Criteria) this;
        }

        public Criteria andDemandAisleNotBetween(Integer value1, Integer value2) {
            addCriterion("demand_aisle not between", value1, value2, "demandAisle");
            return (Criteria) this;
        }

        public Criteria andDemandFrontIsNull() {
            addCriterion("demand_front is null");
            return (Criteria) this;
        }

        public Criteria andDemandFrontIsNotNull() {
            addCriterion("demand_front is not null");
            return (Criteria) this;
        }

        public Criteria andDemandFrontEqualTo(Integer value) {
            addCriterion("demand_front =", value, "demandFront");
            return (Criteria) this;
        }

        public Criteria andDemandFrontNotEqualTo(Integer value) {
            addCriterion("demand_front <>", value, "demandFront");
            return (Criteria) this;
        }

        public Criteria andDemandFrontGreaterThan(Integer value) {
            addCriterion("demand_front >", value, "demandFront");
            return (Criteria) this;
        }

        public Criteria andDemandFrontGreaterThanOrEqualTo(Integer value) {
            addCriterion("demand_front >=", value, "demandFront");
            return (Criteria) this;
        }

        public Criteria andDemandFrontLessThan(Integer value) {
            addCriterion("demand_front <", value, "demandFront");
            return (Criteria) this;
        }

        public Criteria andDemandFrontLessThanOrEqualTo(Integer value) {
            addCriterion("demand_front <=", value, "demandFront");
            return (Criteria) this;
        }

        public Criteria andDemandFrontIn(List<Integer> values) {
            addCriterion("demand_front in", values, "demandFront");
            return (Criteria) this;
        }

        public Criteria andDemandFrontNotIn(List<Integer> values) {
            addCriterion("demand_front not in", values, "demandFront");
            return (Criteria) this;
        }

        public Criteria andDemandFrontBetween(Integer value1, Integer value2) {
            addCriterion("demand_front between", value1, value2, "demandFront");
            return (Criteria) this;
        }

        public Criteria andDemandFrontNotBetween(Integer value1, Integer value2) {
            addCriterion("demand_front not between", value1, value2, "demandFront");
            return (Criteria) this;
        }

        public Criteria andDemandExitIsNull() {
            addCriterion("demand_exit is null");
            return (Criteria) this;
        }

        public Criteria andDemandExitIsNotNull() {
            addCriterion("demand_exit is not null");
            return (Criteria) this;
        }

        public Criteria andDemandExitEqualTo(Integer value) {
            addCriterion("demand_exit =", value, "demandExit");
            return (Criteria) this;
        }

        public Criteria andDemandExitNotEqualTo(Integer value) {
            addCriterion("demand_exit <>", value, "demandExit");
            return (Criteria) this;
        }

        public Criteria andDemandExitGreaterThan(Integer value) {
            addCriterion("demand_exit >", value, "demandExit");
            return (Criteria) this;
        }

        public Criteria andDemandExitGreaterThanOrEqualTo(Integer value) {
            addCriterion("demand_exit >=", value, "demandExit");
            return (Criteria) this;
        }

        public Criteria andDemandExitLessThan(Integer value) {
            addCriterion("demand_exit <", value, "demandExit");
            return (Criteria) this;
        }

        public Criteria andDemandExitLessThanOrEqualTo(Integer value) {
            addCriterion("demand_exit <=", value, "demandExit");
            return (Criteria) this;
        }

        public Criteria andDemandExitIn(List<Integer> values) {
            addCriterion("demand_exit in", values, "demandExit");
            return (Criteria) this;
        }

        public Criteria andDemandExitNotIn(List<Integer> values) {
            addCriterion("demand_exit not in", values, "demandExit");
            return (Criteria) this;
        }

        public Criteria andDemandExitBetween(Integer value1, Integer value2) {
            addCriterion("demand_exit between", value1, value2, "demandExit");
            return (Criteria) this;
        }

        public Criteria andDemandExitNotBetween(Integer value1, Integer value2) {
            addCriterion("demand_exit not between", value1, value2, "demandExit");
            return (Criteria) this;
        }

        public Criteria andDemandSpaciousIsNull() {
            addCriterion("demand_spacious is null");
            return (Criteria) this;
        }

        public Criteria andDemandSpaciousIsNotNull() {
            addCriterion("demand_spacious is not null");
            return (Criteria) this;
        }

        public Criteria andDemandSpaciousEqualTo(Integer value) {
            addCriterion("demand_spacious =", value, "demandSpacious");
            return (Criteria) this;
        }

        public Criteria andDemandSpaciousNotEqualTo(Integer value) {
            addCriterion("demand_spacious <>", value, "demandSpacious");
            return (Criteria) this;
        }

        public Criteria andDemandSpaciousGreaterThan(Integer value) {
            addCriterion("demand_spacious >", value, "demandSpacious");
            return (Criteria) this;
        }

        public Criteria andDemandSpaciousGreaterThanOrEqualTo(Integer value) {
            addCriterion("demand_spacious >=", value, "demandSpacious");
            return (Criteria) this;
        }

        public Criteria andDemandSpaciousLessThan(Integer value) {
            addCriterion("demand_spacious <", value, "demandSpacious");
            return (Criteria) this;
        }

        public Criteria andDemandSpaciousLessThanOrEqualTo(Integer value) {
            addCriterion("demand_spacious <=", value, "demandSpacious");
            return (Criteria) this;
        }

        public Criteria andDemandSpaciousIn(List<Integer> values) {
            addCriterion("demand_spacious in", values, "demandSpacious");
            return (Criteria) this;
        }

        public Criteria andDemandSpaciousNotIn(List<Integer> values) {
            addCriterion("demand_spacious not in", values, "demandSpacious");
            return (Criteria) this;
        }

        public Criteria andDemandSpaciousBetween(Integer value1, Integer value2) {
            addCriterion("demand_spacious between", value1, value2, "demandSpacious");
            return (Criteria) this;
        }

        public Criteria andDemandSpaciousNotBetween(Integer value1, Integer value2) {
            addCriterion("demand_spacious not between", value1, value2, "demandSpacious");
            return (Criteria) this;
        }

        public Criteria andDemandGateIsNull() {
            addCriterion("demand_gate is null");
            return (Criteria) this;
        }

        public Criteria andDemandGateIsNotNull() {
            addCriterion("demand_gate is not null");
            return (Criteria) this;
        }

        public Criteria andDemandGateEqualTo(Integer value) {
            addCriterion("demand_gate =", value, "demandGate");
            return (Criteria) this;
        }

        public Criteria andDemandGateNotEqualTo(Integer value) {
            addCriterion("demand_gate <>", value, "demandGate");
            return (Criteria) this;
        }

        public Criteria andDemandGateGreaterThan(Integer value) {
            addCriterion("demand_gate >", value, "demandGate");
            return (Criteria) this;
        }

        public Criteria andDemandGateGreaterThanOrEqualTo(Integer value) {
            addCriterion("demand_gate >=", value, "demandGate");
            return (Criteria) this;
        }

        public Criteria andDemandGateLessThan(Integer value) {
            addCriterion("demand_gate <", value, "demandGate");
            return (Criteria) this;
        }

        public Criteria andDemandGateLessThanOrEqualTo(Integer value) {
            addCriterion("demand_gate <=", value, "demandGate");
            return (Criteria) this;
        }

        public Criteria andDemandGateIn(List<Integer> values) {
            addCriterion("demand_gate in", values, "demandGate");
            return (Criteria) this;
        }

        public Criteria andDemandGateNotIn(List<Integer> values) {
            addCriterion("demand_gate not in", values, "demandGate");
            return (Criteria) this;
        }

        public Criteria andDemandGateBetween(Integer value1, Integer value2) {
            addCriterion("demand_gate between", value1, value2, "demandGate");
            return (Criteria) this;
        }

        public Criteria andDemandGateNotBetween(Integer value1, Integer value2) {
            addCriterion("demand_gate not between", value1, value2, "demandGate");
            return (Criteria) this;
        }

        public Criteria andDemandBabyIsNull() {
            addCriterion("demand_baby is null");
            return (Criteria) this;
        }

        public Criteria andDemandBabyIsNotNull() {
            addCriterion("demand_baby is not null");
            return (Criteria) this;
        }

        public Criteria andDemandBabyEqualTo(Integer value) {
            addCriterion("demand_baby =", value, "demandBaby");
            return (Criteria) this;
        }

        public Criteria andDemandBabyNotEqualTo(Integer value) {
            addCriterion("demand_baby <>", value, "demandBaby");
            return (Criteria) this;
        }

        public Criteria andDemandBabyGreaterThan(Integer value) {
            addCriterion("demand_baby >", value, "demandBaby");
            return (Criteria) this;
        }

        public Criteria andDemandBabyGreaterThanOrEqualTo(Integer value) {
            addCriterion("demand_baby >=", value, "demandBaby");
            return (Criteria) this;
        }

        public Criteria andDemandBabyLessThan(Integer value) {
            addCriterion("demand_baby <", value, "demandBaby");
            return (Criteria) this;
        }

        public Criteria andDemandBabyLessThanOrEqualTo(Integer value) {
            addCriterion("demand_baby <=", value, "demandBaby");
            return (Criteria) this;
        }

        public Criteria andDemandBabyIn(List<Integer> values) {
            addCriterion("demand_baby in", values, "demandBaby");
            return (Criteria) this;
        }

        public Criteria andDemandBabyNotIn(List<Integer> values) {
            addCriterion("demand_baby not in", values, "demandBaby");
            return (Criteria) this;
        }

        public Criteria andDemandBabyBetween(Integer value1, Integer value2) {
            addCriterion("demand_baby between", value1, value2, "demandBaby");
            return (Criteria) this;
        }

        public Criteria andDemandBabyNotBetween(Integer value1, Integer value2) {
            addCriterion("demand_baby not between", value1, value2, "demandBaby");
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