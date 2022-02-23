package DIO_MetodosJava;

public class Calc {

	public static void soma(double numero1, double numero2) {
		
		double resultado = numero1 + numero2;
		
		System.out.println("A soma do "+numero1+" + "+numero2+ " o resultado é: "+resultado);
	}

	
	public static void subtracao(double numero1, double numero2) {
		double resultado = numero1 - numero2;
		
		System.out.println("A subtração do "+numero1+" - "+numero2+" o resultado é: "+resultado);
	}
	
	public static void multiplicacao(double numero1, double numero2) {
		double resultado = numero1 * numero2;
		
		System.out.println("A multiplicação dos "+numero1+" * "+numero2+"resultado é: "+resultado);
	}
	
	public static void divisao (double numero1, double numero2) {
		double resultado = numero1 / numero2;
		
		System.out.println("A divisão do números "+numero1+" / "+numero2+" o resultado é: "+resultado);
	}
}
