package umg.edu.Modelo;
//CLASE PARA UN CLIENTE INDIVIDUAL

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Geordie&Roberto
 */
public class Individual extends Cliente{
    private String dpi;
    private String tipo="Individual";

    public Individual(int id, String nombre) {
        super(id, nombre);
    }

    public Individual(int id, String nombre, String tipo) {
        super(id, nombre);
        this.tipo = tipo;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    @Override
    public String toString() {
        return super.toString() + "DPI: "+dpi;
    }


   
    
}
