package Java.A07_02_EjerciciosComplemetarios.Level03;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Ejercicio 04
 * Se dispone de una lista de Integer, 
 * de la cual queremos obtener otra lista aplicando la operación de factorial pero no se desean valores repetidos.
 */
public class Ejercicio04
{
    public static void main(String[] args)
    {
        List<Integer> listaCompleta = List.of(1, 2, 4, 4, 4);

        List<Integer> listaFiltrada = listaCompleta.stream()
                    .distinct() // Retorna una coleccion de elemento no repetidos en el stream.
                    .map(x -> factorial(x)) // Mapeo y aplico el factorial a cada elemento.
                    .collect(Collectors.toList()); // Retorno una lista con los resultados.
        
        if(listaFiltrada.size() > 0)
            System.out.println(String.format("El resultado es: %s", listaFiltrada));
        else
            System.out.println("Sin resultados.");
    }

    /**
     * Permite obtener el factorial de n!
     * @param n1 Número natural a operar, al ser natural no se pueden calcular negativos.
     * @return Devuelve un número natural que representa el resultado del factorial de n1
     */
    protected static int factorial(int n1)
    {
        if(n1 > 0)
            return factorial(n1 - 1) * n1;
        
        return 1;
    }
}