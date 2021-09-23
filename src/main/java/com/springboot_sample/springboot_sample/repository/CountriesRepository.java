package com.springboot_sample.springboot_sample.repository;


import com.springboot_sample.springboot_sample.model.Country;

import java.util.ArrayList;

public class CountriesRepository {

    ArrayList<String> countries = new ArrayList<>();
    ArrayList<Country> countriesModel = new ArrayList<Country>();

    public CountriesRepository(){
        this.countries.add("Moldova");
        this.countries.add("Ucraine");
        this.countries.add("Romania");
        this.countries.add("Turkey");
    }

    public String create(String countryName){
        Country country = new Country(countryName);
        this.countriesModel.add(country);

        this.countries.add(countryName);
        System.out.println(countriesModel);
        return "Country created 2";
    }

    public String read(Integer id){
        try {
            return id + ":" + this.countries.get(id);
        } catch (Exception exception){
            return "Not found";
        }
    }

    public String readAll(){
        return this.countries.toString();
    }

    public String update(Integer id, String countryName){
        try {
            this.countries.set(id, countryName);
            return "Country updated";
        } catch (Exception exception){
            return "Country not found";
        }
    }

    public String delete(Integer id){
        try {
            this.countries.remove(this.countries.get(id));
            return "Country deleted";
        } catch (Exception exception){
            return "Country not found";
        }

    }
}
