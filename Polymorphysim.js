class Vehicle{
    drive(){
        console.log('Driving');
    }
}
class Car extends Vehicle{
    drive(){
        console.log('Driving a car');
    }
}
class Truck extends Vehicle{
    drive(){
        console.log('Driving a truck');
    }
}
class Bus extends Vehicle{
    drive(){
        console.log('Driving a bus');
    }
}
class Motorcycle extends Vehicle{
    drive(){
        console.log('Driving a motorcycle');
    }
}
let vehicles=[new Car(),new Truck(),new Bus(),new Motorcycle()];
for(let v in vehicles){
    vehicles[v].drive();
}
// for(let v of vehicles){
//     v.drive();
// }
