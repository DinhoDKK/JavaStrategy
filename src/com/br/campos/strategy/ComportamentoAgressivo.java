package com.br.campos.strategy;

public class ComportamentoAgressivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se Agressivamente....");
    }
}
