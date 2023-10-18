package ArchivoPlano;


import Clases.Usuario;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class LeerArchivoPlano {
    static public String leer(String archivo) throws IOException {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea=br.readLine();
        
            return linea;
    }
    
    
    public static List<Usuario> leerArchivoPlanoRutaV2(String ruta) {
        Stream<String> lines = null;
        
        Path pathArchvioPlano = Paths.get(ruta);
        List<Usuario> listaRutaV2 = new LinkedList<>();
        try {
            lines = Files.lines(pathArchvioPlano);
            List<String> datos = lines.toList();
            for (String dato : datos) {
                Usuario nuevaRutaV2 = Usuario.procesarLineaArchivoPlano(dato);
                listaRutaV2.add(nuevaRutaV2);
            }
        } catch (IOException ioex) {
            System.err.println("Error de IO al leer el archivo plano " + ioex.getMessage());
        } finally {
            assert lines != null;
            lines.close();
        }
        return listaRutaV2;

    }
}


