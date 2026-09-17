/**
 * Clase que devuelve datos sobre el sistema, como RAM, CPU, etc.
 *
 * @author Anxo Vázquez
 *
 * @version 1.0
 */
public class InformeSistema {

    /**
     * Devuelve el número de procesadores (hilos)
     * @return numero de hilos
     */
    public static int mostrarProcesadores(){
        return Runtime.getRuntime().availableProcessors();
    }

    /**
     * Hace un print del estado de la memoria en KiB
     */
    public static void mostrarMemoria(){
        System.out.println("Memoria Libre: " + (Runtime.getRuntime().freeMemory() / 1024) + " KiB");
        System.out.println("Memoria total reservada: " + (Runtime.getRuntime().totalMemory() / 1024) + " KiB");
        System.out.println("Memoria en uso: " + ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024) + " KiB");
        System.out.println("Memoria máxima disponible: " + (Runtime.getRuntime().maxMemory() / 1024) + " KiB");
    }

    /**
     * Devuelve la memoria en uso en bytes.
     * @return memoria usada
     */
    public static long getBytesMemoriaUso(){
        return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
    }

    /**
     * Hace un print del sistema operativo y una ruta
     */
    public static void mostrarMultiplataforma(){
        System.out.println("Sistema Operativo: " + System.getProperty("os.name") + " " + System.getProperty("os.version") + " " + System.getProperty("os.arch"));
        System.out.println("Ruta archivo informe.txt: " + System.getProperty("user.home") + "/psp/informe.txt");
    }

    /**
     * Lanzador principal
     * @param args
     */
    public static void main(String[] args){
        System.out.println("Práctica 1 - Anxo Vázquez");
        System.out.println("Número de procesadores (son hilos): " + InformeSistema.mostrarProcesadores());

        System.out.println("*+*************");

        System.out.println("Informe antes de reservar 64MiB de memoria:");
        InformeSistema.mostrarMemoria();
        long memoriaUsadaAntes = InformeSistema.getBytesMemoriaUso();

        long[] reservado = new long[8 * 1024 * 1024]; //64 MiB
        reservado[0] = 1; // Para evitar que el recolector de basura limpie la variable

        System.out.println("---");
        System.out.println("Informe después de reservar 64MiB de memoria:");
        InformeSistema.mostrarMemoria();

        System.out.println("Diferencia: " + ((InformeSistema.getBytesMemoriaUso() - memoriaUsadaAntes) / (1024 * 1024)) + " MiB");

        System.out.println("***************");

        InformeSistema.mostrarMultiplataforma();
    }
}