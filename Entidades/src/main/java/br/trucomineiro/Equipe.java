package br.trucomineiro;

public class Equipe {
    private final long id;
    private long pontos;
    private Jogador[] jogadores;

    public Equipe(long id, long pontos) {
        this.pontos = pontos;
        this.id = id;
    }

    public long getPontos() {
        return pontos;
    }

    public void setPontos(long pontos) {
        this.pontos = pontos;
    }

    public long getId() {
        return id;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
