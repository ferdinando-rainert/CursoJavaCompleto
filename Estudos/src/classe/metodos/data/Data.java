package classe.metodos.data;

public class Data {

	int dia, mes, ano;
	
	String obterData() {
		//Formatar data
	    return String.format("%d/%d/%d", dia, mes, ano);
	}
}
