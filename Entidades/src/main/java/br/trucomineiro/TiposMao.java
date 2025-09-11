package br.trucomineiro;

public enum TiposMao {
    MAO_NORMAL("normal"),
    MAO_DE_10("10"),
    MAO_DE_FERRO("ferro");

    private String descricao;

    TiposMao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}