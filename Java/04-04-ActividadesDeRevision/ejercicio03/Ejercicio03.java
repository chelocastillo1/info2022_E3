import java.io.BufferedReader;
import java.io.FileReader;

public class Ejercicio03
{
    public static void main(String[] args)
    {
        System.out.println("A continuacion se mostrara un listado de los alumnos:");
        try {
            leer("ejercio03.txt");
        } catch (Exception e) {
            
        }
    }

    protected static int leer(String rutaArchivo)
    {
        BufferedReader br;
        FileReader fr;
        String strLinea;
        String[] strNyA; // Nombre y apellido

        try
        {
            fr = new FileReader(rutaArchivo);
            br = new BufferedReader(fr);

            if(fr != null && br != null)
            {
                while((strLinea = br.readLine()) != null)
                {
                    strNyA = strLinea.split(";");

                    System.out.println(String.format("%s, %s", strNyA[1], strNyA[0]));
                }
                br.close();
                fr.close();
            }
        }
        catch (Exception e) {
                
        }

        return -1;
    }
}