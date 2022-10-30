package ru.mirea.exercise7;

public class Main {
    public static void main(String[] args){
        Learner[] pupil = new Learner[]{
              new Schoolchild("Austin Newton", 17, "m", 10, 5.0),
              new Student("Lillian Hardy", 18, "w", 1, 5.0),
              new Schoolchild("Samson Francis", 15, "m", 8, 4.5),
              new Student("Daniella Garrett", 19, "w", 2, 4.7),
              new Schoolchild("Catherine Mcgee", 10, "w", 3, 4.0),
              new Student("Baldwin Wheeler", 20, "m", 2, 4.9),
              new Schoolchild("Georgiana Walton", 12, "w", 5, 4.1),
              new Student("Gerald Goodwin", 21, "m", 3, 4.3),
              new Schoolchild("Rosanna Cole", 18, "w", 11, 4.6),
              new Student("Jeffery Cain", 19, "m", 1, 5.0)
        };
        int counter1 = 1;
        int counter2 = 1;
        System.out.println();
        for(Learner person : pupil){
            if(person instanceof Student){
                System.out.println("Student " + counter1 + ":");
                System.out.println(person);
                System.out.println();
                counter1++;
            }
        }
        for(Learner person : pupil){
            if(person instanceof Schoolchild){
                System.out.println("Schoolchild " + counter2 + ":");
                System.out.println(person);
                System.out.println();
                counter2++;
            }
        }
    }
}
