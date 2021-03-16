package com.gmibank.pojos;

public class Countries {

    private String name;
    private String states;
    private int id;

    public Countries() {
    }

    public Countries(String name, String states) {
        this.name = name;
        this.states = states;
    }

    public Countries(String name, String states, int id) {
        this.name = name;
        this.states = states;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Countries{" +
                "name='" + name + '\'' +
                ", states='" + states + '\'' +
                ", id=" + id +
                '}';
    }
}
