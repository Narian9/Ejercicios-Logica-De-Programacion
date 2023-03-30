package Ejercicio10;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio10 {
	
	/**
	 Crear un programa en `Java` que realice lo siguiente:
- Crear un diccionario Español-Inglés, que contenga al menos 20 palabras su respectiva traducción
- Utilizar un *objeto* `HashMap` para almacenar los pares de palabras
- Escoger al azar 5 palabars en español del mini diccionario

- Input
  - Pedir al usuario que teclee la traducción al inglés de cada una de las palabras
- Comprobar si el input es correcto
- Output
  - Mostrar cuántas respuestas correctas e incorrectas tiene el usuario
*/
	
public static int verification(String word, HashMap< String, String > words  ) {
	return words.containsKey(word)?0:1;
}
public static String ranndomword( String[] listWords ) {
	int indexWord = (int)(Math.random()*10);
	return listWords[indexWord];
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] spanishWords = {	"día",    
				 "artículo",  
				 "pedir",     
				 "asociar",  
				 "asumir"	,  
				 "encima",   
				 "acceso",   
				 "aceptar",   
				 "acuerdo",   
				 "cuenta",   
				 "lograr",   
				 "cruzar",   
				 "acto",     
				 "acción",
				 "actividad",
				 "costa",
				 "añadir",
				 "adición",
				 "dirección",
				 "adulto",
				 "arena",
				 "capacidad"
					};
		
		HashMap< String, String > words = new HashMap<String, String>();
		words.put( "day"      ,"día");
		words.put( "article"  ,"artículo");
		words.put( "ask"       ,"pedir");
		words.put( "associate" ,"asociar");
		words.put( "assume","asumir");
		words.put("above"	,  "encima");
		words.put("access",	"acceso");
		words.put("accept",	"aceptar");
		words.put("accord",	"acuerdo");
		words.put("account",	"cuenta");
		words.put("achieve",	"lograr");
		words.put("across",	"a través de");
		words.put("act"	,    "acto");
		words.put("action",	"acción");
		words.put("activity",	"actividad");
		words.put("actually",	"en realidad / de hecho");
		words.put("add"	,    "añadir");
		words.put("addition",	"adición");
		words.put("address",	"dirección");
		words.put("adult"	,    "adulto");
		words.put( "about","acerca de");
		words.put( "ability","capacidad");
		
		
		int counterWrongWords =0;
		Scanner s = new Scanner(System.in);
		 
		System.out.println("Ingrese la traducción de las siguientes palabras");
		System.out.println("1." + ranndomword(spanishWords));
		System.out.println("2." + ranndomword(spanishWords));
		System.out.println("3." + ranndomword(spanishWords));
		System.out.println("4." + ranndomword(spanishWords));
		System.out.println("5." + ranndomword(spanishWords));
		String word1 = s.nextLine();
		String word2 = s.nextLine();
		String word3 = s.nextLine();
		String word4 = s.nextLine();
		String word5 = s.nextLine();
		
		
		counterWrongWords+=verification(word1, words);
		counterWrongWords+=verification(word2, words);
		counterWrongWords+=verification(word3, words);
		counterWrongWords+=verification(word4, words);
		counterWrongWords+=verification(word5, words);
		s.close();
		System.out.println("El numero de palabras incorrectas es: "+counterWrongWords);
		System.out.println("El numero de palabras correctas es: "+(5-counterWrongWords));


	}

}