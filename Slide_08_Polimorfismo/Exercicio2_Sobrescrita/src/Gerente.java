public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public double calcularSalario() {
        // Regra do enunciado: Salário base + 500
        // Uso o super.calcularSalario() para pegar os 1500.00 da classe mãe
        return super.calcularSalario() + 500.00;
    }
}