package model;

public class ElectricalBook extends Book {
    private int loc = 1000;

    public ElectricalBook(String name, Author author, String genre, int loc) {
        super(name, author, genre);
        if (loc >= 1000)
            this.loc = loc;
    }

    public int getLoc() {
        return loc;
    }

    public void goToLoc() {
        if (readCount < loc)
            readCount++;
        else {
            super.read();
            readCount = loc;
        }
    }

    public void goToLoc(int count) {
        if (readCount + count < loc)
            readCount += count;
        else {
            super.read();
            readCount = loc;
        }
    }

}
