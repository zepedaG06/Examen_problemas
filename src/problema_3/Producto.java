package problema_3;

public class Producto {

    private String codigo;
    private String nombre;
    private Double precio;
    private int cantidad;

    public Producto() {
    }

    public Producto(String codigo, String nombre, Double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


     public double calcularTotal(){
        return precio * cantidad;
     }

     public boolean disponible(){
        return cantidad > 0;
     }

     public void mostrarinfo() {
         System.out.println("==============PRODUCTO===============");
         System.out.println("codigo: " + getCodigo());
         System.out.println("Nombre: " + getNombre());
         System.out.println("Precio: " + getPrecio());
         System.out.println("Cantidad: " + getCantidad());
         System.out.println("====================================");
         System.out.println("Valor Total: " + calcularTotal());
         System.out.println("Disponible: " + (disponible()? "SI": "NO"));
     }


}
