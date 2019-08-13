package com.example.RestServiceExample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestServiceExample.model.Author;

@RestController
@RequestMapping("/author")
public class AuthorController extends GenericRestController<Author> {


}


