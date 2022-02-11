package com.example.honeyheist.model;

public class Bear {

    private String name;
    private String bearImage;
    private int hatNum;
    private int descriptorNum;
    private int bearTypeNum;
    private int roleNum;
    private int bearStat;
    private int criminalStat;

    public Bear(String name, String bearImage, int bearStat, int criminalStat){
        this.name = name;
        this.bearImage = bearImage;
        this.bearStat = 3;
        this.criminalStat = 3;
    }

    public Bear() {
    }

    public String getName() {
        return name;
    }

    public String getBearImage() {
        return bearImage;
    }

    public int getHatNum() {
        return hatNum;
    }

    public int getDescriptorNum() {
        return descriptorNum;
    }

    public int getBearTypeNum() {
        return bearTypeNum;
    }

    public int getRoleNum() {
        return roleNum;
    }

    public int getBearStat() {
        return bearStat;
    }

    public int getCriminalStat() {
        return criminalStat;
    }

    public void setBearStat(int bearStat) {
        this.bearStat = bearStat;
    }

    public void setCriminalStat(int criminalStat) {
        this.criminalStat = criminalStat;
    }
}
