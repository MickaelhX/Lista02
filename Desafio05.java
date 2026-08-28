package Lista02;

import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = teclado.nextInt();

        int divisor = 1;
        int quantidadeDivisores = 0;

        while (divisor <= numero) {

            if (numero % divisor == 0) {
                quantidadeDivisores++;
            }

            divisor++;
        }

        if (quantidadeDivisores == 2) {
            System.out.println("O número " + numero + " é primo.");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }
    }
}