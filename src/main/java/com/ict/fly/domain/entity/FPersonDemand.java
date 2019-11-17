package com.ict.fly.domain.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class FPersonDemand implements Serializable {
    private Integer demandId;

    /**
     * 用户id
     */
    private Integer userinfoId;

    /**
     * 订单编号
     */
    private Integer orderId;

    private Integer planeId;

    /**
     * 人数
     */
    private Integer demandRenshu;

    /**
     * 年轻女性
     */
    private Integer demandWomen;

    /**
     * 年轻男性
     */
    private Integer demandMen;

    /**
     * 四周无婴儿
     */
    private Integer demandNobaby;

    /**
     * 靠窗：0，不靠窗：1
     */
    private Integer demandWindow;

    /**
     * 靠过道：0，不：1
     */
    private Integer demandAisle;

    /**
     * 靠前：0，不：
     */
    private Integer demandFront;

    /**
     * 紧急出口：0，不：1
     */
    private Integer demandExit;

    /**
     * 腿部宽敞：0，不：1
     */
    private Integer demandSpacious;

    /**
     * 登机口：0，不：1
     */
    private Integer demandGate;

    /**
     * 婴儿座位：0，不：1
     */
    private Integer demandBaby;

    /**
     * 全部需求
     */
    private String demandAll;

    /**
     * 满足的需求
     */
    private String demandManzu;

    private static final long serialVersionUID = 1L;

    public Integer getDemandId() {
        return demandId;
    }

    public void setDemandId(Integer demandId) {
        this.demandId = demandId;
    }

    public Integer getUserinfoId() {
        return userinfoId;
    }

    public void setUserinfoId(Integer userinfoId) {
        this.userinfoId = userinfoId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getPlaneId() {
        return planeId;
    }

    public void setPlaneId(Integer planeId) {
        this.planeId = planeId;
    }

    public Integer getDemandRenshu() {
        return demandRenshu;
    }

    public void setDemandRenshu(Integer demandRenshu) {
        this.demandRenshu = demandRenshu;
    }

    public Integer getDemandWomen() {
        return demandWomen;
    }

    public void setDemandWomen(Integer demandWomen) {
        this.demandWomen = demandWomen;
    }

    public Integer getDemandMen() {
        return demandMen;
    }

    public void setDemandMen(Integer demandMen) {
        this.demandMen = demandMen;
    }

    public Integer getDemandNobaby() {
        return demandNobaby;
    }

    public void setDemandNobaby(Integer demandNobaby) {
        this.demandNobaby = demandNobaby;
    }

    public Integer getDemandWindow() {
        return demandWindow;
    }

    public void setDemandWindow(Integer demandWindow) {
        this.demandWindow = demandWindow;
    }

    public Integer getDemandAisle() {
        return demandAisle;
    }

    public void setDemandAisle(Integer demandAisle) {
        this.demandAisle = demandAisle;
    }

    public Integer getDemandFront() {
        return demandFront;
    }

    public void setDemandFront(Integer demandFront) {
        this.demandFront = demandFront;
    }

    public Integer getDemandExit() {
        return demandExit;
    }

    public void setDemandExit(Integer demandExit) {
        this.demandExit = demandExit;
    }

    public Integer getDemandSpacious() {
        return demandSpacious;
    }

    public void setDemandSpacious(Integer demandSpacious) {
        this.demandSpacious = demandSpacious;
    }

    public Integer getDemandGate() {
        return demandGate;
    }

    public void setDemandGate(Integer demandGate) {
        this.demandGate = demandGate;
    }

    public Integer getDemandBaby() {
        return demandBaby;
    }

    public void setDemandBaby(Integer demandBaby) {
        this.demandBaby = demandBaby;
    }

    public String getDemandAll() {
        return demandAll;
    }

    public void setDemandAll(String demandAll) {
        this.demandAll = demandAll;
    }

    public String getDemandManzu() {
        return demandManzu;
    }

    public void setDemandManzu(String demandManzu) {
        this.demandManzu = demandManzu;
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
        FPersonDemand other = (FPersonDemand) that;
        return (this.getDemandId() == null ? other.getDemandId() == null : this.getDemandId().equals(other.getDemandId()))
            && (this.getUserinfoId() == null ? other.getUserinfoId() == null : this.getUserinfoId().equals(other.getUserinfoId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getPlaneId() == null ? other.getPlaneId() == null : this.getPlaneId().equals(other.getPlaneId()))
            && (this.getDemandRenshu() == null ? other.getDemandRenshu() == null : this.getDemandRenshu().equals(other.getDemandRenshu()))
            && (this.getDemandWomen() == null ? other.getDemandWomen() == null : this.getDemandWomen().equals(other.getDemandWomen()))
            && (this.getDemandMen() == null ? other.getDemandMen() == null : this.getDemandMen().equals(other.getDemandMen()))
            && (this.getDemandNobaby() == null ? other.getDemandNobaby() == null : this.getDemandNobaby().equals(other.getDemandNobaby()))
            && (this.getDemandWindow() == null ? other.getDemandWindow() == null : this.getDemandWindow().equals(other.getDemandWindow()))
            && (this.getDemandAisle() == null ? other.getDemandAisle() == null : this.getDemandAisle().equals(other.getDemandAisle()))
            && (this.getDemandFront() == null ? other.getDemandFront() == null : this.getDemandFront().equals(other.getDemandFront()))
            && (this.getDemandExit() == null ? other.getDemandExit() == null : this.getDemandExit().equals(other.getDemandExit()))
            && (this.getDemandSpacious() == null ? other.getDemandSpacious() == null : this.getDemandSpacious().equals(other.getDemandSpacious()))
            && (this.getDemandGate() == null ? other.getDemandGate() == null : this.getDemandGate().equals(other.getDemandGate()))
            && (this.getDemandBaby() == null ? other.getDemandBaby() == null : this.getDemandBaby().equals(other.getDemandBaby()))
            && (this.getDemandAll() == null ? other.getDemandAll() == null : this.getDemandAll().equals(other.getDemandAll()))
            && (this.getDemandManzu() == null ? other.getDemandManzu() == null : this.getDemandManzu().equals(other.getDemandManzu()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDemandId() == null) ? 0 : getDemandId().hashCode());
        result = prime * result + ((getUserinfoId() == null) ? 0 : getUserinfoId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getPlaneId() == null) ? 0 : getPlaneId().hashCode());
        result = prime * result + ((getDemandRenshu() == null) ? 0 : getDemandRenshu().hashCode());
        result = prime * result + ((getDemandWomen() == null) ? 0 : getDemandWomen().hashCode());
        result = prime * result + ((getDemandMen() == null) ? 0 : getDemandMen().hashCode());
        result = prime * result + ((getDemandNobaby() == null) ? 0 : getDemandNobaby().hashCode());
        result = prime * result + ((getDemandWindow() == null) ? 0 : getDemandWindow().hashCode());
        result = prime * result + ((getDemandAisle() == null) ? 0 : getDemandAisle().hashCode());
        result = prime * result + ((getDemandFront() == null) ? 0 : getDemandFront().hashCode());
        result = prime * result + ((getDemandExit() == null) ? 0 : getDemandExit().hashCode());
        result = prime * result + ((getDemandSpacious() == null) ? 0 : getDemandSpacious().hashCode());
        result = prime * result + ((getDemandGate() == null) ? 0 : getDemandGate().hashCode());
        result = prime * result + ((getDemandBaby() == null) ? 0 : getDemandBaby().hashCode());
        result = prime * result + ((getDemandAll() == null) ? 0 : getDemandAll().hashCode());
        result = prime * result + ((getDemandManzu() == null) ? 0 : getDemandManzu().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", demandId=").append(demandId);
        sb.append(", userinfoId=").append(userinfoId);
        sb.append(", orderId=").append(orderId);
        sb.append(", planeId=").append(planeId);
        sb.append(", demandRenshu=").append(demandRenshu);
        sb.append(", demandWomen=").append(demandWomen);
        sb.append(", demandMen=").append(demandMen);
        sb.append(", demandNobaby=").append(demandNobaby);
        sb.append(", demandWindow=").append(demandWindow);
        sb.append(", demandAisle=").append(demandAisle);
        sb.append(", demandFront=").append(demandFront);
        sb.append(", demandExit=").append(demandExit);
        sb.append(", demandSpacious=").append(demandSpacious);
        sb.append(", demandGate=").append(demandGate);
        sb.append(", demandBaby=").append(demandBaby);
        sb.append(", demandAll=").append(demandAll);
        sb.append(", demandManzu=").append(demandManzu);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}