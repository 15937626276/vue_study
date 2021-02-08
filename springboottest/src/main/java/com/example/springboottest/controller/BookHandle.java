package com.example.springboottest.controller;

import com.example.springboottest.entity.Book;
import com.example.springboottest.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * FileName:BookHandle
 * Author: yuxiaoyin
 * Date: 2021/2/6 12:02
 * Description: Bookcontroller
 */

@RestController
@RequestMapping("/book")
public class BookHandle {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("findAll")
    public List<Book> findAll(){
        return bookRepository.findAll();

    }

}
