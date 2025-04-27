import java.util.Date;
import java.util.List;

public class Conta {

    private int mesa;
    private Garcom garcomResponsavel;

    private Date data;

    private String horarioAbertura;

    private String horarioFechamento;

    private String idConta;

    private List<ItemConta> itensConta;

    private float total;

    private String metodoPagamento;

    private String situacaoConta;

    private void abrirConta() {

    }

    public Conta(int mesa, Garcom garcomResponsavel, Date data, String horarioAbertura, String horarioFechamento, String idConta, List<ItemConta> itensConta, float total, String metodoPagamento, String situacaoConta) {
        this.mesa = mesa;
        this.garcomResponsavel = garcomResponsavel;
        this.data = data;
        this.horarioAbertura = horarioAbertura;
        this.horarioFechamento = horarioFechamento;
        this.idConta = idConta;
        this.itensConta = itensConta;
        this.total = total;
        this.metodoPagamento = metodoPagamento;
        this.situacaoConta = situacaoConta;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public Garcom getGarcomResponsavel() {
        return garcomResponsavel;
    }

    public void setGarcomResponsavel(Garcom garcomResponsavel) {
        this.garcomResponsavel = garcomResponsavel;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHorarioAbertura() {
        return horarioAbertura;
    }

    public void setHorarioAbertura(String horarioAbertura) {
        this.horarioAbertura = horarioAbertura;
    }

    public String getHorarioFechamento() {
        return horarioFechamento;
    }

    public void setHorarioFechamento(String horarioFechamento) {
        this.horarioFechamento = horarioFechamento;
    }

    public String getIdConta() {
        return idConta;
    }

    public void setIdConta(String idConta) {
        this.idConta = idConta;
    }

    public List<ItemConta> getItensConta() {
        return itensConta;
    }

    public void setItensConta(List<ItemConta> itensConta) {
        this.itensConta = itensConta;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String getSituacaoConta() {
        return situacaoConta;
    }

    public void setSituacaoConta(String situacaoConta) {
        this.situacaoConta = situacaoConta;
    }

    private void associarProdutoConta(Produto produto, int quantidade) {

    }

    private String cancelarConta() {

        return " ";
    }

    private String fecharConta() {
        return " ";
    }

    private void calcularComissaoGarcom(Garcom garcom) {

    }


}
