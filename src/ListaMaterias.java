import java.util.ArrayList;
import java.util.List;

public class ListaMaterias {
    
    List <String> materias = new ArrayList<>();
    
    public void Agregar(String materia){
        this.materias.add(materia);

        System.out.println("La materia agregada fue : " + materia);
    }
        
    public boolean contiene(String materia){
        for (String m : this.materias) {
            
            if (m.equals(materia)) {
                
                return true; //Devuelve la materia si la encuentra
            }
        }

        return false; //Termina si no la encuentra
    }
      

    public void imprimir(){
        System.out.println("Materias : " +  this.materias);
    }
}
