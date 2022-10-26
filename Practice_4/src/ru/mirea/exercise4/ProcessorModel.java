package ru.mirea.exercise4;

public abstract class ProcessorModel {
    public Computers computer;
    public String model;
    public String cores;
    public String frequency;
    public ProcessorModel(Computers computer, String model, String cores, String frequency){
        this.computer = computer;
        this.model = model;
        this.cores = cores;
        this.frequency = frequency;
    }
    public Computers getComputer(){
        return computer;
    }
    public String getModel(){
        return model;
    }
    public String getCores(){
        return cores;
    }
    public String getFrequency(){
        return frequency;
    }
}
