package com.example.RestServiceExample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestServiceExample.model.Book;

@RestController
@RequestMapping("/book")
public class BookController extends GenericRestController<Book> {


	
}


