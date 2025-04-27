public class ItemConta {

    private Produto produto;
    private int quantidade;

    private float subtotal;

    public ItemConta(Produto produto, int quantidade, float subtotal) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.subtotal = subtotal;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    private void calcularSubtotal() {

    }
}
