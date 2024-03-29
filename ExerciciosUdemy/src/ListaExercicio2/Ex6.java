package ListaExercicio2;

//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos 
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em 
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double numero;
		
		System.out.println("Digiite um valor: ");
		numero = sc.nextDouble();
		
		if (numero <0.0 || numero > 100) {
			System.out.println(" Fora de intervalo");
		}
		else if (numero <= 25.00){
			System.out.println("Intervalo (0,25)");
		}
		else if(numero <= 50.00){
			System.out.println("Intervalo (25,50)");	
		}
		else if (numero <= 75.00) {
			System.out.println("Intervalo (50,25)");
		}
		else {
			System.out.println("Intervalo (75,100)");
		}
		sc.close();
		
		
	}

}
