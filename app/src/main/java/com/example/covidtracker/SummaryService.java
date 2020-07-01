package com.example.covidtracker;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SummaryService {

    @GET("/Summary")
    Call<Summary>getSummary();

}
