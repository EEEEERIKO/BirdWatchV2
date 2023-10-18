package ArchivoPlano;

import java.io.*;

public class EscribirArchivoPlano {
    public static void escribir(String usuario, String password, String correo, String nombre, String apellido ){
        String nombreArchivo = "C:\\ERIKO\\UNAC\\BirdWatch-main\\BirdWatch-main\\src\\ArchivoPlano\\archivo.txt";

        try {

            FileWriter fileWriter = new FileWriter(nombreArchivo, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("USUARIO:"+usuario+"|CLAVE:"+password+"|CORREO:"+correo+"|NOMBRE:"+nombre+"|APELLIDO:"+apellido+"\n");
            
            bufferedWriter.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
