import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class EscribirWritter {

    public static void main(String[] args) {
        String data = " Pablo Estas líneas de texto\n irán al fichero Ďœ᨟";

	        try {
	            // Crea el FileOutputStream
	            FileWriter file = new FileWriter("/home/pablo/Escritorio/proyect_Lambas-Streams/output.txt");

	            // Se envuelve (wrapea) en un stream con bufer. Tamaño búfer de 8192 bytes, por defecto.
	            BufferedWriter output = new BufferedWriter(file);

	           

	            // Se escriben los datos al flujo de salida.
	            output.write(data);
	            // Nunca olvidar que se debe cerrar el flujo.
	            output.close();
	        }

	        catch (Exception e) {
	            e.getStackTrace();
	        }

    }
    
}
