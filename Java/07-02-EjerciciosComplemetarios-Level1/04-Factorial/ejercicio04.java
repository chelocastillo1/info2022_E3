import java.util.Scanner;

public class ejercicio04
{
    public static void main(String[] args)
    {
        int op1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Por favor ingrese el número que desea factorizar: ");
        op1 = scan.nextInt();
        scan.close();
        
        System.out.println(String.format("El factorial de %d! es: %d", op1, factorizar(op1)));
    }

    protected static int factorizar(int n1)
    {
        if(n1 > 0)
            return factorizar(n1 - 1) * n1;
        
        return 1;
    }
}