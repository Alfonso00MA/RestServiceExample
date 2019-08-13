package com.example.RestServiceExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.RestServiceExample.dao.BaseDao;

public class GenericRestController<T> {

	@Autowired
	private BaseDao<T> dao;



	@RequestMapping(method = RequestMethod.POST)
	public T create(@RequestBody T entity) {
		return dao.save(entity);

	}

	@RequestMapping(method = RequestMethod.PUT)
	public T update(@RequestBody T entity) {
		return dao.save(entity);

	}

	@RequestMapping(method = RequestMethod.DELETE)
	public void delete(@RequestBody T entity) {
		dao.delete(entity);
	}

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public T get(@PathVariable(value = "id") Integer id) {
		return dao.getOne(id);
	}
}
