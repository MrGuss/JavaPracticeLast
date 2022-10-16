package ru.mirea.exercise3_Formatting;

public class Report {
    public static void main(String[] args){
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Jeffry Ray", 8259.12396);
        employee[1] = new Employee("Damon Bell", 8202.14825);
        employee[2] = new Employee("Adele Wilkerson", 8105.15471);
        employee[3] = new Employee("Warren Lee", 8526.19119);
        employee[4] = new Employee("Irma Burns", 9157.49185);
        employee[5] = new Employee("Phylis Harrison", 8550.22411);
        employee[6] = new Employee("Arron Robertson", 9808.31171);
        employee[7] = new Employee("Nancy West", 7764.18354);
        employee[8] = new Employee("Gabriel Chapman", 8885.26391);
        employee[9] = new Employee("Karin Robertson", 9898.76743);
        System.out.println("Employee salaries:");
        generateReport(employee);
    }
    public static void generateReport(Employee[] employee){
        int number = 1;
        for(Employee person : employee){
            System.out.printf("%5s) ", number);
            if(person.fullName.length() == 15){
                System.out.printf("%s:", person.fullName);
                System.out.printf("%15.2f$ \n", person.salary);
            }
            if(person.fullName.length() == 10){
                System.out.printf("%s:", person.fullName);
                System.out.printf("%20.2f$ \n", person.salary);
            }
            number++;
        }
    }
}
