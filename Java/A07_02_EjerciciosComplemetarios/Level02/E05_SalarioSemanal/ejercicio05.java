package Java.A07_02_EjerciciosComplemetarios.Level02.E05_SalarioSemanal;

import java.util.ArrayList;

public class ejercicio05
{
    public static void main(String[] args)
    {
        ArrayList<Integer> hTrabajadas = new ArrayList<Integer>();  // horas trabajadas (día)
        ArrayList<Integer> hValor = new ArrayList<Integer>();       // valor por hora
        ArrayList<Integer> totales = new ArrayList<Integer>();      // vector con los totales diarios

        // Cargar listas
        for(int i = 0; i < 5; i++)
        {
            hTrabajadas.add((int)(Math.random() * 10 + 1)); // entre 1h y 10h
            hValor.add((int)(Math.random() * 700 + 400)); // entre $400/h y $700/h
        }

        // Calcular...
        for(int i = 0; i < 5; i++)
            totales.add(hTrabajadas.get(i) * hValor.get(i));
        
        // Imprimir...
        String strAux = "";
        int nTotal = 0;

        for(int i = 0; i < 5; i++)
        {
            strAux += String.format("$%d ", totales.get(i));
            nTotal += totales.get(i);
        }
            
        System.out.println(String.format("Montos diarios: %s", strAux));
        System.out.println(String.format("Salario semanal: $%d", nTotal));
    }
}
