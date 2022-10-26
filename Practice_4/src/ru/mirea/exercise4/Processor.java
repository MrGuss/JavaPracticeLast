package ru.mirea.exercise4;

public class Processor extends ProcessorModel{
    public Processor(Computers computer, String model, String cores, String frequency){
        super(computer, model, cores, frequency);
    }
    @Override
    public String toString() {
        return "Processor: " +
                "\n For computers: " + getComputer() +
                "\n Model: " + getModel() +
                "\n Number of cores: " + getCores() +
                "\n Frequency: " + getFrequency() + " GHz";
    }
}
