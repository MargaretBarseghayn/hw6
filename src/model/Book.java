package model;

public class Book {
    private final String name;
    private final Author author;
    private double price = 100;
    private final String genre;
    protected double rating = 0;
    private int page = 100;

    protected int readCount = 0;

    public Book(String name, Author author, String genre) {
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public Book(String name, Author author, String genre, int page) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        if (page > 100)
            this.page = page;
        author.addBook(this);
    }

    public String getGenre() {
        return genre;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 100)
            this.price = price;
    }

    public int getPage() {
        return page;
    }

    public double getRating() {
        return rating;
    }

    public int getReadCount() {
        return readCount;
    }

    public void goTo() {
        if (readCount < page)
            ++readCount;
        else {
            read();
            readCount = page;
        }
    }

    public void goTo(int count) {
        if (readCount + count < page)
            readCount += count;
        else {
            read();
            readCount = page;
        }
    }

    public void read() {
        System.out.println("You just finished reading your book :)");
        if (rating < 10)
            rating += 0.1;
    }
}
