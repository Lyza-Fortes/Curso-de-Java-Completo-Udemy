package ListaExercicio2;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// Ler os valores de x e y
		
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();

		// Verificar em qual quadrante o ponto está ou se está sobre um dos eixos
		// cartesianos ou na origem
		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		} else if (x == 0.0) {
			System.out.println("Eixo Y");
		} else if (y == 0.0) {
			System.out.println("Eixo X");
		} else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		} else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		} else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		} else {
			System.out.println("Q4");
		}

		scanner.close();
	}
}