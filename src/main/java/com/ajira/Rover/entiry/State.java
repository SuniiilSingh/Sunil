package com.ajira.Rover.entiry;

import java.util.List;

/**
 *
 */
public class State {
    public String name;
    public List<String> allowedActions;

    public State() {
    }

    public State(String name, List<String> allowedActions) {
        this.name = name;
        this.allowedActions = allowedActions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAllowedActions() {
        return allowedActions;
    }

    public void setAllowedActions(List<String> allowedActions) {
        this.allowedActions = allowedActions;
    }
}
