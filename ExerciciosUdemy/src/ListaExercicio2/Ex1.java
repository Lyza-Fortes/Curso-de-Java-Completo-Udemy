package ListaExercicio2;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n;
		
		System.out.println("Insira um número inteiro: ");
		n = sc.nextInt();
		
		if (n > 0){
			System.out.println(n + " Não negativo");				
		}
		else{
			System.out.println(n + " Negativo");
	    }
		
		sc.close();
    }

}
