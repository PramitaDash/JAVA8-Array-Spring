package com.VirtualBookstore.service;

import com.VirtualBookstore.entity.Book;
import com.VirtualBookstore.payroll.BookDto;

import java.util.List;

public interface BookService {

    public BookDto insertBook(BookDto bookDto);

    public List<BookDto> getAllBooks();

    public void deleteBook(Long id);

    public void updateBooks(BookDto bookDto, Long id);
}
