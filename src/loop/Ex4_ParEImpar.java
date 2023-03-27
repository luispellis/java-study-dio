package loop;

import java.util.Scanner;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
 */
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        Declarando variáveis!
         */
        int numero;
        int quantNumeros;
        int quantPares = 0, quantImpares = 0;

        /*
        Pedindo ao usuário para inserir um número!
         */
        System.out.println(" Quantidade de números: ");
        quantNumeros = scan.nextInt();


        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        } while(count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impares: " + quantImpares);

    }

}
