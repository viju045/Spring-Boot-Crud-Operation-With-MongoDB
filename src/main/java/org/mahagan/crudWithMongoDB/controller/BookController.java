package org.mahagan.crudWithMongoDB.controller;

import org.mahagan.crudWithMongoDB.model.Book;
import org.mahagan.crudWithMongoDB.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepo bookRepo;

    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book){
        bookRepo.save(book);
        return "Added Successfully";
    }

    @GetMapping("/findAllBooks")
    public List<Book> getBooks() {
        return bookRepo.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id){
        bookRepo.deleteById(id);
        return "Deleted Successfully";
    }
}
