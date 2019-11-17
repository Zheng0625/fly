package com.ict.fly.domain.input;

public class PlaneOrder {
    private String name;
    private String username;
    private Integer seat_X;
    private Integer seat_Y;
    private String planeName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getSeat_X() {
        return seat_X;
    }

    public void setSeat_X(Integer seat_X) {
        this.seat_X = seat_X;
    }

    public Integer getSeat_Y() {
        return seat_Y;
    }

    public void setSeat_Y(Integer seat_Y) {
        this.seat_Y = seat_Y;
    }

    public String getPlaneName() {
        return planeName;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }
}
