package Enum;

public enum Cargos {
    G("Gerente"),
    F("Fiscal"),
    O("Operador de Caixa"),
    R("Repositor");
    //
    private String descricao;
    //
    private Cargos(String descricao) {
        this.descricao = descricao;
    }
    //
    @Override
    public String toString() {
        return descricao;
    }
}