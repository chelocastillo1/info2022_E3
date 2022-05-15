package Java.A07_02_EjerciciosComplemetarios.Level01.E05_Multiplicacion;
import java.util.Scanner;

public class ejercicio05
{
    private static int[] operador = {0, 0};

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nPor favor ingrese dos numeros a multiplicar.");
        
        for(int i = 0; i <= operador.length-1; i++)
        {
            System.out.print(String.format("Operador 0%d: ", i + 1));
            setOperador(i, scan.nextInt());
        }

        scan.close();
        
        System.out.println(String.format("El producto de %d x %d es: %d", getOperador(0), getOperador(1), producto(getOperador(0), getOperador(1))));
    }

    protected static void setOperador(int nIndex, int nValor)
    {
        operador[nIndex] = nValor;
    }
    
    public static int getOperador(int nIndex)
    {
        return operador[nIndex];
    }

    protected static int producto(int n1, int n2)
    {
        int nAux;

        if(n1 == 0 || n2 == 0)
            return 0;
        
        nAux = 0;
        for(int i = 1; i <= getOperador(1); i++)
            nAux += getOperador(0);
        
        return nAux;
    }
}