package com.ajira.Rover.entiry;

import java.util.List;

/**
 *
 */
public class Scenario {
    public String name;
    public List<Condition> conditions;
    public List<Rover> rover;

    public Scenario() {
    }

    public Scenario(String name, List<Condition> conditions, List<Rover> rover) {
        this.name = name;
        this.conditions = conditions;
        this.rover = rover;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public List<Rover> getRover() {
        return rover;
    }

    public void setRover(List<Rover> rover) {
        this.rover = rover;
    }
}
