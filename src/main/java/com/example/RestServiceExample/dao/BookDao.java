package com.example.RestServiceExample.dao;

import org.springframework.stereotype.Repository;

import com.example.RestServiceExample.model.Book;

@Repository
public interface BookDao extends BaseDao<Book> {
}