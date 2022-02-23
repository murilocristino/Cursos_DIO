package DIO_MetodosJava;

public class Emprest {
	
	public static int getDuasParcelas() {
		return 2;
	}
	
	public static int getTresParcelas() {
		return 3;
	}

	public static double getTaxaDuasParcelas() {
		return 0.3;
	}
	
	public static double getTaxaTresParcelas() {
		return 0.45;
	}
	
	public static void calcular(double valor, int parcelas) {
		
		if (parcelas == 2) {
			double valorFinal = valor + (valor * getTaxaDuasParcelas());
			
			System.out.println("Valor liquido do emprestimo a ser pago em " + (getDuasParcelas())+" parcelas é de: "+ valorFinal);
		} else if (parcelas == 3) {
			double valorFinal = valor + (valor * getTaxaTresParcelas());
			
			System.out.println("Valor liquido do emprestimo a ser pago em " + (getTresParcelas())+" parcelas é de: "+ valorFinal);
		} else {
			System.out.println("Valor não está no máximo ou no minimo permitido em parcelas - escolhe entre 2 ou 3 parcelas");
		}
	}
}
