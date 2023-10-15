import java.util.*;

class Employee {
    String name;
    String Designation;
    int age;

    public Employee(String name, String Designation, int age) {
        this.name = name;
        this.Designation = Designation;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getDesignation() {
        return this.Designation;
    }

    public int getAge() {
        return this.age;
    }

    private static ArrayList<Employee> employees = new ArrayList<Employee>();

    public static void addEmployee(Employee e) {
        employees.add(e);
    }

    public static void removeEmployee(Employee e) {
        employees.remove(e);
    }

    public static ArrayList<Employee> getEmployees() {
        return employees;
    }

}

public class problem6 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Raj", "Manager", 25);
        Employee e2 = new Employee("Rahul", "Developer", 23);
        Employee e3 = new Employee("Ramesh", "Tester", 24);
        Employee.addEmployee(e1);
        Employee.addEmployee(e2);
        Employee.addEmployee(e3);
        ArrayList<Employee> employees = Employee.getEmployees();
        for (Employee e : employees) {
            System.out.println("Name: " + e.getName() + " Designation: " + e.getDesignation() + " Age: " + e.getAge());
        }
        Employee.removeEmployee(e2);
        employees = Employee.getEmployees();
        System.out.println("After Removing one employee from the list");
        for (Employee e : employees) {

            System.out.println("Name: " + e.getName() + " Designation: " + e.getDesignation() + " Age: " + e.getAge());
        }
    }
}
