
package paquete02;

import paquete03.Autor;

public class Publicacion {

    private Autor autor;
    private int anioPublicacion;

    public Publicacion(Autor a, int anio) {
        autor = a;
        anioPublicacion = anio;
    }

    public void establecerAutor(Autor aut) {
        autor = aut;
    }

    public void establecerAnioPublicacion(int anio) {
        anioPublicacion = anio;
    }

    public Autor obtenerAutor() {
        return autor;
    }

    public int obtenerAnioPublicacion() {
        return anioPublicacion;
    }
}