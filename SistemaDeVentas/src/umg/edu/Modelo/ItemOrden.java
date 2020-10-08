package umg.edu.Modelo;

/**
 *
 * @author Geordie&Roberto
 */
public class ItemOrden {
    
    private int noLinea;
    private int cantidad;
    Producto producto;
    public ItemOrden(int pNoLinea, int pCantidad, int pIdProducto){
        this.cantidad = cantidad;
        this.noLinea = noLinea;
        this.producto = producto;
    }

    public int getNoLinea() {
        return noLinea;
    }

    public void setNoLinea(int noLinea) {
        this.noLinea = noLinea;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    public double getTotalItem(){
        double precio=0.0, cantidad = 0.0, total;
        total = precio * cantidad;
        return total;
    }
    
    @Override
    public String toString() {
        return "[ ItemOrden ] {" + "noLinea=" + noLinea + ", cantidad=" + cantidad + ", producto=" + producto + '}';
    }
    
    
    
}
