interface Vehicle{
    public void drive();
}
class Car implements Vehicle{
    public void drive(){
        System.out.println("Driving a Car");
    }
}
class Motorcycle implements Vehicle{
    public void drive(){
        System.out.println("Driving a Motorcycle");
    }
}
class Truck implements Vehicle{
    public void drive(){
        System.out.println("Driving a Truck");
    }
}
class aeroplane implements Vehicle{
    public void drive(){
        System.out.println("Flying an aeroplane");
    }
}
public class More_Polymorphism {
    public static void main(String[] args) {
        Vehicle [] vehicles=new Vehicle[4];
        vehicles[0]=new Car();
        vehicles[1]=new Motorcycle();
        vehicles[2]=new Truck();
        vehicles[3]=new aeroplane();
        for(Vehicle v:vehicles){
            v.drive();
        }
    }
}
