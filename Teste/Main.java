package Teste;

import java.lang.String;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Exercicios teste = new Exercicios();

		System.out.println("by: Vitória R. C. Diógenes\n");
		System.out.println("Teste para vaga de estagiário\n");

		System.out.println("E.1 digite (1)\n" + "E.2 digite (2)\n" + "E.3 digite (3)\n" + "E.4 digite (4)\n");

		System.out.println("Para visualizar as demais digite (0)");
		int opcao;

		opcao = Integer.parseInt(scanner.nextLine());

		if (opcao == 1) {
			System.out.println("Insira as strings");
			String a = scanner.nextLine();
			String b = scanner.nextLine();
			teste.biggerSize(a, b);
			System.out.println("Maior string: " + teste.biggerSize(a, b));

		} else if (opcao == 2) {
			System.out.println("Insira a string que deseja inverter");
			String rev = scanner.nextLine();
			teste.reverse(rev);
			System.out.println(teste.reverse(rev));

		} else if (opcao == 3) {
			System.out.println("Insira uma sequencia de strings separando-as por espaços");
			String texto = scanner.nextLine();
			teste.concat(texto);

		} else if (opcao == 4) {
			teste.replace("teste 1 de 2 string 3");

		} else if (opcao == 0) {
			Dados dados1 = new Dados(1, "jose", "da silva", 42);
			Dados dados2 = new Dados(2, "joao", "goncalves", 21);
			Dados dados3 = new Dados(3, "pedro", "garcia", 28);
			Dados dados4 = new Dados(4, "matheus", "pinheiro", 21);
			teste.dados.add(dados1);
			teste.dados.add(dados2);
			teste.dados.add(dados3);
			teste.dados.add(dados4);

			System.out.println("E.6:\n");
			teste.hello();
			System.out.println("\nE.7:\n");
			teste.sumAll();
			System.out.println("\nE.8:\n");
			teste.sumAge();
			System.out.println("\nE.9:\n");
			teste.sumAgeTb();
			System.out.println("\nE.10:\n");
			teste.order();
		}

	}

}
