public class Calculadora {

    // Versão 1: Soma dois inteiros
    public int somar(int a, int b) {
        System.out.println("Método usado: somar(int, int)");
        return a + b;
    }

    // Versão 2: Soma três inteiros
    // Diferencia pela QUANTIDADE de parâmetros
    public int somar(int a, int b, int c) {
        System.out.println("Método usado: somar(int, int, int)");
        return a + b + c;
    }

    // Versão 3: Soma dois doubles
    // Diferencia pelo TIPO de parâmetros
    public double somar(double a, double b) {
        System.out.println("Método usado: somar(double, double)");
        return a + b;
    }
}