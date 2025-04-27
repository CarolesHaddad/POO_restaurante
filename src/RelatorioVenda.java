import java.util.Date;
import java.util.List;

public class RelatorioVenda {

    private int totalContasFechadas;
    private float faturamentoTotal;

    private float totalComissaoGarcom;

    private Date data;

    private List<Conta> listaDeContas;

    public RelatorioVenda(int totalContasFechadas, float faturamentoTotal, float totalComissaoGarcom, Date data, List<Conta> listaDeContas) {
        this.totalContasFechadas = totalContasFechadas;
        this.faturamentoTotal = faturamentoTotal;
        this.totalComissaoGarcom = totalComissaoGarcom;
        this.data = data;
        this.listaDeContas = listaDeContas;
    }

    public int getTotalContasFechadas() {
        return totalContasFechadas;
    }

    public void setTotalContasFechadas(int totalContasFechadas) {
        this.totalContasFechadas = totalContasFechadas;
    }

    public float getFaturamentoTotal() {
        return faturamentoTotal;
    }

    public void setFaturamentoTotal(float faturamentoTotal) {
        this.faturamentoTotal = faturamentoTotal;
    }

    public float getTotalComissaoGarcom() {
        return totalComissaoGarcom;
    }

    public void setTotalComissaoGarcom(float totalComissaoGarcom) {
        this.totalComissaoGarcom = totalComissaoGarcom;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Conta> getListaDeContas() {
        return listaDeContas;
    }

    public void setListaDeContas(List<Conta> listaDeContas) {
        this.listaDeContas = listaDeContas;
    }

    private String emitirRelatorioVendas() {
        return "";
    }
}
