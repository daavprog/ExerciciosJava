public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int quantidadePortas) {
        super(marca, modelo); // Chama o construtor do Pai
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void exibirInfo() {
        // Aproveita o print do pai e adiciona o detalhe do carro
        super.exibirInfo(); 
        System.out.println("Tipo: Carro | Portas: " + quantidadePortas);
        System.out.println("-----------------------------");
    }
}