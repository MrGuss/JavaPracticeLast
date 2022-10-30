package ru.mirea.exercise5;

public class Reader {
    public String fullName;
    public int number;
    public String faculty;
    public String birthdate;
    public String telephone;
    public Reader(String fullName, int number, String faculty, String birthdate, String telephone){
        this.fullName = fullName;
        this.number = number;
        this.faculty = faculty;
        this.birthdate = birthdate;
        this.telephone = telephone;
    }
    public void takeBook(){
        System.out.println(fullName + " took the book.");
    }
    public void takeBook(String...name){
        System.out.print(fullName + " took the books: ");
        int i = 1;
        for(String book : name){
            System.out.print(book);
            if(i != name.length){
                System.out.print(", ");
            }
            else{
                System.out.print(".");
            }
            i++;
        }
    }
    public void takeBook(Book...books){
        System.out.println(fullName + " took the books: ");
        for(Book book : books){
            System.out.println(book);
        }
    }
    public void returnBook(){
        System.out.println(fullName + " returned the book.");
    }
    public void returnBook(String...name){
        System.out.print(fullName + " returned the books: ");
        int j = 1;
        for(String book : name){
            System.out.print(book);
            if(j != name.length){
                System.out.print(", ");
            }
            else{
                System.out.print(".");
            }
            j++;
        }
    }
    public void returnBook(Book...books){
        System.out.println(fullName + " returned the books: ");
        for(Book book : books){
            System.out.println(book);
        }
    }
    @Override
    public String toString(){
        return "Library reader: " +
                "\n Full name: " + fullName +
                "\n Reader's ticket number: " + number +
                "\n Faculty: " + faculty +
                "\n Date of birth: " + birthdate +
                "\n Phone number: " + telephone;
    }
}
