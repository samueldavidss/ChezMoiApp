package com.example.samuelsanchez.chezmoiapp.Models;

/**
 * Created by Samuel on 06-10-2017.
 */

public class Pending {

    public String reference, name, key, site;
    public String local;

    public Pending() {
    }


    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}

