public class Professor {
    private String nome;

    // Construtor para facilitar (não ter que ficar dando setNome toda hora)
    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}