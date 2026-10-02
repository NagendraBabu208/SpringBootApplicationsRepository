package com.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.exception.BookNotFoundException;
import com.spring.model.Book;
import com.spring.service.IBookService;

@SpringBootApplication
public class SpringBootBookAppUsingStreamsApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBookAppUsingStreamsApiApplication.class, args);
		
		
	}
	
	@Autowired
	private IBookService bookService;

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("======================================");
		bookService.getAll().forEach(System.out::println);
		System.out.println("==================================================");
		
		try {
		Book book=bookService.getById(1);
		System.out.println(book);
		}catch (BookNotFoundException bookNotFoundException) {
			System.out.println(bookNotFoundException.getMessage());
		}
		
		System.out.println("==================================================");
		
		try {
			bookService.getByTitleContains("Java").forEach(System.out::println);
		} catch (BookNotFoundException bookNotFoundException) {
			System.out.println(bookNotFoundException.getMessage());
		}
		
		System.out.println("==================================================");

		try {
			bookService.getByAuthCategory("Joe", "selfhelp").forEach(System.out::println);
		} catch (BookNotFoundException bookNotFoundException) {
			System.out.println(bookNotFoundException.getMessage());
		}
		
		System.out.println("==================================================");
      
		try {
			bookService.getByLesserPrice(920).forEach(System.out::println);
		} catch (BookNotFoundException bookNotFoundException) {
			System.out.println(bookNotFoundException.getMessage());
		}

		
	}
	
	

}
