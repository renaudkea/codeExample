package dk.kea.renh.list;

import java.util.Objects;

public class Book implements Comparable<Book>{

    private String title;
    private String author;

    public Book() {
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public void print() {
        System.out.println(
                "name='" + title + '\'' +
                ", author='" + author);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public boolean equals(Object o) {
        if(o instanceof Book){
            Book book = (Book) o;
            return Objects.equals(this.title, book.title) && Objects.equals(author, book.author);
        }
        return false;
    }


    @Override
    public String toString() {
        return "Book{" + "name='" + title + '\'' + ", author='" + author + '\'' + '}';
    }

    @Override
    public int compareTo(Book o) {
        return title.compareTo(o.title);
    }
}
