package com.ict.fly.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class FAirplaneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public FAirplaneExample() {
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

        public Criteria andPlaneTypeIsNull() {
            addCriterion("plane_type is null");
            return (Criteria) this;
        }

        public Criteria andPlaneTypeIsNotNull() {
            addCriterion("plane_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlaneTypeEqualTo(String value) {
            addCriterion("plane_type =", value, "planeType");
            return (Criteria) this;
        }

        public Criteria andPlaneTypeNotEqualTo(String value) {
            addCriterion("plane_type <>", value, "planeType");
            return (Criteria) this;
        }

        public Criteria andPlaneTypeGreaterThan(String value) {
            addCriterion("plane_type >", value, "planeType");
            return (Criteria) this;
        }

        public Criteria andPlaneTypeGreaterThanOrEqualTo(String value) {
            addCriterion("plane_type >=", value, "planeType");
            return (Criteria) this;
        }

        public Criteria andPlaneTypeLessThan(String value) {
            addCriterion("plane_type <", value, "planeType");
            return (Criteria) this;
        }

        public Criteria andPlaneTypeLessThanOrEqualTo(String value) {
            addCriterion("plane_type <=", value, "planeType");
            return (Criteria) this;
        }

        public Criteria andPlaneTypeLike(String value) {
            addCriterion("plane_type like", value, "planeType");
            return (Criteria) this;
        }

        public Criteria andPlaneTypeNotLike(String value) {
            addCriterion("plane_type not like", value, "planeType");
            return (Criteria) this;
        }

        public Criteria andPlaneTypeIn(List<String> values) {
            addCriterion("plane_type in", values, "planeType");
            return (Criteria) this;
        }

        public Criteria andPlaneTypeNotIn(List<String> values) {
            addCriterion("plane_type not in", values, "planeType");
            return (Criteria) this;
        }

        public Criteria andPlaneTypeBetween(String value1, String value2) {
            addCriterion("plane_type between", value1, value2, "planeType");
            return (Criteria) this;
        }

        public Criteria andPlaneTypeNotBetween(String value1, String value2) {
            addCriterion("plane_type not between", value1, value2, "planeType");
            return (Criteria) this;
        }

        public Criteria andPlaneSeatIsNull() {
            addCriterion("plane_seat is null");
            return (Criteria) this;
        }

        public Criteria andPlaneSeatIsNotNull() {
            addCriterion("plane_seat is not null");
            return (Criteria) this;
        }

        public Criteria andPlaneSeatEqualTo(Integer value) {
            addCriterion("plane_seat =", value, "planeSeat");
            return (Criteria) this;
        }

        public Criteria andPlaneSeatNotEqualTo(Integer value) {
            addCriterion("plane_seat <>", value, "planeSeat");
            return (Criteria) this;
        }

        public Criteria andPlaneSeatGreaterThan(Integer value) {
            addCriterion("plane_seat >", value, "planeSeat");
            return (Criteria) this;
        }

        public Criteria andPlaneSeatGreaterThanOrEqualTo(Integer value) {
            addCriterion("plane_seat >=", value, "planeSeat");
            return (Criteria) this;
        }

        public Criteria andPlaneSeatLessThan(Integer value) {
            addCriterion("plane_seat <", value, "planeSeat");
            return (Criteria) this;
        }

        public Criteria andPlaneSeatLessThanOrEqualTo(Integer value) {
            addCriterion("plane_seat <=", value, "planeSeat");
            return (Criteria) this;
        }

        public Criteria andPlaneSeatIn(List<Integer> values) {
            addCriterion("plane_seat in", values, "planeSeat");
            return (Criteria) this;
        }

        public Criteria andPlaneSeatNotIn(List<Integer> values) {
            addCriterion("plane_seat not in", values, "planeSeat");
            return (Criteria) this;
        }

        public Criteria andPlaneSeatBetween(Integer value1, Integer value2) {
            addCriterion("plane_seat between", value1, value2, "planeSeat");
            return (Criteria) this;
        }

        public Criteria andPlaneSeatNotBetween(Integer value1, Integer value2) {
            addCriterion("plane_seat not between", value1, value2, "planeSeat");
            return (Criteria) this;
        }

        public Criteria andPlaneNameIsNull() {
            addCriterion("plane_name is null");
            return (Criteria) this;
        }

        public Criteria andPlaneNameIsNotNull() {
            addCriterion("plane_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlaneNameEqualTo(String value) {
            addCriterion("plane_name =", value, "planeName");
            return (Criteria) this;
        }

        public Criteria andPlaneNameNotEqualTo(String value) {
            addCriterion("plane_name <>", value, "planeName");
            return (Criteria) this;
        }

        public Criteria andPlaneNameGreaterThan(String value) {
            addCriterion("plane_name >", value, "planeName");
            return (Criteria) this;
        }

        public Criteria andPlaneNameGreaterThanOrEqualTo(String value) {
            addCriterion("plane_name >=", value, "planeName");
            return (Criteria) this;
        }

        public Criteria andPlaneNameLessThan(String value) {
            addCriterion("plane_name <", value, "planeName");
            return (Criteria) this;
        }

        public Criteria andPlaneNameLessThanOrEqualTo(String value) {
            addCriterion("plane_name <=", value, "planeName");
            return (Criteria) this;
        }

        public Criteria andPlaneNameLike(String value) {
            addCriterion("plane_name like", value, "planeName");
            return (Criteria) this;
        }

        public Criteria andPlaneNameNotLike(String value) {
            addCriterion("plane_name not like", value, "planeName");
            return (Criteria) this;
        }

        public Criteria andPlaneNameIn(List<String> values) {
            addCriterion("plane_name in", values, "planeName");
            return (Criteria) this;
        }

        public Criteria andPlaneNameNotIn(List<String> values) {
            addCriterion("plane_name not in", values, "planeName");
            return (Criteria) this;
        }

        public Criteria andPlaneNameBetween(String value1, String value2) {
            addCriterion("plane_name between", value1, value2, "planeName");
            return (Criteria) this;
        }

        public Criteria andPlaneNameNotBetween(String value1, String value2) {
            addCriterion("plane_name not between", value1, value2, "planeName");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationxIsNull() {
            addCriterion("plane_locationx is null");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationxIsNotNull() {
            addCriterion("plane_locationx is not null");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationxEqualTo(Integer value) {
            addCriterion("plane_locationx =", value, "planeLocationx");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationxNotEqualTo(Integer value) {
            addCriterion("plane_locationx <>", value, "planeLocationx");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationxGreaterThan(Integer value) {
            addCriterion("plane_locationx >", value, "planeLocationx");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationxGreaterThanOrEqualTo(Integer value) {
            addCriterion("plane_locationx >=", value, "planeLocationx");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationxLessThan(Integer value) {
            addCriterion("plane_locationx <", value, "planeLocationx");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationxLessThanOrEqualTo(Integer value) {
            addCriterion("plane_locationx <=", value, "planeLocationx");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationxIn(List<Integer> values) {
            addCriterion("plane_locationx in", values, "planeLocationx");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationxNotIn(List<Integer> values) {
            addCriterion("plane_locationx not in", values, "planeLocationx");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationxBetween(Integer value1, Integer value2) {
            addCriterion("plane_locationx between", value1, value2, "planeLocationx");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationxNotBetween(Integer value1, Integer value2) {
            addCriterion("plane_locationx not between", value1, value2, "planeLocationx");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationyIsNull() {
            addCriterion("plane_locationy is null");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationyIsNotNull() {
            addCriterion("plane_locationy is not null");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationyEqualTo(Integer value) {
            addCriterion("plane_locationy =", value, "planeLocationy");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationyNotEqualTo(Integer value) {
            addCriterion("plane_locationy <>", value, "planeLocationy");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationyGreaterThan(Integer value) {
            addCriterion("plane_locationy >", value, "planeLocationy");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationyGreaterThanOrEqualTo(Integer value) {
            addCriterion("plane_locationy >=", value, "planeLocationy");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationyLessThan(Integer value) {
            addCriterion("plane_locationy <", value, "planeLocationy");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationyLessThanOrEqualTo(Integer value) {
            addCriterion("plane_locationy <=", value, "planeLocationy");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationyIn(List<Integer> values) {
            addCriterion("plane_locationy in", values, "planeLocationy");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationyNotIn(List<Integer> values) {
            addCriterion("plane_locationy not in", values, "planeLocationy");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationyBetween(Integer value1, Integer value2) {
            addCriterion("plane_locationy between", value1, value2, "planeLocationy");
            return (Criteria) this;
        }

        public Criteria andPlaneLocationyNotBetween(Integer value1, Integer value2) {
            addCriterion("plane_locationy not between", value1, value2, "planeLocationy");
            return (Criteria) this;
        }

        public Criteria andPlaneUseIsNull() {
            addCriterion("plane_use is null");
            return (Criteria) this;
        }

        public Criteria andPlaneUseIsNotNull() {
            addCriterion("plane_use is not null");
            return (Criteria) this;
        }

        public Criteria andPlaneUseEqualTo(Integer value) {
            addCriterion("plane_use =", value, "planeUse");
            return (Criteria) this;
        }

        public Criteria andPlaneUseNotEqualTo(Integer value) {
            addCriterion("plane_use <>", value, "planeUse");
            return (Criteria) this;
        }

        public Criteria andPlaneUseGreaterThan(Integer value) {
            addCriterion("plane_use >", value, "planeUse");
            return (Criteria) this;
        }

        public Criteria andPlaneUseGreaterThanOrEqualTo(Integer value) {
            addCriterion("plane_use >=", value, "planeUse");
            return (Criteria) this;
        }

        public Criteria andPlaneUseLessThan(Integer value) {
            addCriterion("plane_use <", value, "planeUse");
            return (Criteria) this;
        }

        public Criteria andPlaneUseLessThanOrEqualTo(Integer value) {
            addCriterion("plane_use <=", value, "planeUse");
            return (Criteria) this;
        }

        public Criteria andPlaneUseIn(List<Integer> values) {
            addCriterion("plane_use in", values, "planeUse");
            return (Criteria) this;
        }

        public Criteria andPlaneUseNotIn(List<Integer> values) {
            addCriterion("plane_use not in", values, "planeUse");
            return (Criteria) this;
        }

        public Criteria andPlaneUseBetween(Integer value1, Integer value2) {
            addCriterion("plane_use between", value1, value2, "planeUse");
            return (Criteria) this;
        }

        public Criteria andPlaneUseNotBetween(Integer value1, Integer value2) {
            addCriterion("plane_use not between", value1, value2, "planeUse");
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