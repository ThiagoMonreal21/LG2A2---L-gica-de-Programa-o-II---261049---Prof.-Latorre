package com.company;

public class Main {

    public static void main(String[] args) {
        Sessao s = new Sessao();

        Ingresso i1 = new Ingresso(false);
        Ingresso i2 = new Ingresso(true);
        Ingresso i3 = new Ingresso(false);
        Ingresso i4 = new Ingresso(true);

        s.adicionar(i1);
        s.adicionar(i2);
        s.adicionar(i3);
        s.adicionar(i4);

        System.out.println(s.getIngressos());
        System.out.println(s.qntIngressos());
        System.out.println(s.qntMeiaEntradas());
        System.out.println(s.totalFaturado());
    }
}
