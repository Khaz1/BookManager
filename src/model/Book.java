package model;

public class Book {
    String name;
    String authorName;


    public Book (String name, String authorName) {
        this.name = name;
        this.authorName = authorName;
    }
    @Override
    public String toString() {
        return name;
    }
}
