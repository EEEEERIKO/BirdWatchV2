/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import ArchivoPlano.LeerArchivoPlano;
import java.util.List;

/**
 *
 * @author erikv
 */
public class Usuario {
    
    private String usuario;
    private String password;
    private String correoElectronico;
    private String nombre;
    private String apellidos;
    
    public Usuario(){
        
    }

    public Usuario(Integer ID, String usuario,  String password, String correoElectronico, String nombre, String apellidos) {
        
        this.usuario = usuario;
        this.password = password;
        this.correoElectronico = correoElectronico;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String getUsario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    

    
    
    public String correoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronic(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public static void main(String[] args) {
        try {
            
            String[] sublista = null;
            
            
                
            
           
            sublista = LeerArchivoPlano.leer("C:\\ERIKO\\UNAC\\BirdWatch-main\\BirdWatch-main\\src\\ArchivoPlano\\archivo.txt").split(",");
            System.out.println(sublista.length);
            
            
            
            
            
        } catch (Exception e) {
        }
        List<Usuario> lista = null;
        
        lista = LeerArchivoPlano.leerArchivoPlanoRutaV2("C:\\ERIKO\\UNAC\\BirdWatch-main\\BirdWatch-main\\src\\ArchivoPlano\\archivo.txt");
        System.out.println(lista.get(0).nombre);
        
        
    }
    public static int verificarUsuarioNuevo(String usuario) {
        
        return -1;
    } 
    
    /*public static int verificarLogueo(String usuario, String password){
        Vector lista = mostrar();
        Usuario obj;
        for(int i = 0; i < lista.size(); i++){
            obj = (Usuario)lista.elementAt(i);
            if(obj.getUsario().equalsIgnoreCase(usuario)){
                System.out.println("usuario Correcto");
            }
            if(password.equals((String)obj.getPassword())){
                System.out.println("contrasena correcta");
            }
            
            
            if(usuario.toLowerCase().equalsIgnoreCase((String)obj.getNombre().toLowerCase())&& password.equals((String)obj.getPassword())){
                return 1;
            }
        }
        return -1;
    }*/
    
    public static Usuario procesarLineaArchivoPlano(String linea){
        Usuario rutaV2 = new Usuario();
        String []lineaU = linea.split("\\|");
        String []lineaTexto = lineaU[0].split("USUARIO:");
        rutaV2.usuario = String.valueOf(lineaTexto[1]);
        lineaTexto = lineaU[1].split("CLAVE:");
        rutaV2.password = lineaTexto[1];
        lineaTexto = lineaU[2].split("CORREO:");
        rutaV2.correoElectronico = lineaTexto[1];
        lineaTexto = lineaU[3].split("NOMBRE:");
        rutaV2.nombre = lineaTexto[1];
        lineaTexto = lineaU[4].split("APELLIDO:");
        rutaV2.apellidos = lineaTexto[1];

        return rutaV2;
    }
    
    
    
    
    
    
}
