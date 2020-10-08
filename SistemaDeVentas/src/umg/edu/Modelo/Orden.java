
package umg.edu.Modelo;

import java.util.Date;

/**
 *
 * @author Geordie&Roberto
 */
public class Orden {
    
    private int id;
    Cliente cliente;
    ItemOrden item1;
    ItemOrden item2;
    Date fechaOrden;
    private double precioEnvio;
    private double total;
    private String tipoEnvio;
    private String estado;
    private static int sigIdOrden;
    private int díasEnvio;
    
    public Orden(){
        id=1;
        total=0.0;
        fechaOrden = new Date();
    }
    
    public Orden(Date pFecha){
        this();
        this.fechaOrden=fechaOrden;
    }
    
    public Orden (int pCliente, Date pFecha){
        this();
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemOrden getItem1() {
        return item1;
    }

    public void setItem1(ItemOrden item1) {
        this.item1 = item1;
    }

    public ItemOrden getItem2() {
        return item2;
    }

    public void setItem2(ItemOrden item2) {
        this.item2 = item2;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public double getPrecioEnvio() {
        return precioEnvio;
    }

    public void setPrecioEnvio(double precioEnvio) {
        this.precioEnvio = precioEnvio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getDíasEnvio() {
        return díasEnvio;
    }

    public void setDíasEnvio(int díasEnvio) {
        this.díasEnvio = díasEnvio;
    }
    
    
    public double getTotalOrden(){
        double precio=0 ;
        double descuento=0;
        double total;
        total= precio-descuento;
        return total;
    }
    
}
