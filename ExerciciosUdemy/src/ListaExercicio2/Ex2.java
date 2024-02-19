package ListaExercicio2;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n;
		
		System.out.println("====Par ou ímpar?====");
		
		System.out.println("Insira um número: ");
		n = sc.nextInt();
		
		if (n % 2 > 0) {
			System.out.println(n + ", Número ímpar!");	
		}
		
		else{
			System.out.println(n + ", Número par!");
		}
		sc.close();
		
	}

}
