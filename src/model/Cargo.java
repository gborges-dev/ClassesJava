package model;

public class Cargo implements java.io.Serializable{
    private String nome;
    private String descricao;
    private Setor setor;

    public Cargo() {
        this.setNome("Sem nome");
        this.setDescricao("Sem descrição");
        this.setSetor(null);
    }

    public Cargo(String nome, String descricao, Setor setor) {
        this.setNome(nome);
        this.setDescricao(descricao);
        this.setSetor(setor);
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public Setor getSetor() {
        return this.setor;
    }

    public void setNome(String nome) {
        this.nome = (nome.trim().isEmpty() ? "Sem nome" : nome);
    }

    public void setDescricao(String descricao) {
        this.descricao = (descricao.trim().isEmpty() ? "Sem descrição" : descricao);
    }

    public void setSetor(Setor setor) {
        this.setor = setor != null ? setor : new Setor();
    }
    @Override
    public String toString() {
        return "CARGO" + "\n" +  
               "Nome: " + nome + "\n" +
               "Descrição: " + descricao + "\n" +
               "Setor: " + setor;
    }
}
