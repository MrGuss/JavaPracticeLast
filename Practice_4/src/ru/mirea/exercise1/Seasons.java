package ru.mirea.exercise1;

public enum Seasons{
    WINTER(-7),
    SPRING(+8),
    SUMMER(+22) {
        @Override
        public String getDescription() {
            return "Warm season";
        }
    },
    AUTUMN(+15);
    private final int averageTemperature;
    Seasons(int averageTemperature){
        this.averageTemperature = averageTemperature;
    }
    public int getAverageTemperature(){
        return averageTemperature;
    }
    public String getDescription(){
        return "Cold season";
    }
}
