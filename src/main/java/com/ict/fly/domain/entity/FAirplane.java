package com.ict.fly.domain.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class FAirplane implements Serializable {
    private Integer planeId;

    /**
     * 飞机型号
     */
    private String planeType;

    /**
     * 飞机座位数
     */
    private Integer planeSeat;

    private String planeName;

    /**
     * 飞机座位宽度
     */
    private Integer planeLocationx;

    /**
     * 飞机座位长度
     */
    private Integer planeLocationy;

    /**
     * 飞机可用：0，不可用：1
     */
    private Integer planeUse;

    private static final long serialVersionUID = 1L;

    public Integer getPlaneId() {
        return planeId;
    }

    public void setPlaneId(Integer planeId) {
        this.planeId = planeId;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public Integer getPlaneSeat() {
        return planeSeat;
    }

    public void setPlaneSeat(Integer planeSeat) {
        this.planeSeat = planeSeat;
    }

    public String getPlaneName() {
        return planeName;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }

    public Integer getPlaneLocationx() {
        return planeLocationx;
    }

    public void setPlaneLocationx(Integer planeLocationx) {
        this.planeLocationx = planeLocationx;
    }

    public Integer getPlaneLocationy() {
        return planeLocationy;
    }

    public void setPlaneLocationy(Integer planeLocationy) {
        this.planeLocationy = planeLocationy;
    }

    public Integer getPlaneUse() {
        return planeUse;
    }

    public void setPlaneUse(Integer planeUse) {
        this.planeUse = planeUse;
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
        FAirplane other = (FAirplane) that;
        return (this.getPlaneId() == null ? other.getPlaneId() == null : this.getPlaneId().equals(other.getPlaneId()))
            && (this.getPlaneType() == null ? other.getPlaneType() == null : this.getPlaneType().equals(other.getPlaneType()))
            && (this.getPlaneSeat() == null ? other.getPlaneSeat() == null : this.getPlaneSeat().equals(other.getPlaneSeat()))
            && (this.getPlaneName() == null ? other.getPlaneName() == null : this.getPlaneName().equals(other.getPlaneName()))
            && (this.getPlaneLocationx() == null ? other.getPlaneLocationx() == null : this.getPlaneLocationx().equals(other.getPlaneLocationx()))
            && (this.getPlaneLocationy() == null ? other.getPlaneLocationy() == null : this.getPlaneLocationy().equals(other.getPlaneLocationy()))
            && (this.getPlaneUse() == null ? other.getPlaneUse() == null : this.getPlaneUse().equals(other.getPlaneUse()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPlaneId() == null) ? 0 : getPlaneId().hashCode());
        result = prime * result + ((getPlaneType() == null) ? 0 : getPlaneType().hashCode());
        result = prime * result + ((getPlaneSeat() == null) ? 0 : getPlaneSeat().hashCode());
        result = prime * result + ((getPlaneName() == null) ? 0 : getPlaneName().hashCode());
        result = prime * result + ((getPlaneLocationx() == null) ? 0 : getPlaneLocationx().hashCode());
        result = prime * result + ((getPlaneLocationy() == null) ? 0 : getPlaneLocationy().hashCode());
        result = prime * result + ((getPlaneUse() == null) ? 0 : getPlaneUse().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", planeId=").append(planeId);
        sb.append(", planeType=").append(planeType);
        sb.append(", planeSeat=").append(planeSeat);
        sb.append(", planeName=").append(planeName);
        sb.append(", planeLocationx=").append(planeLocationx);
        sb.append(", planeLocationy=").append(planeLocationy);
        sb.append(", planeUse=").append(planeUse);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}