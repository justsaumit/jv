import Book.book;

public class q16{
    public static void main(String[] args) {
        book book1 = new book("Harry Potter: Goblet of Fire", "J.K Rowling", 2000);
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Year: " + book1.getYear());
        System.out.println("");
        book book2 = new book("To Kill a Mockingbird", "Harper Lee", 1960);
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Year: " + book2.getYear());

    }
}
