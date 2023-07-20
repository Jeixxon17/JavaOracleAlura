
public class TestBank {
	public static void main(String[] args) {
		/*Cuenta cuenta = new Cuenta(555);
		Cuenta cuenta2 = new Cuenta(333);
		Cuenta cuenta3 = new Cuenta(444);
		Cliente cliente = new Cliente();
		cliente.setNombre("Jeison");
		cliente.setDocumento("1001137318");
		cuenta.setTitular(cliente);
		cuenta.setAgencia(17);
		cuenta.depositar(400);
		cuenta.retirar(300);
		
		Cliente titular = cuenta.getTitular();
		
		System.out.println(cuenta.getSaldo());
		System.out.println(cuenta.getAgencia());
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());

		System.out.println(Cuenta.getTotal());
		System.out.println(cuenta.getAgencia());*/
		
		Funcionario funcionario = new Contador();
		//Funcionario gerente = new Funcionario();
		//gerente.setSalario(6000);
		//gerente.setTipo(1);
		Gerente gerente = new Gerente();
		funcionario.setNombre("Jeison");
		funcionario.setDocumento("1001137318");
		funcionario.setSalario(1000000);
		funcionario.setTipo(0);
		gerente.setSalario(50000);
		gerente.setClave("1234567");
		
		System.out.println(gerente.iniciarSesion("1234567"));
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.getBonificacion());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.getBonificacion());
	}
}
