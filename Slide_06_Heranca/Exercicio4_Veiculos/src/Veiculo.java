public class Veiculo {
    private String marca;
    private String modelo;

    // Construtor para facilitar o preenchimento
    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método que será sobrescrito depois
    public void exibirInfo() {
        System.out.println("Veículo: " + marca + " " + modelo);
    }

    // Getters (para as filhas acessarem se precisarem)
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
}