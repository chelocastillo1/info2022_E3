package Java.A07_02_EjerciciosComplemetarios.Level03;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejercicio 01
 * Dada una lista que contiene valores de tipo String, 
 * se deberá filtrar todos los valores que NO sean null o vacío ("").
 */
public class Ejercicio01
{
    public static void main(String[] args)
    {
        List<String> listaCompleta = List.of("Hola", null, "Informatorio", "");

        List<String> listaFiltrada = listaCompleta.stream()
                                    .filter(palabra -> palabra != null) // primero filtramos los nulos
                                    .filter(palabra -> !palabra.isEmpty()) // luego filtramos los vacíos
                                    .collect(Collectors.toList());

        if(listaFiltrada.size() > 0)
            System.out.println(String.format("El resultado es: %s", listaFiltrada));
        else
            System.out.println("Ninguna coincidencia.");
    }
}