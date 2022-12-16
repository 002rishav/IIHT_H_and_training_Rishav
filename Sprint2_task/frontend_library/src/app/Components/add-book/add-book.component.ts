import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { BookService } from 'src/app/Services/book.service';

@Component({
  selector: 'app-add-book',
  templateUrl: './add-book.component.html',
  styleUrls: ['./add-book.component.css'],
  exportAs: 'ngForm'
})
export class AddBookComponent implements OnInit {

  constructor(private bookService: BookService) { }

  register(registerForm: NgForm) {
    this.bookService.addBook(registerForm.value).subscribe(
      (resp) => {
        console.log(resp);
      },
      (err) => {
        console.log(err);
      }
    );
  }

  ngOnInit(): void {
  }

}
