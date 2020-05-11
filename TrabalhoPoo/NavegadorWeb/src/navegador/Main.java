package navegador;

import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Date data = new Date();
		System.out.println("Data Agora: " + data);
		Scanner leitor = new Scanner(System.in);

		System.out.println("Bem vindo ao Navegador De Internet");
		while (true) {
			System.out.println("--------------------");
			System.out.println("(1) Para digitar um endereço web valido");
			System.out.println("(2) Digite um buscador");
			System.out.println("(3) Para histórico de navegação");
			System.out.println("(4) Para ferramentas e ajuda ");
			int opcao = leitor.nextInt();
			
			
			if (opcao == 1) {
				System.out.println("Digite o endereço do site: ");
				leitor.nextLine();
				String endereco = leitor.nextLine();

				break;
			}

			if (opcao == 2) {
				System.out.println("Digite qual o seu buscador");
				break;
			}

			if (opcao == 3) {
				System.out.println(" ");
				break;
			}

			if (opcao == 4) {
				System.out.println("ferramentas e ajuda :)");
				break;
			}

			System.out.println("Opção inválida.");
		}
		leitor.close();

	}

}
