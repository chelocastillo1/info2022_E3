import java.util.Scanner;

public class Ejercicio01
{
    public static void main(String[] args)
    {
        int op1, op2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingrelos números que desea sumar.");
        System.out.print("Operando 1: ");
        op1 = scan.nextInt();
        System.out.print("Operando 2: ");
        op2 = scan.nextInt();
        scan.close();
        
        System.out.println(String.format("El resultado de sumar %d + %d, es %d", op1, op2, sumatoria(op1, op2)));
    }

    protected static int sumatoria(int n1, int n2)
    {
        if(n1 != 0 && n2 != 0)
            return (n1 + n2);
        
        return 0;
    }
}