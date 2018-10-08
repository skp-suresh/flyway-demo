package com.demo.flywaydemo.controllers;

import com.demo.flywaydemo.models.Book;
import com.demo.flywaydemo.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("book/{name}")
    public Book findBook(@PathVariable("name") String name) {
        System.out.println("called get");
        return bookService.findBookByName(name);
    }
    
}