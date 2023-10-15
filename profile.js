Array.prototype.myFilter=function(callback)
{
    let array=[]
    this.forEach((element)=>callback(element)?array.push(element):null)
    return array
}
Array.prototype.myMap=function(callback)
{
    let array=[]
    this.forEach((element)=>array.push(callback(element)))
    return array
}
let a=[1,2,3,4,5];
let b=a.myFilter((element)=>element%2==0)
b.forEach((element)=>console.log(element))
let c=a.myMap((element)=>{
    let fact=1;
    for(let i=1;i<=element;i++)
    {
        fact*=i;
    }
    return fact;
})
c.forEach((element)=>console.log(element))