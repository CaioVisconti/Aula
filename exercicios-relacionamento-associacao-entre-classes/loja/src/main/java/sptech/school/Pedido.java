package sptech.school;

public class Pedido {
    private Integer codigo;
    private String produto;
    private Integer quantidade;
    private Double valorUnitario;
    private Double valorComDesconto;
    private Boolean itemPromocional;
    private Boolean cancelado;

    public Pedido(Integer codigo, String produto, Integer quantidade, Double valorUnitario, Double valorComDesconto, Boolean itemPromocional,Boolean cancelado) {
        this.codigo = codigo;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.valorComDesconto = valorComDesconto;
        this.itemPromocional = itemPromocional;
        this.cancelado = cancelado;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getProduto() {
        return produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public Double getValorComDesconto() {
        return valorComDesconto;
    }

    public void setValorComDesconto(Double valorComDesconto) {
        this.valorComDesconto = valorComDesconto;
    }

    public Boolean getItemPromocional() {
        return itemPromocional;
    }

    public void promocional() {
        this.itemPromocional = true;
    }

    public Boolean getCancelado() {
        return cancelado;
    }

    public void cancelar() {
        this.cancelado = true;
    }

    public Double calcularValorTotal() {
        Double total = this.valorUnitario * this.quantidade;
        return total;
    }

    public Double calcularValorTotalDesconto() {
        Double total = this.valorComDesconto * this.quantidade;
        return total;
    }
}
