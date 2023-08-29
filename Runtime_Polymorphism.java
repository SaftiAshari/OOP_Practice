import java.util.ArrayList;
class Employee{
     String name;
     int id;
     String address;
     public Employee(String name, int id, String address){
         this.name = name;
         this.id = id;
         this.address = address;
     }
     public void Info()
     {
            System.out.println("Name: " + this.name+ " ID: " + this.id + " Address: " + this.address);
     }
    public void salary(){
        System.out.println("Salary of Employee");
    }
}
class Manager extends Employee{
    public Manager(String name, int id, String address){
        super(name, id, address);
    }
    public void salary(){
        System.out.println("Salary of a Manager");
    }
}
class Developer extends Employee{
    public Developer(String name, int id, String address){
        super(name, id, address);
    }
    public void salary(){
        System.out.println("Salary of a Developer");
    }
}
class Tester extends Employee{
    public Tester(String name, int id, String address){
        super(name, id, address);
    }
    public void salary(){
        System.out.println("Salary of a Tester");
    }
}
class Designer extends Employee{
    public Designer(String name, int id, String address){
        super(name, id, address);
    }
    public void salary(){
        System.out.println("Salary of a Designer");
    }
}
public class Runtime_Polymorphism {
    public static void main(String[] args) {
        ArrayList<Employee> employees=new ArrayList<Employee>();
        employees.add(new Manager("John", 1, "New York"));
        employees.add(new Developer("Jack", 2, "New York"));
        employees.add(new Tester("Jill", 3, "New York"));
        employees.add(new Designer("Joe", 4, "New York"));
        for(Employee e:employees){
            e.Info();
            e.salary();
        }
    }
}
