package com.beyond.exclusive_club_vip.data;

public class VIPGuest {
    private String name;
    private double tab;

    public VIPGuest(String name, double tab) {
        this.name = name;
        this.tab = tab;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTab() {
        return tab;
    }

    public void setTab(double tab) {
        this.tab = tab;
    }
}
