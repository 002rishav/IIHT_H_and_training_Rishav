import { Component, OnInit } from '@angular/core';
import { BookService } from 'src/app/Services/book.service';

@Component({
  selector: 'app-search-books',
  templateUrl: './search-books.component.html',
  styleUrls: ['./search-books.component.css']
})
export class SearchBooksComponent implements OnInit {

  bookDetails = null;
  constructor(private bookService: BookService) { }

  getAllBooks() {
    this.bookService.getBooks().subscribe(
      (resp) => {
        console.log(resp);
        this.bookDetails = resp;
      },
      (err) => {
        console.log(err);
      }
    );
  }

  deleteBook(book: any){
    this.bookService.deleteBook(book.id).subscribe(
      (resp) => {
        console.log(resp);
        this.getAllBooks();
      },
      (err) => {
        console.log(err);
      }
    );
  }

  ngOnInit(): void {
  }

}
