package Java.A07_01_PracticaGuiadaEjercicios.E05_MultiplicadorDeNumero;
import java.util.Scanner;

public class MultiplicadorDeNumero
{
    public static void main(String[] args)
    {
        boolean bContinuar = true;
        int nNumero;

        Scanner scan = new Scanner(System.in);

        while(bContinuar)
        {
            System.out.println("\nPor favor ingrese un numero a multiplicar.");
            System.out.println("Para terminar, ingrese (-1).\n");

            System.out.print("Ingrese un numero: ");
            nNumero = scan.nextInt();

            if(nNumero != -1)
            {
                System.out.println(String.format("El numero ingresado es: %d", nNumero));
                
                for(int i = 1; i <= 10; i++)
                    System.out.println(String.format("%d x %d = %d", nNumero, i, nNumero * i));
            }
            else
                bContinuar = false;
        }

        scan.close();

        System.out.println(" ");
    }
}