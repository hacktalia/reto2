
import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		
		
		
		
		Scanner entraDatos= new Scanner (System.in);
	
		
		
		
		int i =0;
		int numero =0;
		int resultado =0;
		
			System.out.print("introduzca un número:   ");
			numero=entraDatos.nextInt();
		
	
		      for(i = 1; i < numero; i++) {
					if (numero % i==0) {
						resultado++;
						
						
			   }
					
		            }
					
					if (resultado<=2) {
						
		                System.out.println("El número SI es primo");
					
		            } else {
		            	
		                System.out.println("El número NO es primo");
		            }
		      }
	}

		 
		   

	
		
	


