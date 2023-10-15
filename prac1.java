import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void print() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}

public class prac1 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("John", 20));
        list.add(new Person("Paul", 30));
        for (Person p : list) {
            p.print();
        }

    }
}
