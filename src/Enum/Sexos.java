package Enum;

public enum Sexos {
    M("Masculino"),
    F("Feminino"),
    O("Outros");
    
    private String descricao;
    
    private Sexos(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString() {
        return descricao;
    } 
}
