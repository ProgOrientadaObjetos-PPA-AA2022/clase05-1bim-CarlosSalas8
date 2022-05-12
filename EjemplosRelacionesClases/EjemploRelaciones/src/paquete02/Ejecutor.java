
package paquete02;

import paquete03.Autor;

public class Ejecutor {

    public static void main(String[] args) {
        // Se crea un objeto de tipo Autorfake
        Autor aut = new Autor("José", "Alvear");
        String pas = "985421265";
        aut.establecerPasaporte(pas);

        // Se crea un objeto de tipo Publicación
        int anioPublicacion = 2000;
        
        Publicacion p = new Publicacion(aut, anioPublicacion);
        
        System.out.printf("Publicación\nAutor: %s %s\n"
                + "Año de Publicación: %d\n"
                + "Pasaporte: %s\n",
                p.obtenerAutor().obtenerNombre(),
                p.obtenerAutor().obtenerApellido(),
                p.obtenerAnioPublicacion(),
                p.obtenerAutor().obtenerPasaporte());
        
        aut.establecerApellido("Elizalde");
        
        System.out.printf("Publicación\nAutor: %s %s\n"
                + "Año de Publicación: %d\n",
                p.obtenerAutor().obtenerNombre(),
                p.obtenerAutor().obtenerApellido(),
                p.obtenerAnioPublicacion(),
                p.obtenerAutor().obtenerPasaporte());
        
        
    }
}
