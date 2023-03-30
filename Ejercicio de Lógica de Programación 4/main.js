'use strict'
let number = Number(prompt("INGRESA UN NUMERO"));

const fibonacciSerie = (number) => {
    let n1 = 0;
    let n2 =1 ;
    let fibonacciNumber = 0;
    const array = [0];
    for (let n = 0; n < number-1; n++) { 
        fibonacciNumber = n1 +n2;  
        array.push(fibonacciNumber);         
        n2=n1;
        n1=fibonacciNumber;
    }
    return array.join(", ");
}
alert(fibonacciSerie(number));
console.log(fibonacciSerie(number));