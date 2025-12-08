public abstract class Funcionario {
    
    // O 'protected' serve para que as classes filhas consigam acessar 
    // essa variável diretamente sem precisar de getSalarioBase
    protected double salarioBase;

    public Funcionario(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Eu OBRIGO as filhas a implementarem isso.
    // Não se sabe como calcula, mas eu sei que ele deve existir e retornar um double.
    public abstract double calcularSalarioFinal();
    
    // Getter para usar no Main
    public double getSalarioBase() {
        return salarioBase;
    }
}