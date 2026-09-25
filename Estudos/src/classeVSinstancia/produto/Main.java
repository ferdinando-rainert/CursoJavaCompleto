package classeVSinstancia.produto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Criar scanner para digitar no terminal
		Scanner sc = new Scanner(System.in);

		Produto p1 = new Produto();
		p1.nome = "Celular";
		p1.preco = 100.00;
		
		System.out.println("Produto: "+ p1.nome + " valor com desconto:" + p1.precoComDesconto());
	}

}
