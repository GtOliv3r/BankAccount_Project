import java.util.Scanner;

public class Main{

    public static void main (String[] args){
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	int escolha1 = 0;
    	int escolha2 = 0;
    	double valorEntrada = 0;
    	
    	Cliente nome = new Cliente();
    	System.out.println("Informe seu primeiro nome: ");
    	nome.setNome(scanner.next());
    	

    	Conta cc = new ContaCorrente(nome);
        Conta poupanca = new ContaPoupanca(nome);
        
        System.out.println("Digite um número abaixo para selecionar a conta desejada: ");
        System.out.println("1 - Corrente");
        System.out.println("2 - Poupanca");
        
        escolha1 = scanner.nextInt();
        
        if( escolha1 == 1 ) {
        	
        
	        System.out.println("Conta Corrente selecionada \n");
	        System.out.println("Digite um número abaixo para realizar a operação desejada: ");
	        System.out.println("1 - Sacar");
	        System.out.println("2 - Depositar");
	        System.out.println("3 - Transferir de uma conta para outra");
        
	        escolha2 = scanner.nextInt();     
        
	        if( escolha2 == 1) {
	        	System.out.println("Você escolheu a opção 'sacar' ");
	        	System.out.println("Digite o valor: ");
	        	valorEntrada = scanner.nextDouble();
	        	if(valorEntrada > 1000){
	        		System.out.println("CUIDADO!! Seu saldo está negativo!! ");
	        	}
	        	cc.sacar(valorEntrada);  
	        }
	        
	        if(escolha2 == 2) {
	        	System.out.println("Você escolheu a opção 'depositar' ");
	        	System.out.println("Digite o valor: ");
	        	valorEntrada = scanner.nextDouble();
	        	  cc.depositar(valorEntrada);
	        }
	        
	        if (escolha2 == 3) {
	        	System.out.println("Você escolheu a opção 'transferir' ");
	        	System.out.println("Digite o valor: ");
	        	valorEntrada = scanner.nextDouble();
	        	if(valorEntrada > 1000){
	        		System.out.println("CUIDADO!! Seu saldo está negativo!! ");
	        	}
	        	  cc.transferir(valorEntrada,poupanca);
	        }
	        
        }
        
        if( escolha1 == 2 ) {
        	
            
	        System.out.println("Conta Poupanca selecionada \n");
	        System.out.println("Digite um número abaixo para realizar a operação desejada: ");
	        System.out.println("1 - Sacar");
	        System.out.println("2 - Depositar");
	        System.out.println("3 - Transferir de uma conta para outra");
        
	        escolha2 = scanner.nextInt();     
        
	        if( escolha2 == 1) {
	        	System.out.println("Você escolheu a opção 'sacar' ");
	        	System.out.println("Digite o valor: ");
	        	valorEntrada = scanner.nextDouble();
	        	if(valorEntrada > 1000){
	        		System.out.println("CUIDADO!! Seu saldo está negativo!! ");
	        	}
	        	poupanca.sacar(valorEntrada);  
	        }
	        
	        if(escolha2 == 2) {
	        	System.out.println("Você escolheu a opção 'depositar' ");
	        	System.out.println("Digite o valor: ");
	        	valorEntrada = scanner.nextDouble();
	        	poupanca.depositar(valorEntrada);
	        }
	        
	        if (escolha2 == 3) {
	        	System.out.println("Você escolheu a opção 'transferir' ");
	        	System.out.println("Digite o valor: ");
	        	valorEntrada = scanner.nextDouble();
	        	if(valorEntrada > 1000){
	        		System.out.println("CUIDADO!! Seu saldo está negativo!! ");
	        	}
	        	poupanca.transferir(valorEntrada,cc);
	        }
	        
        }
      
        //cc.transferir(100,poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
