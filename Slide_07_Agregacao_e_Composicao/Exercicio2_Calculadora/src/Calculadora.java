import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        
        // No slide é solicitado um tratamento de erros (NumberFormatException),
        // mas não mostrou como usar o bloco "try-catch". Tive que adicionar isso.
        try {
            
            // Aqui ocorrem as Entradas de Dados:
            // JOptionPane.showInputDialog lê uma String.
            String aux1 = JOptionPane.showInputDialog(null, "Digite o primeiro número:");
            String aux2 = JOptionPane.showInputDialog(null, "Digite o segundo número:");

            // Como o JOptionPane só devolve texto (String), precisei usar o Double.parseDouble
            // para transformar em número e poder fazer conta.
            double n1 = Double.parseDouble(aux1);
            double n2 = Double.parseDouble(aux2);

            // Aqui ocorre a Escolha de Operação
            // No exercício é solicitado o "showOptionDialog", mas os exemplos no Slide 21 
            // só mostravam "showConfirmDialog" (Sim/Não).
            // Tive que pesquisar essa estrutura de Array para criar os botões personalizados.
            Object[] botoes = {"Somar", "Subtrair", "Multiplicar", "Dividir"};

            int escolha = JOptionPane.showOptionDialog(
                null, 
                "Qual conta você quer fazer?", 
                "Calculadora", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                botoes, 
                botoes[0]
            );

            // Se fechar a janela sem escolher nada, encerra.
            if (escolha == -1) {
                System.exit(0);
            }

            double resultado = 0;

            // Lógica normal de Java (switch) para decidir a conta
            switch (escolha) {
                case 0: // Somar
                    resultado = n1 + n2;
                    break;
                case 1: // Subtrair
                    resultado = n1 - n2;
                    break;
                case 2: // Multiplicar
                    resultado = n1 * n2;
                    break;
                case 3: // Dividir
                    // Validação de divisão por zero.
                    if (n2 == 0) {
                        JOptionPane.showMessageDialog(null, "Erro: Não dá pra dividir por zero!");
                        return; // Para o código aqui e fecha a janela
                    }
                    resultado = n1 / n2;
                    break;
            }

            // Aqui ocorrem as Saídas de Dados
            // Uso o"showMessageDialog" para mostrar o resultado final da operação escolhida pelo usuário.
            JOptionPane.showMessageDialog(null, "O resultado da conta é: " + resultado);

        } catch (NumberFormatException e) {
            // Essa é a parte que valida se a pessoa digitou letra em vez de número.
            // O enunciado pediu para validar "NumberFormatException", então o catch pega esse erro específico.
            JOptionPane.showMessageDialog(null, "Erro: Você digitou letras ou caracteres inválidos. Use apenas números.");
        
        } catch (Exception e) {
            // Se acontecer qualquer outro erro estranho, é encerrado aqui.
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado.");
        }
    }
}