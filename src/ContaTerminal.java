import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o número da conta:");
        int numero = scanner.nextInt();
        System.out.println("Insira o número da agência:");
        String agencia = scanner.next();
        System.out.println("Insira seu nome:");
        String nomeCliente = scanner.next();
        System.out.println("Insira seu saldo:");
        double saldo = scanner.nextDouble();

       String dadosClientes = DadosCliente(numero,agencia,nomeCliente,saldo);
        System.out.println(dadosClientes);
    }



    public static String DadosCliente(int numero,String agencia,String nomeCliente,double saldo){
        return "Olá"+" "+nomeCliente+", "+"obrigado por criar uma conta em nosso banco,sua agência é"+" "+agencia+", "+"conta "+ numero +" e seu saldo "+saldo+" já está disponivel para saque";
}
}
