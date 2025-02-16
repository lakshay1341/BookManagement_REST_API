package in.lakshay.service;

import java.util.List;

import in.lakshay.entity.Book;

public interface IBookService {
	
	Long createBook(Book book);
	Book findOneBook(Long id);
	void deleteOneBook(Long id);
	void updateBook(Book book);
	List<Book> findBooks();

}
