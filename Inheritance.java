class Animal{
    String name;
    int age;
    String color;
    String breed;
    public Animal(String name, int age, String color, String breed){
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
    }
    public void SayName(){
        System.out.println("My name is " + name);
    }
    public void SayAge(){
        System.out.println("I am " + age + " years old");
    }
    public void SayColor(){
        System.out.println("My color is " + color);
    }
    public void SayBreed(){
        System.out.println("My breed is " + breed);
    }
}
class Dog extends Animal{
    public Dog(String name, int age, String color, String breed){
        super(name, age, color, breed);
    }
  public void bark()
  {
    System.out.println("I am barking");
  }

}
class Bird extends Animal{
    public Bird(String name, int age, String color, String breed){
        super(name, age, color, breed);
    }
  public void fly()
  {
    System.out.println("I am flying");
  }

}
public class Inheritance{
    public static void main(String[] args){
        Dog dog = new Dog("Tommy", 5, "Black", "German Shepherd");
        dog.SayName();
        dog.SayAge();
        dog.SayColor();
        dog.SayBreed();
        dog.bark();
        Bird bird = new Bird("Parrot", 2, "Green", "Parrot");
        bird.SayName();
        bird.SayAge();
        bird.SayColor();
        bird.SayBreed();
        bird.fly();
    }
}