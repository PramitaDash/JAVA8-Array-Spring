package com.VirtualBookstore.mapping;

import com.VirtualBookstore.entity.Book;
import com.VirtualBookstore.payroll.BookDto;
import org.springframework.stereotype.Component;

@Component
public class MappingBooks {

    public Book BookDtoToBook(BookDto bookDto){
        Book book = new Book();
        book.setId(bookDto.getId());
        book.setTitle(bookDto.getTitle());
        book.setAuthor(bookDto.getAuthor());
        book.setPrice(bookDto.getPrice());
        return book;
    }

    public BookDto BookToBookDto(Book book){
        BookDto dto = new BookDto();
        dto.setId(book.getId());
        dto.setTitle(book.getTitle());
        dto.setAuthor(book.getAuthor());
        dto.setPrice(book.getPrice());
        return dto;
    }
}
