package ru.mirea.exercise5;

public class Main {
    public static void main(String[] args){
        Reader[] reader = new Reader[]{
                new Reader("Malcolm Freeman", 1, "mathematical", "25.03.2001", "+7 (988) 975-99-69"),
                new Reader("Eunice Chandler", 2, "juridical", "14.06.1998", "+7 (992) 941-56-20"),
                new Reader("Rudolph Mckenzie", 3, "historical", "05.11.1998", "+7 (931) 124-61-42"),
                new Reader("Rhoda Robinson", 4, "philological", "31.12.1999", "+7 (907) 120-53-52"),
                new Reader("Horace Mcdaniel", 5, "chemical", "15.10.1999", "+7 (948) 986-23-74"),
                new Reader("Lizbeth Bruce", 6, "economic", "11.01.2001", "+7 (916) 520-36-14")
        };
        System.out.println(reader[0]);
        System.out.println();
        reader[0].takeBook();
        System.out.println();
        System.out.println(reader[1]);
        System.out.println();
        reader[1].takeBook("novel", "story", "detective");
        System.out.println();
        System.out.println();
        System.out.println(reader[2]);
        System.out.println();
        reader[2].takeBook(new Book("Portrait of Dorian Gray", "Oscar Wilde"),
                new Book("David Copperfield", "Charles Dickens"),
                new Book("Pride and prejudice", "Jane Austen"));
        System.out.println();
        System.out.println(reader[3]);
        System.out.println();
        reader[3].returnBook();
        System.out.println();
        System.out.println(reader[4]);
        System.out.println();
        reader[4].returnBook("guide", "dictionary", "encyclopedia");
        System.out.println();
        System.out.println();
        System.out.println(reader[5]);
        System.out.println();
        reader[5].returnBook(new Book("Jane Eyre", "Charlotte Bronte"),
                new Book("Death on the Nile", "Agatha Christie"),
                new Book("The lost world", "Arthur Conan Doyle"));
    }
}
