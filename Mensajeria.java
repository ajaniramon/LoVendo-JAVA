
package lovendo;

import java.util.Date;


public class Mensajeria {
    
    UsuarioRegistrado comprador;
    UsuarioRegistrado vendedor;
    String texto;
    Date fechamensaje;

    public Mensajeria(UsuarioRegistrado comprador, UsuarioRegistrado vendedor, String texto) {
        this.comprador = comprador;
        this.vendedor = vendedor;
        this.texto = texto;
        fechamensaje = new Date();
    }

    public UsuarioRegistrado getComprador() {
        return comprador;
    }

    public void setComprador(UsuarioRegistrado comprador) {
        this.comprador = comprador;
    }

    public UsuarioRegistrado getVendedor() {
        return vendedor;
    }

    public void setVendedor(UsuarioRegistrado vendedor) {
        this.vendedor = vendedor;
    }

    public Date getFechamensaje() {
        return fechamensaje;
    }

    public void setFechamensaje(Date fechamensaje) {
        this.fechamensaje = fechamensaje;
    }
    
    
  
}