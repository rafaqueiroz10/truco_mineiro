package br.trucomineiro;

public class Mao {
    private int valor;
    private TiposMao tipo;
    private Rodada[] rodadas;

    public Mao(int valor, TiposMao tipo, Rodada[] rodadas) {
        this.valor = valor;
        this.tipo = tipo;
        this.rodadas = rodadas;
    }

    public Mao(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public TiposMao getTipo() {
        return tipo;
    }

    public void setTipo(TiposMao tipo) {
        this.tipo = tipo;
    }

    public Rodada[] getRodadas() {
        return rodadas;
    }

    public void setRodadas(Rodada[] rodadas) {
        this.rodadas = rodadas;
    }
}