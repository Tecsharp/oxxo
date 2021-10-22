
public class TelmexUsers {
	

	String nombre;
	String cuentaNumero;
	int tipoCuenta;
	
	public TelmexUsers(String nombre, String cuentaNumero, int tipoCuenta) {
		super();
		this.nombre = nombre;
		this.cuentaNumero = cuentaNumero;
		this.tipoCuenta = tipoCuenta;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCuentaNumero() {
		return cuentaNumero;
	}
	public void setCuentaNumero(String cuentaNumero) {
		this.cuentaNumero = cuentaNumero;
	}
	public int getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(int tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	

}
