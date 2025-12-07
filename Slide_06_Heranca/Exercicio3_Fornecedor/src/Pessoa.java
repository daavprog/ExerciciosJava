public class Pessoa {
    // Atributos privados (encapsulados)
    private String nome;
    private String endereco;
    private String telefone;

    // Construtor Padrão (Vazio)
    // Obrigatório pelo enunciado
    public Pessoa() {
    }

// Construtor 2: Cadastro Rápido (Só Nome e Telefone)
    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    // Construtor 3: Cadastro Completo
    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public String toString() {
        return "Dados: " + nome + " | " + endereco + " | " + telefone;
    }
}