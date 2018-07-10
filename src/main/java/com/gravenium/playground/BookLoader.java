package com.gravenium.playground;

import com.gravenium.playground.book.Book;
import com.gravenium.playground.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

// CommandLineRunner is an interface that has a run method, which you'll need to implement.
// The run method will be executed after the application context is loaded and right before
// Spring Application run method is completed!

// Nice way to load dummy data right before the application starts up.

@Component
public class BookLoader implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Effective Java", "Java A Beginner's Guide", "Our Final Invention", "Head First Java")
            .forEach(name -> bookRepository.save(new Book(name)));
        bookRepository.findAll().forEach(System.out::println);
    }
}
