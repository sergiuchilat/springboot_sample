package com.springboot_sample.springboot_sample.repository;


import java.util.Arrays;

public class CountriesRepository {

    String[] countries = {"Moldova", "Ucraina", "Romania"};

    public String create(){
        return "Create Country";
    }

    public String read(Integer id){
        try {
            return id + ":" + this.countries[id];
        } catch (Exception exception){
            return "Not found";
        }
    }

    public String readAll(){
        return Arrays.toString(this.countries);
    }

    public String update(){
        return "Update Country";
    }

    public String delete(){
        return "Delete Country";
    }
}
