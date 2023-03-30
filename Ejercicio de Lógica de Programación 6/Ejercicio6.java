package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	
	/*
	 * # Ejercicio 6

## Instrucciones

- Crear un programa en `Java` que realice lo siguiente:

- Input
  - Solicitar por consola una palabra o frase

- Output
  - Mostrar por consola el texto ingresado de forma invertida.

--- 

Input:
```
Hola Generation
```
Output:
``` 
noitareneG aloH
```*/
	
	public static String reversePhrase (String phrase) {
		
			StringBuilder reversePh = new StringBuilder(phrase);
			 reversePh = reversePh.reverse();
			
			System.out.println(reversePh);
		
		return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese una frase");
		String phrase = s.nextLine();
		
		reversePhrase(phrase);
	}

}
