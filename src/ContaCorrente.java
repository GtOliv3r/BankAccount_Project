public class ContaCorrente extends Conta{

	
	
	
        public ContaCorrente(Cliente cliente) {
        	super(cliente);
		
	}

		public void imprimirExtrato(){
        	System.out.println("");
        System.out.println("=== Extrato conta corrente ===");
        super.imprimirInfoComuns();
    }

}