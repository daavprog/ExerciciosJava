public class Turma {
    private String codigo;
    private Professor professor; // Aqui ocorre a Agregação, pois tem uma classe dentro da outra

    // Construtor: A Turma nasce com um código, mas o professor pode ser definido depois
    public Turma(String codigo) {
        this.codigo = codigo;
    }

    // Método pedido no slide: Define quem é o professor dessa turma
    public void setProfessor(Professor p) {
        this.professor = p;
    }

    // Método pedido no slide: Mostra os dados
    public void resumo() {
        System.out.println("--- Turma ---");
        System.out.println("Código da Turma: " + this.codigo);
        
        // Aqui eu faço uma verificação de segurança
        if (this.professor != null) {
            System.out.println("Professor responsável: " + this.professor.getNome());
        } else {
            System.out.println("Professor responsável: [Nenhum professor associado]");
        }
        System.out.println("-----------------------");
    }
}