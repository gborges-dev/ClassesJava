package controller;

import abstratas.Dados;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Funcionario;

public class daoFuncionario {
    public int create(Funcionario funcionario) throws SQLException{
        String SQL = "insert into funcionario(nome, nascimento, salario, sexos, cargos) values (?,?,?,?,?)";
        PreparedStatement pst = Dados.getConnection().prepareStatement(SQL);
        pst.setObject(1, funcionario.getNome());
        pst.setObject(2, funcionario.getNascimento());
        pst.setObject(3, funcionario.getSalario());
        pst.setObject(4, funcionario.getSexos().name());
        pst.setObject(5, funcionario.getCargos().name());
    }
}
