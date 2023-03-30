package Ejercicio8;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
	
	/*
	 * ## Instrucciones

- Crear un programa en `Java` que realice lo siguiente:
- Input
  - Solicitar al usuario 10 números por consola y almacenarlos en un *array*
- Colocar todos los números primos a las primeras posiciones, desplazando el resto al final de forma que ningún número se pierda.
- Output
  - Mostrar por consola el array que contiene los números primos al inicio, mostrando el índice seguido del valor de la posición.
- El orden de los números **no importa** siempre y cuando los números primos se encuentren al inicio del array.

--- */
	public static boolean isPrime(int inputNumber){
		boolean isItPrime = true;
		
		 
		if(inputNumber <= 1) {
			isItPrime = false;
			
		}else{
		for (int i = 2; i<= inputNumber/2; i++) {
			if ((inputNumber % i) == 0){
				isItPrime = false;
				break;
			}
		}	
	}
		return isItPrime;
}
	
	public static void getNumbers( Scanner s, int[] numbers) {
		int counter = 0;
		int reverseCounter = 9;
		int number1;
		int i=0;
		
		for(int element : numbers) {
			number1 = s.nextInt();
			System.out.println(isPrime(number1));
			if(isPrime(number1)== true) {
				
				numbers[counter] = number1;
				counter++;

			}else if(isPrime(number1) == false){
				numbers[reverseCounter]= number1;
				reverseCounter--;
			}	
			//System.out.print(element+ " ");
		}
		for(int element : numbers) {
			
			System.out.println(i +". " +element+ " ");
			i++;
					}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbersArray = new int[10];

		Scanner s = new Scanner(System.in);
		 
		System.out.println("Ingrese 10 numeros:");

		getNumbers(s, numbersArray);	
		s.close();
		

	}

}
