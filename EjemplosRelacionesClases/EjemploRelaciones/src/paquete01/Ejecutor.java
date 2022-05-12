
package paquete01;

public class Ejecutor {

    public static void main(String[] args) {
 
        String marca = "Toshiba";
        UnidadDVD unidad = new UnidadDVD(marca);

        // se crea el objeto de tipo Computadora
        String procesador = "Intel";
        
        Computadora computadora = new Computadora(procesador, unidad);
        System.out.printf("Computadora:\nProcesador: %s\n"
                + "Unidad de DVD: %s\n",
                computadora.obtenerTipoProcesador(),
                computadora.obtenerUnidadDvd().obtenerMarca());
        System.out.println("----------------------------------");
        
        UnidadDVD d = computadora.obtenerUnidadDvd();
        
        System.out.printf("Computadora:\nProcesador: %s\n"
                + "Unidad de DVD: %s\n",
                computadora.obtenerTipoProcesador(),
                d);
    }

}
