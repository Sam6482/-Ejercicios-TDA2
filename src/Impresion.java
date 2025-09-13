import java.util.LinkedList;
import java.util.Queue;

public class Impresion {
    public static void main(String[] args) {
        Queue<String> impresion = new LinkedList<>();

        impresion.add("Hola.pdf");
        impresion.add("Hola2.pdf");
        impresion.add("Hola3.pdf");
        
        System.out.println("Fila con documentos: " + impresion);
        String atender = impresion.poll();

        System.out.println("Documento atendido " + atender);
        System.out.println("Siguiente documento atender " + impresion);

        impresion.add("Hola4.pdf");
        System.out.println("Lista final: " + impresion);
    }
}
