public class TesteVeiculos {
    public static void main(String[] args) {
        // Crio um ARRAY de Veiculos (Polimorfismo)
        // O array é do tipo genérico, mas aceita os filhos
        Veiculo[] garagem = new Veiculo[3];

        garagem[0] = new Carro("Toyota", "Corolla", 4);
        garagem[1] = new Moto("Honda", "CB 500", 500);
        garagem[2] = new Carro("Fiat", "Uno", 2);

        for (Veiculo v : garagem) {
            v.exibirInfo();
        }
    }
}