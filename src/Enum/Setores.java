package Enum;

public enum Setores {
    A("Administração"),
    F("Frente de Caixa"),
    L("Loja");
    //
    private String descricao;
    //
    private Setores(String descricao) {
        this.descricao = descricao;
    }
    //
    @Override
    public String toString() {
        return descricao;
    }
 }