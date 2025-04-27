public class Funcionario extends Pessoa {

    private String matricula;

    private String turno;

    public Funcionario(String nome, String endereco, String telefone, String cpf, String matricula, String turno) {
        super(nome, endereco, telefone, cpf);
        this.matricula = matricula;
        this.turno = turno;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
