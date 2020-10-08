package umg.edu.Modelo;

/**
 *
 * @author Geordie&Roberto
 */

public class Cliente {
public int id;

public String Nombre;

    public Cliente(int id, String nombre) {
        this.id = id;
        //this.sigIdCliente = sigIdCliente;
        Nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String setId(int id) {
        this.id = id;
        return null;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
