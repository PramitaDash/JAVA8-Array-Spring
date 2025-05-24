package com.VirtualBookstore.controller;

import com.VirtualBookstore.payroll.BookDto;
import com.VirtualBookstore.service.BookServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/book")
public class BookController {

    private final BookServiceImpl service;

    @PostMapping
    public ResponseEntity<BookDto> insertBook(@RequestBody BookDto bookDto) {

        BookDto newBook = service.insertBook(bookDto);
        return new ResponseEntity<>(newBook, HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<List<BookDto>> getAllBooks(){
        List<BookDto> bookDtos = service.getAllBooks();
        return new ResponseEntity<>(bookDtos,HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteBook(@PathVariable Long id){
        service.deleteBook(id);
        return new ResponseEntity<>("This book is deleted successfully", HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<String> updateBooks(@RequestBody BookDto bookDto, @PathVariable Long id){
        service.updateBooks(bookDto, id);
        return new ResponseEntity<>("this book is updated successfully", HttpStatus.OK);
    }

}
