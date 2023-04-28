package com.dielmeramosgomes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Exercicio Um
        //System.out.println(ExercicioUm.exercicioUm(13, 0, 0));

        /* Exercicio Dois
        Scanner ler = new Scanner(System.in);
        int numero;
        System.out.print("Digite um numero: ");
        numero = ler.nextInt();
        System.out.println(ExercicioDois.numeroPertenceFibonacci(numero)); */

        // Exercício Cinco
        Scanner ler = new Scanner(System.in);
        String str;
        System.out.print("Digite uma string: ");
        str = ler.next();
        System.out.println(ExercicioCinco.inverteCaracteres(str));
    }
}