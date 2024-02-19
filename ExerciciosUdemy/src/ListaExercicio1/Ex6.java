package ListaExercicio1;

//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double a,b,c, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println("Valor A: ");
		a = sc.nextDouble();
		
		System.out.println("Valor B: ");
		b = sc.nextDouble();
		
		System.out.println("Valor c: ");
		c = sc.nextDouble();
		
		triangulo = (a*c)/2;
		System.out.println("Triângulo: "+triangulo);
		
		circulo = Math.PI * c * c;
		System.out.printf("Cículo:%.4f%n",circulo);
		
		trapezio = ((a + b) * c) / 2;
		System.out.println("Trapézio: "+trapezio);
		
		quadrado =  Math.pow(b, 2);
		System.out.println("Quadrado: "+quadrado);
		
		retangulo = a * b;
		System.out.println("Retângulo: "+retangulo);
		
		sc.close();
		
		
	}

}
