import java.util.Stack;

public class Editor {
    public static void main(String[] args) {
        Stack<Accion> Acciones = new Stack<>();

        Acciones.push(new Accion(1, "Escribir título"));
        Acciones.push(new Accion(2, "Escribir párrafo"));
        Acciones.push(new Accion(3, "Borrar párrafo"));

        Accion quitarAccion = Acciones.pop();
        System.out.println(" Acción borrada: " + quitarAccion);

        Accion quitarSiguiente = Acciones.peek();
        System.out.println(" Próxima acción a borrar: " + quitarSiguiente);

        System.out.println(" Acciones restantes en la pila:");
        for (Accion a : Acciones) {
            System.out.println(a);
        }
    }
}