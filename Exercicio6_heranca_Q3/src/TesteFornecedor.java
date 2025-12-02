public class TesteFornecedor {
    public static void main(String[] args) {
        // Criando o fornecedor
        Fornecedor f1 = new Fornecedor();

        // 1. Testando métodos HERDADOS de Pessoa
        f1.setNome("Atacado Ltda");
        f1.setEndereco("Av. Pero Miranda, 1234");
        f1.setTelefone("(91) 4002-8922");

        // 2. Testando métodos da classe FORNECEDOR
        f1.setValorCredito(5000.00);
        f1.setValorDivida(1200.50);

        // Exibindo os dados
        System.out.println("--- Dados do Fornecedor ---");
        System.out.println("Empresa: " + f1.getNome()); // Herdado
        System.out.println("Telefone: " + f1.getTelefone()); // Herdado
        
        System.out.println("Crédito Máximo: R$ " + f1.getValorCredito());
        System.out.println("Dívida Atual: R$ " + f1.getValorDivida());

        // 3. Testando o método obterSaldo()
        System.out.println("Saldo Disponível (Crédito - Dívida): R$ " + f1.obterSaldo());
    }
}