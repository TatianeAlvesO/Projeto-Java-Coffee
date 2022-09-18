package ProjetoCafeteria;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import java.util.HashSet;
import java.util.Scanner;

public class Cafeteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		NotaFiscal nota = new NotaFiscal(0, null, 0);

		Scanner leitor = new Scanner(System.in);

		int pedido,pagamento;
		String nome,telefone,cpf,email;
		
		System.out.println("\n-------------Bem-vindo a Cafeteria Java Coffee! -------------");
		
		
		System.out.println("\nPor gentileza, preencha os dados abaixo para realizar o seu pedido: ");
		System.out.println("\nNos informe o seu nome: ");
		nome = leitor.next();
		System.out.println("\nNos informe um numero para contato: ");
		telefone = leitor.next();
		System.out.println("\nNos informe o seu cpf: ");
		cpf = leitor.next();
		System.out.println("\nNos informe o seu e-mail: ");
		email = leitor.next();
		
		
		System.out.println("\n-------------------------------------------------------------");
		System.out.println("\nCadastro realizado com sucesso!");
		System.out.println("\nNome: "+nome);
		System.out.println("\nContato: "+telefone);
		System.out.println("\nCPF: "+cpf);
		System.out.println("\nE-mail: "+email);
		
		
		System.out.println("\n-------------------------------------------------------------");
		
		System.out.println("\nEscolha um produto:");
		System.out.println("\n1 - Café com leite ---------- R$ 5,00");
		System.out.println("\n2 - Café puro ---------- R$ 3,00");
		System.out.println("\n3 - Cappuccino ---------- R$ 10,00");
		System.out.println("\n4 - Chocolate quente ----------- R$ 15,00");
		System.out.println("\n5 - Bolo de cenoura ---------- R$ 12,50");
		System.out.println("\n6 - Bolo de chocolate ---------- R$ 12,50");
		System.out.println("\n7 - Cheesecake de chocolate ----------- R$ 15,00");
		System.out.println("\n8 - Brownie ---------- R$ 10,00");
		System.out.println("\n9 - Pão de queijo ---------- R$ 15,00");
		System.out.println("\n10 - Misto quente ---------- R$ 18,00");
		System.out.println("\n11 - Croissant ---------- R$ 12,50");
		System.out.println("\n12 - Torta vegetariana ---------- R$ 15,00");
		System.out.println("\n0 - Finalizar o pedido");
		pedido = leitor.nextInt();

		ArrayList<String> produto = new ArrayList<String>();
		
		do {
			
				switch (pedido) {
				case 1:
					produto.add("\nCafé com leite ---------- R$ 5,00");
					System.out.println("\nCafé com leite servido...");
					nota.setValorUnit(nota.getValorUnit() + 5);
					break;
				case 2:
					produto.add("\nCafé puro ---------- R$ 3,00");
					System.out.println("\nCafé puro servido...");
					nota.setValorUnit(nota.getValorUnit() + 3);
					break;
				case 3:
					produto.add("\nCappuccino ---------- R$ 10,00");
					System.out.println("\nCappuccino servido...");
					nota.setValorUnit(nota.getValorUnit() + 10);
					break;
				case 4:
					produto.add("\nChocolate quente ----------- R$ 15,00");
					System.out.println("\nChocolate quente servido...");
					nota.setValorUnit(nota.getValorUnit() + 15);
					break;
				case 5:
					produto.add("\nBolo de cenoura ---------- R$ 12,50");
					System.out.println("\nBolo de cenoura servido...");
					nota.setValorUnit(nota.getValorUnit() + 12.50);
					break;
				case 6:
					produto.add("\nBolo de chocolate ---------- R$ 12,50");
					System.out.println("\nBolo de chocolate servido...");
					nota.setValorUnit(nota.getValorUnit() + 12.50);
					break;
				case 7:
					produto.add("\nCheesecake de chocolate ----------- R$ 15,00");
					System.out.println("\nCheesecake de chocolate servido...");
					nota.setValorUnit(nota.getValorUnit() + 15);
					break;
				case 8:
					produto.add("\nBrownie ---------- R$ 10,00");
					System.out.println("\nBrownie servido...");
					nota.setValorUnit(nota.getValorUnit() + 10);
					break;
				case 9:
					produto.add("\nPão de queijo ---------- R$ 15,00");
					System.out.println("\nPão de queijo servido...");
					nota.setValorUnit(nota.getValorUnit() + 15);
					break;
				case 10:
					produto.add("\nMisto quente ---------- R$ 18,00");
					System.out.println("\nMisto quente servido...");
					nota.setValorUnit(nota.getValorUnit() + 18);
					break;
				case 11:
					produto.add("\nCroissant ---------- R$ 12,50");
					System.out.println("\nCroissant servido...");
					nota.setValorUnit(nota.getValorUnit() + 12.50);
					break;
				case 12:
					produto.add("\nTorta vegetariana ---------- R$ 15,00");
					System.out.println("\nTorta vegetariana servido...");
					nota.setValorUnit(nota.getValorUnit() + 15);
					break;
				case 0:
					System.out.println("\nFinalizando o pedido...");
					nota.setValorUnit(nota.getValorUnit());
					break;
				default:
					System.out.println("\nVocê pediu a conta!");

				}
				
				System.out.println("\nEscolha um produto:");
				System.out.println("\n1 - Café com leite ---------- R$ 5,00");
				System.out.println("\n2 - Café puro ---------- R$ 3,00");
				System.out.println("\n3 - Cappuccino ---------- R$ 10,00");
				System.out.println("\n4 - Chocolate quente ----------- R$ 15,00");
				System.out.println("\n5 - Bolo de cenoura ---------- R$ 12,50");
				System.out.println("\n6 - Bolo de chocolate ---------- R$ 12,50");
				System.out.println("\n7 - Cheesecake de chocolate ----------- R$ 15,00");
				System.out.println("\n8 - Brownie ---------- R$ 10,00");
				System.out.println("\n9 - Pão de queijo ---------- R$ 15,00");
				System.out.println("\n10 - Misto quente ---------- R$ 18,00");
				System.out.println("\n11 - Croissant ---------- R$ 12,50");
				System.out.println("\n12 - Torta vegetariana ---------- R$ 15,00");
				System.out.println("\n0 - Finalizar o pedido");
				
				pedido = leitor.nextInt();
        
		
				
		} while (pedido != 0);
		
		System.out.println("\n-------------------------------------------------------------");
		System.out.println("\nOs produtos solicitados foram: "+produto);
		System.out.println("\nO valor total do pedido foi de R$ " + nota.getValorUnit());
		
		System.out.println("\n-------------------------------------------------------------");
		System.out.println("\nNos informe o modo de pagamento: ");
		System.out.println("\n1 - Dinheiro");
		System.out.println("\n2 - Cartão de débito");
		System.out.println("\n3 - Cartão de crédito");
		System.out.println("\n4 - Pix");
		pagamento = leitor.nextInt();
		
		
			switch (pagamento) {
			case 1:
				System.out.println("\nDirija-se ao caixa para realizar o pagamento!");
				break;
			case 2:
				System.out.println("\nInsira seu cartão de débito no local indicado!");
				break;
			case 3:
				System.out.println("\nInsira seu cartão de crédito no local indicado!");
				break;
			case 4:
				System.out.println("\nAponte a câmera do seu celular no QR code abaixo!");
				break;
			default:
				System.out.println("\nPor gentileza, informe o modo de pagamento!");
					
			} 
			
			
		System.out.println("\n-------------------------------------------------------------");
		System.out.println("\nAgradecemos a preferência, volte sempre!!!");
		
	}

}