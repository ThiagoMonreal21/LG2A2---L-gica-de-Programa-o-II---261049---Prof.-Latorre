# LG2A2---L-gica-de-Programa-o-II---261049---Prof.-Latorre

import java.util.Arrays;
import java.util.Scanner;

public class Tarefa_2 {

    public static void main (String [] args) {

        double valores [] = novo double [4];
        Entrada do scanner = novo Scanner (System.in);

            para (int i = 0; i <valores.length; i ++) {
                System.out.println ("Digite o" + (i + 1) + "valor:");
                valores [i] = input.nextDouble ();
            }

            Conjunto de cordas = conjunto (valores);
            mídia dupla = mídia (valores);
            double maior = maior (valores);
            duplo menor = menor (valores);

            System.out.println ("Conjunto:" + conjunto);
            System.out.println ("Média:" + mídia);
            System.out.println ("Maior valor:" + maior);
            System.out.println ("Menor valor:" + menor);
    }

    Conjunto de strings estáticas (double x []) {

        String r;

        r = Arrays.toString (x);

        return r;
    }
    mídia dupla estática (double x []) {

        soma duplo = 0, r;

        para (int i = 0; i <x.length; i ++) {
            soma = (soma + x [i]);
        }
        r = (soma / comprimento x);

        return r;
    }
    estático duplo maior (double x []) {
        duplo maior = 0, r;

        para (int i = 0; i <x.length; i ++) {
            if (maior <x [i]) {
                maior = x [i];
            }
        }
        r = maior;

        return r;
    }
    duplo menor estático (duplo x []) {
        duplo menor = x [0], r;

        para (int i = 0; i <x.length; i ++) {
            if (menor> x [i]) {
                menor = x [i];
            }
        }
        r = menor;

        return r;
    }
}
