// var name = 'Rishav'
// var age = 24;  //define a variable
// var isGraduate = true;
// var laptop;
// laptop = 'lg';
// console.log(name);
// console.log(age);

// function alertUser() {

//     var favChips = 'Lays' //This variable is created and destroyed inside the function hence it is not accessible outside the method

//     alert("This user has logged in " + name)

// }
// alertUser();
// console.log(favChips);
//if else else if statements
// function operators(num) {

//     if (num > 20) {
//         console.log("Number is greater than 20");
//     } else if (num == 20) {
//         console.log("Number is equal to 20");
//     }
//     else {
//         console.log("Number is smaller than 20");
//     }
// }
// operators(65);

// function creditScore(score) {
//     var creditLimit;
//     switch (score) {
//         case 800: creditLimit = "Above 1 Lac";
//             break;
//         case 700: creditLimit = "50,000 to 1 Lac";
//             break;
//         case 600: creditLimit = "10,000 to 25,000";
//             break;
//         default: creditLimit = "Not eligible";
//     }
//     console.log(creditLimit);
// }
// creditScore(800);

// function counting() {
//     for (let i = 1; i < 10; i++) {
//         console.log(i);
//     }
// }


// counting();

var car = new Object();
car.brand = "Mercedes"
car.model = "C class"
car.price = 6000000

console.log(car)

var names = ['Rishav', 'Nishant', 'Abhishek']
console.log(names);

let Car = class {
    //initialize any object

    constructor(brand, modelName, price) {
        this.brand = brand;
        this.modelName = modelName;
        this.price = price;
    }

    print() {
        console.log("this is a: " + this.brand + " " + this.modelName + " which costs: " + this.price);
    }
}

var C1 = new Car("Mercedes", "A class", 4000000);
var C2 = new Car("BMW", "3-series", 5000000);
C1.print();
C2.print();

class TodaysDate extends Date{
    constructor(){
        super();
    }
    print(){
        console.log(this.getDate());
    }
}
let today=new TodaysDate();
today.print();

class AppleLaptops {
    //parent class
    constructor(brand, model, processor,ram) {
        this.brand = "Apple";        
    }
}

class MacBookPro extends AppleLaptops {
    constructor(model, processor,ram) {
        super();// used to fetch the content of the constructor from parent class
        this.model = model;
        this.processor = processor;
        this.ram=ram;
    }
}

let l1=new MacBookPro("2021 15` MacBook Pro","i7","16GB");
console.log(l1.brand+" "+l1.model+" "+l1.processor+" "+l1.ram);

let fruits=["Apple","Banana","Pineapple"]
let seasonalfruits=["Mango","Litchi"]
let allFruits=[...fruits,...seasonalfruits] //... is a spread operator which is used to get the values of other arrays into current array
console.log(allFruits);