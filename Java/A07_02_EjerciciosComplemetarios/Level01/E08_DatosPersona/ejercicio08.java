package Java.A07_02_EjerciciosComplemetarios.Level01.E08_DatosPersona;

import java.util.Scanner;

public class ejercicio08
{
    public static void main(String[] args)
    {
        String[] persona = {"", "", "", ""};
        Scanner scan1 = new Scanner(System.in);

        System.out.println("\nPor favor, ingrese los datos de la persona.");

        System.out.print("Ingrese el nombre y apellido: ");
        persona[0] = scan1.nextLine();

        System.out.print("Ingrese la edad de la persona: ");
        persona[1] = scan1.next();

        System.out.print("Ingrese la direccion: ");
        persona[2] = scan1.nextLine();

        System.out.print("Ingrese la ciudad de residencia: ");
        persona[3] = scan1.nextLine();

        scan1.close();

        System.out.println(String.format("%s - %s - %d - %s", persona[3], persona[2], persona[1], persona[0]));
    }

}