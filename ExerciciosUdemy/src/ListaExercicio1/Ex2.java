package ListaExercicio1;

import java.util.Scanner;

//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159

public class Ex2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in); 
		
		Double a, r, pi =  3.14159;
		
		System.out.println("Insira o raio: ");
		r=sc.nextDouble();
		
		a = pi*r*r;
		
		System.out.printf("Valor da área é: %.4f%n", a);
		
		sc.close();
		
		
	}
}

	
	
	

