package desafioClasses;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Ferdinando";
		p1.peso = 80.0;
		
		Comida c1 = new Comida();
		c1.nome = "Carne";
		c1.peso = 5.0;
		
		System.out.println("Nome: "+ p1.nome + " Peso Antes: " + p1.peso);
		
		p1.Comer(c1);
		
		System.out.println("Nome: "+ p1.nome + " Peso depois: " + p1.peso );
		
	}

}
