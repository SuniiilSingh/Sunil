package com.ajira.Rover.entiry;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 */
public class Performs {
    @JsonProperty("collect-sample")
    public CollectSample collectSample;
    @JsonProperty("item-usage")
    public ItemUsage itemUsage;

    public Performs() {
    }

    public Performs(CollectSample collectSample, ItemUsage itemUsage) {
        this.collectSample = collectSample;
        this.itemUsage = itemUsage;
    }

    public CollectSample getCollectSample() {
        return collectSample;
    }

    public void setCollectSample(CollectSample collectSample) {
        this.collectSample = collectSample;
    }

    public ItemUsage getItemUsage() {
        return itemUsage;
    }

    public void setItemUsage(ItemUsage itemUsage) {
        this.itemUsage = itemUsage;
    }
}
