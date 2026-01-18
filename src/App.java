// ============================ Simulador caixa de Supermercado ============================

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        // criando o objeto Scanner para ler a entrada do usuário
        Scanner leitor = new Scanner (System.in);

        System.out.println(" ");
        System.out.println("==================== Simulador de Checkout de Padaria ====================");
        System.out.println("Bom dia, iniciaremos seu atendimento na padaria!");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        // nome do Atendente
        System.out.println("Digite o nome do Atendente: ");
        String atendenteNome = leitor.nextLine();
        System.out.println(" ");


        // Nome do Cliente
        System.out.println("Digite o nome do Cliente: ");
        String clienteNome = leitor.nextLine();
        System.out.println(" ");


        // inputs do produto 1
        System.out.println("Digite o nome do primeiro produto: ");
        String produto1Nome = leitor.nextLine();
        System.out.println("Valor primeiro produto: ");
        double produto1Valor = leitor.nextDouble();
        leitor.nextLine(); // <<-- ESSA LINHA LIMPA O "ENTER" QUE SOBROU
        System.out.println(" ");

        // inputs do produto 2
        System.out.println("Digite o nome do segundo produto: ");
        String produto2Nome = leitor.nextLine();
        System.out.println("Valor segundo produto: ");
        double produto2Valor = leitor.nextDouble();
        leitor.nextLine(); // <<-- ESSA LINHA LIMPA O "ENTER" QUE SOBROU
        System.out.println(" ");

        // inputs do produto 3
        System.out.println("Digite o nome do terceiro produto: ");
        String produto3Nome = leitor.nextLine();
        System.out.println("Valor terceiro produto: ");
        double produto3Valor = leitor.nextDouble();
        leitor.nextLine(); // <<-- ESSA LINHA LIMPA O "ENTER" QUE SOBROU
        System.out.println(" ");

        double totalCompra = produto1Valor + produto2Valor + produto3Valor;
        System.out.println(" ");


        System.out.println(" =================== INFORMATIVO DO CAIXA =================== ");
        // verificando se tem desconto
        double resultado; // Atribuindo a variável resultado para armazenar o valor final se tiver ou nao desconto

        if (totalCompra >= 100) {
            resultado = totalCompra * 0.90; // 10% de desconto
            System.out.println("Voce ganhou 10% de desconto por ter gasto mais de R$100,00!");
            System.out.println("O valor total da sua compra foi de: R$"+ String.format("%.2f", totalCompra));
            System.out.println("Com o desconto, o valor final da sua compra e de: R$"+ String.format("%.2f", resultado));
            System.out.println(" ");

        }else {
            resultado = totalCompra;
            System.out.println("O valor total não bateu o minímo de R$100,00! Infelizmente não terá desconto :"+String.format("%.2f", totalCompra));
            System.out.println(" ");
        }


        // realizando o pagamento
        System.out.println("Qual o valor que você cliente: "+clienteNome+", irá me pagar?");
        double valorAReceber = leitor.nextDouble();
        leitor.nextLine();
        System.out.println(" ");

        if (valorAReceber > resultado) {
            double troco = valorAReceber - resultado;
            System.out.println("Obrigado pelo pagamento! Seu troco é de: R$"+String.format("%.2f", troco)+". Volte sempre!");
        }else if (valorAReceber < resultado) {
            System.out.println("Desculpe, o valor pago é insuficiente para cobrir o total da compra.");
        }else {
            System.out.println("Obrigado pelo pagamento! Volte sempre!");
        }

        // nota fiscal

        System.out.println(" ");
        System.out.println(" =================== NOTA FISCAL =================== ");
        System.out.println(" ");
        System.out.println("Atendente: "+atendenteNome);
        System.out.println(" ");
        System.out.println("Cliente: "+clienteNome);
        System.out.println(" ");
        System.out.println("Produto 1: "+produto1Nome);
        System.out.println("Valor: R$"+produto1Valor);
        System.out.println(" ");
        System.out.println("Produto 2: "+produto2Nome);
        System.out.println("Valor: R$"+produto2Valor);
        System.out.println(" ");
        System.out.println("Produto 3: "+produto3Nome);
        System.out.println("Valor: R$"+produto3Valor);
        System.out.println(" ");
        System.out.println("Total: R$"+totalCompra);
        if (totalCompra >= 100) {
            System.out.println("Desconto aplicado: 10%");
            System.out.println("Total com desconto: R$"+resultado);
        } else {
            System.out.println("Desconto aplicado: Nenhum");
        }
        System.out.println(" ");

        // fechando o scanner
        leitor.close();
    }
}
