package com.ahasanidea.java.observer;

import java.util.ArrayList;
import java.util.List;

public class Weather {
    private WeatherType currentWeather;
    private List<WeatherObserver> observers;
    public Weather(){
        observers=new ArrayList<>();
        currentWeather=WeatherType.SUNNY;
    }
    public void addObserver(WeatherObserver obs){
        observers.add(obs);
    }
    public void removeObserver(WeatherObserver obs){
        observers.remove(obs);
    }
}
