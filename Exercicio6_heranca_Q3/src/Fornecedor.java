public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    // Construtor Padrão (necessário para o new Fornecedor() funcionar simples)
    public Fornecedor() {
        super(); // Chama o construtor da classe Pessoa
    }

    // Método solicitado no enunciado
    public double obterSaldo() {
        return this.valorCredito - this.valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
}