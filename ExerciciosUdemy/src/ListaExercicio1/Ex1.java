package ListaExercicio1;

import java.util.Scanner;

//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.


public class Ex1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	int a,b,soma;
	
	System.out.println("Digite o primeiro número: ");
	a = sc.nextInt();
	
	System.out.println("Digite o segundo número: ");
	b = sc.nextInt();
	
	soma = a + b;
	
	System.out.println("Soma é = " + soma);
	soma = sc.nextInt();
	
	sc.close();
		
	}
}
