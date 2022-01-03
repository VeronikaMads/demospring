package com.example.demospring.controller;

import com.example.demospring.Repository.BookRepository;
import com.example.demospring.entity.BookEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/books")
    public String test() {
        List<BookEntity> books = bookRepository.findAll();
        return "Hello Spring!";
    }
}
