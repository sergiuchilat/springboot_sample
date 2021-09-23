package com.springboot_sample.springboot_sample.model;

public class Country {
    private Integer id = null;
    private String name = null;

    Country(){

    }

    public Country(String name){
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
