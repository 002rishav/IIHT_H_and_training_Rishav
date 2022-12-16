package com.library.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.Entity.Library;
import com.library.Repo.ILibraryRepo;
import com.library.exception.ResourceNotFoundExceptionHandler;

@Service
public class LibraryServiceImpl implements ILibraryService {

	@Autowired
	private ILibraryRepo libraryRepo;

	@Override
	public Library saveBook(Library library) {
		Library savedBook = libraryRepo.save(library); 
		return savedBook;
	}

	@Override
	public List<Library> getAllBooks() {

		return libraryRepo.findAll();
	}

	@Override
	public Library getBook(Integer id) {
		return libraryRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundExceptionHandler("Book", "id", id));
	}

	@Override
	public void deleteBook(Integer id) {
		libraryRepo.deleteById(id);

	}

	@Override
	public Library updateBook(Library library, Integer id) {
		// lets check if the book exists with the given value or not
		Library existingBook = libraryRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundExceptionHandler("Book", "id", id));

		existingBook.setBook_name(library.getBook_name());
		existingBook.setBook_author(library.getBook_author());
		existingBook.setBook_price(library.getBook_price());
		existingBook.setBook_genre(library.getBook_genre());

		libraryRepo.save(existingBook);
		return existingBook;
	}
	
	@Override
	public Library updateBorrowedStatus(Library library, Integer id) {
		// lets check if the book exists with the given value or not
		Library existingBook = libraryRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundExceptionHandler("Book", "id", id));

		existingBook.setBorrowed_status(library.getBorrowed_status());

		libraryRepo.save(existingBook);
		return existingBook;
	}

}
