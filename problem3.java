import java.util.*;

class Rectangle {
    int height;
    int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int Area() {
        return height * width;
    }

    public void print() {
        System.out.println("Area: " + this.Area());
    }
}

public class problem3 {
    public static void main(String[] args) {
        ArrayList<Rectangle> list = new ArrayList<Rectangle>();
        list.add(new Rectangle(5, 10));
        list.add(new Rectangle(2, 4));
        for (Rectangle r : list) {
            r.print();
        }
    }

}
