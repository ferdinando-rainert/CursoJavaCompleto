package thisANDthis;

public class Data {

	int dia, mes, ano;

	Data() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
//		Usando this como método
		this(1, 1, 1970);
	}

	//this.dia refere ao atributo da classe Data
	//o restante são as variáveis do parâmetro do método
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String obterData() {
		// Formatar data
		return String.format("%d/%d/%d", dia, mes, ano);
	}

}