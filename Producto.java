package lovendo;

public class Producto {

    private static int id;
    private String nombre;
    private String descripcion;
    private int precio;
    private String categoria;
    private String imagen;

    private enum estadocompra {

        EN_PROCESO, ESPERANDO_PAGO, REALIZADA
    }

    public Producto(String nombre, String descripcion, int precio, String categoria) {
        this.id = this.id++;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String visualizarProducto(Producto producto) {
        String resultado = "";

        resultado = resultado + producto.id + " " + producto.nombre + " " + producto.categoria + " " + producto.descripcion;

        return resultado;
    }

    public String comprobarCompra(
             
        enum comprobar){
    return comprobar;
    }

    public boolean comprarProducto(String estado) {
        boolean comprobar = false;

        if (estado.equalsIgnoreCase("si")) {
            comprobar = true;
        }
        return comprobar;
    }

    public boolean venderProducto(String estado) {
        boolean comprobar = false;

        if (estado.equalsIgnoreCase("si")) {
            comprobar = true;
        }
        return comprobar;
    }

    public boolean publicarProducto(String estado) {
        boolean comprobar = false;

        if (estado.equalsIgnoreCase("si")) {
            comprobar = true;
        }
        return comprobar;
    }
     public boolean aceptarCompra(String estado) {
        boolean comprobar = false;

        if (estado.equalsIgnoreCase("si")) {
            comprobar = true;
        }
        return comprobar;
    }
    
      public boolean enviarCompra(String estado) {
        boolean comprobar = false;

        if (estado.equalsIgnoreCase("si")) {
            comprobar = true;
        }
        return comprobar;
    }
    

}
