package Ejercicio7;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio7 {
	
	/**
	 * # Ejercicio 7

## Instrucciones

- Crear un programa en `Java` que realice lo siguiente:
- Input
  - Solicitar al usuario un dia de la semana (Lunes - Viernes)
  - Solicitar al usuario una hora (horas y minutos)
- Calcular cuántos minutos faltan para el fin de semana.
  - Considerando el inicio para el fin de semana **Viernes a las 15:00 hrs**
- Output
  - Mostrar el resultado por un mensaje en consola.

--- 

Input: Lunes, 14:30 hrs
``` Java
lunes
14
30
```

Output:
```Java
"Faltan 5730 minutos para el fin de semana"
```*/
	static double hoursLeftMondayToFriday = 110;
	public static double funcionDay(String weekDay, LocalTime time, double hoursLeftMondayToFriday) {
		double hoursPerDay = 24;
		LocalTime  minutesLeft;
		 
		weekDay = weekDay.toLowerCase();
		switch(weekDay) {
		case "lunes":
			hoursLeftMondayToFriday = hoursLeftMondayToFriday -0;
			break;
		case "martes":
			hoursLeftMondayToFriday = hoursLeftMondayToFriday -hoursPerDay ;
			break;
		case "miercoles":
			hoursLeftMondayToFriday = hoursLeftMondayToFriday -(hoursPerDay*2) ;
			break;
		case "jueves":
			hoursLeftMondayToFriday = hoursLeftMondayToFriday -(hoursPerDay*3) ;
			break;
		case "viernes":
			hoursLeftMondayToFriday = hoursLeftMondayToFriday -(hoursPerDay*4) ;
			break;
			default:
				//return "No es un día de la semana";
				break;
			
		}
		return ((hoursLeftMondayToFriday - time.getHour())*60) - time.getMinute();
	}
	
	public static double funcionHourMinutes(double hoursPerDay ) {
		
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate myObj = LocalDate.now();  
	    System.out.println(myObj);  
	    SimpleDateFormat ft = new SimpleDateFormat("EEEE");
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese un día de la semana Lunes, Martes, Miercoles, Jueves o viernes");
		String weekDay = s.nextLine();
		
		System.out.println("Ingrese una hora (hh)");
		String timeHourMinutes = s.nextLine();
		LocalTime time = LocalTime.parse(timeHourMinutes,DateTimeFormatter.ISO_TIME);
		
	        System.out.println("Faltan " +funcionDay(weekDay, time,  hoursLeftMondayToFriday)+" minutos para el fin de semana.");

	}

}
