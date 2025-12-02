public class Main {
    
    public static void main(String[] args) {
        // Teste 1: Construtor Padrão (Vazio)
        Pessoa p1 = new Pessoa();
        p1.setNome("Ana Silva"); // Usando Setter
        
        // Teste 2: Construtor "Rápido" (Nome e Telefone)
        Pessoa p2 = new Pessoa("Davy Melo", "(91) 99999-0000");
        
        // Teste 3: Construtor Completo
        Pessoa p3 = new Pessoa("Pedro Henrique", "Almirante Barroso, 123", "(91) 88888-1111");

        System.out.println("--- Resultados ---");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}