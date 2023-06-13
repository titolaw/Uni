package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Elogio;
import entities.Manifestacao;
import entities.Pessoa;
import entities.Reclamacao;
import entities.Sugestao;

public class Program {

	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
		Scanner sc = new Scanner(System.in);
		int opcao;

		Pessoa pessoa = new Pessoa();
		System.out.print("Digite seu nome: ");
		pessoa.setNome(sc.nextLine());
		System.out.print("Digite seu endereco: ");
		pessoa.setEndereco(sc.nextLine());
		System.out.print("Digite seu cpf: ");
		pessoa.setCpf(sc.nextLine());

		Manifestacao listaManifestacoes = new Manifestacao();

		do {
			if (listaManifestacoes.getContador() == 5) {
				System.out.println("\nLista de manifestacões: \n");
				listaManifestacoes.listar();
				break;
			}

			menu();
			System.out.print("Digite uma opção: ");
			opcao = sc.nextInt();
			sc.nextLine();
			switch (opcao) {
			case 1: {
				System.out.print("Inserir elogio: ");
				String texto = sc.nextLine();
				LocalDateTime now = LocalDateTime.now();
				String data = now.format(dtf);
				Elogio elogio = new Elogio(pessoa, data, texto);
				listaManifestacoes.inserir(elogio);
				listaManifestacoes.incrementaContador();
				break;
			}
			case 2: {
				System.out.print("Inserir sugestao: ");
				String texto = sc.nextLine();
				LocalDateTime now = LocalDateTime.now();
				String data = now.format(dtf);
				Sugestao sugestao = new Sugestao(pessoa, data, texto);
				listaManifestacoes.inserir(sugestao);
				listaManifestacoes.incrementaContador();
				break;
			}
			case 3: {
				System.out.print("Inserir reclamação: ");
				String texto = sc.nextLine();
				LocalDateTime now = LocalDateTime.now();
				String data = now.format(dtf);
				Reclamacao reclamacao = new Reclamacao(pessoa, data, texto);
				listaManifestacoes.inserir(reclamacao);
				listaManifestacoes.incrementaContador();
				break;
			}
			case 4: {
				if (listaManifestacoes.getNumNull() == listaManifestacoes.getSize()) {
					System.out.println("\nLista de manifestacões: ");
					System.out.println("A lista está vazia.");
					break;
				}

				else {
					System.out.println("\nLista de manifestacões: \n");
					listaManifestacoes.listar();
					break;
				}
			}
			case 5: {
				System.out.println("Dados do usuário: \n");
				System.out.println(pessoa.toString());
				break;
			}
			case 6: {
				pessoa = new Pessoa();
				System.out.println("Trocar usuário: ");
				System.out.print("Digite seu nome: ");
				pessoa.setNome(sc.nextLine());
				System.out.print("Digite seu endereco: ");
				pessoa.setEndereco(sc.nextLine());
				System.out.print("Digite seu cpf: ");
				pessoa.setCpf(sc.nextLine());
			}
			case 7: {
				System.out.println("\nSair. Até logo!");
				break;
			}
			default: {
				System.out.println("\nOpção inválida.");
				break;
			}
			}
		} while (opcao != 7);

		System.out.println("\nObrigado pelo seu feedback! Volte sempre.");

		sc.close();
	}

	public static void menu() {

		System.out.print("\n|--------------------------------|\n");
		System.out.print("| Opção 1 - Inserir elogio       |\n");
		System.out.print("| Opção 2 - Inserir sugestão     |\n");
		System.out.print("| Opção 3 - Inserir reclamação   |\n");
		System.out.print("| Opção 4 - Listar manifestacões |\n");
		System.out.print("| Opção 5 - Dados do usuário     |\n");
		System.out.print("| Opção 6 - Trocar usuário       |\n");
		System.out.print("| Opção 7 - Sair                 |\n");
		System.out.print("|--------------------------------|\n\n");

	}

}
