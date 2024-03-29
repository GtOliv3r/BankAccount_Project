    public abstract class Conta implements IConta{
    
    private static int AGENCIA_PADRAO = 1850;
    
    private static int SEQUENCIAL = 40028922;

    protected int agencia;
    protected int numero;
    protected double saldo = 1000;
    protected Cliente cliente;
    
    
    
        public Conta(Cliente cliente){
            this.agencia = Conta.AGENCIA_PADRAO;
            this.numero = SEQUENCIAL++;
            this.cliente = cliente;
    }

    @Override
    public void sacar(double valor){
        saldo -= valor;

    }

    @Override
    public void depositar(double valor){
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    } 

    public int getAgencia(){
            return agencia;
        }

    public int getNumero(){
            return numero;
        }

    public double getSaldo(){
            return saldo;
        }
        
        protected void imprimirInfoComuns(){
        System.out.println(String.format("Cliente: %s" , this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d" , this.agencia));
        System.out.println(String.format("Conta : %d" , this.numero));
        System.out.println(String.format("Saldo: %.2f" , this.saldo));
        }

    }