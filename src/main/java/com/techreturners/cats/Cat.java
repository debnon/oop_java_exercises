package com.techreturners.cats;

public abstract class Cat implements Behaviours {

    protected boolean sleep = false;
    protected int averageHeight;
    protected String setting;

    public Cat(int averageHeight, String setting) {
        this.averageHeight = averageHeight;
        this.setting = setting;
    }

    public boolean isAsleep() {
        return sleep;
    }
    public void goToSleep() {
        sleep = true;
    }
    public void wakeUp() {
        sleep = false;
    }

    public String getSetting() {
        return setting;
    }

    public int getAverageHeight() {
        return averageHeight;
    }

    public String eat() {
        return "Mmm, food!";
    }

}
