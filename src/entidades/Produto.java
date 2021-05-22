package entidades;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;

	// MÉTODOS

	public double valorTotalEstoque() {
		return preco * quantidade;
	}

	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
}
