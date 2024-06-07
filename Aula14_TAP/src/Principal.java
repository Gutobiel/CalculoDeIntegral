public class Principal {
	public static void main(String[] args) {
		double incremento = 0.0001;
		for (double i = 0 ; i < 100 ; i+=incremento) {
			new Integradora(i, i + incremento).start();
		}
		
		while (Thread.activeCount() > 1) {
			try {Thread.sleep(1000);} catch (Exception erro) {}
		}
		
		System.out.println("O resultado da integral é: " + Funcao.getResultado());
	}
}