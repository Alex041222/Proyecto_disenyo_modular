package proyecto_disenyo_modular;

public class BuscarNombre {

	    public static String buscarN(String nombre) {
	    	
	        for (String n : Main.hierba) {
	            if (n.contains(nombre)) {
	                return n;
	            }
	        }
	        return "Nombre no encontrado";
	    }
	}
