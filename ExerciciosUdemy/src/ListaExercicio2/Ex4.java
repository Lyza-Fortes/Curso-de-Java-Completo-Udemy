package ListaExercicio2;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int hInicio, hFinal;
		
		System.out.println("Hora de inicío: ");
		hInicio = sc.nextInt();
		
		System.out.println("Hora de término: ");
		hFinal = sc.nextInt();
		
		int duracao; 
		
		if(hInicio < hFinal) {
			duracao = hInicio - hFinal;		
		}
		
		else if(hFinal < hInicio) {
			duracao = 24 - hInicio + hFinal;
		}
		
		else {
			
			duracao = 24;
		}
		System.out.println("A duração do jogo é de " + duracao + " horas.");

        sc.close();
		
		
	}

	
}
