package com.example.demospring.bootstrap;

import com.example.demospring.Repository.BookRepository;
import com.example.demospring.entity.BookEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class BookStrapData implements CommandLineRunner {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        BookEntity book1 = BookEntity.builder()
                .name("book 1")
                .description("description 1")
                .build();

        BookEntity book2 = BookEntity.builder()
                .name("book 2")
                .description("description 2")
                .build();
        bookRepository.saveAll(List.of(book1,book2));
        log.info("Book count in DB: {}",bookRepository.count());
    }
}
