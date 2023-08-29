function Animal(name,color,age,numLegs,breed){
  this.name = name;
  this.color = color;
  this.age = age;
  this.numLegs = numLegs;
  this.breed = breed;
  this.SayName = function(){
    console.log("My name is " + this.name);
  }
  this.SayColor = function(){
    console.log("My color is " + this.color);
  }
    this.SayAge = function(){
        console.log("My age is " + this.age);
    }
    this.SayNumLegs = function(){
        console.log("I have " + this.numLegs + " legs");
    }
    this.SayBreed = function(){
        console.log("My breed is " + this.breed);
    }

}
function Dog(name,color,age,numLegs,breed){
  Animal.call(this,name,color,age,numLegs,breed);
  this.Bark = function(){
    console.log("Woof!");
  }
}
var dog = new Dog("Rex","Brown",3,4,"German Shepherd");
dog.SayName();
dog.SayColor();
dog.SayAge();
dog.SayNumLegs();
dog.SayBreed();
dog.Bark();
