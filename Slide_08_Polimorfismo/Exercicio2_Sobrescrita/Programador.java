public class Programador extends Funcionario {

    public Programador(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public double calcularSalario() {
        // Regra do enunciado: Salário base + 20%
        double salarioBase = super.calcularSalario();
        return salarioBase + (salarioBase * 0.20);
    }
}