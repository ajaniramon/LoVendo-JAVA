

package lovendo;


public class Administrador extends Usuario{
    
    private int codAdmin;

    public Administrador(String username, String passwd, String nombre, String email, String dni, int tfno) {
        super(username, passwd);
    }

    public int getCodAdmin() {
        return codAdmin;
    }

    public void setCodAdmin(int codAdmin) {
        this.codAdmin = codAdmin;
    }
    
    public Producto visualizarProducto(Producto producto){
        
        System.out.println(producto.informacionProducto(producto));
        
        return producto;
    }
    
}
