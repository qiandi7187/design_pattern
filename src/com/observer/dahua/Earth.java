package com.observer.dahua;

import java.util.Observable;

public class Earth extends Observable {
    private String weather ;

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        if(!weather.equals(this.weather)){
            this.weather = weather;
            setChanged();
        }
        notifyObservers(weather);
    }
}
