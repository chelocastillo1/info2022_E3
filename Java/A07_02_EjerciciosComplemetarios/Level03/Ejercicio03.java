package Java.A07_02_EjerciciosComplemetarios.Level03;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejercicio 03
 * Se dispone de una lista de Strings, 
 * de la cual saber la cantidad de valores que comiencen con la letra B (tanto mayúscula como minúscula, 
 * en ese caso decimos que será ignoreCase).
 */
public class Ejercicio03
{
    public static void main(String[] args)
    {
        List<String> listaCompleta = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");

        int nCantidad = listaCompleta.stream()
                    .filter(x -> x.toUpperCase().charAt(0) == 'B') // Al ser ignoreCase, paso todo a Mayus y compruebo
                    .collect(Collectors.toList()).size();
        
        if(nCantidad > 0)
            System.out.println(String.format("El resultado es: %s", nCantidad));
        else
            System.out.println("Sin resultados.");
    }
}