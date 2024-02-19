package ListaExercicio2;

import java.util.Scanner;

public class Ex5 {
 public static void main(String[] args) {
	 
	 Scanner sc = new Scanner (System.in);
	 
	 int codigo, quantidade;
	 double total;
	 
	 System.out.println("Código do produto: ");
	 codigo = sc.nextInt();
	 
	 System.out.println("Quantidade: ");
	 quantidade = sc.nextInt();
	 
	 if (codigo == 1) {
		 total = quantidade * 4.0;
	 }
	 else if(codigo == 2) {
		 total = quantidade * 4.5;
	 }
	 else if(codigo == 3) {
		 total = quantidade * 5;
	 }
	 else if(codigo == 4) {
		 total = quantidade * 2;
	 }
	 else {
		 total = quantidade * 1.5;
	 }
	 
	 System.out.printf("Total: R$ %.2f%n", total);
		
	 sc.close();
}
}
