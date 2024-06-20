package com.ls.stockOverflow.models;

import jakarta.persistence.Entity;

@Entity
public class ReviewBuyer {
    private String name;
    private int money;
    private boolean isRich;

    public ReviewBuyer() {
    }

    public ReviewBuyer(String name, int money, boolean isRich) {
        this.name = name;
        this.money = money;
        this.isRich = isRich;
    }

    public boolean isRich() {
        return isRich;
    }

    public void setRich(boolean rich) {
        isRich = rich;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ReviewBuyer{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", isRich=" + isRich +
                '}';
    }
}
