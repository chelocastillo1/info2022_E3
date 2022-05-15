package Java.A07_01_PracticaGuiadaEjercicios.E04_DiaDeLaSemana;
import java.util.Scanner;

public class DiaDeLaSemana
{
    public static void main(String[] args)
    {
        boolean bContinuar = true;
        int nDia;

        Scanner scan = new Scanner(System.in);

        while(bContinuar)
        {
            System.out.println("\nPor favor ingrese un numero del 1 al 7.");
            System.out.println("Para terminar, ingrese (-1).\n");

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

    public static String getDiaString(int nDia)
    {
        String strResultado;

        switch(nDia)
        {
            case 1:
                strResultado = "Domingo";
                break;
            case 2:
                strResultado = "Lunes";
                break;
            case 3:
                strResultado = "Martes";
                break;
            case 4:
                strResultado = "Miercoles";
                break;
            case 5:
                strResultado = "Jueves";
                break;
            case 6:
                strResultado = "Viernes";
                break;
            case 7:
                strResultado = "Sabado";
                break;
            default:
                strResultado = "Indeterminado";
        }
        
        return strResultado;
    }
}