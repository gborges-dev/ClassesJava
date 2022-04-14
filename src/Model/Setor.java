package Model;

public class Setor implements java.io.Serializable{
    private String nome;

    public Setor() {
        this.nome = "Sem nome";
    }

    public Setor(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = (nome.trim().isEmpty() ? "Sem nome" : nome);
    }

    @Override
    public String toString() {
        return "SETOR" + "\n" +
                "Nome: " + nome + "\n";
    }
    
    
}
