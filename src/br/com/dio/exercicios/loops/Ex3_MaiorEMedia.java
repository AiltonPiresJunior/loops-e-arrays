package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;

        while(count<5){
            System.out.println("Insira um número: ");
            numero = scan.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            soma += numero;
            count ++;
        }

        System.out.println("O maior numero é: " + maior);
        System.out.println("A média é: " + (soma/5));

    }
}
