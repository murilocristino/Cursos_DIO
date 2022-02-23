package DIO_MetodosJava;

public class Main {
	
	public static void main(String[] args) {
		
		//Calc
		
		System.out.println("Exercicio Calculadora");
		Calc.soma(90, 11);
		Calc.subtracao(5, 2.2);
		Calc.multiplicacao(9, 3);
		Calc.divisao(10, 2);
		
		//Mensag
		
		System.out.println("Exercicio da Mensagem");
		Mensag.obtermMensagem(6);
		Mensag.obtermMensagem(23);
		Mensag.obtermMensagem(16);
		
		//Emprest
		
		System.out.println("Exercicio de Empréstimo");
		Emprest.calcular(10000, Emprest.getDuasParcelas());
		Emprest.calcular(10000, Emprest.getTresParcelas());
		Emprest.calcular(10000, 4);
	}
	
	
	
	

	
	
}
