package Lista02;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos números você deseja inserir?");
        int n = teclado.nextInt();

        int contador = 1;
        int menor = 0;
        int maior = 0;
        int soma = 0;

        while (contador <= n) {

            System.out.println("Digite o " + contador + "º número:");
            int numero = teclado.nextInt();

            soma += numero;

            if (contador == 1) {
                menor = numero;
                maior = numero;
            } else {
                if (numero < menor) {
                    menor = numero;
                }

                if (numero > maior) {
                    maior = numero;
                }
            }

            contador++;
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);
    }
}