package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Language;
import com.example.demo.repository.LanguageRepository;

@Service
public class LanguageService {
	@Autowired
	private LanguageRepository languageRepository;
	
	public  List<Language>  getAllLanguage(String employeeId){

		List<Language> languageList = new ArrayList<>();
		languageRepository.findByEmployeeId(employeeId).forEach(languageList::add);
		return languageList;
		
	}
	public  Language  getLanguage(String id){

		
		return languageRepository.findById(id).get();
	}

	public  void  addLanguage(Language language){

		languageRepository.save(language);
	}
	public  void  updateLanguage(Language language){

		System.out.println("***********");
		languageRepository.save(language);

	}
	public void deleteLanguage(String id) {
		languageRepository.deleteById(id);
	}
}
