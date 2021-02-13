package Teste;

import java.lang.String;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercicios {

	ArrayList<Dados> dados = new ArrayList<Dados>();

	public String biggerSize(String a, String b) { // compara o tamanho das palavras
		int x = lengthTester(a);
		int z = lengthTester(b);
		if (x > z) {
			return a;
		} else {
			return b;
		}

	}

	private int lengthTester(String c) { // função de apoio
		char counter;
		int cont = 0;
		for (int i = 1; i < c.length(); i++) {
			counter = c.charAt(i);
			cont += 1;
		}
		return cont;

	}

	public String reverse(String d) { // inverte a string
		String rev = "";
		for (int i = lengthTester(d); i >= 0; i--) {
			rev += d.charAt(i);
		}
		return rev;

	}

	public void concat(String texto) {
		String[] ss = texto.split(" ");
		String c = new String();

		for (int i = 0; i < ss.length; i++) {
			c += ss[i];
		}
		System.out.println(c);

	}

	public void replace(String s) { 
		String[] vetor = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		String n[] = s.split(" ");
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if (n[i].equals(vetor[j])) {
					n[i] = "removido";

				}

			}

		}
		for (int p = 0; p < n.length; p++) {
			System.out.println(n[p]);
		}

	}


	public void hello() {

		for (int i = 0; i < dados.size(); i++) {
			String nome = dados.get(i).getNome();
			String first = nome.substring(0, 1).toUpperCase();
			String second = nome.substring(1);

			System.out.println("Olá " + first.concat(second) + " " + dados.get(i).getSobrenome());
		}
	}

	public void sumAll() {
		int counter = 0;
		for (int i = 0; i < dados.size(); i++) {
			counter += dados.get(i).getIdade();
		}
		System.out.println("soma das idades: " + counter);
	}

	public void sumAge() {
		for (int i = 0; i < dados.size(); i++) {
			if (dados.get(i).getIdade() < 26) {
				System.out.println(dados.get(i).getId() + " " + dados.get(i).getNome() + " "
						+ dados.get(i).getSobrenome() + " " + dados.get(i).getIdade());

			}
		}
	}

	public void sumAgeTb() {
		for (int i = 0; i < dados.size(); i++) {
			if (dados.get(i).getIdade() < 30) {
				System.out.println(dados.get(i).getId() + " " + dados.get(i).getNome() + " "
						+ dados.get(i).getSobrenome() + " " + dados.get(i).getIdade());

			}
		}
	}

	public void order() { // ordena o array pela idade

		for (int i = 0; i < dados.size(); i++) {
			for (int j = i + 1; j < dados.size(); j++) {
				if (dados.get(i).getIdade() < dados.get(j).getIdade()
						|| (dados.get(i).getIdade() == dados.get(j).getIdade()
								&& dados.get(i).getId() < dados.get(j).getId())) {
					Dados user = dados.get(i);
					dados.set(i, dados.get(j));
					dados.set(j, user);
				}
			}
		}
		toShowOrder();

	}

	public void toShowOrder() { // imprime o array ordenado

		for (int i = 0; i < dados.size(); i++) {
			System.out.println(dados.get(i).getId() + " " + dados.get(i).getNome() + " " + dados.get(i).getSobrenome()
					+ " " + dados.get(i).getIdade());

		}
	}

}
