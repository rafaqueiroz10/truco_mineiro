package br.trucomineiro;

public class Usuario {
    private final int id;
    private String nome;
    private long senha;

    public Usuario(int id, String nome, long senha) {
        this.id = id;
        this.senha = senha;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public long getSenha() {
        return senha;
    }

    public void setSenha(long senha) {
        this.senha = senha;
    }
}