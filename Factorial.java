import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            a.add(i);
        }
        a.forEach((element) -> {
            {
                int fact = 1;
                for (int i = 1; i <= element; i++) {
                    fact = fact * i;
                }
                b.add(fact);
            }
        });
        for (int i : b) {
            System.out.println(i);
        }
    }
}