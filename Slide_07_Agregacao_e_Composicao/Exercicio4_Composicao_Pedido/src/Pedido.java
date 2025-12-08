import java.util.ArrayList;
import java.util.List;

public class Pedido {

    // Aqui vamos ter uma classe interna "itemPedido"(Inner Class)
    // Fazemos ela 'private' para garantir a COMPOSIÇÃO: Ninguém de fora pode criar um Item solto.
    // Só o Pedido pode criar seus próprios itens.
    private class ItemPedido {
        private String nomeProduto;
        private int quantidade;
        private double precoUnitario;

        // Construtor do Item
        public ItemPedido(String nome, int qtd, double preco) {
            this.nomeProduto = nome;
            this.quantidade = qtd;
            this.precoUnitario = preco;
        }

        // Método que calcula o subtotal (qtd * preço) 
        public double getSubtotal() {
            return this.quantidade * this.precoUnitario;
        }
    }

    // Atributos do Pedido
    // Uma lista para guardar os itens
    private List<ItemPedido> listaDeItens;

    // Construtor do Pedido
    public Pedido() {
        // Inicializa a lista vazia quando cria o pedido
        this.listaDeItens = new ArrayList<>();
    }

    // Crio o método "adicionarItem", que recebe os dados soltos e cria o objeto "ItemPedido" AQUI DENTRO.
    // Isso caracteriza uma Composição Forte.
    public void adicionarItem(String nome, int qtd, double preco) {
        ItemPedido novoItem = new ItemPedido(nome, qtd, preco);
        this.listaDeItens.add(novoItem);
        System.out.println("Item adicionado: " + nome);
    }

    // Crio o método "valorTotal" que vai percorrer toda a lista somando tudo
    public double obterValorTotal() {
        double total = 0;

        // Loop "For Each", para cada item na listaDeItens... some
        for (ItemPedido item : this.listaDeItens) {
            total += item.getSubtotal();
        }

        return total;
    }
}