package Model;

import Enum.Setores;

public class Cargo implements java.io.Serializable{
    private String nome;
    private String descricao;
    private Setores setor;

    public Cargo() {
        this.setNome("Sem nome");
        this.setDescricao("Sem descrição");
        this.setSetor(Setores.L);
    }

    public Cargo(String nome, String descricao, Setores setor) {
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

    public Setores getSetor() {
        return this.setor;
    }

    public void setNome(String nome) {
        this.nome = (nome.trim().isEmpty() ? "Sem nome" : nome);
    }

    public void setDescricao(String descricao) {
        this.descricao = (descricao.trim().isEmpty() ? "Sem descrição" : descricao);
    }

    public void setSetor(Setores setor) {
        this.setor = setor;
    }
    @Override
    public String toString() {
        return "CARGO" + "\n" +  
               "Nome: " + nome + "\n" +
               "Descrição: " + descricao + "\n" +
               "Setor: " + setor;
    }
}
