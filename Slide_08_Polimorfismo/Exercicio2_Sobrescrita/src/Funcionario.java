public class Funcionario {
    private String nome;
    private String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Método base que retorna o valor fixo pedido no enunciado
    public double calcularSalario() {
        return 1500.00;
    }

    // Getters para exibir no Main depois
    public String getNome() {
        return nome;
    }
}