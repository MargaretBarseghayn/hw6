package service;

import model.Book;

public class BookService implements BookTasks<Book> {
    @Override
    public void getAuthorInfo(Book val) {
        val.getAuthor().printInfo();
    }

    @Override
    public int compareByPrice(Book val1, Book val2) {
        return Double.compare(val1.getPrice(), val2.getPrice());
    }

    @Override
    public int compareByRating(Book val1, Book val2) {
        return Double.compare(val1.getRating(), val2.getRating());
    }

    @Override
    public void printInfo(Book val) {
        System.out.println("book.name = " + val.getName() + "\nbook.genre = " + val.getGenre()
                + "\nbook.author is " + val.getAuthor().getName() + "\nbook.page = " + val.getPage()
                + "\nbook.price is " + val.getPrice());
        System.out.println("****************");
    }
}
