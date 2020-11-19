package service;

import model.ElectricalBook;

public class ElectricalBookService implements BookTasks<ElectricalBook> {
    @Override
    public void getAuthorInfo(ElectricalBook val) {
        val.getAuthor().printInfo();
    }

    @Override
    public int compareByPrice(ElectricalBook val1, ElectricalBook val2) {
        return Double.compare(val1.getPrice(), val2.getPrice());
    }

    @Override
    public int compareByRating(ElectricalBook val1, ElectricalBook val2) {
        return Double.compare(val1.getRating(), val2.getRating());
    }

    @Override
    public void printInfo(ElectricalBook val) {
        System.out.println("ElectricalBook.name = " + val.getName() + "\nElectricalBook.genre = " + val.getGenre()
                + "\nElectricalBook.author is " + val.getAuthor().getName() + "\nElectricalBook.page = " + val.getPage()
                + "\nElectricalBook.price is " + val.getPrice());
        System.out.println("****************");
    }
}
