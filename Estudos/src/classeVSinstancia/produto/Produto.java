package classeVSinstancia.produto;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;

	// Construtor explícito
	Produto(String nomeInicial) {
		nome = nomeInicial;
	}

	Produto() {

	}

	double precoComDesconto() {
		double valorfinal = preco - (preco * desconto);
		return valorfinal;

	}

}
