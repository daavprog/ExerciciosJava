public class Main {
    public static void main(String[] args) {
        
        // Crio os objetos independentes
        // O professor existe SEM a turma.
        Professor prof1 = new Professor("Samara Souza");
        Professor prof2 = new Professor("Girafales");
        
        // A turma existe SEM professor inicialmente.
        Turma turmaPOO = new Turma("BCC-2025");

        // Façi a Associação (Agregando). Onde eu defino pra a turma que "esse" vai ser o professor dela
        turmaPOO.setProfessor(prof1);
        
        // Exibo um resumoo
        System.out.println("Cenário 1:");
        turmaPOO.resumo();

        // Trocando o Professor
        // Isso prova que a Turma não é "dona" da vida do professor, ela apenas aponta para um novo.
        System.out.println("Cenário 2 (Troca de Professor):");
        turmaPOO.setProfessor(prof2);
        
        turmaPOO.resumo();
    }
}