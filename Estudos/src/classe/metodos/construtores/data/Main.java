package classe.metodos.construtores.data;



public class Main {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		Data d2 = new Data(31, 12, 2020);
		
		String dataFormatada1 = d1.obterData();
		
		//Mostrando a data
		System.out.println(dataFormatada1);
		System.out.printf(d2.obterData());

	}

}
