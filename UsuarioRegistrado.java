

package lovendo;

import java.util.Scanner;


public class UsuarioRegistrado extends Usuario{
    
    private String imagen;
    private int puntuación;

    public UsuarioRegistrado(String username, String passwd, String nombre, String email, String dni, int tfno) {
        super(username, passwd);
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getPuntuación() {
        return puntuación;
    }

    public void setPuntuación(int puntuación) {
        this.puntuación = puntuación;
    }

    public boolean Puntuar(UsuarioRegistrado comprador){
        boolean resultado = false;
        
        System.out.println("Puntua");
        Scanner sc = new Scanner(System.in);
        int puntuacion = sc.nextInt();
        comprador.setPuntuación(puntuacion);
        
        return resultado;
    }
    
}
