package br.trucomineiro;

public interface IJogo {
    public int verificarVencedor();
    public void embaralharCartas();
    public void atualizarMao();
    public void iniciar();
    public void iniciarMao();
    public void verificarMao();
    public void encerrar();
    public void distribuirCartas();
    public void criarBaralho();
    public void criarEquipe();
}
