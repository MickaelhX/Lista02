package Lista02;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String continuar = "s";

        while (continuar.equals("s")) {

            System.out.println("Digite o primeiro número:");
            int numero1 = teclado.nextInt();

            System.out.println("Digite o segundo número:");
            int numero2 = teclado.nextInt();

            int soma = numero1 + numero2;

            System.out.println("Resultado: " + soma);

            System.out.println("Deseja fazer outra conta? (s/n)");
            continuar = teclado.next();
        }
    }
}