package com.gravenium.playground.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface BookRepository extends JpaRepository<Book, Long> {
}
