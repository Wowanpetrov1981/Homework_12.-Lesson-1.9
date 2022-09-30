package Homework_12;

public class Book {
    String title;
    Author author;
    int yearOfPublication;

    public Book(String title, Author author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;


    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;

    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
}
