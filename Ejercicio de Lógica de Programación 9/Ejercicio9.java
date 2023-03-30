package Ejercicio9;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio9 {
	/*
	 * - Crear un programa en `Java` que realice lo siguiente
  
- Crear un diccionario Español-Inglés, que contenga al menos *20* palabras con su respectiva traducción
- Utiliza un *objeto* `HashMap` para almacenar pares de palabras
- Input 
  - Solicitar a usuario una palbra en español
- Output
  - Mostrar por consola la palabra en inglés
  - En caso de no encontrar su traducción en el diccionario, debe imprimir un mensaje indicándolo
  */

	public static String verification(String word, HashMap< String, String > words  ) {
		boolean isThere = words.containsKey(word);
		String msg      = isThere ? "" + words.get(word) : ("La palabra no esta disponible");
		return  msg;
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			HashMap< String, String > Dictionary = new HashMap<String, String>();
			Dictionary.put( "artículo", "article"  );
			Dictionary.put( "día",      "day");
			Dictionary.put( "pedir",    "ask");
			Dictionary.put( "asociar",  "associate");
			Dictionary.put( "asumir"	,  "assume");
			Dictionary.put( "encima",   "above");
			Dictionary.put( "acceso",   "access");
			Dictionary.put( "aceptar",  "accept");
			Dictionary.put( "acuerdo",  "accord" );
			Dictionary.put( "cuenta",   "account");
			Dictionary.put( "lograr",   "achieve" );
			Dictionary.put( "cruzar",   "across" );
			Dictionary.put( "acto",     "act"   );
			Dictionary.put( "acción","action" );
			Dictionary.put( "actividad","activity"	);
			Dictionary.put( "costa","shore"	);
			Dictionary.put( "añadir","add");
			Dictionary.put( "adición","addition");
			Dictionary.put( "dirección","address");
			Dictionary.put( "adulto","adult"	);
			Dictionary.put( "arena","sand");
			Dictionary.put( "capacidad","ability");
			
			
			int counterWrongWords =0;
			Scanner s = new Scanner(System.in);
			 
			System.out.println("Ingrese una palabra en español para traducir a ingles");

			String word1 = s.nextLine();		
			
			System.out.println(verification(word1, Dictionary));			
			s.close();
			

		}

}

