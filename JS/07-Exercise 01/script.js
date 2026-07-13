function sum(a,b)
{
    result=a+b;
    console.log(result);

}
function sub(a,b)
{
    result=a-b;
    console.log(result);
    
}
function div(a,b)
{
    result=a/b;
    console.log(result);
    
}
function mul(a,b)
{
    result=a*b;
    console.log(result);
    
}
function expo(a,b)
{
    result=a**b;
    console.log(result);
    
}
let a = parseInt(prompt("Enter a number:"));
let b = parseInt(prompt("Enter another number:"));
if(Math.random()<0.1)
{
    console.log("Addition is two number is")
    sub(a,b);
    console.log("Multiplication is two number is")
    sum(a,b);
    console.log("Subration is two number is")
    div(a,b);
    console.log("division is two number is")
    expo(a,b);
    

}
else{
    console.log("Addition is two number is")
    sum(a,b);
    console.log("Multiplication is two number is")
    mul(a,b);
    console.log("Subraction is two number is")
    sub(a,b);
    console.log("division is two number is")
    div(a,b);
}

