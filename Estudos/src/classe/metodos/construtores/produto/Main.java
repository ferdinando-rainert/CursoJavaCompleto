package classe.metodos.construtores.produto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Criar scanner para digitar no terminal
		Scanner sc = new Scanner(System.in);

		//Seguindo regra do construtor
		Produto p1 = new Produto("Notebook");

//		p1.nome = ;
		p1.preco = 4356.89;
		p1.desconto = 0.25;

		//Seguindo regra do construtor
		Produto p2 = new Produto("Celular");
//		p2.nome = "Celular";
		p2.preco = 6000.00;
		p2.desconto = 0.15;

		System.out.println(p1.nome);
		System.out.println(p1.preco);

		// double precoFinal1 = p1.preco - (p1.preco * p1.desconto);
		// System.out.println("Preço final do produto " + p1.nome + " é de " +
		// precoFinal1);

		// Chamando método e apresentando
		System.out.println(p1.precoComDesconto());

	}

}
