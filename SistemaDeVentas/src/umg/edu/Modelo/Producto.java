package umg.edu.Modelo;

/**
 *
 * @author Geordie&Roberto
 */
public class Producto {
    private int id;
    private static int sigIdProducto= 2000;
    private String nombre;
    private double punitario;
    
    public Producto(){
    }
    
    public Producto(int id, String nombre, double punitario){
        this.id = id;
        this.nombre = nombre;
        this.punitario = punitario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPunitario() {
        return punitario;
    }

    public void setPunitario(double punitario) {
        this.punitario = punitario;
    }

    @Override
    public String toString() {
        return "[Producto] {" + "id=" + id + ", nombre=" + nombre + ", punitario=" + punitario + '}';
    }
    
    
    

    
}
