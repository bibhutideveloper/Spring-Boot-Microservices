package com.bibhuti.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bibhuti.entity.Book;
import com.bibhuti.repository.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository repo;

	@GetMapping("/book")
	public ModelAndView getBookById(@RequestParam("id") Integer id) {
		
		Optional<Book> findById = repo.findById(id);

		ModelAndView mav = new ModelAndView();
		
		if(findById.isPresent()) {
			Book bookObj = findById.get();
			// sending data to view
			mav.addObject("book", bookObj);
			System.out.println(bookObj);
		}
		
		// setting view page name
		mav.setViewName("index");
		
		return mav;
	
	}
	
}
