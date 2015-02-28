
package lovendo;


public class Usuario {
    String username;
    String passwd;
    static int ID;
    int id;
    String nombre;
    String email;
    String dni;
    int tfno;

    public Usuario(String username, String passwd) {
        this.username = username;
        this.passwd = passwd;
        this.id = this.id++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTfno() {
        return tfno;
    }

    public void setTfno(int tfno) {
        this.tfno = tfno;
    }
    public boolean login(){
        boolean success = false;
        
        return success;
    }
    public boolean logout(){
        boolean success = false;
        
        return success;
    }
}
