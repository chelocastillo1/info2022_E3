package Java.otros;
import java.util.Scanner;

public class Potencia
{
    public static void main(String[] args)
    {
        int nBase, nExp;

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el número base: ");
        nBase = scan.nextInt();

        System.out.print("Ingrese el número exponente: ");
        nExp = scan.nextInt();

        System.out.println(String.format("La potencia entre %d y %d es: %f", nBase, nExp, exponencial(nBase, nExp)));
        
        scan.close();
    }

    /**
     * Operación matemática de exponenciación
     * @param b Base de la potencia.
     * @param nExp Exponente de la potencia.
     * @return Devuelve un número de tipo float que representa el resultado de la exponenciación.
     */
    public static float exponencial(int b, int nExp)
    {
        float nReturn;
        int j;

        nReturn = b;

        if(nExp == 0) // Cualquier nro elevado a cero (0), es igual a uno (1).
            return 1;

        j = nExp;
        if(j < 0)
            j = j * (-1);

        for(int i = 1; i < j; i++)
            nReturn = nReturn * b;

        if(nExp < 0) // Si el exponente es negativo...
            nReturn = 1 / nReturn;

        return nReturn;
    }
}