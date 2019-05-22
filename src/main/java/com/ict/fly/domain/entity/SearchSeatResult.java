package com.ict.fly.domain.entity;

public class SearchSeatResult {
    private Integer planeId;
    private Integer seatId;
    private Integer isseat;

    @Override
    public String toString() {
        return "SearchSeatResult{" +
                "planeId=" + planeId +
                ", seatId=" + seatId +
                ", isseat=" + isseat +
                '}';
    }

    public Integer getPlaneId() {
        return planeId;
    }

    public void setPlaneId(Integer planeId) {
        this.planeId = planeId;
    }

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public Integer getIsseat() {
        return isseat;
    }

    public void setIsseat(Integer isseat) {
        this.isseat = isseat;
    }
}
