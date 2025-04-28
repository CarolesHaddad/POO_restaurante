package controller;

import view.FuncionarioView;
import model.funcionario.Funcionario;
import model.funcionario.FuncionarioModel;

public class FuncionarioController {

    private FuncionarioModel funcionarioModel;
    private FuncionarioView funcionarioView;

    public FuncionarioController(FuncionarioModel funcionarioModel, FuncionarioView funcionarioView) {
        this.funcionarioModel = funcionarioModel;
        this.funcionarioView = funcionarioView;
    }

    public void addFuncionario(String nome, String endereco, String telefone, String cpf, String matricula, String turno) {
        Funcionario funcionario = new Funcionario(nome ,endereco, telefone, cpf, matricula, turno);
        funcionarioModel.addFuncionario(funcionario);
        funcionarioView.showFuncionarioCadastrado(nome);

    }

    public void demitirFuncionario(String matricula) {
        funcionarioModel.demitirFuncionario(matricula);
        funcionarioView.showFuncionarioDemitido(matricula);
    }

    public void listarFuncionarios() {
        funcionarioView.displayFuncionarios(funcionarioModel.listarFuncionarios());
    }


}
