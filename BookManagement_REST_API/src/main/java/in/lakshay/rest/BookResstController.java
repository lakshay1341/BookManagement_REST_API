package in.lakshay.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.lakshay.entity.Book;
import in.lakshay.service.IBookService;

@RestController
@RequestMapping("/api/book")
public class BookResstController {
	
	@Autowired
	private IBookService service;
	
	@PostMapping("/create")
	public ResponseEntity<String> createBook(@RequestBody Book book){
		Long id=service.createBook(book);
		String message="Book '"+id+"' created!";
		return new ResponseEntity<String>(message,HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Book>> findAllBooks(){
		
		List<Book> books=service.findBooks();
		return new ResponseEntity<>(books,HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<?> findOneBook(@PathVariable Long id){
		Book book=service.findOneBook(id);
		return new ResponseEntity<Book>(book, HttpStatus.OK);
		
	}
	
	@PutMapping("/modify")
	public ResponseEntity<String> updateBook(@RequestBody Book book){
		service.updateBook(book);
		return new ResponseEntity<String>("Book updated!",HttpStatus.OK);
	}
	
	@DeleteMapping("remove/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable Long id){
		service.deleteOneBook(id);
		return new ResponseEntity<String>("Book deleted",HttpStatus.OK);
	}

}
