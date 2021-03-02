package com.company;

import java.util.ArrayList;
import java.util.List;

public class Sessao implements SessaoInterface {
    private List<Ingresso> ingressos;

    public Sessao (){
        this.ingressos = new ArrayList<>();
    }

    public void adicionar(Ingresso ingresso){
        ingressos.add(ingresso);
    }

    public int qntIngressos(){
        return ingressos.size();
    }

    @Override
    public int qntMeiaEntradas() {
        int contador = 0;
        for (Ingresso i : ingressos) {
            if(i.isMeia()==true) {
                contador++;
            }
        }
        return contador;
    }

    public double totalFaturado(){
        double total=0;
        /*for(i=0; i < ingressos.size; i++){*/
        for (Ingresso i : ingressos){
            total = total + i.getValor();
        }
        return total;
    }

    public List<Ingresso> getIngressos(){
        return ingressos;
    }

    public String toString() {
        return "Sessao (" + "ingresso =" + ingressos + ")";
    }
}
