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
     * Hace un print del estado de la memoria en KB
     */
    public static void mostrarMemoria(){
        //Estos métodos estan en bytes, por eso los divido entre 1000 para convertirlos a KB y que quede más simplificada
        System.out.println("Memoria Libre: " + (Runtime.getRuntime().freeMemory() / 1000) + " KBytes");
        System.out.println("Memoria total reservada: " + (Runtime.getRuntime().totalMemory() / 1000) + " KBytes");
        System.out.println("Memoria en uso: " + ((Runtime.getRuntime().totalMemory() + Runtime.getRuntime().freeMemory())/ 1000) + " KBytes");
        System.out.println("Memoria máxima disponible: " + (Runtime.getRuntime().maxMemory() / 1000) + " KBytes");
    }

    /**
     * Programa principal
     * @param args
     */
    public static void main(String[] args){
        System.out.println("Práctica 1 - Anxo Vázquez");
        System.out.println("Número de procesadores (son hilos): " + InformeSistema.mostrarProcesadores());

        System.out.println("*+*************");

        InformeSistema.mostrarMemoria();
    }
}
