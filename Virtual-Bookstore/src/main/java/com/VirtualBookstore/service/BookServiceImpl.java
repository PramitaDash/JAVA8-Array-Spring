package com.VirtualBookstore.service;

import com.VirtualBookstore.config.SecurityConfig;
import com.VirtualBookstore.entity.Book;
import com.VirtualBookstore.exception.ResourceNotFound;
import com.VirtualBookstore.mapping.MappingBooks;
import com.VirtualBookstore.payroll.BookDto;
import com.VirtualBookstore.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class BookServiceImpl implements BookService{

    private final BookRepository repository;
    private final MappingBooks mappingBooks;


    @Override
    public BookDto insertBook(BookDto bookDto) {
        Book book = mappingBooks.BookDtoToBook(bookDto);
        Book newBook = repository.save(book);
        return mappingBooks.BookToBookDto(newBook);
    }

    @Override
    public List<BookDto> getAllBooks() {
        List<Book> books = repository.findAll();
        if(books.isEmpty()){
            throw new ResourceNotFound("no books found");
        }
        return books.stream().map(mappingBooks::BookToBookDto).collect(Collectors.toList());
    }

    @Override
    public void deleteBook(Long id) {
        Book book = repository.findById(id).orElseThrow(
                ()-> new ResourceNotFound("this book id is not available"));
        repository.delete(book);
    }

    @Override
    public void updateBooks(BookDto bookDto, Long id) {
        Optional<Book> book = repository.findById(id);
            book.ifPresentOrElse(book1 -> {
                book1.setTitle(bookDto.getTitle());
                book1.setAuthor(bookDto.getAuthor());
                book1.setPrice(bookDto.getPrice());
                repository.save(book1);
            }, ()->{
                throw new ResourceNotFound("Book id is not found");
            });
        }

    }

