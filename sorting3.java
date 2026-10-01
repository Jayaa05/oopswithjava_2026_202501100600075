import java.util.*;

class Book {

    int id;
    String title;
    int pages;

    Book(int id, String title, int pages) {
        this.id = id;
        this.title = title;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return id + " " + title + " " + pages;
    }
}

class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book b1, Book b2) {

        
        if (b1.pages != b2.pages) {
            return b1.pages - b2.pages;
        }

       
        return b1.title.compareTo(b2.title);
    }
}
public class sorting3 {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

       
        books.add(new Book(101, "Java Basics", 150));
        books.add(new Book(104, "Data Structures", 150));
        books.add(new Book(103, "Computer Networks", 250));
        books.add(new Book(102, "Operating Systems", 400));

       
        Collections.sort(books, new BookComparator());

        
        System.out.println("Sorted Books:");

        for (Book b : books) {
            System.out.println(b);
        }
    }
}