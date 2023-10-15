import java.util.*;

class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double Area() {
        return Math.PI * radius * radius;
    }

    public void print() {
        System.out.println("Area: " + this.Area());
    }
}

public class problem4 {
    public static void main(String[] args) {
        ArrayList<Circle> list = new ArrayList<Circle>();
        list.add(new Circle(5));
        list.add(new Circle(2));
        for (Circle c : list) {
            c.print();
        }
    }
}
