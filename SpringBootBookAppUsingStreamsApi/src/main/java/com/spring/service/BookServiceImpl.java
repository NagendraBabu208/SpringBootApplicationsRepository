package com.spring.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


import org.springframework.stereotype.Component;

import com.spring.exception.BookNotFoundException;
import com.spring.model.Book;
import com.spring.util.BookDetails;

@Component
public class BookServiceImpl implements IBookService {

	
	private BookDetails bookDetails;
	
	public BookServiceImpl(BookDetails bookDetails) {
		super();
		this.bookDetails = bookDetails;
	}

	@Override
	public List<Book> getAll() {
		List<Book> listOfBooksSortedByTitle=bookDetails.showBooks()
		.stream()
		.sorted(Comparator.comparing(Book::getTitle))
		.collect(Collectors.toList());
		return listOfBooksSortedByTitle;
	}

	@Override
	public Book getById(int bookId) throws BookNotFoundException {
		
		Book nbook=bookDetails.showBooks()
		.stream()
		.filter(book ->book.getBookId()==bookId)
		.findAny()
		.orElseThrow(()->new BookNotFoundException("Book is not found with bookId "+bookId));
		
		return nbook;
	}

	@Override
	public List<Book> getByTitleContains(String title) throws BookNotFoundException {
		
		List<Book> listOfBooksByTitle=bookDetails.showBooks()
				.stream()
				.filter(book->book.getTitle().contains(title))
				.collect(Collectors.toList());
		
		if(listOfBooksByTitle.isEmpty()) {
			throw new BookNotFoundException("Books are not avaialable with book title!!!. "); 
		}
		
		return listOfBooksByTitle;
	}

	@Override
	public List<Book> getByAuthCategory(String author, String category) throws BookNotFoundException {
		
		List<Book> listOfBooksByAuthorAndCategory=bookDetails.showBooks()
		.stream().
		filter(book->book.getAuthor().equals(author) && book.getCategory().equals(category))
		.collect(Collectors.toList());
		
		if(listOfBooksByAuthorAndCategory.isEmpty()) {
			throw new BookNotFoundException("Books are not avaialable!!!. "); 

		}
		return listOfBooksByAuthorAndCategory;
	}

	@Override
	public List<Book> getByLesserPrice(double price) throws BookNotFoundException {
	
		List<Book> listOfBooksByLesserThanPrice=bookDetails.showBooks()
		.stream()
		.filter(book->book.getPrice()<price)
		.collect(Collectors.toList());
		
		if(listOfBooksByLesserThanPrice.isEmpty()) {
			throw new BookNotFoundException("Books are not avaialable!!!."); 

		}
		
		return listOfBooksByLesserThanPrice;
	}

}
