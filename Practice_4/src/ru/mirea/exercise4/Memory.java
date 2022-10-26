package ru.mirea.exercise4;

public class Memory extends MemoryModel{
    public Memory(Computers computer, String type, String volume, String drive, String size){
        super(computer, type, volume, drive, size);
    }
    @Override
    public String toString() {
        return "Memory: " +
                "\n For computers: " + getComputer() +
                "\n Type: " + getType() +
                "\n Volume: " + getVolume() + " GB" +
                "\n Drive type: " + getDrive() +
                "\n Storage capacity: " + getSize();
    }
}
