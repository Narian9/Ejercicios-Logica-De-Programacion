let number1 = Number(prompt("Da a conocer el numero 1 "));
let number2 = Number(prompt("Da a conocer el numero 2 "));
let number3 = Number(prompt("Da a conocer el numero 3 "));
let arr     = [number1,number2,number3];
let fromBiggertoSmaller = [...arr].sort((a,b)=> b-a);
let fromSmallertoBigger = [...arr].sort((a,b)=> a-b);

fromBiggertoSmaller === fromSmallertoBigger ? console.error(`Los números son iguales`): console.log(`fromBiggertoSmaller ${fromBiggertoSmaller}`,`fromSmallertoBigger ${fromSmallertoBigger}`);
