import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Por favor, digite o Nome do Cliente:");
        	String nomeCliente = entrada.nextLine();
		
		System.out.println("Por favor, digite o número da Agência:");
        	String agencia = entrada.nextLine();

        	System.out.println("Por favor, digite o número da Conta:");
        	int numero = Integer.parseInt(entrada.nextLine());

        	System.out.println("Por favor, digite o Saldo:");
        	double saldo = Double.parseDouble(entrada.nextLine());

        	String mensagem = "Olá ".concat(nomeCliente)
                         .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                         .concat(agencia)
                         .concat(", conta ")
                         .concat(String.valueOf(numero))
                         .concat(" e seu saldo ")
                         .concat(String.valueOf(saldo))
                         .concat(" já está disponível para saque");

        	System.out.println(mensagem);
		
		
        	entrada.close();
	}

}
