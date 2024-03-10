package ListaExercicio4;

import java.util.Scanner;

//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n=sc.nextInt();
		
		for(int i=0; i<=n; i++) {
			
			System.out.println("Digite um numero: ");
			int x = sc.nextInt();
			
			System.out.println("Digite um numero: ");
			int y = sc.nextInt();
			
			if( y == 0) {
				System.out.println("Divisão impossível");
				System.out.println("");
				System.out.println("=====//=====");
				System.out.println("");
			}
		
			else {
				double divisao= x/y;
				System.out.println("Resultado: "+divisao);
				System.out.println("");
				System.out.println("=====//=====");
				System.out.println("");
			}
		}
		
		
		
	}

}
