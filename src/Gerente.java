public class Gerente extends Funcionario {

    private String setorResponsavel;

    public Gerente(String nome, String endereco, String telefone, String cpf, String matricula, String turno, String setorResponsavel) {
        super(nome, endereco, telefone, cpf, matricula, turno);
        this.setorResponsavel = setorResponsavel;

    }

    public String getSetorResponsavel() {
        return setorResponsavel;
    }

    public void setSetorResponsavel(String setorResponsavel) {
        this.setorResponsavel = setorResponsavel;
    }
}
