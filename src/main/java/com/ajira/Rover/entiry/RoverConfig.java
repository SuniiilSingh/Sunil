package com.ajira.Rover.entiry;

/**
 *
 */
public class RoverConfig {

    private Integer id;
    private Condition condition;

    private CollectSample collectSample;

    private ItemUsage itemUsage;

    private Performs performs;

    private Rover rover;

    private Scenario scenario;

    private  State state;

    private DeployPoint deployPoint;

    private Inventory inventory;

    private Root root;

    public RoverConfig() {

    }

    public RoverConfig(Integer id, Condition condition, CollectSample collectSample, ItemUsage itemUsage, Performs performs, Rover rover, Scenario scenario, State state, DeployPoint deployPoint, Inventory inventory, Root root) {
        this.id = id;
        this.condition = condition;
        this.collectSample = collectSample;
        this.itemUsage = itemUsage;
        this.performs = performs;
        this.rover = rover;
        this.scenario = scenario;
        this.state = state;
        this.deployPoint = deployPoint;
        this.inventory = inventory;
        this.root = root;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
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

    public Performs getPerforms() {
        return performs;
    }

    public void setPerforms(Performs performs) {
        this.performs = performs;
    }

    public Rover getRover() {
        return rover;
    }

    public void setRover(Rover rover) {
        this.rover = rover;
    }

    public Scenario getScenario() {
        return scenario;
    }

    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public DeployPoint getDeployPoint() {
        return deployPoint;
    }

    public void setDeployPoint(DeployPoint deployPoint) {
        this.deployPoint = deployPoint;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Root getRoot() {
        return root;
    }

    public void setRoot(Root root) {
        this.root = root;
    }
}
