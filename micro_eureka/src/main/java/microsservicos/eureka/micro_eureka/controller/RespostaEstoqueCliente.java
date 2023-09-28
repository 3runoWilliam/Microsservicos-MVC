package microsservicos.eureka.micro_eureka.controller;

public class RespostaEstoqueCliente {
    private String estoque;
    private String cliente;
    private String vendas;

    public RespostaEstoqueCliente(String estoque, String cliente, String vendas) {
        this.estoque = estoque;
        this.cliente = cliente;
        this.vendas = vendas;
    }

    public String getEstoque() {
        return estoque;
    }

    public String getCliente() {
        return cliente;
    }

    public String getVendas() {
        return vendas;
    }
}
