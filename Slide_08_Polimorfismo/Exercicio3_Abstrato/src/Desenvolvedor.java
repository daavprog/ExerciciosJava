public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(double salarioBase) {
        super(salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        // Salário Base + 10%
        return this.salarioBase + (this.salarioBase * 0.10);
    }
}