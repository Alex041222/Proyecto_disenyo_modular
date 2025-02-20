package proyecto_disenyo_modular;

public class Carrito {
	
	 private static String[] productos = new String[10];
	    private static double[] cantidades = new double[10];
	    private static int numProductos = 0;
	    private static String[] hierba = { "Maria Juana", "Hierba de los bosques", "La seta feliz", "El oro verde" };

	    public static void seleccionarProducto(String producto, double cantidad) {
	        int index = -1;
	        for (int i = 0; i < hierba.length; i++) {
	            if (hierba[i].equalsIgnoreCase(producto)) {
	                index = i;
	            }
	        }
	        if (index != -1 && numProductos < productos.length) {
	            productos[numProductos] = producto;
	            cantidades[numProductos] = cantidad;
	            System.out.println(cantidad + " unidades de " + producto + " han sido añadidas al carrito.");
	            numProductos++;
	        } else {
	            System.out.println("Producto no encontrado o carrito lleno.");
	        }
	    }

	    public static void eliminarProducto(String producto) {
	        int index = -1;
	        for (int i = 0; i < numProductos; i++) {
	            if (productos[i].equalsIgnoreCase(producto)) {
	                index = i;
	            }
	        }
	        if (index != -1) {
	            for (int i = index; i < numProductos - 1; i++) {
	                productos[i] = productos[i + 1];
	                cantidades[i] = cantidades[i + 1];
	            }
	            productos[numProductos - 1] = null;
	            cantidades[numProductos - 1] = 0;
	            numProductos--;
	            System.out.println(producto + " ha sido eliminado del carrito.");
	        } else {
	            System.out.println("Producto no está en el carrito.");
	        }
	    }

	    public static void finalizarCompra() {
	        if (numProductos == 0) {
	            System.out.println("El carrito está vacío. No hay productos para comprar.");
	        } else {
	            System.out.println("Compra finalizada. Estos son los productos comprados:");
	            for (int i = 0; i < numProductos; i++) {
	                System.out.println(cantidades[i] + " unidades de " + productos[i]);
	            }
	            for (int i = 0; i < numProductos; i++) {
	                productos[i] = null;
	                cantidades[i] = 0;
	            }
	            numProductos = 0;
	        }
	    }
	}
