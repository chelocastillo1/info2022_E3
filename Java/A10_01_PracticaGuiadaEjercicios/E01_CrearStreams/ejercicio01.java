package Java.A10_01_PracticaGuiadaEjercicios.E01_CrearStreams;

import java.util.stream.Stream;

class E01_CrearStreams
{
    public static void main(String[] args)
    {
        Stream<String> vacio = Stream.empty();
        System.out.println(vacio);
    }
}