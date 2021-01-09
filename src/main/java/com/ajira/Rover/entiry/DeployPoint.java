package com.ajira.Rover.entiry;

/**
 *
 */
public class DeployPoint {
    public int row;
    public int column;

    public DeployPoint() {
    }

    public DeployPoint(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
