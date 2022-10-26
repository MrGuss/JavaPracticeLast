package ru.mirea.exercise4;

public class Main {
    public static void main(String[] args){
        ProcessorModel[] processorModel = new ProcessorModel[]{
                new Processor(Computers.APPLE, "Intel Core i5", "4 - 12", "3"),
                new Processor(Computers.MSI, "Intel Core i7", "2 - 12", "2 - 3"),
                new Processor(Computers.ASUS, "Intel Core i3", "2 - 8", "2 - 3"),
                new Processor(Computers.HP, "Intel Core i5", "2 - 8", "2 - 3"),
                new Processor(Computers.LENOVO, "Intel Core i5", "2 - 8", "2 - 3"),
                new Processor(Computers.ACER, "Intel Core i5", "2 - 18", "2 - 3"),
                new Processor(Computers.DELL, "Intel Core i3", "2 - 8", "2 - 3")
        };
        MemoryModel[] memoryModel = new MemoryModel[]{
                new Memory(Computers.APPLE, "DDR4", "8 - 96", "SSD", "320 GB - 2 TB"),
                new Memory(Computers.MSI, "DDR4", "2 - 128", "HDD + SSD", "320 GB - 2 TB"),
                new Memory(Computers.ASUS, "DDR4", "4 - 16", "SSD", "320 GB - 2 TB"),
                new Memory(Computers.HP, "DDR4", "2 - 32", "HDD", "320 GB - 2 TB"),
                new Memory(Computers.LENOVO, "DDR4", "2 - 32", "HDD", "320 GB - 2 TB"),
                new Memory(Computers.ACER, "DDR4", "2 - 64", "HDD", "320 GB - 2 TB"),
                new Memory(Computers.DELL, "DDR4", "4 - 64", "HDD", "320 GB - 2 TB")
        };
        MonitorModel[] monitorModel = new MonitorModel[]{
                new Monitor(Computers.APPLE, "30", "5120×2160", "60", "IPS", "16:9", "178/178", "100"),
                new Monitor(Computers.MSI, "22 - 30", "1920×1080", "360 - 60", "VA", "16:9", "178/178", "250 - 550"),
                new Monitor(Computers.ASUS, "19 - 30", "1920×1080", "240 - 60", "TN", "16:9", "178/178", "200 - 450"),
                new Monitor(Computers.HP, "19 - 30", "1920×1080", "240 - 60", "IPS", "16:9", "178/178", "200 - 750"),
                new Monitor(Computers.LENOVO, "19 - 30", "1920×1080", "240 - 60", "IPS", "16:9", "178/178", "200 - 400"),
                new Monitor(Computers.ACER, "19 - 30", "1920×1080", "240 - 60", "IPS", "16:9", "178/178", "200 - 750"),
                new Monitor(Computers.DELL, "19 - 30", "1920×1080", "120 - 60", "IPS", "16:9", "178/178", "200 - 350")
        };
        System.out.println();
        System.out.println("Computers:");
        System.out.println();
        Output output = new Output();
        output.toScreen(processorModel, memoryModel, monitorModel);
    }
}
