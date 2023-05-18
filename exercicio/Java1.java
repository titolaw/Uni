package application;

import java.util.Scanner;

public class Ouvidoria {

	public static void menu() {

		System.out.print("|--------------------------------|\n");
		System.out.print("| Opção 1 - Inserir reclamações  |\n");
		System.out.print("| Opção 2 - Listar reclamações   |\n");
		System.out.print("| Opção 3 - Sair                 |\n");
		System.out.print("|--------------------------------|\n");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ocorrencias = new String[2];

		menu();
		int opcao = 9;

		while (opcao != 3) {
			System.out.print("Digite uma opção: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Inserir reclamações");
				for(int x = 0; x < ocorrencias.length;x++) {
					System.out.println("Digite uma reclamação: ");
					ocorrencias[x] = sc.nextLine();
					sc.next();
				}
				break;

			case 2:
				System.out.println("Listar reclamações");
				for(String item : ocorrencias) {
					System.out.println(item);
				}
				break;

			case 3:
				System.out.println("Sair. Até logo!");
				break;
			default:
				System.out.println("Opção inválida");
			}

		}
		sc.close();
	}
}
