public class Main {
    public static void main(String[] args) {
        
        System.out.println("--- Folha de Pagamento ---");

        // Crio Desenvolvedor (Salário base 3000)
        // A variável é do tipo 'Funcionario', o objeto é 'Desenvolvedor'
        Funcionario dev = new Desenvolvedor(3000.00);
        
        // Crio Suporte (Salário base 1500)
        Funcionario sup = new Suporte(1500.00);

        // Exibindo resultados
        // O Java sabe qual cálculo usar por causa do polimorfismo
        
        System.out.println("Cargo: Desenvolvedor");
        System.out.println("Base: R$ " + dev.getSalarioBase());
        System.out.println("Final (Base + 10%): R$ " + dev.calcularSalarioFinal());
        System.out.println("-----------------------------");

        System.out.println("Cargo: Suporte");
        System.out.println("Base: R$ " + sup.getSalarioBase());
        System.out.println("Final (Base + 200): R$ " + sup.calcularSalarioFinal());
    }
}