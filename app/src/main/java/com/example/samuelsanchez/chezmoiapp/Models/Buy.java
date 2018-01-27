package com.example.samuelsanchez.chezmoiapp.Models;

/**
 * Created by Samuel on 27-Jan-18.
 */

public class Buy {
    public String description;
    public String Date;
    public int cost;
    public String user, key;


    public Buy() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
