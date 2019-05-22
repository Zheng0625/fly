package com.ict.fly.domain.entity;

public class MoreSeat {

    private long one;
    private long two;

    @Override
    public String toString() {
        return "MoreSeat{" +
                "one=" + one +
                ", two=" + two +
                '}';
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
