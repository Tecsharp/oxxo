
public class SantanderUsers {
	private String nombre;
	private String numCuenta;
	
	
	public SantanderUsers(String nombre, String numCuenta) {
		super();
		this.nombre = nombre;
		this.numCuenta = numCuenta;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNumCuenta() {
		return numCuenta;
	}


	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	
}
