let number1 = Number(prompt("Da a conocer el numero 1 "));
let number2 = Number(prompt("Da a conocer el numero 2 "));
let number3 = Number(prompt("Da a conocer el numero 3 "));
let arr     = [number1,number2,number3];
let fromBiggertoSmaller = [...arr].sort((a,b)=> b-a);
let fromSmallertoBigger = [...arr].sort((a,b)=> a-b);


 console.log(`fromBiggertoSmaller ${fromBiggertoSmaller}`);
 console.log(`fromSmallertoBigger ${fromSmallertoBigger}`);
 console.log();
