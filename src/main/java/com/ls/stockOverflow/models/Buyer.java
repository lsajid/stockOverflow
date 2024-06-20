package com.ls.stockOverflow.models;

import jakarta.persistence.Entity;

@Entity
public class Buyer {
    private long id;
    private String displayName;
    private String userName;
    private String password;

    public Buyer() {
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "id=" + id +
                ", displayName='" + displayName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Buyer(String password, String userName, String displayName, long id) {
        this.password = password;
        this.userName = userName;
        this.displayName = displayName;
        this.id = id;
    }
}

//NOTES----
//use java to give you details so that buyer
//maps how we organize our buyer to the db itself