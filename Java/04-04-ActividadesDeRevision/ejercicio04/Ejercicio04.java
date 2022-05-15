import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import Alumno;

public class Ejercicio04
{
    private static Collection<Alumno> coleccion;

    public static void main(String[] args)
    {
        boolean bContinuar;
        Scanner scan1 = new Scanner(System.in);
        int nOpcion;

        coleccion = new ArrayList<Alumno>();

        bContinuar = true;
        nOpcion = 0;

        while(bContinuar)
        {
            System.out.println(" ");
            System.out.println("1. Cargar un alumno.");
            System.out.println("2. Mostrar listado.");
            System.out.println("3. Guardar listado en un archivo.");
            System.out.println("4. Cargar listado desde un archivo.");
            System.out.println("0. Salir.");
            System.out.print("Seleccione una opción: ");
            nOpcion = scan1.nextInt();
            System.out.println(" ");
            switch(nOpcion)
            {
                case 1: // Cargar un alumno
                    alumnoCargar();
                    break;
                case 2: // Mostrar listado
                    alumnoListado();
                    break;
                case 3: // Guardar listado en un archivo
                    archivoGuardar("ejercicio04.txt");
                    break;
                case 4: // Cargar listado desde un archivo
                    archivoCargar("ejercicio04.txt");
                    break;
                default: // Salir
                    bContinuar = false;
            }
        }

        scan1.close();
        coleccion.clear();
    }

    protected static void alumnoListado()
    {
        System.out.println("Listado de alumnos:");
        if(!coleccion.isEmpty())
            for(Alumno a : coleccion)
                System.out.println(String.format("%s, %s esta en %d° grado.", a.getApellido(), a.getNombre(), a.getGrado()));
        /* ME HACE BUCLE INFINITO :S
        while(coleccion.iterator().hasNext())
        {
            a = coleccion.iterator().next();

            System.out.println(String.format("%s, %s", a.getApellido(), a.getNombre()));
        }*/
    }

    protected static void alumnoCargar()
    {
        Alumno a;
        String strNombre, strApellido;
        int nGrado;
        Scanner scan2 = new Scanner(System.in); // Si lo cierro, me empieza a dar error en ejecución la variable scan1. :S

        System.out.print("Ingrese el nombre del alumno: ");
        strNombre = scan2.next();

        System.out.print("Ingrese el apellido del alumno: ");
        strApellido = scan2.next();

        System.out.print("Ingrese el grado en el que está el alumno: ");
        nGrado = scan2.nextInt();

        //scan2.close();

        a = new Alumno(strApellido, strNombre, nGrado);
        coleccion.add(a);

        if(coleccion.contains(a))
            System.out.println("Los datos del alumno fueron cargado exitosamente.");
        else
            System.out.println("Se produjo un error al intentar cargar los datos del alumno.");
    }

    protected static int archivoCargar(String rutaArchivo)
    {
        BufferedReader br;
        FileReader fr;
        String strLinea;
        String[] texto;

        try
        {
            fr = new FileReader(rutaArchivo);
            br = new BufferedReader(fr);

            if(fr != null && br != null)
            {
                coleccion.clear();

                while((strLinea = br.readLine()) != null)
                {
                    texto = strLinea.split(",");
                    coleccion.add(new Alumno(texto[1], texto[0], Integer.parseInt(texto[2])));
                }
                br.close();
                fr.close();
            }
        }
        catch (Exception e) {
                
        }

        return -1;
    }

    protected static int archivoGuardar(String rutaArchivo)
    {
        File f;
        BufferedWriter bw;
        String texto;

        try
        {
            f = new File(rutaArchivo);
            bw = new BufferedWriter(new FileWriter(f));

            if(f != null && bw != null)
            {
                if(!coleccion.isEmpty())
                {
                    texto = "";
                    for(Alumno a : coleccion)
                        texto += String.format("%s,%s,%s\n", a.getApellido(), a.getNombre(), a.getGrado());
                
                    bw.write(texto);
                }
                bw.close();
            }
        }
        catch (Exception e) {
            
        }

        return -1;
    }
}