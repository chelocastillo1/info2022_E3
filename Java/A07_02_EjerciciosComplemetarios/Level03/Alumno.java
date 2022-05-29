package Java.A07_02_EjerciciosComplemetarios.Level03;

import java.time.LocalDate;
import java.time.Period;

public class Alumno
{
    String pApellido;
    String pNombre;
    LocalDate pFDN; // Fecha de Nacimiento

    public Alumno(String strApellido, String strNombre, LocalDate dFechaDeNacimiento)
    {
        this.pApellido = strApellido;
        this.pNombre = strNombre;
        this.pFDN = dFechaDeNacimiento;
    }

    public String toString()
    {
        //return String.format("%s %s %s", this.pApellido, this.pNombre, this.getFechaDeNacimiento().toString());
        return String.format("%s %s", this.pApellido, this.pNombre);
    }

    public String getApellido()
    {
        return this.pApellido;
    }

    public String getNombre()
    {
        return this.pNombre;
    }

    public LocalDate getFechaDeNacimiento()
    {
        return this.pFDN;
    }

    public int getEdad()
    {
        return Period.between(this.pFDN, LocalDate.now()).getYears();
    }
}
