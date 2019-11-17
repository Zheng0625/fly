package com.ict.fly.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class FOrderinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public FOrderinfoExample() {
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

        public Criteria andUNameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("u_name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("u_name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("u_name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("u_name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("u_name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("u_name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUIdTypeIsNull() {
            addCriterion("u_id_type is null");
            return (Criteria) this;
        }

        public Criteria andUIdTypeIsNotNull() {
            addCriterion("u_id_type is not null");
            return (Criteria) this;
        }

        public Criteria andUIdTypeEqualTo(Integer value) {
            addCriterion("u_id_type =", value, "uIdType");
            return (Criteria) this;
        }

        public Criteria andUIdTypeNotEqualTo(Integer value) {
            addCriterion("u_id_type <>", value, "uIdType");
            return (Criteria) this;
        }

        public Criteria andUIdTypeGreaterThan(Integer value) {
            addCriterion("u_id_type >", value, "uIdType");
            return (Criteria) this;
        }

        public Criteria andUIdTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id_type >=", value, "uIdType");
            return (Criteria) this;
        }

        public Criteria andUIdTypeLessThan(Integer value) {
            addCriterion("u_id_type <", value, "uIdType");
            return (Criteria) this;
        }

        public Criteria andUIdTypeLessThanOrEqualTo(Integer value) {
            addCriterion("u_id_type <=", value, "uIdType");
            return (Criteria) this;
        }

        public Criteria andUIdTypeIn(List<Integer> values) {
            addCriterion("u_id_type in", values, "uIdType");
            return (Criteria) this;
        }

        public Criteria andUIdTypeNotIn(List<Integer> values) {
            addCriterion("u_id_type not in", values, "uIdType");
            return (Criteria) this;
        }

        public Criteria andUIdTypeBetween(Integer value1, Integer value2) {
            addCriterion("u_id_type between", value1, value2, "uIdType");
            return (Criteria) this;
        }

        public Criteria andUIdTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id_type not between", value1, value2, "uIdType");
            return (Criteria) this;
        }

        public Criteria andUIdNum1IsNull() {
            addCriterion("u_id_num1 is null");
            return (Criteria) this;
        }

        public Criteria andUIdNum1IsNotNull() {
            addCriterion("u_id_num1 is not null");
            return (Criteria) this;
        }

        public Criteria andUIdNum1EqualTo(String value) {
            addCriterion("u_id_num1 =", value, "uIdNum1");
            return (Criteria) this;
        }

        public Criteria andUIdNum1NotEqualTo(String value) {
            addCriterion("u_id_num1 <>", value, "uIdNum1");
            return (Criteria) this;
        }

        public Criteria andUIdNum1GreaterThan(String value) {
            addCriterion("u_id_num1 >", value, "uIdNum1");
            return (Criteria) this;
        }

        public Criteria andUIdNum1GreaterThanOrEqualTo(String value) {
            addCriterion("u_id_num1 >=", value, "uIdNum1");
            return (Criteria) this;
        }

        public Criteria andUIdNum1LessThan(String value) {
            addCriterion("u_id_num1 <", value, "uIdNum1");
            return (Criteria) this;
        }

        public Criteria andUIdNum1LessThanOrEqualTo(String value) {
            addCriterion("u_id_num1 <=", value, "uIdNum1");
            return (Criteria) this;
        }

        public Criteria andUIdNum1Like(String value) {
            addCriterion("u_id_num1 like", value, "uIdNum1");
            return (Criteria) this;
        }

        public Criteria andUIdNum1NotLike(String value) {
            addCriterion("u_id_num1 not like", value, "uIdNum1");
            return (Criteria) this;
        }

        public Criteria andUIdNum1In(List<String> values) {
            addCriterion("u_id_num1 in", values, "uIdNum1");
            return (Criteria) this;
        }

        public Criteria andUIdNum1NotIn(List<String> values) {
            addCriterion("u_id_num1 not in", values, "uIdNum1");
            return (Criteria) this;
        }

        public Criteria andUIdNum1Between(String value1, String value2) {
            addCriterion("u_id_num1 between", value1, value2, "uIdNum1");
            return (Criteria) this;
        }

        public Criteria andUIdNum1NotBetween(String value1, String value2) {
            addCriterion("u_id_num1 not between", value1, value2, "uIdNum1");
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