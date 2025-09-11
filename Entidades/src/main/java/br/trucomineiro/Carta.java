package br.trucomineiro;

public class Carta {
    private final int id;

    // recomendado: usar enum
    private final int valor;

    // recomendado: usar enum
    private final String naipe;

    public Carta(int id, int valor, String naipe) {
        this.valor = valor;
        this.naipe = naipe;
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public String getNaipe() {
        return naipe;
    }
}