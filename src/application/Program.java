package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Dados dados = new Dados();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome");
		String nome = sc.nextLine();
		System.out.println("Sobre nome");
		String sobrenome = sc.nextLine();
		System.out.println("CPF");
		Integer cpf = sc.nextInt();
		System.out.println("Valor");
		Double valor = sc.nextDouble();
		String nomePai = sc.nextLine();
		dados.addLista(nomePai);
		
		Dados dados1 = new Dados(nome, sobrenome, cpf, valor);
	
		System.out.println(dados);
		
		sc.close();

	}

}
