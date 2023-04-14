package lacoscondicionais;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
			        
			        Scanner leia = new Scanner(System.in);

			        int A,B, C, soma;

			        
			        System.out.print("\n Digite o numero A: ");
			        A = leia.nextInt();

			        System.out.print("\n Digite o numero B: ");
			        B = leia.nextInt();

			        System.out.print("\n Digite o numero C: ");
			        C = leia.nextInt();

			        soma = A + B;

			        if (soma > C) {
			            
			            System.out.println("\nA Soma de A + B é Maior do que C");
			            
			        } else if (soma < C) {
			            
			            System.out.println("\nA Soma de A + B é Menor do que C");
			            
			        } else {
			            
			            System.out.println("\nA Soma de A + B é igual do que C");
			        }

			     
			    }
			}
		

	


