package Java.A07_01_PracticaGuiadaEjercicios.E02_IngresarTresEnteros;
import java.util.Scanner;

public class IngresarTresEnteros
{
    public static void main(String[] args)
    {
        boolean bContinuar = true;
        int[] numeros = {0, 0, 0};

        Scanner scan = new Scanner(System.in);

        while(bContinuar)
        {
            System.out.println("Por favor ingrese tres numeros.");
            System.out.println("Para terminar, ingrese (-1).\n");

            for(int i = 1; i <= 3; i++)
            {
                System.out.print(String.format("Ingrese el %d° numero: ", i));
                numeros[i-1] = scan.nextInt();

                if(numeros[i-1] == -1)
                    bContinuar = false;
            }
        
            for(int i = 0; i < 3; i++)
                System.out.println(String.format("El %d° numero ingresado es: %d", i + 1, numeros[i]));
        }

        scan.close();
    }
}