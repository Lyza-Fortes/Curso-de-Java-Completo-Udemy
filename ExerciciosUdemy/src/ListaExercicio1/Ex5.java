package ListaExercicio1;

import java.util.Scanner;

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

public class Ex5 {
  
  public static void main(String[] args) {
	  
	  Scanner sc = new Scanner (System.in);
	  
	  int cod1,pecas1,cod2,pecas2;
	  double valor1, valor2, total;
	  
	  System.out.println("Cód da peça: ");
	  cod1 = sc.nextInt();
	  
	  System.out.println("Quantidade: ");
	  pecas1 = sc.nextInt();
	  
	  System.out.println("Valor: ");
	  valor1 = sc.nextDouble();
	  
	  System.out.println("==========//==========");
	  
	  System.out.println("Cód da peça: ");
	  cod2 = sc.nextInt();
	  
	  System.out.println("Quantidade: ");
	  pecas2 = sc.nextInt();
	  
	  System.out.println("Valor: ");
	  valor2 = sc.nextDouble();
	  
	  total = pecas1 * valor1 + pecas2 * valor2;
	  
	  System.out.println("==========//==========");
	  
	  System.out.println("Total:  "+total);
	  
	  
}
}
