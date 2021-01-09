package com.ajira.Rover.entiry;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import java.util.List;

/**
 *
 */
@Entity
public class EnvironmentConfig {

    public int temperature;
    public int humidity;
    @JsonProperty("solar-flare")
    public boolean solarFlare;
    public boolean storm;
    @JsonProperty("area-map")
    public List<List<String>> areaMap;

    public EnvironmentConfig() {
    }

    public EnvironmentConfig(int temperature, int humidity, boolean solarFlare, boolean storm, List<List<String>> areaMap) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.solarFlare = solarFlare;
        this.storm = storm;
        this.areaMap = areaMap;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public boolean isSolarFlare() {
        return solarFlare;
    }

    public void setSolarFlare(boolean solarFlare) {
        this.solarFlare = solarFlare;
    }

    public boolean isStorm() {
        return storm;
    }

    public void setStorm(boolean storm) {
        this.storm = storm;
    }

    public List<List<String>> getAreaMap() {
        return areaMap;
    }

    public void setAreaMap(List<List<String>> areaMap) {
        this.areaMap = areaMap;
    }
}
