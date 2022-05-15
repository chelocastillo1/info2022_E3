package Java.A07_01_PracticaGuiadaEjercicios.E07_LogicaDeNegocio;
import java.util.ArrayList;
import java.util.Scanner;

public class ClasificarEvaluacionBis
{
    private static ArrayList<Integer> lista;

    public static void main(String[] args)
    {
        boolean bContinuar = true;
        int nCalificacion;

        lista = new ArrayList<Integer>();

        Scanner scan = new Scanner(System.in);

        printEncabezado();

        while(bContinuar)
        {
            System.out.print("Ingrese una calificacion: ");
            nCalificacion = scan.nextInt();

            if(nCalificacion != -1)
                lista.add(nCalificacion);
            else
                bContinuar = false;
        }

        scan.close();

        printResultado();
    }

    public static String evaluar(int nCalificacion)
    {
        String strResultado;

        if(nCalificacion > 92)
            strResultado = "Excelente";
        if(nCalificacion > 84)
            strResultado = "Sobresaliente";
        if(nCalificacion > 74)
            strResultado = "Distinguida";
        if(nCalificacion > 59)
            strResultado = "Buena";
        else
            strResultado = "Desaprobada";
        
        return strResultado;
    }

    protected static void printEncabezado()
    {
        System.out.println("\nPor favor ingrese las calificaciones que desea evaluar.");
        System.out.println("Para terminar, ingrese (-1).\n");
    }
    
    protected static void printResultado()
    {
        System.out.println(" ");
        System.out.println("A continuacion se detallaran las calificaciones evaluadas:");

        for(Integer n : lista)
            System.out.println(String.format("La nota %d es evaluada como: %s", n, evaluar(n)));
        
        System.out.println(" ");
    }
}