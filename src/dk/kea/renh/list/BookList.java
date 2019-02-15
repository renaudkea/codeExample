package dk.kea.renh.list;


import java.util.ArrayList;
import java.util.List;

public class BookList {
    private String bookListName;

    private List<Book> list = new ArrayList<>();


    public void add(Book element) {
        list.add(element);
    }

    public boolean remove(Book element) {
        return list.remove(element);
    }

    public Book findByName(String name) {
        for (Book book : list) {

            if(book.getTitle().equals(name)){
                return book;
            }
        }
        return null;
    }


}
