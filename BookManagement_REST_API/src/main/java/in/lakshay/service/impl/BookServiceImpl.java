package in.lakshay.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.lakshay.entity.Book;
import in.lakshay.repo.BookRepository;
import in.lakshay.service.IBookService;

@Service
public class BookServiceImpl implements IBookService{

	@Autowired
	private BookRepository repo;
	
	@Override
	public Long createBook(Book book) {
		// TODO Auto-generated method stub
		book=repo.save(book);
		return book.getId();
	}

	@Override
	public Book findOneBook(Long id) {
		// TODO Auto-generated method stub
		Optional<Book> opt=repo.findById(id);
		if(opt.isPresent())
			return opt.get();
		else
			throw new RuntimeException("book '"+id+"' Not exist");
	}

	@Override
	public void deleteOneBook(Long id) {
		// TODO Auto-generated method stub
		repo.delete(findOneBook(id));
		
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		Long id=book.getId();
		if(id!=null && repo.existsById(id)) {
			repo.save(book);
		}else {
			throw new RuntimeException("book '"+id+"' Not exist");
		}
		
	}

	@Override
	public List<Book> findBooks() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
