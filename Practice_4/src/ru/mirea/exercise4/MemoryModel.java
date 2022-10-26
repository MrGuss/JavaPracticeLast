package ru.mirea.exercise4;

public abstract class MemoryModel {
    public Computers computer;
    public String type;
    public String volume;
    public String drive;
    public String size;
    public MemoryModel(Computers computer, String type, String volume, String drive, String size){
        this.computer = computer;
        this.type = type;
        this.volume = volume;
        this.drive = drive;
        this.size = size;
    }
    public Computers getComputer(){
        return computer;
    }
    public String getType(){
        return type;
    }
    public String getVolume(){
        return volume;
    }
    public String getDrive(){
        return drive;
    }
    public String getSize(){
        return size;
    }
}
