package com.demo.flywaydemo.services;

import com.demo.flywaydemo.models.Book;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    public BookService() {
        System.out.println("book service initialized");
    }

    public Book findBookByName(String name) {
        System.out.println("books service find book, "+name);
        return new Book();
    }
}