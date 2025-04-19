package com.anderson.triplyzer.dto.response;

public class ValorPassagemDTO {
    private double valorNormal;
    private double valorMilhas;

    public ValorPassagemDTO(double valorNormal, double valorMilhas) {
        this.valorNormal = valorNormal;
        this.valorMilhas = valorMilhas;
    }
    public double getValorNormal() {
        return valorNormal;
    }
    public void setValorNormal(double valorNormal) {
        this.valorNormal = valorNormal;
    }
    public double getValorMilhas() {
        return valorMilhas;
    }
    public void setValorMilhas(double valorMilhas) {
        this.valorMilhas = valorMilhas;
    }
}
