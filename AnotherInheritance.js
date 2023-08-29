function Vehicles(brand,model){
    this.brand = brand;
    this.model = model;
    this.Info = function(){
        console.log('Brand: '+this.brand+' Model: '+this.model);
    }
    this.drive=function(){
        console.log('Driving');
    }
}
function Car(brand,model){
    Vehicles.call(this,brand,model);
    this.drive=function(){
        console.log('Driving a car');
    }
}
function Truck(brand,model){
    Vehicles.call(this,brand,model);
    this.drive=function(){
        console.log('Driving a truck');
    }
}
function Bus(brand,model){
    Vehicles.call(this,brand,model);
    this.drive=function(){
        console.log('Driving a bus');
    }
}
function Motorcycle(brand,model){
    Vehicles.call(this,brand,model);
    this.drive=function(){
        console.log('Driving a motorcycle');
    }
}
var vehicles=[];
vehicles.push(new Car('Toyota','Corolla'),new Truck('Ford','F-150'),new Bus('Mercedes','Sprinter'),new Motorcycle('Honda','CBR'));