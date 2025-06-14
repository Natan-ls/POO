import java.util.*;

public class Lanchonete {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod = 1;
		do{
			Pedido pedido;
			System.out.printf("Informe o nome do cliente:");
			String nome = sc.nextLine();
			
			if(nome.equals("\n"))
				pedido = new Pedido(cod);
			else pedido = new Pedido(cod, nome);
			
			do{
				System.out.println("1 - BigMac");
				System.out.println("2 - Hamburger");
				System.out.println("3 - CheeseBurguer");
				System.out.println("0 - Encerrar");
				System.out.printf("Opção: ");
				int opc = sc.nextInt();
				
				if(opc == 0)
					break;
				else if((opc > 0) || (4 < opc)){
					System.out.println("Adicionais");
					System.out.println("1 - Batata");
					System.out.println("2 - Batata e Refri");
					System.out.println("3 - Batata e cookie");
					System.out.println("4 - Não");
					int opcAdicional = sc.nextInt();
					
					if(opcAdicional == 1){
						System.out.println("Qtd gramas: ");
						Double gramas = sc.nextDouble();
						String total = pedido.adiciona(opc, gramas);
						System.out.println(total);
					}
					
					if(opcAdicional == 2){
						System.out.println("Qtd gramas: ");
						Double gramas = sc.nextDouble();
						System.out.println("Qtd litros: ");
						Double litros = sc.nextDouble();
						String total = pedido.adiciona(opc, gramas, litros);
						System.out.println(total);
					}
					
					if(opcAdicional == 3){
						System.out.println("Qtd litros: ");
						Double litros = sc.nextDouble();
						System.out.println("Qtd: ");
						int qtd = sc.nextInt();
						String total = pedido.adiciona(opc, litros, qtd);
						System.out.println(total);
					}
					
					if(opcAdicional == 4){
						String total = pedido.adiciona(opc);
						System.out.println(total);
					}
					
				}
			
			}while(true);
			cod++;
			String n = sc.nextLine();
		}while(true);
	}
}

