package com.ajira.Rover.entiry;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 *
 */
public class Root{
    public List<Scenario> scenarios;
    public List<State> states;
    @JsonProperty("deploy-point")
    public DeployPoint deployPoint;
    @JsonProperty("initial-battery")
    public int initialBattery;
    public List<Inventory> inventory;

    public Root() {
    }

    public Root(List<Scenario> scenarios, List<State> states, DeployPoint deployPoint, int initialBattery, List<Inventory> inventory) {
        this.scenarios = scenarios;
        this.states = states;
        this.deployPoint = deployPoint;
        this.initialBattery = initialBattery;
        this.inventory = inventory;
    }

    public List<Scenario> getScenarios() {
        return scenarios;
    }

    public void setScenarios(List<Scenario> scenarios) {
        this.scenarios = scenarios;
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

    public DeployPoint getDeployPoint() {
        return deployPoint;
    }

    public void setDeployPoint(DeployPoint deployPoint) {
        this.deployPoint = deployPoint;
    }

    public int getInitialBattery() {
        return initialBattery;
    }

    public void setInitialBattery(int initialBattery) {
        this.initialBattery = initialBattery;
    }

    public List<Inventory> getInventory() {
        return inventory;
    }

    public void setInventory(List<Inventory> inventory) {
        this.inventory = inventory;
    }
}