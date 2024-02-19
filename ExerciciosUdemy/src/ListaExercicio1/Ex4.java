package ListaExercicio1;

import java.util.Scanner;

//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

public class Ex4 {
	public static void main(String[] args) {
		
		int numero;
		Double horas,valor, salario;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Número do funcionário: ");
		numero = sc.nextInt();
		
		System.out.println("Número de horas trabalhadas: ");
		horas = sc.nextDouble();
		
		System.out.println("Valor da hora: ");
		valor = sc.nextDouble();
		
		salario = horas * valor;
		
		System.out.println("=======//=======");
		
		System.out.println("Funcionário "+ numero);
		System.out.printf("Salário: %.2f%n ", salario);
		
		sc.close();
		
		
		
	}

}
