package com.ict.fly.domain.input;

public class SeatTypeSel {
    private String wora;
    private String seatExit;
    private String seatBaby;
    private String seatGate;
    private String plane_type;

    @Override
    public String toString() {
        return "SeatTypeSel{" +
                "wora='" + wora + '\'' +
                ", seatExit='" + seatExit + '\'' +
                ", seatBaby='" + seatBaby + '\'' +
                ", seatGate='" + seatGate + '\'' +
                ", plane_type='" + plane_type + '\'' +
                '}';
    }

    public String getWora() {
        return wora;
    }

    public void setWora(String wora) {
        this.wora = wora;
    }

    public String getSeatExit() {
        return seatExit;
    }

    public void setSeatExit(String seatExit) {
        this.seatExit = seatExit;
    }

    public String getSeatBaby() {
        return seatBaby;
    }

    public void setSeatBaby(String seatBaby) {
        this.seatBaby = seatBaby;
    }

    public String getSeatGate() {
        return seatGate;
    }

    public void setSeatGate(String seatGate) {
        this.seatGate = seatGate;
    }

    public String getPlane_type() {
        return plane_type;
    }

    public void setPlane_type(String plane_type) {
        this.plane_type = plane_type;
    }
}
