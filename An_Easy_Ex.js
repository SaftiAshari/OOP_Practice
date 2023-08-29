function geometricshapes(name,width,height){
    this.name=name;
    this.width=width;
    this.height=height;
    this.area=function(){
        console.log("The area of "+this.name+" is "+this.width*this.height);
    }
}
let shapes=[];
shapes.push(new geometricshapes("rectangle",10,20),new geometricshapes("square",10,10),new geometricshapes("triangle",10,20));
for(let s of shapes){
    s.area();
}