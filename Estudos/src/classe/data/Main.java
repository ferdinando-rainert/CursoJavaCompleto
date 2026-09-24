package classe.data;

public class Main {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		d1.dia = 01;
		d1.mes = 01;
		d1.ano = 2001;
		
		//Mostrando a data
		//\n para pular linha
		System.out.printf("%d/%d/%d\n", d1.dia,d1.mes,d1.ano);

	}

}
