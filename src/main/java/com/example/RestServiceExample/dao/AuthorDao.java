package com.example.RestServiceExample.dao;

import org.springframework.stereotype.Repository;

import com.example.RestServiceExample.model.Author;

@Repository
public interface AuthorDao extends BaseDao<Author> {
}