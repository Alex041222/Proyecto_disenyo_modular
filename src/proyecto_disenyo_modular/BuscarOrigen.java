package proyecto_disenyo_modular;

public class BuscarOrigen {
	
	 public static String buscarO(String Origen) {
	    	
	        for (String o : Main.origen) {
	            if (o.contains(Origen)) {
	                return o;
	            }
	        }
	        return "Origen no encontrado";
	    }
	}

