package com.gmibank.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country3 {
    private String id;
    private String name;
    private States3 states;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public States3 getStates() {
        return states;
    }

    public void setStates(States3 states) {
        this.states = states;
    }
}
