package ru.mirea.exercise4;

public class Output {
    public int counter = 1;
    public void toScreen(ProcessorModel[] array1, MemoryModel[] array2, MonitorModel[] array3){
        for(Computers computer : Computers.values()){
            System.out.println(counter + ") " + computer);
            System.out.println();
            for(ProcessorModel processor : array1){
                if(processor.getComputer() == computer){
                    System.out.println(processor);
                }
            }
            System.out.println();
            for(MemoryModel memory : array2){
                if(memory.getComputer() == computer){
                    System.out.println(memory);
                }
            }
            System.out.println();
            for(MonitorModel monitor : array3){
                if(monitor.getComputer() == computer){
                    System.out.println(monitor);
                }
            }
            System.out.println();
            counter += 1;
        }
    }
}
