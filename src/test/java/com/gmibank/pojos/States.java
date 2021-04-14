package com.gmibank.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class States {

    private String name;
    private int id;
    private String tpcountry;
    public String getTpcountry() {
        return tpcountry;
    }

    public void setTpcountry(String tpCountry) {
        this.tpcountry = tpCountry;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
