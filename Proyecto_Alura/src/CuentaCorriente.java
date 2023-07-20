
public class CuentaCorriente extends Cuenta {
	
	public CuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	//Sobreescribir metodo
	@Override //Sobreescrito del metodo de la clase padre, es decir no es nuevo
	public boolean retirar(double valor) {
		double comision = 0.2;
		return super.retirar(valor + comision);
	}
	
	@Override
	public void depositar(double valor) {
		saldo = saldo + valor;
		
	}
}
