package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Language;


public interface LanguageRepository extends CrudRepository<Language, String>{
	public List<Language>  findByEmployeeId(String employeeId);

}