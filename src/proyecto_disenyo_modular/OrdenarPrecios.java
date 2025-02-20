package proyecto_disenyo_modular;

public class OrdenarPrecios {
    public static void ordenarAscendente(String[] nombres, double[] precios) {
        int n = precios.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (precios[j] > precios[j + 1]) {
                    double tempPrecio = precios[j];
                    precios[j] = precios[j + 1];
                    precios[j + 1] = tempPrecio;
                    
                    String tempNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = tempNombre;
                }
            }
        }
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " - " + precios[i] + "€");
        }
    }

    public static void ordenarDescendente(String[] nombres, double[] precios) {
        int n = precios.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (precios[j] < precios[j + 1]) {
                    double tempPrecio = precios[j];
                    precios[j] = precios[j + 1];
                    precios[j + 1] = tempPrecio;
                    
                    String tempNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = tempNombre;
                }
            }
        }
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " - " + precios[i] + "€");
        }
    }
}
