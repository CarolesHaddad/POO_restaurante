package view;

import model.funcionario.Funcionario;

import java.util.List;

public class FuncionarioView {

    public void displayFuncionarios(List<Funcionario> funcionarios) {
        System.out.println("Lista de Funcionarios:");
        for (int i = 0; i < funcionarios.size(); i++) {
            Funcionario funcionario = funcionarios.get(i);
            System.out.println(i + ": " + funcionario.getNome() + " / " + funcionario.getCpf() + " / " +
                    funcionario.getTelefone() + " / " + funcionario.getEndereco() + " / " +
                    funcionario.getMatricula() + " / " + funcionario.getTurno());
        }
        System.out.println();
    }

    public void showFuncionarioCadastrado(String nome) {
        System.out.println("Funcionario " + nome + " cadastrado com sucesso.");
    }

    public void showFuncionarioDemitido(String matricula) {
        System.out.println("Funcionario com a matrícula " + matricula + " demitido");
    }

    public void showInvalidOption() {
        System.out.println("Opção inválida.");
    }
}