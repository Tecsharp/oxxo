
public class Productos {

	private String nombreProducto;
	private double precio;
	private int ID;
	
	
	public Productos(String nombreProducto, double precio, int ID) {
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


	public Integer getID() {
		return ID;
	}


	public void setID(Integer iD) {
		ID = iD;
	}




	
	
	
	
}
