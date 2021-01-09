package com.ajira.Rover.entiry;

/**
 *
 */
public class CollectSample {
    public String type;
    public int qty;

    public CollectSample() {
    }

    public CollectSample(String type, int qty) {
        this.type = type;
        this.qty = qty;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
