
class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	//Constructor
	private static int total = 0; //No es de la instancia, es de la clase

	public Cuenta(int agencia, int numero) {
		
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Aqui Se Crea una nueva cuenta");
		Cuenta.total++;
	}
	
	//Metodos
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}
	
	 public boolean transfiere(double valor, Cuenta destino) {
	        if(this.saldo >= valor) {
	            this.saldo -= valor;
	            destino.depositar(valor);
	            return true;
	        } else {
	            return false;
	        }
	    }
	 
	 //Set y Get
	 public double getSaldo() {
		 return this.saldo;
	 }
	 
	 public int getAgencia() {
		return agencia;
	}
	 
	 public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	 
	 public Cliente getTitular() {
		return titular;
	}
	 
	 public static int getTotal() {
		 return Cuenta.total;
	 }
}
