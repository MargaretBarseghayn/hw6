package service;

public interface BookTasks<T> {
    void getAuthorInfo(T val);

    int compareByPrice(T val1, T val2);

    int compareByRating(T val1, T val2);

    void printInfo(T val);
}
