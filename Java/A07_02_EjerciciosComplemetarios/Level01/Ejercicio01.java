package Java.A07_02_EjerciciosComplemetarios.Level01;
import java.util.Scanner;

/**
 * Ejercicio 01: Nombre de usuario
 */
public class Ejercicio01
{
    private static String userName;

    public static void main(String[] args)
    {
        ingresarDatos();

        mostrarNombre();
    }

    protected static void setNombreUsuario(String valor)
    {
        if(valor != null)
            if(valor.length() > 0)
                userName = valor;
    }
    public static String getNombreUsuario()
    {
        return userName;
    }

    protected static void ingresarDatos()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Por favor, ingrese un nombre de usuario: ");
        setNombreUsuario(scan.next());

        scan.close();
    }

    protected static void mostrarNombre()
    {
        System.out.println(String.format("HOLA %s!!!", getNombreUsuario()));
    }
}
