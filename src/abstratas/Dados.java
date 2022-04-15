package abstratas;

import model.Cargo;
import model.Setor;
import model.Funcionario;
import java.util.LinkedList;

abstract public class Dados {
    private static LinkedList<Cargo> listaCargo = new LinkedList<>();
    private static LinkedList<Setor> listaSetor = new LinkedList<>();
    private static LinkedList<Funcionario> listaFuncionario = new LinkedList<>();
    //
    public static LinkedList<Cargo> getListaCargo() {
        return listaCargo;
    }
    public static LinkedList<Setor> getListaSetor() {
        return listaSetor;
    }
    public static LinkedList<Funcionario> getListaFuncionario() {
        return listaFuncionario;
    }
    
}