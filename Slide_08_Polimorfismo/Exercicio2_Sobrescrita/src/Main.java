public class Main {
    public static void main(String[] args) {
        
        // Crio o Array (Lista de Pagamento)
        // O array é do tipo genérico 'Funcionario', mas vai guardar filhos diferentes.
        Funcionario[] folhaPagamento = new Funcionario[3];

        // Preenchendo com tipos específicos (Upcasting)
        // Funcionario comum
        folhaPagamento[0] = new Funcionario("João Silva", "111.111.111-11");
        
        // Gerente (Polimorfismo)
        folhaPagamento[1] = new Gerente("Maria Souza", "222.222.222-22");
        
        // Programador (Polimorfismo)
        folhaPagamento[2] = new Programador("Carlos Ribeiro", "333.333.333-33");

        System.out.println("--- Folha de Pagamento ---");

        // Percorro o array
        // O Java decide qual 'calcularSalario' chamar na hora, se diferenciando pelo objeto.
        for (Funcionario f : folhaPagamento) {
            System.out.println("Funcionário: " + f.getNome());
            System.out.println("Salário a receber: R$ " + f.calcularSalario());
            System.out.println("--------------------------");
        }
    }
}