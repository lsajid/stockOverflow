package com.ls.stockOverflow.models;

public class User {
    private String firstName;
    private String lastName;
    private int buyer;
    private long password;

    public User() {
    }

    public User(String firstName, String lastName, int buyer, long password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.buyer = buyer;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBuyer() {
        return buyer;
    }

    public void setBuyer(int buyer) {
        this.buyer = buyer;
    }

    public long getPassword() {
        return password;
    }

    public void setPassword(long password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", buyer=" + buyer +
                ", password=" + password +
                '}';
    }
}
