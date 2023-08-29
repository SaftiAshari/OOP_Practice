class Animal{
    constructor(name,color,age,numLegs,breed){
        this.name = name;
        this.color = color;
        this.age = age;
        this.numLegs = numLegs;
        this.breed = breed;
        this.Information = function(){
            console.log("My name "+this.name+" and I am "+this.age+" years old."+" I am a "+this.breed+" and I have "+this.numLegs+" legs."+" My color is "+this.color+".");
        }
    }
    speak(){
        console.log("I can speak!");
    }
}
class Dog extends Animal{
    constructor(name,color,age,numLegs,breed){
        super(name,color,age,numLegs,breed);
    }
    speak(){
        console.log("I can bark!");
    }
}
class Cat extends Animal{
    constructor(name,color,age,numLegs,breed){
        super(name,color,age,numLegs,breed);
    }
   speak(){
        console.log("I can meow!");
    }
}
class Bird extends Animal{
    constructor(name,color,age,numLegs,breed){
        super(name,color,age,numLegs,breed);
    }
    speak(){
        console.log("I can chirp!");
    }
}
var animal=[]
animal.push(new Dog("Buddy","brown",3,4,"Labrador"),new Cat("Kitty","white",2,4,"Persian"),new Bird("Tweety","yellow",1,2,"Canary"));
for(let a of animal){
    a.Information();
    a.speak();
}
