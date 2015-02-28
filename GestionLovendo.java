/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LoVendo;
import java.util.*;
/**
 *
 * @author alumno
 */
public class GestionLovendo {
  private List<UsuarioRegistrado> autorizados;
  private List<Producto> productos;
  
  public GestionLovendo(){
    autorizados = new ArrayList();
    productos = new ArrayList();
}
  public boolean autorizarUsuario(UsuarioRegistrado user){
      boolean exito = false;
      if(!autorizados.contains(user)){
          exito = true;
          autorizados.add(user);
      }
      
      return exito;
  }
  public boolean introducirProducto(Producto prod){
      boolean exito = false;
      if(!productos.contains(prod)){
          exito = true;
          productos.add(prod);
      }
      return exito;
  }
  public UsuarioRegistrado buscarUsuario(String nombre){
      UsuarioRegistrado u = null;
      for(UsuarioRegistrado i: autorizados){
          if(i.getNombre().equalsIgnoreCase(nombre)){
              u = i;
          }
      }
      return u;
  }
  
}
