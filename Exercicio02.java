package Lista02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um numero");
        int limite = teclado.nextInt();

        int numero = 0;
        while (numero <= limite ) {
            System.out.println(numero);
            numero++;
        }
    }
}