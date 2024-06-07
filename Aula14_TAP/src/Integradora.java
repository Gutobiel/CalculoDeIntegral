public class Integradora extends Thread {
	// Propriedades da classe
	private double inicio = 0;
	private double fim = 0;
	
	// Método construtor cheio da classe
	public Integradora(double inicio, double fim) {
		super();
		this.inicio = inicio;
		this.fim = fim;
	}

	// Método de execução paralela da classe
	public void run() {
		double resultadoParcial = ((fim - inicio) * Funcao.calcular((inicio + fim) / 2));
		
		Funcao.atualizarResultado(resultadoParcial);
	}
}