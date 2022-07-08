package Java.A07_02_EjerciciosComplemetarios.Level03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Ejercicio 05
 * Se posee una Lista con objetos de clase Alumno con los atributos: 
 * apellido, nombre y fechaDeNacimiento (con tipos: String, String y LocalDate).
 * Se desea generar un Map<String, Integer> donde la clave de Map será el apellido concatenado con el nombre 
 * (con separador de espacio en blanco) y el value la edad del alumno.
 * La lista de entrada debe estar cargada con varios alumnos (al menos 5) para subir el ejemplo y demostrar su funcionamiento.
 * En ejemplo se muestra solo con 1 Alumno a modo de abreviar.
 * En el ejemplo también se usa LocalDate.now().minusYears(30), 
 * en el ejercicio a presentar se deberá usar otra tecnica de construcción para la fecha (no usar .now().
 * Pueden ver métodos .parse(), etc)
 */
public class Ejercicio05
{
    //private static List<Alumno> alumnos;

    public static void main(String[] args)
    {
        List<Alumno> alumnos = new ArrayList<Alumno>();
        //Map<String, Integer> listaFiltrada = new HashMap<>();

        cargarListaAlumnosAleatorios(alumnos);

        /*for (Alumno alumno : alumnos)
            System.out.println(alumno);*/

        Map<String, Integer> listaFiltrada = alumnos.stream()
                .collect(Collectors.toMap(  x -> x.toString(), // key, forzamos con el .toString(), sino, devuelve un Object.
                                            x -> x.getEdad()) // value
                                        );

        if(listaFiltrada.size() > 0)
            System.out.println(String.format("El resultado es: %s", listaFiltrada));
        else
            System.out.println("Sin resultados.");
    }

    /**
     * Carga una lista de alumnos con datos aleatorios ...
     */
    protected static void cargarListaAlumnosAleatorios(List<Alumno> aux)
    {
        aux.add(new Alumno("Ariel", "Perez", LocalDate.of(1986, 9, 12)));
        aux.add(new Alumno("Ana", "Gonzalez", LocalDate.of(1994, 1, 14)));
        aux.add(new Alumno("Carlos", "Tevez", LocalDate.of(1989, 7, 11)));
        aux.add(new Alumno("Carla", "Floridia", LocalDate.of(1998, 4, 1)));
        aux.add(new Alumno("Felipe", "Gomez", LocalDate.of(2000, 11, 30)));
        aux.add(new Alumno("Florencia", "Paez", LocalDate.of(1989, 1, 14)));
        aux.add(new Alumno("Gonzalo", "Castillo", LocalDate.of(1992, 3, 22)));
        aux.add(new Alumno("Gbariela", "Caceres", LocalDate.of(1995, 7, 2)));
        aux.add(new Alumno("Juan", "Garcia", LocalDate.of(1999, 10, 18)));
    }
    // protected static void cargarListaAlumnosAleatorios(List<Alumno> aux)
    // {
    //     // Vectores para cargar nombre/apellidos aleatoriamente.
    //     final String vNombre[] = {"Ariel", "Ana", "Carlos", "Carla", "Felipe", "Florencia", "Gonzalo", "Gabriela", "Juan", "Jimena", "Pedro", "Patricia"};
    //     final String vApellido[] = {"Perez", "Gonzalez", "Tevez", "Floridia", "Gomez", "Paez", "Castillo", "Caceres", "Garcia", "Gimenez", "Diaz", "Ruiz"};

    //     for(int i = 0; i < 10; i++)
    //     {
    //         strAlumno[0] = vApellido[(int)(Math.random() * 12 + 1) - 1]; // Aleatorización para el apellido
    //         strAlumno[1] = vNombre[(int)(Math.random() * 12 + 1) - 1]; // Aleatorización para el nombre

    //         // Aleatorización para la fecha de nacimiento...
    //         nFecha[0] = 1986 + ((int)(Math.random() * 18 + 1)); // AÑO: del 1986 al 2004
    //         //nFecha[0] = getNumeroAleatorio(2016, 2022); // AÑO: del 2004 al 2022 (No me está dando resultado... :S)
    //         nFecha[1] = (int)(Math.random() * 12 + 1); // MES: del 1 al 12
    //         nFecha[2] = (int)(Math.random() * getDiasDelMes(nFecha[0], nFecha[1]) + 1); // DÍA: del 1 al N (según función getDiasDelMes())

    //         aux.add(new Alumno(strAlumno[0], strAlumno[1], LocalDate.of(nFecha[0], nFecha[1], nFecha[2])));
    //     }
    // }

    /**
     * Permite obtener la cantidad de días para determinado mes del año.
     * @param nAnio Requerido para saber si es bisiesto o no.
     * @param nMes del uno al doce.
     * @return Devuelve un entero que representa la cantidad de días para el mes requerido.
     */
    protected static int getDiasDelMes(int nAnio, int nMes)
    {
        int nReturn;

        switch(nMes)
        {
            case 2: // febrero
                nReturn = esBisiesto(nAnio) ? 29 : 28;
                break;
            case 1: // enero
            case 3: // marzo
            case 5: // mayo
            case 7: // julio
            case 8: // agosto
            case 10: // octubre
            case 12: // diciembre
                nReturn = 31;
                break;
            case 4: // abril
            case 6: // junio
            case 9: // septiembre
            case 11: // noviembre
                nReturn = 30;
                break;
            default:
                nReturn = 0;
        }

        return nReturn;
    }

    /**
     * Determina si el año ingresado es bisiesto, de ser así, febrero tiene 29 días
     * @param n Año
     * @return Devuelve verdadero si el año ingresado es bisiesto
     */
    protected static boolean esBisiesto(int n)
    {
        GregorianCalendar aux = new GregorianCalendar();
        return aux.isLeapYear(n) ? true : false;
    }
}
