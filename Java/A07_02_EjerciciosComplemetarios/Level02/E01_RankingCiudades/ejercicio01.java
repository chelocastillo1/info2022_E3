package Java.A07_02_EjerciciosComplemetarios.Level02.E01_RankingCiudades;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio01
{
    private static Scanner scan;
    private static ArrayList<String> pCiudades = new ArrayList<String>();

    protected static int ID_CIUDAD_EXISTE = -1;
    protected static int ID_CAMPO_VACIO = -2;
    protected static int ID_VALOR_NULL = -3;

    public static void main(String[] args)
    {
        boolean bContinuar;
        int nOpcion;
        
        //ciudades = new ArrayList<String>();
        scan = new Scanner(System.in);
        bContinuar = true;

        while(bContinuar)
        {
            System.out.println("\nRanking de ciudades favoritas.");
            System.out.println("1. Agregar ciudad.");
            System.out.println("2. Borrar ciudad.");
            System.out.println("3. Ver ranking de ciudades favoritas.");
            System.out.println("0. Salir.");

            System.out.print("Ingrese un numero: ");
            nOpcion = scan.nextInt();

            switch(nOpcion)
            {
                case 1: // Agregar
                    ciudadAgregar();
                    break;
                case 2: // Borrar
                    ciudadBorrar();
                    break;
                case 3: // Ver ranking
                    ciudadRanking();
                    break;
                default: // Salir
                    bContinuar = false;
            }
        }
        scan.close();
    }

    protected static int setCiudad(String valor)
    {
        int nReturn;

        nReturn = 0; // success

        if(valor != null)
            if(valor.length() > 0)
                if(!pCiudades.contains(valor))
                    pCiudades.add(valor);
                else
                    nReturn = ID_CIUDAD_EXISTE; // ya existe
            else
                nReturn = ID_CAMPO_VACIO;
        else
            nReturn = ID_VALOR_NULL;
        
        return nReturn;
    }

    public static String getCiudad(int nIndex)
    {
        if(nIndex >= 0 && nIndex <= pCiudades.size())
            return pCiudades.get(nIndex);
        
        return null;
    }

    /**
     * Elimina un elemento de la lista a partir de un índice pasado.
     * @param nIndex Indice del elemento de la lista que se desea eliminar.
     * @return
     */
    protected static boolean delCiudad(int nIndex)
    {
        String strAux;

        if(nIndex >= 0 && nIndex <= pCiudades.size())
        {
            strAux = pCiudades.get(nIndex);
            pCiudades.remove(nIndex);
            
            return !pCiudades.contains(strAux);
        }

        return false;
    }

    protected static void ciudadAgregar()
    {
        String strAux;
        int nReturn;

        System.out.print("Ingrese un nombre de ciudad: ");
        strAux = scan.next();

        
        if(strAux.length() > 0)
        {
            nReturn = setCiudad(strAux);

            /* error: case expressions must be constant expressions :S
            Me cago en vos (java), incompatibilidad entre el switch y las constantes?
            switch(nReturn)
            {
                case ID_CIUDAD_EXISTE:
                    System.out.println("El nombre de ciudad que intenta agregar, ya existe.");
                    break;
                case ID_CAMPO_VACIO:
                    System.out.println("No ha ingresado nada, vuelva a intentarlo.");
                    break;
                case ID_VALOR_NULL:
                    System.out.println("Error, el valor es nulo (esto no deberia aparecer aqui :S).");
                    break;
                default: // success
            }*/

            if(nReturn == ID_CIUDAD_EXISTE)
                System.out.println("El nombre de ciudad que intenta agregar, ya existe.");
            if(nReturn == ID_CAMPO_VACIO)
                System.out.println("No ha ingresado nada, vuelva a intentarlo.");
            if(nReturn == ID_VALOR_NULL)
                System.out.println("Error, el valor es nulo (esto no deberia aparecer aqui :S).");
            else
                System.out.println("La ciudad se agrego a la lista exitosamente.");
        }
        else
            System.out.println("No ha ingresado nada, vuelva a intentarlo.");
    }

    protected static void ciudadBorrar()
    {
        int nIndex;

        System.out.println("\nListado de las ciudades que puede quitar." + pCiudades.size());
        for(int i = 0; i <= pCiudades.size() - 1; i++)
            System.out.println(String.format("#%d - %s", i + 1, pCiudades.get(i)));

        System.out.print("\nPor favor, ingrese el numero de la ciudad a borrar: ");
        nIndex = scan.nextInt();

        if(nIndex > 0 && nIndex <= pCiudades.size())
            if(delCiudad(nIndex - 1))
                System.out.println("La ciudad se ha elimiado del listado.");
            else
                System.out.println("Error, no se pudo eliminar la ciudad.");
        else
            System.out.println("Error, indice no valido.");
    }

    public static void ciudadRanking()
    {
        System.out.println("\nRanking de sus ciudades favoritas:");
        
        for(int i = 0; i < pCiudades.size(); i++)
            System.out.println(String.format("#%d - %s", i + 1, pCiudades.get(i)));
    }
}