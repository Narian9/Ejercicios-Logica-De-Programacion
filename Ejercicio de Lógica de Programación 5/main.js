let secretNumber=(Math.random()*100).toFixed(0);
console.log(secretNumber);

const getANumber = () => Number(prompt("Adivine el numero, escriba un numero del 1-100"));
const gameNumber = () => {
    let number=getANumber();
    let gameAgain = false;
   if(number == secretNumber) {
     alert("Felicidades, adivinaste el número secreto.")
    } else {
         gameAgain = confirm("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
         console.log(gameAgain);
         gameAgain ? gameNumber(): alert("Gracias por jugar");
    }
}

gameNumber();