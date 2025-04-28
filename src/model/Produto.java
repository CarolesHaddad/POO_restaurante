package model;

public class Produto {

    private String categoria;

    private String idProduto;

    private float preco;

    private String nome;

    private int quantidadeEstoque;

    public Produto(String categoria, String idProduto, float preco, String nome, int quantidadeEstoque) {
        this.categoria = categoria;
        this.idProduto = idProduto;
        this.preco = preco;
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    private void cadastrarProduto() {

    }

    private void apagarProduto() {

    }

    private void atualizarQuantidade(int novaQuantidade) {

    }

    private Produto buscarProdutoPorId(String id) {
     return null;
    }

}
