import java.util.List;

public class Garcom extends Funcionario {

    private List<Conta> contasResponsavel;

    public Garcom(String nome, String endereco, String telefone, String cpf, String matricula, String turno, List<Conta> contasResponsavel)
    {
        super(nome, endereco, telefone, cpf, matricula, turno);
        this.contasResponsavel = contasResponsavel;
    }

    public List<Conta> getContasResponsavel() {
        return contasResponsavel;
    }

    public void setContasResponsavel(List<Conta> contasResponsavel) {
        this.contasResponsavel = contasResponsavel;
    }
}
