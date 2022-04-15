package model;

import enums.Sexos;
import java.time.LocalDate;

public class Funcionario implements java.io.Serializable{
    private String nome;
    private LocalDate nascimento;
    private double salario;
    private Sexos sexo;
    private Cargo cargo;

    public Funcionario() {
        this.setCargos(null);
        this.setNascimento(LocalDate.now());
        this.setNome("sem nome");
        this.setSalario(1212);
        this.setSexos(Sexos.O);
    }
    
    public Funcionario(String nome, LocalDate nascimento, double salario, Sexos sexo, Cargo cargo) {
        this.setNome(nome);
        this.setNascimento(nascimento);
        this.setSalario(salario);
        this.setSexos(sexo);
        this.setCargos(cargo);
    }

    public String getNome() {
        return this.nome;
    }

    public LocalDate getNascimento() {
        return this.nascimento;
    }

    public double getSalario() {
        return this.salario;
    }

    public Sexos getSexos() {
        return this.sexo;
    }

    public Cargo getCargos() {
        return this.cargo;
    }

    public void setNome(String nome) {
        this.nome = (nome.trim().isEmpty() ? "Sem nome" : nome);
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = (nascimento == null ? LocalDate.now() : nascimento);
    }

    public void setSalario(double salario) {
        this.salario = (salario <= 0 ? 1212 : salario);
    }

    public void setSexos(Sexos sexos) {
        this.sexo = sexos;
    }

    public void setCargos(Cargo cargos) {
        this.cargo = cargos != null ? cargos : new Cargo();
    }

    @Override
    public String toString() {
        return "FUNCIONÁRIO" + "\n" +  
               "Nome: " + nome + "\n" +
               "Nascimento: " + nascimento + "\n" +
               "Salario: " + salario + "\n" +
               "Sexos: " + sexo + "\n" +
               "cargos: " + cargo;
    }
}
