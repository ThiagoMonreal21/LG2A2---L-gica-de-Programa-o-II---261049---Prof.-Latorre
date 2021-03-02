package com.company;

public class Ingresso {
    private double valor;
    private boolean meia;

    public Ingresso (boolean meia){
        this.valor = 10;
        this.meia = meia;
        if(meia==true){
            this.valor=valor/2;
        }
    }

    public double getValor(){
        return valor;
    }

    public boolean isMeia() {
        return meia;
    }

    public String toString(){
        return "Ingresso {" + "Valor= " + valor + " Meia = " + meia + "}";
    }
}
