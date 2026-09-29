package desafioClasses;

public class Pessoa {
	
	String nome;
	double peso;

	Pessoa(){
		nome = null;
		peso = 0;
	}
	public void Comer(Comida comida) {
		
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
}
