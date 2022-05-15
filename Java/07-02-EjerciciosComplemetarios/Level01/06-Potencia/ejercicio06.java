import java.util.Scanner;

public class ejercicio06
{
    private static int[] operador = {0, 0};

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el numero base: ");
        setOperador(0, scan.nextInt());

        System.out.print("Ingrese el numero exponente: ");
        setOperador(1, scan.nextInt());

        System.out.println(String.format("\n%d elevado a %d = %f\n", getOperador(0), getOperador(1), potencia(getOperador(0), getOperador(1))));
        
        scan.close();
    }

    protected static void setOperador(int nIndex, int nValor)
    {
        operador[nIndex] = nValor;
    }
    
    public static int getOperador(int nIndex)
    {
        return operador[nIndex];
    }

    /**
     * Operación matemática de exponenciación
     * @param b Base de la potencia.
     * @param nExp Exponente de la potencia.
     * @return Devuelve un número de tipo float que representa el resultado de la exponenciación.
     */
    public static float potencia(int b, int nExp)
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