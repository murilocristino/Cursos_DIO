package DIO_MetodosJava;

public class Calc {

	public static void soma(double numero1, double numero2) {
		
		double resultado = numero1 + numero2;
		
		System.out.println("A soma do "+numero1+" + "+numero2+ " o resultado �: "+resultado);
	}

	
	public static void subtracao(double numero1, double numero2) {
		double resultado = numero1 - numero2;
		
		System.out.println("A subtra��o do "+numero1+" - "+numero2+" o resultado �: "+resultado);
	}
	
	public static void multiplicacao(double numero1, double numero2) {
		double resultado = numero1 * numero2;
		
		System.out.println("A multiplica��o dos "+numero1+" * "+numero2+"resultado �: "+resultado);
	}
	
	public static void divisao (double numero1, double numero2) {
		double resultado = numero1 / numero2;
		
		System.out.println("A divis�o do n�meros "+numero1+" / "+numero2+" o resultado �: "+resultado);
	}
}
