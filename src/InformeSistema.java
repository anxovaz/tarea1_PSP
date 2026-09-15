/**
 * Clase que devuelve datos sobre el sistema, como RAM, CPU, etc.
 *
 * @author Anxo Vázquez
 */
public class InformeSistema {
    /**
     * Devuelve el número de procesadores
     * @return numero de hilos
     */
    public static int mostrarProcesadores(){
        int cpus = Runtime.getRuntime().availableProcessors();
        return cpus;
    }

    /**
     * Programa principal
     * @param args
     */
    public static void main(String[] args){
        System.out.println("Práctica 1 - Anxo Vázquez");
        System.out.println("Número de procesadores (son hilos): " + InformeSistema.mostrarProcesadores());

        System.out.println("*+*************");

        System.out.println("Memoria reservada:");
        System.out.println("Memoria libre:");
        System.out.println("Memoria en uso:");
        System.out.println("Memoria máxima disponible:");

    }
}
