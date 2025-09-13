package br.trucomineiro;

public enum ValoresCarta {
    DOIS("Dois"),
    TRES("Três"),
    QUATRO ("Quatro"),
    CINCO("Cinco"),
    SEIS("Seis"),
    SETE("Sete"),
    VALETE("Valete"),
    RAINHA("Rainha"),
    REI("Rei"),
    AS("As");

    private final String valor;

    ValoresCarta(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
