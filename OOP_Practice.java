class GeometricShape {
    String type;
    int length;
    int breadth;

    public GeometricShape(String type, int length, int breadth) {
        this.type = type;
        this.length = length;
        this.breadth = breadth;
    }

    public void area() {
        if (this.type == "Rectangle") {
            System.out.println("Area of Rectangle is " + this.length * this.breadth);
        } else if (this.type == "Square") {
            System.out.println("Area of Square is " + this.length * this.length);
        } else if (this.type == "Circle") {
            System.out.println("Area of Circle is " + 3.14 * this.length * this.length);
        }
    }
}

public class OOP_Practice {
    public static void main(String[] args) {
        GeometricShape rectangle = new GeometricShape("Rectangle", 5, 10);
        rectangle.area();
        GeometricShape square = new GeometricShape("Square", 5, 5);
        square.area();
        GeometricShape circle = new GeometricShape("Circle", 5, 0);
        circle.area();
    }
}
