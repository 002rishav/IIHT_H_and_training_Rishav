import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-userform',
  templateUrl: './userform.component.html',
  styleUrls: ['./userform.component.css']
})
export class UserformComponent implements OnInit {

  title:String = 'Please fill the form below';

  firstName:String = '';
  lastName:String = '';
  age = 0;
  gender:String = 'male';
  email:String = '';

  save(){
    console.log("Hello " + this.firstName + ' ' + this.lastName);
    console.log('your email id is ' + this.email);
    console.log('your age is ' + this.age + ' and gender is ' + this.gender);
  }


  constructor() { }

  ngOnInit(): void {
  }

}
