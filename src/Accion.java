public class Accion {
    int id;
    String accion;

    public Accion(int id, String accion){
        this.id = id;
        this.accion = accion;
    }

    @Override
    public String toString() {
        return "Accion [id=" + id + ", accion=" + accion + "]";
    }

    
}
