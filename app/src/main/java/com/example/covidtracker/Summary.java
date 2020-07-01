package com.example.covidtracker;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Summary {

    @SerializedName("Countries")
    private ArrayList<Countries> countries;

    public ArrayList<Countries> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<Countries> countries) {
        this.countries = countries;
    }

}
