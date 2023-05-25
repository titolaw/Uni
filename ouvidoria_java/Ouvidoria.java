package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ocorrencias = new String[5];

		int opcao = 9;

		while (opcao != 3) {
			menu();
			System.out.print("Digite uma opção: ");
			opcao = sc.nextInt();
			sc.nextLine();
			switch (opcao) {
			case 1: {
				System.out.println("Inserir reclamações");
				for (int x = 0; x < ocorrencias.length; x++) {
					System.out.println("Digite uma reclamação: ");
					ocorrencias[x] = sc.nextLine();
				}
				break;
			}
			case 2: {
				boolean vazio = true;
				for (String item : ocorrencias) {
					if (item != null) {
						vazio = false;
						break;
					}
				}

				if (vazio == false) {
					System.out.println("Lista de reclamações: ");
					for (int x = 0; x < ocorrencias.length; x++) {
						System.out.println(x + 1 + " - " + ocorrencias[x]);
					}
				} else {
					System.out.println("A lista de reclamações está vazia.");
				}
				break;
			}
			case 3: {
				System.out.println("Sair. Até logo!");
				break;
			}
			default: {
				System.out.println("Opção inválida");
				break;
			}
			}

		}
		sc.close();
	}

	public static void menu() {

		System.out.print("|--------------------------------|\n");
		System.out.print("| Opção 1 - Inserir reclamações  |\n");
		System.out.print("| Opção 2 - Listar reclamações   |\n");
		System.out.print("| Opção 3 - Sair                 |\n");
		System.out.print("|--------------------------------|\n");

	}

}
