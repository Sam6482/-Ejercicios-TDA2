import java.util.Scanner;

public class Materia {
    
    public static void main(String[] args) {
        
        ListaMaterias lista = new ListaMaterias();

        System.out.println("Metiendo materias");

        lista.Agregar("Matematicas");
        lista.Agregar("Fisica");
        lista.Agregar("Historia");
        lista.Agregar("Quimica");
        lista.Agregar("Programacion");

        System.out.println("\n Las materias agregadas fueron");

        lista.imprimir();

        System.out.println("¿Que materia vas a buscar?");
        
        Scanner teclado = new Scanner(System.in);
        String Buscar = teclado.nextLine();
        

        if (lista.contiene(Buscar)) {
            System.out.println("La materia esta en la lista");
        }
            else{

                System.out.println("La materia no esta en la lista ");
            }
    }
}
