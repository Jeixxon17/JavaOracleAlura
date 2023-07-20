
public class TestBank2 {

	public static void main(String[] args) {
		//Elemento mas generioco puede ser adaptado al elemento mas especifico
		/*Funcionario funcionario = new Funcionario();
		
		funcionario.setNombre("Jeison");
		
		Gerente gerente = new Gerente();
		
		gerente.setNombre("Andres");
		
		Contador contador = new Contador();
		
		funcionario.setSalario(2000);
		gerente.setSalario(10000);
		contador.setSalario(5000);
		
		ControlBonificacion bonificacion = new ControlBonificacion();
		bonificacion.registrarSalario(funcionario);
		bonificacion.registrarSalario(gerente);
		bonificacion.registrarSalario(contador);
		
		System.out.println();
		System.out.println(); */
		
		CuentaCorriente cc = new CuentaCorriente(1, 1);
		CuentaAhorros ca = new CuentaAhorros(2, 3);
		
		cc.depositar(2000);
		cc.transfiere(1000, ca);
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}

}
