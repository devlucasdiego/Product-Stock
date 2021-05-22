package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto produto = new Produto();
		System.out.println("Informe os dados do produto");

		System.out.println("Nome: ");
		produto.nome = sc.nextLine();

		System.out.println("Preço: ");
		produto.preco = sc.nextDouble();

		System.out.println("Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();

		sc.close();
	}

}
