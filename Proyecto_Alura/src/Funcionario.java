public class Funcionario {
	private String Nombre;
	private String documento;
	private double salario;
	private int tipo;
	
	//Constructor metodo publico que el tipo de retorno es la clase en si, puede recibir parametros o no
	public Funcionario() {
		
	}

	//Metodos Get y Set
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getBonificacion() {
		return this.salario * 0.05;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
}
