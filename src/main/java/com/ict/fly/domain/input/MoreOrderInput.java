package com.ict.fly.domain.input;

public class MoreOrderInput {
    private Long renshu;
    private String plane_type;
    private String username;


    @Override
    public String toString() {
        return "MoreOrderInput{" +
                "renshu=" + renshu +
                ", plane_type='" + plane_type + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getRenshu() {
        return renshu;
    }

    public void setRenshu(Long renshu) {
        this.renshu = renshu;
    }

    public String getPlane_type() {
        return plane_type;
    }

    public void setPlane_type(String plane_type) {
        this.plane_type = plane_type;
    }
}
