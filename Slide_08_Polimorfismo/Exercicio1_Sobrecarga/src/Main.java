public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("--- Teste de Sobrecarga ---");

        // Chamando a Versão 1, com 2 inteiros
        // O Java olha os argumentos (int, int) e chama a Versão 1
        int res1 = calc.somar(10, 20);
        System.out.println("Resultado: " + res1);
        System.out.println("---------------------------");

        // Chamando a Versão 2, com 3 inteiros
        // O Java percebe 3 argumentos e chama a Versão 2
        int res2 = calc.somar(10, 20, 30);
        System.out.println("Resultado: " + res2);
        System.out.println("---------------------------");

        // Chamando a Versão 3, 2 doubles
        // O Java vê que tem double e chama a Versão 3
        double res3 = calc.somar(10.5, 20.5);
        System.out.println("Resultado: " + res3);
    }
}