package es.oretania;

public class SumaAcumulada {

	public static void main(String[] args) {
		try {
			int [] numeros = { 10, 5 , -2, 2, 1, 5, 0, 7, -1, 3};
			int sumaTotal;
			sumaTotal = calcularSumaDivisones(numeros);
			System.out.println("Suma total de las divisiones: " + sumaTotal);
		}catch (Exception e) {}

	}
	private static int calcularSumaDivisones(int[] numeros) throws Exception {
		int suma = 0;
		for (int i = 1; i <= numeros.length; i++) {
			int resultado = 100 / numeros[i];
			suma += resultado;
		}
		return suma;
	}
}
