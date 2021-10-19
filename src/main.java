import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class main {

	public static void main(String[] args) {
		

		
		while(true) {
		
		String[] buttons = { "DEPOSITOS", "PAGO DE SERVICIOS", "VENTA", "SALIR" };

	    int rc = JOptionPane.showOptionDialog(null, "SELECCIONA UNA ACCIÓN", "OXXO",
	        JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[2]);

    
	    switch (rc) {
		case 0:
			
			System.out.println("Seleccionaste DEPOSITOS");
			
			break;
		case 1:
			
			System.out.println("Seleccionaste PAGO DE SERVICIOS");
			
			break;
		case 2:
			main.ventaProductos();
			break;
		case 3:
			System.out.println("Seleccionaste SALIR");
			return;
		default:
			System.out.println("ENTRA A DEFAULT");
			break;
		}
		}
	}
	
	
	
    public static List<Productos> crearProductos() {

        final List<Productos> producto = new ArrayList<>();

        final Productos producto1 = new Productos("Café Andatti", 10, 0011);
        final Productos producto2 = new Productos("Pastel de Zanahoria", 20, 0032);
        final Productos producto3 = new Productos("Coca-Cola 1L", 30, 0043);
        final Productos producto4 = new Productos("Chips Jalapeno", 40, 0054);
        final Productos producto5 = new Productos("HotDog Vikingo", 50, 0065);
        final Productos producto6 = new Productos("Burrito Azul", 60, 0076);
        final Productos producto7 = new Productos("Dr Pepper", 70, 0077);
        final Productos producto8 = new Productos("PowerADE", 80, 0065);
        final Productos producto9 = new Productos("Gansito", 90, 0051);
        final Productos producto10 = new Productos("Cable USB Type C", 100, 0352);

        producto.add(producto1);
        producto.add(producto2);
        producto.add(producto3);
        producto.add(producto4);
        producto.add(producto5);
        producto.add(producto6);
        producto.add(producto7);
        producto.add(producto8);
        producto.add(producto9);
        producto.add(producto10);

        return producto;
    }

    public static void ventaProductos() {
    	
    	double pagoTotal = 0;
		int countProductos = 0;
		//debug//
		System.out.println("Seleccionaste VENTAS");
		

		while(true) {

	        Object[] options1 = { "AGREGAR AL CARRITO", "PAGAR", "SALIR" };

			JPanel panel = new JPanel();
			panel.add(new JLabel("INTRODUCE UN PRODUCTO"));
			JTextField textField = new JTextField(10);
			panel.add(textField);
			
			int result = JOptionPane.showOptionDialog(null, panel, "VENTA", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, options1, null);
			
			if(result == 2) {
				return;
			}
			
			if(result == 1) {
				
				JOptionPane.showMessageDialog(null, "PAGO TOTAL: " + pagoTotal + "\nNUMERO DE PRODUCTOS: " + countProductos);
				pagoTotal = 0;
				countProductos = 0;
				
			}
			
			//debug
			System.out.println(result);

		    
	        final List<Productos> producto = crearProductos();
	        
	        for(int i = 0; i < producto.size(); i++) {
	        	
	        	String name = producto.get(i).getNombreProducto();
	        	
	        	if(name.equalsIgnoreCase(textField.getText())) {
	        		
	    			String[] botVen1 = {"SALIR", "CONFIRMAR"};

	    		    int botV1 = JOptionPane.showOptionDialog(null, "SELECCIONA UNA ACCIÓN\n PRECIO DE " + producto.get(i).getNombreProducto() + ": " + producto.get(i).getPrecio(), "OXXO",
	    		        JOptionPane.INFORMATION_MESSAGE, 0, null, botVen1, botVen1[1]);
	    		    	    		    
	    		    if(botV1 == 1) {
	    		    	
	    		    	
	    		    	System.out.println("Seleccionaste AGREGAR AL CARRITO");
	    				pagoTotal = pagoTotal + producto.get(i).getPrecio();
	    				countProductos = countProductos+1;
	    			
	    				
	    		    } else {
	    		    	System.out.println("SALIÓ");
	    		    	
	    		    }
	    		    

	    		    
	    		    //debug
	        		System.out.println("PRECIO TOTAL: " + pagoTotal + "\nNUMERO DE PRODUCTOS: " + countProductos);
	        	}       
	        }
		}
    }
}
