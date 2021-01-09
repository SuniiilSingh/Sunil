package com.ajira.Rover.entiry;

/**
 *
 */
public class Inventory {
    public String type;
    public int quantity;
    public int priority;

    public Inventory() {
    }

    public Inventory(String type, int quantity, int priority) {
        this.type = type;
        this.quantity = quantity;
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
