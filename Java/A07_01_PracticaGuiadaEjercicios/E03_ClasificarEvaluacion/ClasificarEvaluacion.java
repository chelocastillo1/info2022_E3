package Java.A07_01_PracticaGuiadaEjercicios.E03_ClasificarEvaluacion;
import java.util.ArrayList;
import java.util.Scanner;

public class ClasificarEvaluacion
{
    public static void main(String[] args)
    {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        boolean bContinuar = true;
        int nCalificacion;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nPor favor ingrese las calificaciones que desea evaluar.");
        System.out.println("Para terminar, ingrese (-1).\n");

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

        System.out.println(" ");
        System.out.println("A continuacion se detallaran las calificaciones evaluadas:");

        for(Integer n : lista)
            System.out.println(String.format("La nota %d es evaluada como: %s", n, evaluar(n)));
        
        System.out.println(" ");
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
}