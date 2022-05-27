package Java.A10_01_PracticaGuiadaEjercicios.E03_Numeros;

import java.util.stream.Stream;

public class ejercicio03
{
    public static void main(String[] args)
    {
        Stream<Integer> numeros = Stream.iterate(40, n -> n + 2).limit(20);
        numeros.forEach(n -> System.out.println(n));
        System.out.println(numeros);
    }
}
