public class Suporte extends Funcionario {

    public Suporte(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        // Salário Base + R$ 200,00 fixo
        return this.salarioBase + 200.00;
    }
}