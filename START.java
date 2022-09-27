
import java.util.Scanner;

public class START {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entradaDatos = new Scanner(System.in);
		
		  int hora= 0;
		  int minutos= 0;
		  int segundos = 0;
		  
		 
		 
		 System.out.print(" introduzca número de horas: ");
		 hora =entradaDatos.nextInt();
		 if (hora >=0 && hora <=23)
		 
	     System.out.print(" introduzca número de minutos: ");
		 minutos =entradaDatos.nextInt();
		 if (minutos >=0 && minutos <=59)
			 
	    System.out.print(" introduzca número de segundos: ");
		segundos =entradaDatos.nextInt();
		 if (segundos >=0 && segundos <=59)
			 
			 System.out.print(" la hora es correcta");
		 
	
		 
	}

}
		 
		 
		

