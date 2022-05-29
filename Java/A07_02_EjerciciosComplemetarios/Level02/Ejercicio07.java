package Java.A07_02_EjerciciosComplemetarios.Level02;

import java.util.Scanner;

/**
 * Ejercicio 07: FizzBuzz
 */
public class Ejercicio07
{
    private static Scanner scan;
    
    public static void main(String[] args)
    {
        boolean bContinuar = true;
        int nOpcion, nOperador[] = {0, 0};

        scan = new Scanner(System.in);

        while(bContinuar)
        {
            System.out.println(" ");
            System.out.println("FUNCION FIZZBIZZ");
            System.out.println("1. Ejecutar una funcion descabellada. -_-!");
            System.out.println("0. Salir.");

            System.out.print("Seleccione una opción: ");
            nOpcion = scan.nextInt();
            
            System.out.println(" ");
            
            switch(nOpcion)
            {
                case 1: // Funcion descabellada
                    System.out.println("A continuacion debe definir un intervalo de dos numeros enteros.");
                    System.out.print("Ingrese el intervalo minimo a operar: ");
                    nOperador[0] = scan.nextInt();

                    System.out.print("Ahora, ingrese el intervalo maximo a operar: ");
                    nOperador[1] = scan.nextInt();

                    if(nOperador[0] < nOperador[1])
                    {
                        String[] strVector = fxUnaFuncionDescabellada(nOperador[0], nOperador[1]);
                        System.out.println(" ");
                        
                        for(String s : strVector)
                            System.out.print(String.format("%s ", s));

                        System.out.println(" ");
                    }
                    else
                        System.out.println(String.format("El intervalo [%d, %d] no es valido.", nOperador[0], nOperador[1]));
                    break;
                default: // Salir
                    bContinuar = false;
            }
        }
        scan.close();
    }

    protected static String[] fxUnaFuncionDescabellada(int n1, int n2) // -_-!
    {
        String[] strReturn;

        if(n2 < n1) // No cumple la condición de n2 mayor que n1.
            return null;
        
        strReturn = new String[n2 - n1];

        for(int i = n1; i < n2; i++)
        {
            if((i % 2) == 0 && (i % 3) == 0) // ¿Es múltiplo de dos y de tres?
                strReturn[i - n1] = "FizzBuzz";
            else if((i % 2) == 0) // ¿Es múltiplo de dos?
                strReturn[i - n1] = "Fizz";
            else if((i % 3) == 0) // ¿Es múltiplo de tres?
                strReturn[i - n1] = "Buzz";
            else
                strReturn[i - n1] = String.format("%d", i);
        }

        return strReturn;
    }
}
