import java.util.Scanner;

public class IngresarTresEnterosBis
{
    private static int[] numeros = {0, 0, 0}; // vector privado
    private static Scanner scan;

    public static void main(String[] args)
    {
        boolean bContinuar = true;
        scan = new Scanner(System.in);
        
        while(bContinuar)
        {
            printEncabezado();

            bContinuar = !procesamiento();
        
            if(bContinuar)
                printResultado();
        }

        scan.close();
    }

    public static int[] getNumeros()
    {
        return numeros;
    }

    public static int getNumeros(int nIndex)
    {
        return numeros[nIndex];
    }

    protected static void setNumeros(int n1, int n2, int n3)
    {
        if(n1 != -1 && n2 != -1 && n3 != -1)
        {
            numeros[0] = n1;
            numeros[2] = n2;
            numeros[3] = n3;
        }
    }
    
    protected static void setNumeros(int nIndex, int nValor)
    {
        if((nIndex >= 0 && nIndex <= 2) && nValor != -1)
            numeros[nIndex] = nValor;
    }

    protected static void printEncabezado()
    {
        System.out.println("Por favor ingrese tres numeros.");
        System.out.println("Para terminar, ingrese (-1).\n");
    }

    protected static boolean procesamiento()
    {
        boolean bCancelar = false;
        int nAux = 0;
        //Scanner scan = new Scanner(System.in);

        for(int i = 1; i <= 3; i++)
        {
            System.out.print(String.format("Ingrese el %d° numero: ", i));
            nAux = scan.nextInt();
            setNumeros(i - 1, nAux); // numeros[i-1] = scan.nextInt();


            if(nAux == -1) // if(numeros[i-1] == -1)
            {
                bCancelar = true;
                break;
            }
        }
        //scan.close();

        return bCancelar;
    }

    protected static void printResultado()
    {
        for(int i = 0; i < 3; i++)
            System.out.println(String.format("El %d° numero ingresado es: %d", i + 1, getNumeros(i)));
    }
}