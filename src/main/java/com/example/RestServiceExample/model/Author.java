package com.example.RestServiceExample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "author")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Author extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Author() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "SEX", nullable = false)
	private String sex;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", sex=" + sex + "]";
	}
	
	

}