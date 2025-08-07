package br.trucomineiro;

public class Carta {
    private final int valor;
    private final String naipe;

    Carta(int valor, String naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public int getValor() {
        return valor;
    }

    public String getNaipe() {
        return naipe;
    }
}
