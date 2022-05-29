package Java.A07_02_EjerciciosComplemetarios.Level02;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Ejercicio 03: Baraja francesa
 */
public class Ejercicio03
{
    public static void main(String[] args)
    {
        ArrayList<String> baraja = new ArrayList<String>();

        // Cargar baraja francesa en orden.
        baraja.add("A"); // 1
        baraja.add("2");
        baraja.add("3");
        baraja.add("4");
        baraja.add("5");
        baraja.add("6");
        baraja.add("7");
        baraja.add("8");
        baraja.add("9");
        baraja.add("10");
        baraja.add("J"); // 11
        baraja.add("Q"); // 12
        baraja.add("K"); // 13

        System.out.print("Baraja en orden ascendente: ");
        imprimirBaraja(baraja); // Imprimir baraja

        // Collections.sort(baraja, Collections.reverseOrder()); // invertir orden
        // Collections.sort: No hace lo que quiero, revertir el orden actuál sin importar su codigo ascii.
        ArrayList<String> aux = new ArrayList<String>();
        
        // vamos a invertir el orden como se requiere...
        for(int i = baraja.size() - 1; i >= 0; i--) // recorremos la lista <baraja>
            aux.add(baraja.get(i));    // y por cada naipe, lo volcamos en la lista auxiliar <aux>, 
                                                                // pero en el orden opuesto sin importar su codigo ascii.
        
        baraja = aux; // Ahora sobreescribimos la lista <baraja> con la lista auxiliar <aux>.
        System.out.print("Baraja en orden descendente: ");
        imprimirBaraja(baraja); // Imprimir baraja en orden invertido

        Collections.shuffle(baraja);
        System.out.print("Baraja desordenada: ");
        imprimirBaraja(baraja); // Imprimir baraja
    }

    protected static void imprimirBaraja(ArrayList<String> strArray)
    {
        String strReturn = "";

        for(String strNaipe : strArray)
            strReturn += String.format("%s ", strNaipe);

        System.out.println(strReturn);
    }
}
