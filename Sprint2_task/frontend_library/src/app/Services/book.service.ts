import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private http: HttpClient) { }

  API = 'http://localhost:5000';
  public addBook(bookData) {
    return this.http.post(this.API + '/add/book', bookData);
  }

}
