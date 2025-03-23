package sptech.school;

public class Loja {

    private Integer pedidosRealizados = 0;
    private Integer descontosAplicados = 0;
    private Integer pedidosCancelados = 0;

    public void aplicarPromocao(Pedido pedido) {
        pedido.promocional();
    }

    public void cancelarPedido(Pedido pedido) {
        pedido.cancelar();
        this.pedidosCancelados++;
    }

    public void aplicarDesconto(Pedido pedido, Integer porcentagem) {
        if(pedido.getItemPromocional()) {
            Double valorAtual = pedido.getValorUnitario();
            Double novoValor = valorAtual * (1 - porcentagem * 0.01);
            pedido.setValorComDesconto(novoValor);
            this.descontosAplicados++;
            System.out.printf("Foi aplicado %d por cento de desconto ao pedido de código %d\n\n", porcentagem, pedido.getCodigo());
        } else {
            System.out.print("Pedido não elegível para desconto, operação não finalizada.\n\n");
        }
    }

    public void finalizarPedido(Pedido pedido) {
        String promocao = "NÃO";
        Double total = pedido.calcularValorTotal();

        if(pedido.getItemPromocional()) {
            promocao = "SIM";
            total = pedido.calcularValorTotalDesconto();
        }

        System.out.println(total);

        if(!pedido.getCancelado()) {
            if(promocao == "SIM") {
                System.out.printf("------------------------- PEDIDO ------------------------- \n Código: %d\n Item: %s\n Valor unitário: R$%.2f\n Quantidade: %d\n Valor Total: R$%.2f\n\n Item promocional: %s\n Valor com desconto: R$%.2f\n\n TOTAL A SER PAGO: R$%.2f\n\n", pedido.getCodigo(), pedido.getProduto(), pedido.getValorUnitario(), pedido.getQuantidade(), total, promocao, pedido.getValorComDesconto(), total);
            } else {
                System.out.printf("------------------------- PEDIDO ------------------------- \n Código: %d\n Item: %s\n Valor unitário: R$%.2f\n Quantidade: %d\n Valor Total: R$%.2f\n\n Item promocional: %s\n\n TOTAL A SER PAGO: R$%.2f\n\n", pedido.getCodigo(), pedido.getProduto(), pedido.getValorUnitario(), pedido.getQuantidade(), total, promocao, total);
            }
            this.pedidosRealizados++;
        } else {
            System.out.println("PEDIDO CANCELADO, NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO\n\n");
        }
    }

    public void exibirRelatorio() {
        System.out.printf("------------------------- Relatório ------------------------- \n Pedidos realizados: %d\n Descontos aplicados: %d\n Pedidos cancelados: %d\n\n", this.pedidosRealizados, this.descontosAplicados, this.pedidosCancelados);
    }
}
