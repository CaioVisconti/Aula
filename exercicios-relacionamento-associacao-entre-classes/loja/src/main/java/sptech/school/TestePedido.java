package sptech.school;

public class TestePedido {
    public static void main(String[] args) {

        Pedido primeiro = new Pedido(1, "Leite", 4, 5.5, 5.0, false, false);
        Pedido segundo = new Pedido(2, "Nescau", 2, 12.1, 11.5, true, false);
        Pedido terceiro = new Pedido(4, "Toddy", 1, 21.99, 19.1, false, true);

        Loja mercado = new Loja();

        mercado.cancelarPedido(primeiro);
        mercado.aplicarPromocao(segundo);
        mercado.aplicarDesconto(segundo, 20);
        mercado.aplicarDesconto(terceiro, 11);
        mercado.finalizarPedido(primeiro);
        mercado.finalizarPedido(segundo);
        mercado.finalizarPedido(terceiro);
        mercado.exibirRelatorio();
    }
}