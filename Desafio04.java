package Lista02;

import java.util.Scanner;

public class Desafio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        // Nome
        do {
            System.out.println("Digite seu nome:");
            nome = teclado.nextLine();

            if (nome.length() <= 3) {
                System.out.println("Nome inválido! Digite um nome com mais de 3 caracteres.");
            }

        } while (nome.length() <= 3);

        // Idade
        do {
            System.out.println("Digite sua idade:");
            idade = teclado.nextInt();

            if (idade < 0 || idade > 150) {
                System.out.println("Idade inválida! Digite uma idade entre 0 e 150.");
            }

        } while (idade < 0 || idade > 150);

        // Salário
        do {
            System.out.println("Digite seu salário:");
            salario = teclado.nextDouble();

            if (salario <= 0) {
                System.out.println("Salário inválido! Digite um valor maior que zero.");
            }

        } while (salario <= 0);

        teclado.nextLine();

        // Sexo
        do {
            System.out.println("Digite seu sexo (f/m):");
            sexo = teclado.nextLine().toLowerCase();

            if (!sexo.equals("f") && !sexo.equals("m")) {
                System.out.println("Sexo inválido! Digite apenas 'f' ou 'm'.");
            }

        } while (!sexo.equals("f") && !sexo.equals("m"));

        // Estado civil
        do {
            System.out.println("Digite seu estado civil:");
            System.out.println("s = Solteiro");
            System.out.println("c = Casado");
            System.out.println("v = Viúvo");
            System.out.println("d = Divorciado");

            estadoCivil = teclado.nextLine().toLowerCase();

            if (!estadoCivil.equals("s") &&
                    !estadoCivil.equals("c") &&
                    !estadoCivil.equals("v") &&
                    !estadoCivil.equals("d")) {

                System.out.println("Estado civil inválido!");
            }

        } while (!estadoCivil.equals("s") &&
                !estadoCivil.equals("c") &&
                !estadoCivil.equals("v") &&
                !estadoCivil.equals("d"));

        System.out.println("\nDados cadastrados com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado civil: " + estadoCivil);
    }
}