package lovendo;

import java.util.Scanner;

public class LoVendo {

    public static void main(String[] args) {
        
        GestionLovendo gestion = new GestionLovendo();
        
        UsuarioRegistrado cristian = new UsuarioRegistrado("cristian", "1234", "Cristian", "cristiancervera91@hotmail.com", "44890336v", 671169092);
        
        UsuarioRegistrado daniel = new UsuarioRegistrado("McH", "1234", "daniel", "Mchafull@hotmail.com", "44785441d", 666666666);
        
        Administrador admin = new Administrador("admin", "1234", "Administrador", "admin@admin.com", "66685445r", 654654654);
        
        Producto pelota = new Producto("Pelota", "pelota de tenis en perfecto estado", 10, "deportes");
        
        admin.visualizarProducto(pelota);
        
        //*********************************************************
        System.out.println("MENSAJE");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("de:");
        String nombrede = sc.next();
        
        UsuarioRegistrado comprador = gestion.buscarUsuario(nombrede);
        
        System.out.println("para:");
        String nombre = sc.next();
        
        UsuarioRegistrado vendedor = gestion.buscarUsuario(nombre);
        
        System.out.println("mensaje:");
        String mensaje = sc.next();
        
        Mensajeria msn = new Mensajeria(comprador, vendedor, mensaje);
        
        //*************************************************************

    }

}
