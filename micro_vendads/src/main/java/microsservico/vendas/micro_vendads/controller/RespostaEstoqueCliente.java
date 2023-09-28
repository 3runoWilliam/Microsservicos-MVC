package microsservico.vendas.micro_vendads.controller;

public class RespostaEstoqueCliente {
    private String estoque;
    private String cliente;

    public RespostaEstoqueCliente(String estoque, String cliente) {
        this.estoque = estoque;
        this.cliente = cliente;
    }

    public String getEstoque() {
        return estoque;
    }

    public String getCliente() {
        return cliente;
    }
}
