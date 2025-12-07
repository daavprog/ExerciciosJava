public class Main {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
    
        p1.setNome("Davy");
        p2.setNome("Pedro");
        p3.setNome("Samara");
        p4.setNome("Filipe");

        p2.setCurso("Computacao");
        p3.setSalario(10000.75f);
        p4.setSetor("Coordenador");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}