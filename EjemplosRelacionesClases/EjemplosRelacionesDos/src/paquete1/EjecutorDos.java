

package paquete1;

import java.util.Scanner;

 
public class EjecutorDos {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del barrio? ");
        String nbarrio = entrada.nextLine();
        Barrio b1 = new Barrio(nbarrio);
        System.out.println("Ingrese el nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese el numero de cedula? ");
        String cedula = entrada.nextLine();


        Persona personaObjeto = new Persona(nombre, cedula, b1);

        System.out.printf("%s\n" , personaObjeto);
    }
    
}

