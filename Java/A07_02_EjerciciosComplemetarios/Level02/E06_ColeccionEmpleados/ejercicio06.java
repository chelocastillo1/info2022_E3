package Java.A07_02_EjerciciosComplemetarios.Level02.E06_ColeccionEmpleados;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ejercicio06
{
    private static HashSet<Empleado> empleados;
    private static Map<Integer, Integer> salarios;

    /// Vectores para cargar nombre/apellidos aleatoriamente.
    private static String vNombre[] = {"Ariel", "Ana", "Carlos", "Carla", "Felipe", "Florencia", "Gonzalo", "Gabriela", "Juan", "Jimena", "Pedro", "Patricia"};
    private static String vApellido[] = {"Perez", "Gonzalez", "Tevez", "Floridia", "Gomez", "Paez", "Castillo", "Caceres", "Garcia", "Gimenez", "Diaz", "Ruiz"};

    public static void main(String[] args)
    {
        empleados = new HashSet<Empleado>();
        salarios = new HashMap<>();
        
        // Cargar HashSet con datos aleatoriamente.
        int nDNI = 0, nHorasTrabajadas = 0, nValorHora = 0;
        String strNombre = "";
        String strApellido = "";
        for(int i = 0; i < 10; i++)
        {
            nDNI = (int)(Math.random() * 88888888 + 11111111);
            strNombre = vNombre[(int)(Math.random() * 12 + 1) - 1];
            strApellido = vApellido[(int)(Math.random() * 12 + 1) - 1];
            nHorasTrabajadas = (int)(Math.random() * 10 + 1);
            nValorHora = (int)(Math.random() * 900 + 400);

            empleados.add(new Empleado(nDNI, strApellido, strNombre, nHorasTrabajadas, nValorHora));
        }
        
        System.out.println(String.format("%10s | %-20s | %8s | %-7s", "DNI", "Apellido/Nombre", "H/T", "Salario"));
        for(Empleado e : empleados)
        {
            salarios.put(e.getDNI(), e.calcularSueldo()); // Proceder a calcular sueldos y almanarlos en un Map(DNI, salario)
            System.out.println(String.format("%10d   %-20s   %7d   $%7d", e.getDNI(), e.getAyN(), e.getHorasTrabajadas(), salarios.get(e.getDNI())));
        }

        empleados.clear();
        salarios.clear();
    }
}