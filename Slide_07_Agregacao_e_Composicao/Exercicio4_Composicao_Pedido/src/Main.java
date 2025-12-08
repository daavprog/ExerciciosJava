public class Main {
    public static void main(String[] args) {
        
        // Crio o Pedido
        Pedido meuPedido = new Pedido();

        // Adiciono itens (Composição)
        // Eu não dou um "new ItemPedido()" aqui fora, porque mando os dados para o Pedido e ELE cria o item lá dentro.
        System.out.println("--- Criando Pedido ---");
        meuPedido.adicionarItem("Teclado Mecânico", 2, 150.00); // 2 * 150 = 300
        meuPedido.adicionarItem("Mouse Gamer", 1, 80.00);       // 1 * 80  = 80

        // Exibo o total dos valores dos itens
        System.out.println("----------------------");
        System.out.println("Valor Total do Pedido: R$ " + meuPedido.obterValorTotal());
        System.out.println("----------------------");

    }
}