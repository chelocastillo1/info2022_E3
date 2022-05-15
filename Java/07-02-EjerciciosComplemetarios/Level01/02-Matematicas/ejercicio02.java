import java.util.Scanner;

public class ejercicio02
{
    private static int[] operador = {0, 0};

    public static void main(String[] args)
    {
        ingresarDatos();

        mostrarResultado();
    }

    protected static void setOperador(int nIndex, int nValor)
    {
        operador[nIndex] = nValor;
    }
    public static int getOperador(int nIndex)
    {
        return operador[nIndex];
    }

    protected static void ingresarDatos()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, ingrese los dos numeros que desea operar.");
        
        for(int i = 0; i <= operador.length-1; i++)
        {
            System.out.print(String.format("Operador 0%d: ", i + 1));
            setOperador(i, scan.nextInt());
        }

        scan.close();
    }

    protected static void mostrarResultado()
    {
        System.out.println(String.format("%d + %d = %d", getOperador(0), getOperador(1), (getOperador(0) + getOperador(1))));
        System.out.println(String.format("%d - %d = %d", getOperador(0), getOperador(1), (getOperador(0) - getOperador(1))));
        System.out.println(String.format("%d x %d = %d", getOperador(0), getOperador(1), (getOperador(0) * getOperador(1))));
        try
        {
            System.out.println(String.format("%d / %d = %d", getOperador(0), getOperador(1), (getOperador(0) / getOperador(1))));
        } catch(ArithmeticException e)
        {
            System.out.println(String.format("%d / %d = [No se puede resolver]", getOperador(0), getOperador(1)));
        }
        try
        {
            System.out.println(String.format("%d %s %d = %d", getOperador(0), "%", getOperador(1), (getOperador(0) % getOperador(1))));
        } catch(ArithmeticException e)
        {
            System.out.println(String.format("%d %s %d = [No se puede resolver]", getOperador(0), "%", getOperador(1)));
        }
        
    }
}
