
package com.kiet.library.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kiet.library.model.Book;

@Service
public class BookService {

    private List<Book> books = new ArrayList<>();

    public BookService() {
        books.add(new Book(201, "Effective Java", "Joshua Bloch",
                "Programming", 2018, true));

        books.add(new Book(202, "Clean Code", "Robert C. Martin",
                "Programming", 2008, true));

        books.add(new Book(203, "Wings of Fire", "A.P.J. Abdul Kalam",
                "Biography", 1999, true));

        books.add(new Book(204, "The Alchemist", "Paulo Coelho",
                "Fiction", 1988, false));

        books.add(new Book(205, "Java: The Complete Reference", "Herbert Schildt",
                "Programming", 2021, true));
    }

    public List<Book> getAllBooks() {
        return books;
    }
}
