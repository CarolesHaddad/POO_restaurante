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
