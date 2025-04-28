package model.funcionario;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioModel {
    private List<Funcionario> funcionarios;

    public FuncionarioModel() {
        this.funcionarios = new ArrayList<>();
    }

    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }

    public void demitirFuncionario(String matricula){
        funcionarios.removeIf(funcionario -> funcionario.getMatricula().equalsIgnoreCase(matricula));
    }
}