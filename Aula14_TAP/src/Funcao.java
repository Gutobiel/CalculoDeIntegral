public class Funcao {
	// Propriedades da classe
	private static double resultado = 0;
	
	// Métodos da classe
	public static double calcular(double x) {
		return (Math.pow(Math.E, x) * Math.pow(x, 2) + Math.sqrt(x) * Math.sin(x) /
				Math.abs(x) - x * x * 1/3 * x + Math.cosh(x) /
				Math.tan(x/5 - 3) + Math.log(x) + Math.log10(Math.pow(x, 3)) * 7);
	}
	
	public synchronized static void atualizarResultado(double resultadoParcial) {
		resultado += resultadoParcial;
	}
	
	public static double getResultado() {
		return resultado;
	}
}