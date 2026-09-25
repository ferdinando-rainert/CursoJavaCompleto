package classeVSinstancia;

public class Main {

	public static void main(String[] args) {

		AreaCirc a = new AreaCirc(5.6);
		
//		Sistema permite acessar Pi pois ele não é static(não faz parte somente da classe)
//		a.pi = 10;
		
//		Acessando a classe para poder acessar o atributo static
//		Porém não permite acessar pois na outra classe ele é final
//		AreaCirc.pi = 13.1415;
		
		System.out.println(a.Area());
		
		//utilizando metodo static para calcular área
		System.out.println(AreaCirc.area(100));
		
	}

}
