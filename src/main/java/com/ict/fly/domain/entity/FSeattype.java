package com.ict.fly.domain.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class FSeattype implements Serializable {
    private Integer seatId;

    private Integer planeId;

    /**
     * 座位：0，不：1
     */
    private Integer seatYn;

    /**
     * 座位等级，头等舱 0；商务舱 1；经济舱 2
     */
    private Integer seatType;

    /**
     * 靠窗：0，不靠窗：1
     */
    private Integer seatWindow;

    /**
     * 靠过道：0，不：1
     */
    private Integer seatAisle;

    /**
     * 靠前
     */
    private Integer seatFront;

    /**
     * 紧急出口：0，不：1
     */
    private Integer seatExit;

    /**
     * 腿部宽敞：0，不：1
     */
    private Integer seatSpacious;

    /**
     * 登机口：0，不：1
     */
    private Integer seatGate;

    /**
     * 婴儿座位：0，不：1
     */
    private Integer seatBaby;

    private Integer seatLocationx;

    private Integer seatLocationy;

    private Integer seatLocationname;

    private FAirplane fAirplane;

    private FOrderinfo fOrderinfo;

    private SearchSeatResult searchSeatResult;

    private Integer isseat;

    public SearchSeatResult getSearchSeatResult() {
        return searchSeatResult;
    }

    public void setSearchSeatResult(SearchSeatResult searchSeatResult) {
        this.searchSeatResult = searchSeatResult;
    }

    public FAirplane getfAirplane() {
        return fAirplane;
    }

    public void setfAirplane(FAirplane fAirplane) {
        this.fAirplane = fAirplane;
    }

    public FOrderinfo getfOrderinfo() {
        return fOrderinfo;
    }

    public void setfOrderinfo(FOrderinfo fOrderinfo) {
        this.fOrderinfo = fOrderinfo;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private static final long serialVersionUID = 1L;

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public Integer getPlaneId() {
        return planeId;
    }

    public void setPlaneId(Integer planeId) {
        this.planeId = planeId;
    }

    public Integer getSeatYn() {
        return seatYn;
    }

    public void setSeatYn(Integer seatYn) {
        this.seatYn = seatYn;
    }

    public Integer getSeatType() {
        return seatType;
    }

    public void setSeatType(Integer seatType) {
        this.seatType = seatType;
    }

    public Integer getSeatWindow() {
        return seatWindow;
    }

    public void setSeatWindow(Integer seatWindow) {
        this.seatWindow = seatWindow;
    }

    public Integer getSeatAisle() {
        return seatAisle;
    }

    public void setSeatAisle(Integer seatAisle) {
        this.seatAisle = seatAisle;
    }

    public Integer getSeatFront() {
        return seatFront;
    }

    public void setSeatFront(Integer seatFront) {
        this.seatFront = seatFront;
    }

    public Integer getSeatExit() {
        return seatExit;
    }

    public void setSeatExit(Integer seatExit) {
        this.seatExit = seatExit;
    }

    public Integer getSeatSpacious() {
        return seatSpacious;
    }

    public void setSeatSpacious(Integer seatSpacious) {
        this.seatSpacious = seatSpacious;
    }

    public Integer getSeatGate() {
        return seatGate;
    }

    public void setSeatGate(Integer seatGate) {
        this.seatGate = seatGate;
    }

    public Integer getSeatBaby() {
        return seatBaby;
    }

    public void setSeatBaby(Integer seatBaby) {
        this.seatBaby = seatBaby;
    }

    public Integer getSeatLocationx() {
        return seatLocationx;
    }

    public void setSeatLocationx(Integer seatLocationx) {
        this.seatLocationx = seatLocationx;
    }

    public Integer getSeatLocationy() {
        return seatLocationy;
    }

    public void setSeatLocationy(Integer seatLocationy) {
        this.seatLocationy = seatLocationy;
    }

    public Integer getSeatLocationname() {
        return seatLocationname;
    }

    public void setSeatLocationname(Integer seatLocationname) {
        this.seatLocationname = seatLocationname;
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
        FSeattype other = (FSeattype) that;
        return (this.getSeatId() == null ? other.getSeatId() == null : this.getSeatId().equals(other.getSeatId()))
            && (this.getPlaneId() == null ? other.getPlaneId() == null : this.getPlaneId().equals(other.getPlaneId()))
            && (this.getSeatYn() == null ? other.getSeatYn() == null : this.getSeatYn().equals(other.getSeatYn()))
            && (this.getSeatType() == null ? other.getSeatType() == null : this.getSeatType().equals(other.getSeatType()))
            && (this.getSeatWindow() == null ? other.getSeatWindow() == null : this.getSeatWindow().equals(other.getSeatWindow()))
            && (this.getSeatAisle() == null ? other.getSeatAisle() == null : this.getSeatAisle().equals(other.getSeatAisle()))
            && (this.getSeatFront() == null ? other.getSeatFront() == null : this.getSeatFront().equals(other.getSeatFront()))
            && (this.getSeatExit() == null ? other.getSeatExit() == null : this.getSeatExit().equals(other.getSeatExit()))
            && (this.getSeatSpacious() == null ? other.getSeatSpacious() == null : this.getSeatSpacious().equals(other.getSeatSpacious()))
            && (this.getSeatGate() == null ? other.getSeatGate() == null : this.getSeatGate().equals(other.getSeatGate()))
            && (this.getSeatBaby() == null ? other.getSeatBaby() == null : this.getSeatBaby().equals(other.getSeatBaby()))
            && (this.getSeatLocationx() == null ? other.getSeatLocationx() == null : this.getSeatLocationx().equals(other.getSeatLocationx()))
            && (this.getSeatLocationy() == null ? other.getSeatLocationy() == null : this.getSeatLocationy().equals(other.getSeatLocationy()))
            && (this.getSeatLocationname() == null ? other.getSeatLocationname() == null : this.getSeatLocationname().equals(other.getSeatLocationname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSeatId() == null) ? 0 : getSeatId().hashCode());
        result = prime * result + ((getPlaneId() == null) ? 0 : getPlaneId().hashCode());
        result = prime * result + ((getSeatYn() == null) ? 0 : getSeatYn().hashCode());
        result = prime * result + ((getSeatType() == null) ? 0 : getSeatType().hashCode());
        result = prime * result + ((getSeatWindow() == null) ? 0 : getSeatWindow().hashCode());
        result = prime * result + ((getSeatAisle() == null) ? 0 : getSeatAisle().hashCode());
        result = prime * result + ((getSeatFront() == null) ? 0 : getSeatFront().hashCode());
        result = prime * result + ((getSeatExit() == null) ? 0 : getSeatExit().hashCode());
        result = prime * result + ((getSeatSpacious() == null) ? 0 : getSeatSpacious().hashCode());
        result = prime * result + ((getSeatGate() == null) ? 0 : getSeatGate().hashCode());
        result = prime * result + ((getSeatBaby() == null) ? 0 : getSeatBaby().hashCode());
        result = prime * result + ((getSeatLocationx() == null) ? 0 : getSeatLocationx().hashCode());
        result = prime * result + ((getSeatLocationy() == null) ? 0 : getSeatLocationy().hashCode());
        result = prime * result + ((getSeatLocationname() == null) ? 0 : getSeatLocationname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seatId=").append(seatId);
        sb.append(", planeId=").append(planeId);
        sb.append(", seatYn=").append(seatYn);
        sb.append(", seatType=").append(seatType);
        sb.append(", seatWindow=").append(seatWindow);
        sb.append(", seatAisle=").append(seatAisle);
        sb.append(", seatFront=").append(seatFront);
        sb.append(", seatExit=").append(seatExit);
        sb.append(", seatSpacious=").append(seatSpacious);
        sb.append(", seatGate=").append(seatGate);
        sb.append(", seatBaby=").append(seatBaby);
        sb.append(", seatLocationx=").append(seatLocationx);
        sb.append(", seatLocationy=").append(seatLocationy);
        sb.append(", seatLocationname=").append(seatLocationname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}