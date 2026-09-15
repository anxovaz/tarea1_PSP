public class InformeSistema {
    public static int mostrarProcesadores(){
        int numcores = Runtime.getRuntime().availableProcessors();
        return numcores;
    }


    public static void main(String[] args){
        System.out.println("Práctica 1 - Anxo Vázquez");
        System.out.println("Número de procesadores: " + InformeSistema.mostrarProcesadores());

    }
}
