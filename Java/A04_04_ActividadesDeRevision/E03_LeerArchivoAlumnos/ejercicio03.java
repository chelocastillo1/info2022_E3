package Java.A04_04_ActividadesDeRevision.E03_LeerArchivoAlumnos;

import java.io.BufferedReader;
import java.io.FileReader;

public class ejercicio03
{
    public static void main(String[] args)
    {
        System.out.println("A continuacion se mostrara un listado de los alumnos:");
        try {
            leer("ejercicio03.txt");
        } catch (Exception e) {
            System.out.println("Se produjo un error al intentar leeer el archivo.");
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