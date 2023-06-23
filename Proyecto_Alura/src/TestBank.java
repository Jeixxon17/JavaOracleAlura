
public class TestBank {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(555);
		Cuenta cuenta2 = new Cuenta(333);
		Cuenta cuenta3 = new Cuenta(444);
		Cliente cliente = new Cliente();
		/*cliente.setNombre("Jeison");
		cliente.setDocumento("1001137318");
		cuenta.setTitular(cliente);
		cuenta.setAgencia(17);
		cuenta.depositar(400);
		cuenta.retirar(300);
		
		Cliente titular = cuenta.getTitular();
		
		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.getAgencia());
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());*/

		System.out.println(Cuenta.getTotal());
		System.out.println(cuenta.getAgencia());
	}
}
