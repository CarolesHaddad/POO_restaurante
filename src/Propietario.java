import java.util.Date;

public class Propietario extends Pessoa {

    private Date dataAquisicao;

    public Propietario(String nome, String endereco, String telefone, String cpf, Date dataAquisicao) {
        super(nome, endereco, telefone, cpf);
        this.dataAquisicao = dataAquisicao;
    }

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }
}
