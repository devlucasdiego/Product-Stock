package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe os dados do produto");

		System.out.println("Nome: ");
		String nome = sc.nextLine();

		System.out.println("Preço: ");
		double preco = sc.nextDouble();
		Produto produto = new Produto(nome, preco);

		System.out.println();
		System.out.println("Dados do produto: " + produto);

		System.out.println();
		System.out.println("Insira o numero de produtos a serem adicionados em estoque: ");
		int quantidade = sc.nextInt();
		produto.addProdutos(quantidade);

		System.out.println();
		System.out.println("Dados atualizados: " + produto);

		System.out.println();
		System.out.println("Insira o numero de produtos a serem removidos do estoque: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);

		System.out.println();
		System.out.println("Dados atualizados: " + produto);

		sc.close();
	}

}
