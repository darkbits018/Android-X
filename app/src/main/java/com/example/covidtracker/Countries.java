package com.example.covidtracker;

import com.google.gson.annotations.SerializedName;


public class Countries {

    @SerializedName("Country")
    private String Country;

    @SerializedName("TotalConfirmed")
    private String otalases;

    @SerializedName("NewConfirmed")
    private String newcases;

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country){
        Country = Country;
    }

    public String getOtalases() {
        return otalases;
    }

    public void setOtalases(String otalases) {
        this.otalases = otalases;
    }

    public String getNewcases() {
        return newcases;
    }

    public void setNewcases(String newcases) {
        this.newcases = newcases;
    }
}
