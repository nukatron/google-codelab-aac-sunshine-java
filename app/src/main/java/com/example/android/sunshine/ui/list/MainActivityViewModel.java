package com.example.android.sunshine.ui.list;


import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.android.sunshine.data.SunshineRepository;
import com.example.android.sunshine.data.database.ListWeatherEntry;
import com.example.android.sunshine.data.database.WeatherEntry;

import java.util.List;

public class MainActivityViewModel extends ViewModel {

    private LiveData<List<ListWeatherEntry>> mEntryList;

    public MainActivityViewModel(SunshineRepository repository) {
        mEntryList = repository.getCurrentWeatherForecasts();
    }

    public LiveData<List<ListWeatherEntry>> getForecast() {
        return mEntryList;
    }
}
