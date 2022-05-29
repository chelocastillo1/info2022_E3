package Java.A07_02_EjerciciosComplemetarios.Level03;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejercicio 02
 * Dada una lista que contiene números enteros, 
 * se deberá generar otra lista que contendrá el resultado de aplicar la operación de potencia a 2.
 */
public class Ejercicio02
{
    public static void main(String[] args)
    {
        List<Integer> listaCompleta = List.of(1, 2, 3, 4, 5);

        List<Integer> listaFiltrada = listaCompleta.stream()
                                    .map(x -> (int)Math.pow(x, 2))
                                    .collect(Collectors.toList());
        
        if(listaFiltrada.size() > 0)
            System.out.println(String.format("El resultado es: %s", listaFiltrada));
        else
            System.out.println("Sin resultados.");
    }
}