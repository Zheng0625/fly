package com.ict.fly.domain.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class FOrderinfo implements Serializable {
    /**
     * 座位id
     */
    private Integer orderId;

    /**
     * 座位id
     */
    private Integer seatId;

    /**
     * 旅客姓名
     */
    private String uName;

    /**
     * 证件类型  身份证 0，护照 1
     */
    private Integer uIdType;

    /**
     * 证件号码
     */
    private String uIdNum1;

    /**
     * 座位等级，头等舱 0；商务舱 1；经济舱 2
     */
    private Integer seatType;

    /**
     * 飞机型号
     */
    private String planeType;

    private FAirplane fAirplane;

    private FSeattype fSeattype;

    public FSeattype getfSeattype() {
        return fSeattype;
    }

    public void setfSeattype(FSeattype fSeattype) {
        this.fSeattype = fSeattype;
    }

    public FAirplane getfAirplane() {
        return fAirplane;
    }

    public void setfAirplane(FAirplane fAirplane) {
        this.fAirplane = fAirplane;
    }

    private static final long serialVersionUID = 1L;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public Integer getuIdType() {
        return uIdType;
    }

    public void setuIdType(Integer uIdType) {
        this.uIdType = uIdType;
    }

    public String getuIdNum1() {
        return uIdNum1;
    }

    public void setuIdNum1(String uIdNum1) {
        this.uIdNum1 = uIdNum1;
    }

    public Integer getSeatType() {
        return seatType;
    }

    public void setSeatType(Integer seatType) {
        this.seatType = seatType;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        FOrderinfo other = (FOrderinfo) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getSeatId() == null ? other.getSeatId() == null : this.getSeatId().equals(other.getSeatId()))
            && (this.getuName() == null ? other.getuName() == null : this.getuName().equals(other.getuName()))
            && (this.getuIdType() == null ? other.getuIdType() == null : this.getuIdType().equals(other.getuIdType()))
            && (this.getuIdNum1() == null ? other.getuIdNum1() == null : this.getuIdNum1().equals(other.getuIdNum1()))
            && (this.getSeatType() == null ? other.getSeatType() == null : this.getSeatType().equals(other.getSeatType()))
            && (this.getPlaneType() == null ? other.getPlaneType() == null : this.getPlaneType().equals(other.getPlaneType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getSeatId() == null) ? 0 : getSeatId().hashCode());
        result = prime * result + ((getuName() == null) ? 0 : getuName().hashCode());
        result = prime * result + ((getuIdType() == null) ? 0 : getuIdType().hashCode());
        result = prime * result + ((getuIdNum1() == null) ? 0 : getuIdNum1().hashCode());
        result = prime * result + ((getSeatType() == null) ? 0 : getSeatType().hashCode());
        result = prime * result + ((getPlaneType() == null) ? 0 : getPlaneType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", seatId=").append(seatId);
        sb.append(", uName=").append(uName);
        sb.append(", uIdType=").append(uIdType);
        sb.append(", uIdNum1=").append(uIdNum1);
        sb.append(", seatType=").append(seatType);
        sb.append(", planeType=").append(planeType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}