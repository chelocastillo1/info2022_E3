package Java.A07_01_PracticaGuiadaEjercicios.E07_LogicaDeNegocio;
import java.util.Scanner;

public class DiaDeLaSemanaBis
{
    public static void main(String[] args)
    {
        boolean bContinuar = true;
        int nDia;

        Scanner scan = new Scanner(System.in);

        while(bContinuar)
        {
            printEncabezado();

            System.out.print("Ingrese un numero: ");
            nDia = scan.nextInt();

            if(nDia != -1)
                System.out.println(String.format("%d - %s", nDia, getDiaString(nDia)));
            else
                bContinuar = false;
        }

        scan.close();

        System.out.println(" ");
    }

    protected static void printEncabezado()
    {
        System.out.println("\nPor favor ingrese un numero del 1 al 7.");
        System.out.println("Para terminar, ingrese (-1).\n");
    }

    public static String getDiaString(int nDia)
    {
        String[] strResultado = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};

        if(nDia >= 1 && nDia <= 7)
            return strResultado[nDia - 1];

        return "Indeterminado";
    }
}