package br.trucomineiro;

public enum NaipesCarta {
    COPAS("Copas"),
    OUROS("Ouros"),
    PAUS("Paus"),
    ESPADAS("Espadas");

    private final String nome;

    NaipesCarta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}