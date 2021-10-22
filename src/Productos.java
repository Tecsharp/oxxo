
public class Productos {

	private String nombreProducto;
	private double precio;
	private String ID;
	
	
	public Productos(String nombreProducto, double precio, String ID) {
		super();
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.ID = ID;
		
	}


	public String getNombreProducto() {
		return nombreProducto;
	}


	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}




	
	
	
	
}
