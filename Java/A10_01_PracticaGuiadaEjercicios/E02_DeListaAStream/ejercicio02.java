package Java.A10_01_PracticaGuiadaEjercicios.E02_DeListaAStream;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class ejercicio02
{
    public static void main(String[] args)
    {
        Collection<String> vocales = Arrays.asList("A", "E", "I", "O", "U");
        Stream<String> vocalesStream = vocales.stream();
        System.out.println(vocalesStream);
    }
}