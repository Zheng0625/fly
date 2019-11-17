package com.ict.fly.domain.input;

public class SelectOrderResultMap {
    private Integer seat_locationx;
    private Integer seat_locationy;
    private String plane_name;
    private String u_username;

    @Override
    public String toString() {
        return "SelectOrderResultMap{" +
                "seat_locationx=" + seat_locationx +
                ", seat_locationy=" + seat_locationy +
                ", plane_name='" + plane_name + '\'' +
                ", u_username='" + u_username + '\'' +
                '}';
    }

    public String getU_username() {
        return u_username;
    }

    public void setU_username(String u_username) {
        this.u_username = u_username;
    }

    public Integer getSeat_locationx() {
        return seat_locationx;
    }

    public void setSeat_locationx(Integer seat_locationx) {
        this.seat_locationx = seat_locationx;
    }

    public Integer getSeat_locationy() {
        return seat_locationy;
    }

    public void setSeat_locationy(Integer seat_locationy) {
        this.seat_locationy = seat_locationy;
    }

    public String getPlane_name() {
        return plane_name;
    }

    public void setPlane_name(String plane_name) {
        this.plane_name = plane_name;
    }
}
