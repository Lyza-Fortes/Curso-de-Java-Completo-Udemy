package ListaExercicio3;

//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha 
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser 
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int senha;

		System.out.println("Digite a senha: ");
		senha = sc.nextInt();

		while (senha != 1021) {
			System.out.println("Senha Inválida!");
			senha = sc.nextInt();

		}
		System.out.println("---Acesso Permitido---");

		sc.close();
	}
}
