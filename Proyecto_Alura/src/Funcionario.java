//Al ser abstracto no puede ser instancia como tal, porque al ser abstrata es una representacion conceptual...
//pero no puede ser una representacion fisica del objeto
public abstract class Funcionario {
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
	
	public abstract double getBonificacion();

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
}
