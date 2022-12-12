package com.library.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.library.Entity.Library;
import com.library.Service.ILibraryService;

@RestController
public class LibraryController {

	@Autowired
	private ILibraryService libraryService;

	@PostMapping("/add/book")
	Integer addBook(@RequestBody Library library) {
		Integer id = libraryService.saveBook(library);
		System.out.println(id);
		return id;
	}
	
	@GetMapping("/allbooks")
	public List<Library> getAllBooks(){
		return libraryService.getAllBooks();
	}
	
	@GetMapping("/read/{id}")
	public Optional<Library> getBookbyId(@PathVariable Integer id){
		Optional<Library> library=libraryService.getBook(id);
		return library;
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Library> deleteBook(@PathVariable Integer id){
		System.out.println(id);
		ResponseEntity<Library> responseEntity=new ResponseEntity<>(HttpStatus.OK);
		try {
			libraryService.deleteBook(id);
		}catch(Exception e) {
			e.printStackTrace();
			responseEntity=new ResponseEntity<Library>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Library> updateEmployee(@PathVariable("id") Integer id,@RequestBody Library library){
		return new ResponseEntity<Library>(libraryService.updateBook(library, id),HttpStatus.OK);
	}
	
	@PutMapping("/borrow/{id}")
	public ResponseEntity<Library> updateBorrowedStatus(@PathVariable("id") Integer id,@RequestBody Library library){
		return new ResponseEntity<Library>(libraryService.updateBorrowedStatus(library, id),HttpStatus.OK);
	}
}
