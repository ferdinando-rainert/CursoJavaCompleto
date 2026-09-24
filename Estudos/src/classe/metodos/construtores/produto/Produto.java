package classe.metodos.construtores.produto;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	//Construtor explícito
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	double precoComDesconto(){		
		double valorfinal =  preco - (preco * desconto);
		return valorfinal;
		
	}
}
