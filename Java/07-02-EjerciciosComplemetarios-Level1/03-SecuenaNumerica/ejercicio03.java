import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class ejercicio03
{
    private static int pNumero;

    public static void main(String[] args)
    {
        String strResultado = "";

        ingresarDatos();

        if(getNumero() > 0)
        {
            for(int i = 1; i <= getNumero(); i++)
            {
                for(int j = 1; j <= i; j++)
                    strResultado = String.format("%s %d", strResultado, j);
                
                strResultado += "\n";
            }
            
            System.out.println(strResultado);
        }
        else
            System.out.println("El numero deber ser mayor a cero (0).");
    }

    protected static void setNumero(int nValor)
    {
        pNumero = nValor;
    }
    
    public static int getNumero()
    {
        return pNumero;
    }

    protected static void ingresarDatos()
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("\nPor favor, ingrese el numero que desea secuenciar: ");
        setNumero(scan.nextInt());
        System.out.println(" ");

        scan.close();
    }
}