const  btn = document.querySelector('#btn');

const isValidData =  (e) => {
    e.preventDefault();
    
    let  input = document.getElementById('input').value ;
    input = (input.length >0) ? input *1 :alert("Ingrese un numero valido")  ;
    console.log(typeof input);
    input = ( typeof input == "number" && !(Number.isNaN(input))) ? convertCelsiusToFahrenheit(input): alert("Ingrese un numero valido");
    
}
const convertCelsiusToFahrenheit = (celsius = 1 ) => {
    showResult(celsius,((celsius * (9/5))+32));
}
const showResult = (celsius, result) => {
    const containerToShowResult  = document.querySelector('#containerToShowResult');
    console.log(containerToShowResult);
    const paragraph = document.createElement('h3');
    paragraph.innerText = ` ${celsius} Celsius equivalen a ${result} Fahrenheit `;
    console.log(paragraph.innerText);
    containerToShowResult.appendChild(paragraph)
}

btn.addEventListener("click", isValidData, false);
