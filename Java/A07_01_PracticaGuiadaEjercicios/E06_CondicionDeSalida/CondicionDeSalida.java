package Java.A07_01_PracticaGuiadaEjercicios.E06_CondicionDeSalida;
import java.util.Scanner;

public class CondicionDeSalida
{
    public static void main(String[] args)
    {
        boolean bContinuar = true;
        int nNumero;

        Scanner scan = new Scanner(System.in);

        while(bContinuar)
        {
            System.out.println("\nPor favor ingrese un numero.");
            System.out.println("Para terminar, ingrese (-1).\n");

            System.out.print("Ingrese un numero: ");
            nNumero = scan.nextInt();

            if(nNumero != -1)
                System.out.println(String.format("El numero ingresado es: %d", nNumero));
            else
                bContinuar = false;
        }

        scan.close();
        
        System.out.println("Cerrando la aplicacion.\n");
    }
}