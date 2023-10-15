import java.util.*;

class Dog {
  String name;
  String breed;

  public Dog(String name, String breed) {
    this.name = name;
    this.breed = breed;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public void print() {
    System.out.println("Name: " + this.getName() + " Breed: " + this.getBreed());
  }

}

public class problem2 {
  public static void main(String[] args) {
    ArrayList<Dog> list = new ArrayList<Dog>();
    list.add(new Dog("Fido", "Labrador"));
    list.add(new Dog("Rex", "Poodle"));
    for (Dog d : list) {
      d.print();
    }
    list.get(0).setName("Rover");
    list.get(1).setBreed("Labrador");
    for (Dog d : list) {
      d.print();
    }
  }
}
