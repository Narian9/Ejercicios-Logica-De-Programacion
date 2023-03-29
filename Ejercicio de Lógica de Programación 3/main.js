'use strict'
let number = Number(prompt("Da a conocer el numero 1 "));
console.log(number);

const factorialNumber = (number) =>{ 

    return (number>0)? (number*factorialNumber(number - 1 )):1
};

alert(`El factorial de ${number} es: ${factorialNumber(number)}`);