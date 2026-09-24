package classe.metodos.produto;

public class Produto {
	
	String nome;
	double preco;
	double desconto;

	double precoComDesconto(){
		
		double valorfinal =  preco - (preco * desconto);
		
		return valorfinal;
	}
	
}
