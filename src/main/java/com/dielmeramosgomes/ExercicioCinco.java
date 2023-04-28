package com.dielmeramosgomes;

import java.util.ArrayList;

public class ExercicioCinco {
    /*5) Escreva um programa que inverta os caracteres de um string.
IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente
definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse;*/

    public static String inverteCaracteres(String str) {
        String aux;
        var lista = new ArrayList<String>();
        for (int i = str.length()-1; i >= 0; i--) {
            lista.add(String.valueOf(str.charAt(i)));
        }
        aux = lista.toString();
        return aux;
    }

}
