package com.ict.fly.domain.entity;

public class MoreSeat {

    private long one;
    private long two;
    private int planeId;

    @Override
    public String toString() {
        return "MoreSeat{" +
                "one=" + one +
                ", two=" + two +
                ", planeId=" + planeId +
                '}';
    }

    public int getPlaneId() {
        return planeId;
    }

    public void setPlaneId(int planeId) {
        this.planeId = planeId;
    }

    public long getOne() {
        return one;
    }

    public void setOne(long one) {
        this.one = one;
    }

    public long getTwo() {
        return two;
    }

    public void setTwo(long two) {
        this.two = two;
    }
}
