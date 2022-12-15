import { Component, OnInit } from '@angular/core';
import User from 'src/app/Entity/user';

@Component({
  selector: 'app-userform',
  templateUrl: './userform.component.html',
  styleUrls: ['./userform.component.css']
})
export class UserformComponent implements OnInit {

  title:String = 'Please fill the form below';

  user: User = new User();

  save(){
    console.log("Hello " + this.user.firstName + ' ' + this.user.lastName);
    console.log('your email id is ' + this.user.email);
    console.log('your age is ' + this.user.age + ' and gender is ' + this.user.gender);
  }


  constructor() { }

  ngOnInit(): void {
  }

}
