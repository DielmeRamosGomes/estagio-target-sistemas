package com.dielmeramosgomes;

import java.util.ArrayList;

public class ExercicioDois {

    /*
    2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2
     valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que
      desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando
       se o número informado pertence ou não a sequência.
    */

    public static String numeroPertenceFibonacci(int numero) {
        var lista = new ArrayList<Integer>();
        int soma = 0;
        lista.add(0);
        lista.add(1);
        for (int i = 1; i <= numero && soma <= numero; i++) {
            soma = lista.get(i-1) + lista.get(i);
            lista.add(soma);
        }
        System.out.println("Lista: "+ lista);
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(numero)) {
                return "O numero " + numero + " pertence a sequência de Fibonacci";
            }
        }
        return "O numero não pertence a sequência de Fibonacci";


    }

}
