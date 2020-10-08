package umg.edu.Modelo;
//CLASE PARA UN CLIENTE EMPRESA

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Geordie&Roberto
 */
public class Empresa extends Cliente{
    
    private String contacto;
    private int descuento;

    public Empresa(int id, String nombre, String contacto, int descuento) {
        super(id, nombre);
        this.contacto = contacto;
        this.descuento = descuento;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return super.toString()+ "Contacto: " + contacto + "Descuento: " +descuento;
    }

}
