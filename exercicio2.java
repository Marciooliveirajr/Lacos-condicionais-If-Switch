package lacoscondicionais;
import java.util.Scanner;
public class exercicio2 {
	

			public static void main(String[] args) {

				Scanner leia = new Scanner(System.in);
				
				int quantidade,cod;
				float ValorTotal;
				
				System.out.println("\nProdutos: ");
				System.out.println("\n1 - Cachorro Quente R$ 10,00");
				System.out.println("\n2 - X-Salada R$ 15,00");
				System.out.println("\n3 - X-Bacon R$ 18,00");
				System.out.println("\n4 - Bauru R$ 12,00");
				System.out.println("\n5 - Refrigerante R$ 8,00");
				System.out.println("\n6 - Suco de Laranja R$ 13,00");
				System.out.println("\n Escolha um produto:");
				cod = leia.nextInt();
				System.out.println("\nDigite a quantidade deste produto: ");
				quantidade = leia.nextInt();
				
				switch(cod) {
				case 1:
					ValorTotal = quantidade * 10;
					System.out.println("\nCachorro Quente - Valor Total: R$ "+ValorTotal);
					break;
				case 2:
					ValorTotal = quantidade * 15;
					System.out.println("\nX-Salada - Valor Total: R$ "+ValorTotal);
					break;
				case 3:
					ValorTotal = quantidade * 18;
					System.out.println("\nX-Bacon - Valor Total: R$ "+ValorTotal);
					break;
				case 4:
					ValorTotal = quantidade * 12;
					System.out.println("\nBauru - Valor Total: R$ "+ValorTotal);
					break;
				case 5:
					ValorTotal = quantidade * 8;
					System.out.println("\nRefrigerante Valor Total: R$ "+ValorTotal);
					break;
				case 6:
					ValorTotal = quantidade * 13;
					System.out.println("\nSuco de Laranja Valor Total: R$ "+ValorTotal);
					break;
				default:
					System.out.println("\nInsira um numero de 1 a 6");
					
					
			}
				
		}

	}


