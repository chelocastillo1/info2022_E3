package Java.A07_02_EjerciciosComplemetarios.Level01;
import java.util.Scanner;

/**
 * Ejercicio 04: Factorial
 */
public class Ejercicio04
{
    public static void main(String[] args)
    {
        int op1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Por favor ingrese el número natural que desea factorizar: ");
        op1 = scan.nextInt();
        scan.close();
        
        System.out.println(String.format("El factorial de %d! es: %d", op1, factorizar(op1)));
    }

    /**
     * Permite obtener el factoria de n!
     * @param n Número natural a factorizar, al ser natural no se pueden calcular negativos.
     * @return Devuelve un número natural que representa el resultado de factorizar n1
     */
    protected static int factorizar(int n)
    {
        if(n > 0)
            return factorizar(n - 1) * n;
        
        return 1;
    }
}