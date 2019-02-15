package dk.kea.renh.list;


import java.util.*;

public class ListMain {


    public static void main(String[] args) {


        //populate
        List<Book> bl = new LinkedList<>();

        bl.add(new Book("otto", "toto"));
        bl.add(new Book("atta", "tata"));
        bl.add(new Book("itti", "titi"));
        bl.add(new Book("uttu", "tutu"));
        bl.add(new Book("ette", "tete"));


        //traverse - get and search
        for (int i = 0; i < bl.size(); i++) {
            Book b = bl.get(i);
            b.getTitle();

        }

        // traverse iterator - allow modification in iteration
        Iterator<Book> it = bl.iterator();
        while (it.hasNext()) {
            Book b = it.next();
            b.getTitle();
        }

        // for each loop - Throw  ConcurrentModificationException on change
        for (Book b : bl) {
            b.getTitle();
        }

        // contains. required equals methods
        boolean b = bl.contains(new Book("otto", "toto"));
        System.out.println(b);


        // test for emptyness - write code that dont break on empty list
        if (!bl.isEmpty()) {

        }
        ;

        // same as
        if (!(bl.size() > 0)) {

        }
        ;

        // sort - natural order - required that object in list implements Comparable
        System.out.println(bl);
        bl.sort(null);
        System.out.println(bl);

        // with Collections.sort - required that object in list implements Comparable

        Collections.sort(bl);


        // sort with Comparator - using anonymous class (inline implementering of an interface)
        bl.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });

        // with Collections.sort
        Collections.sort(bl, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });


        // LinkedList  - bl is defined as a list, we need to cast to be able to access linkedList methods from Deque interface

        LinkedList<Book> linkedList = (LinkedList<Book>) bl;
        System.out.println(linkedList);
        //remove first/ last element - Queue behavior
        linkedList.remove();
        linkedList.removeLast();


        // Iterate backward
        Iterator<Book> iterator = linkedList.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        //addAll

        List<Book> newList = new ArrayList<>();
        newList.add(new Book("baba", "bobo"));
        bl.addAll(newList);

        //Array to list
        Integer[] arr = new Integer[]{3, 6, 4, 21, 87, -433, 64};
        List<Integer> arrList = Arrays.asList(arr);


        // list to Array


        Book[] bArr2 = bl.toArray(new Book[0]);

    }


}
