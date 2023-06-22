
public class TestBank {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		//Cliente cliente = new Cliente();
		
		cuenta.saldo = 300;
		cuenta.depositar(700);
		cuenta.retirar(100);
		
		System.out.println(cuenta.saldo);
	}
}
