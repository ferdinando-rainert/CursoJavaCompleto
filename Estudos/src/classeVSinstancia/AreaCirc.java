package classeVSinstancia;

public class AreaCirc {
	
	double raio;
	
//	Nesse caso pode ser considerado uma constante
//	Final é usado para definir que é constante
//	Static usado para ser possível editar apenas na classe
	static final double pi = 3.14;
	
//	Dessa forma é possível alterar fora da classe
//	double pi = 3.14;
	
	AreaCirc(double raioInicial){
		raio = raioInicial;
	}
	
	double Area(){
		
//		retorna raio² * pi
//		return raio * raio * pi;
		
//		Usando funções do java:
		return pi * Math.pow(raio, 2);
	}
	
//	Metodo static
	static double area(double raio) {
		
		return Math.pow (raio, 2) * pi;
	}
}
