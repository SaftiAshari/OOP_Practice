import java.util.ArrayList;
class Vehicles{
String brand;
String model;
public Vehicles(String brand, String model){
    this.brand = brand;
    this.model = model;

}
public void Information(){
    System.out.println("Brand: " + this.brand+ " Model: " + this.model);

}
public void drive(){
    System.out.println("I am driving a vehicle");
}
}
class Car extends Vehicles{
    public Car(String brand, String model){
        super(brand, model);
    }
    public void drive(){
        System.out.println("I am driving a car");
    }
}
class Motorcycle extends Vehicles{
    public Motorcycle(String brand, String model){
        super(brand, model);
    }
    public void drive(){
        System.out.println("I am driving a motorcycle");
    }
}
class Truck extends Vehicles{
    public Truck(String brand, String model){
        super(brand, model);
    }
    public void drive(){
        System.out.println("I am driving a truck");
    }
}
class aeroplane extends Vehicles{
    public aeroplane(String brand, String model){
        super(brand, model);
    }
    public void drive(){
        System.out.println("I am flying an aeroplane");
    }
}
public class Example {
    public static void main(String[] args) {
        ArrayList<Vehicles> vehicles = new ArrayList<Vehicles>();
        vehicles.add(new Car("BMW", "X5"))
        vehicles.add(new Motorcycle("Harley Davidson", "Street 750"));
        vehicles.add(new Truck("Volvo", "FH16"));
        vehicles.add(new aeroplane("Boeing", "747"));
        for(Vehicles v:vehicles){
            v.Information();
            v.drive();
        }
    }
}
