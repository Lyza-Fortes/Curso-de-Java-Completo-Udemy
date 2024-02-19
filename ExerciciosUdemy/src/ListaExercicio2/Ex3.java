package ListaExercicio2;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b;

		a = sc.nextInt();
		b = sc.nextInt();

		if (a % b == 0 || b % a == 0 ) {
			System.out.println("São múltiplos!");
		} else {
			System.out.println("Não são múltiplos!");
		}
		sc.close();

	}

}
