package Java.A07_02_EjerciciosComplemetarios.Level02;
import java.util.ArrayList;

/**
 * Ejercicio 02: ArrayList
 */
public class Ejercicio02
{
    public static void main(String[] args)
    {
        ArrayList<Integer> lista = new ArrayList<Integer>();

        for(int i = 0; i < 5; i++) // agregar 5 numeros
            lista.add((int)(Math.random() * 1000 + 1));

        System.out.println(String.format("Total de elementos en lista: %d.", lista.size()));
        
        lista.add(0, (int)(Math.random() * 1000 + 1)); // agregar al principio
        System.out.println(String.format("Se inserto el %d al principio.", lista.get(0)));

        lista.add(lista.size(), (int)(Math.random() * 1000 + 1)); // agregar al final
        System.out.println(String.format("Se agrego el %d al final.", lista.get(lista.size() - 1)));

        System.out.println(String.format("Ahora la lista contiene %d elementos.", lista.size()));

        for(int i = 0; i < lista.size(); i++) // iterar lista y mostrar elementos
            System.out.println(String.format("%d", lista.get(i)));
    }
}
