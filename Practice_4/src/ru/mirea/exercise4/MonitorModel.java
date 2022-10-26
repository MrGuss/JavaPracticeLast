package ru.mirea.exercise4;

public abstract class MonitorModel {
    public Computers computer;
    public String diagonal;
    public String permission;
    public String frequency;
    public String matrix;
    public String sides;
    public String corners;
    public String brightness;
    public MonitorModel(Computers computer, String diagonal, String permission, String frequency, String matrix, String sides, String corners, String brightness){
        this.computer = computer;
        this.diagonal = diagonal;
        this.permission = permission;
        this.frequency = frequency;
        this.matrix = matrix;
        this.sides = sides;
        this.corners = corners;
        this.brightness = brightness;
    }
    public Computers getComputer(){
        return computer;
    }
    public String getDiagonal(){
        return diagonal;
    }
    public String getPermission(){
        return permission;
    }
    public String getFrequency(){
        return frequency;
    }
    public String getMatrix(){
        return matrix;
    }
    public String getSides(){
        return sides;
    }
    public String getCorners(){
        return corners;
    }
    public String getBrightness(){
        return brightness;
    }
}
