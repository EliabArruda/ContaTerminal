import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        ContaTerminal c = new ContaTerminal();
        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        String condicao;
        double saldo = 0;
        double depositar = 0;
        System.out.println("Informe seu nome Completo: ");
        nomeCliente = sc.nextLine();

        System.out.println("Digite o Número da Agencia: ");
        agencia = sc.nextLine();


        System.out.println("Por favor, Digite o Número da Conta: ");
        numeroConta = sc.nextInt();


        System.out.println("Olá, " +  nomeCliente + ", obrigado por criar uma conta em nosso banco." +
                "\nSua agência é:" + agencia
                + "\nconta: " + numeroConta + "\ne seu saldo R$" + saldo);

        for(int i = 0; i <= 10;i++) {
            System.out.println("Você quer depositar algum valor em sua conta?");
            condicao = sc.next();

            if (condicao.equals("yes")) {

                System.out.println("Valor: ");
                depositar = sc.nextDouble();

                saldo = saldo + depositar;
            } else {

                System.out.println("Olá, " +  nomeCliente + ", obrigado por criar uma conta em nosso banco." +
                        "\nSua agência é:" + agencia
                        + "\nconta: " + numeroConta + "\ne seu saldo R$" + saldo);
                System.out.println("Obrigado por utilizar este serviço!");
                break;
            }
        }
    }
}
