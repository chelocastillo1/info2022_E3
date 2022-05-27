package Java.A07_02_EjerciciosComplemetarios.Level02.E04_Estudiantes;

import java.util.ArrayList;
import java.util.Scanner;

import Java.A99_99_Extras.Alumno;

public class ejercicio04
{
    private static Scanner scan;
    private static ArrayList<Alumno> lista, gp1, gp2, gp3;

    public static void main(String[] args)
    {
        boolean bContinuar;
        scan = new Scanner(System.in);
        int nOpcion;

        lista = new ArrayList<Alumno>();

        bContinuar = true;
        nOpcion = 0;

        while(bContinuar)
        {
            System.out.println(" ");
            System.out.println("1. Cargar un alumno.");
            System.out.println("2. Mostrar listado de todos los alumnos.");
            System.out.println("3. Agrupar por curso asignado e imprimirlos.");
            System.out.println("0. Salir.");
            System.out.print("Seleccione una opción: ");
            nOpcion = scan.nextInt();
            System.out.println(" ");
            switch(nOpcion)
            {
                case 1: // Cargar un alumno
                    alumnoCargar();
                    break;
                case 2: // Mostrar listado
                    alumnoListado();
                    break;
                case 3: // Agrupar alumnos
                    alumnoAgrupar();
                    break;
                default: // Salir
                    bContinuar = false;
            }
        }

        scan.close();
        lista.clear();
    }

    protected static void alumnoCargar()
    {
        Alumno a;
        String strNombre, strApellido;
        int nGrado;

        System.out.print("Ingrese el nombre del alumno: ");
        strNombre = scan.next();

        System.out.print("Ingrese el apellido del alumno: ");
        strApellido = scan.next();

        System.out.print("Ingrese el grado en el que está el alumno: ");
        nGrado = scan.nextInt();

        a = new Alumno(strApellido, strNombre, nGrado);
        lista.add(a);

        if(lista.contains(a))
            System.out.println("Los datos del alumno fueron cargado exitosamente.");
        else
            System.out.println("Se produjo un error al intentar cargar los datos del alumno.");
    }

    protected static void alumnoListado()
    {
        System.out.println("Listado de alumnos:");
        if(!lista.isEmpty())
            for(Alumno a : lista)
                System.out.println(String.format("%s, %s esta en %d° grado.", a.getApellido(), a.getNombre(), a.getGrado()));
    }

    protected static void alumnoAgrupar()
    {
        if(lista.size() > 0)
        {
            gp1 = new ArrayList<Alumno>();
            gp2 = new ArrayList<Alumno>();
            gp3 = new ArrayList<Alumno>();
            
            for(Alumno a : lista)
            {
                switch(a.getGrado())
                {
                    case 1:
                        gp1.add(a);
                        break;
                    case 2:
                        gp2.add(a);
                        break;
                    case 3:
                        gp3.add(a);
                        break;
                }
            }

            // Proceder a imprimir los cursos
            if(gp1.size() > 0)
            {
                System.out.println("Alumnos asignados al curso 1: ");
                for(Alumno a : gp1)
                    System.out.println(a);
            }
            else
                System.out.println("El curso 1 no tiene alumnos asignados.");
        }
        else
            System.out.println("Aun no se han cargado alumnos al listado.");
    }
}