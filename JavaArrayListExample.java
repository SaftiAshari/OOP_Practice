import java.util.ArrayList;
public class JavaArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Jack");
        names.add("Jill");
        names.add("Joe");
        for(String name:names){
            System.out.println(name);
        }
    }
}

