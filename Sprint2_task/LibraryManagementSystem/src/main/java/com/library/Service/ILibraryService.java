package com.library.Service;

import java.util.List;

import com.library.Entity.Library;

public interface ILibraryService {

	Integer saveBook(Library library);
	
	public List<Library> getAllBooks();
	
	Library getBook(Integer id);
	
	public void deleteBook(Integer id);
	
	Library updateBook(Library library,Integer id);

	Library updateBorrowedStatus(Library library, Integer id);

}