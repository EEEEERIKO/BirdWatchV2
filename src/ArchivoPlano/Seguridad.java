/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArchivoPlano;

import Clases.Usuario;
import java.awt.datatransfer.FlavorListener;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author erikv
 */
public class Seguridad {
    String res;
    
    
    private static List<Usuario> obtenerLista(){
        List<Usuario> lista = null;
        lista = LeerArchivoPlano.leerArchivoPlanoRutaV2("C:\\ERIKO\\UNAC\\BirdWatch-main\\BirdWatch-main\\src\\ArchivoPlano\\archivo.txt");
        return lista;
    }
    
        
    
    
    public static boolean usuarioRepetido(String usuario){
       List<Usuario> lista = obtenerLista();
        
        for(int i = 0 ; i<lista.size();i++ ){
            if (usuario.equalsIgnoreCase(lista.get(i).getUsario())) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean ingresarCuenta(String usuario, String clave){
        List<Usuario> lista = obtenerLista();
        
        for(int i = 0 ; i<lista.size();i++ ){
            if (usuario.equalsIgnoreCase(lista.get(i).getUsario()) && clave.equals(lista.get(i).getPassword()) ) {
                
                    return true;
                }
            }
        return false;  
    }
    
}
