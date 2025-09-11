package br.trucomineiro;

public class Carta {
    private final int id;
    private final ValoresCarta valor;
    private final NaipesCarta naipe;

    public Carta(int id, ValoresCarta valor, NaipesCarta naipe) {
        this.valor = valor;
        this.naipe = naipe;
        this.id = id;
    }

    public ValoresCarta getValor() {
        return valor;
    }

    public NaipesCarta getNaipe() {
        return naipe;
    }
}