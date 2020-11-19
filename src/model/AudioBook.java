package model;
public class AudioBook extends Book {
    private int duration = 4500;

    public AudioBook(String name, Author author, String genre, int duration) {
        super(name, author, genre);
        if (duration >= 4500)
            this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

}
