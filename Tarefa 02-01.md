# LG2A2---L-gica-de-Programa-o-II---261049---Prof.-Latorre

import java.util.Random;
import java.util.Scanner;

public class Tarefa_01 {

    public static void main (String [] args) {
        Entrada do scanner = novo Scanner (System.in);

        Duplo x, y;
        String op;

        System.out.println ("Qual a operação você deseja realizar?");
        op = input.nextLine ();

        System.out.println ("Entre com o primeiro número:");
        x = input.nextDouble ();

        System.out.println ("Entre com o segundo número:");
        y = input.nextDouble ();

        if (op.equals ("soma")) {
            soma (x, y);
        } else if (op.equals ("subtração")) {
           sub (x, y);
        } else if (op.equals ("multiplicação")) {
            multi (x, y);
        } else if (op.equals ("divisão")) {
            div (x, y);
        }outro{
            System.out.println ("Nenhuma opção válida solicitada.");
        }

    }

    soma vazio estático (duplo num1, duplo num2) {
        System.out.println ("O resultado da soma é:");
        System.out.println (num1 + num2);
    }
    estático vazio sub (duplo num1, duplo num2) {
        System.out.println ("O resultado da subtração é:");
        System.out.println (num1-num2);
    }
    static void multi (double num1, double num2) {
        System.out.println ("O resultado da multiplicação é:");
        System.out.println (num1 * num2);
    }
    static void div (double num1, double num2) {
        System.out.println ("O resultado da divisão é:");
        System.out.println (num1 / num2);
    }
}
