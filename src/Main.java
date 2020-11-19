import model.Author;
import model.Book;
import service.BookService;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Daniel Kiz", 1927);
        BookService bs = new BookService();
        Book book1 = new Book("The mind of Billy Milligan", author, "Biography", 890);
        book1.setPrice(250);
        ArrayList<Book> books = author.getBooks();
        for (Book value : books) {
            System.out.println(value.getName());
        }
        Book book2 = new Book("The mind of Billy Milligan", author, "Biography", 890);
        if (bs.compareByPrice(book1, book2) == 1) {
            System.out.println("book1 has more pages");
            bs.printInfo(book1);
        } else {
            System.out.println("book2 has more pages or equal to book1");
            bs.printInfo(book2);
        }
        book1.goTo();
        book1.goTo(10);
        book1.goTo();
        System.out.println(book1.getReadCount());


    }
}
