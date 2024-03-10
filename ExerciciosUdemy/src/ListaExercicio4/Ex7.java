package ListaExercicio4;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê o número inteiro 'n' do usuário
        int n = sc.nextInt();
        
        // Loop de 1 até 'n'
        for (int i = 1; i <= n; i++) {
            // Calcula o primeiro, segundo e terceiro número para cada valor de 'i'
            int primeiro = i;
            int segundo = i * i; // Segundo número é o quadrado do primeiro
            int terceiro = i * i * i; // Terceiro número é o cubo do primeiro

            // Imprime os três números na mesma linha
            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
        }
        
        sc.close(); // Fecha o scanner
    }
}
