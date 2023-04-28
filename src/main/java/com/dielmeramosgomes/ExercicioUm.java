package com.dielmeramosgomes;

public class ExercicioUm {

    /*
1) Observe o trecho de código abaixo:
int INDICE = 13, SOMA = 0, K = 0;
enquanto K < INDICE faça
{
K = K + 1;
SOMA = SOMA + K;
}
imprimir(SOMA);
Ao final do processamento, qual será o valor da variável SOMA?
    RESPOSTA : SOMA = 91
    */

    public static String exercicioUm(int indice, int soma, int k) {
        while (k < indice) {
            k += 1;
            soma += k;
        }
        return "Soma = " + soma;
    }


}
