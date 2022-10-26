package ru.mirea.exercise4;

public class Monitor extends MonitorModel{
    public Monitor(Computers computer, String diagonal, String permission, String frequency, String matrix, String sides, String corners, String brightness){
        super(computer, diagonal, permission, frequency, matrix, sides, corners, brightness);
    }
    @Override
    public String toString() {
        return "Monitor: " +
                "\n For computers: " + getComputer() +
                "\n Diagonal: " + getDiagonal() + " inches" +
                "\n Permission: " + getPermission() + " pixels" +
                "\n Frequency: " + getFrequency() + " Hz" +
                "\n Matrix type: " + getMatrix() +
                "\n Aspect ratio: " + getSides() +
                "\n Viewing angles: " + getCorners() +
                "\n Matrix brightness: " + getBrightness() + " cd/m2";
    }
}
