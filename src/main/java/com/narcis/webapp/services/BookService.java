package com.narcis.webapp.services;

import com.narcis.webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
