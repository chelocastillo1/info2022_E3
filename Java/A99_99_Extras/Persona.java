package Java.A99_99_Extras;

import java.time.LocalDate;
import java.util.Calendar;

enum eSexo
{
    Femenino, 
    Masculino
}

public class Persona
{
    private int pDNI;
    private String pApellido;
    private String pNombre;
    private LocalDate pFechaNacimiento;
    private eSexo pSexo;

    public Persona(int nDNI, String strApellido, String strNombre, LocalDate dFechaNacimiento, eSexo cSexo)
    {
        this.setDNI(nDNI);
        this.setApellido(strApellido);
        this.setNombre(strNombre);
        this.setFechaNacimiento(dFechaNacimiento);
        this.setSexo(cSexo);
    }

    public Persona(int nDNI, String strApellido, String strNombre, LocalDate dFechaNacimiento)
    {
        this.setDNI(nDNI);
        this.setApellido(strApellido);
        this.setNombre(strNombre);
        this.setFechaNacimiento(dFechaNacimiento);
    }

    public Persona(int nDNI, String strApellido, String strNombre)
    {
        this.setDNI(nDNI);
        this.setApellido(strApellido);
        this.setNombre(strNombre);
    }

    public Persona(String strApellido, String strNombre)
    {
        this.setApellido(strApellido);
        this.setNombre(strNombre);
    }

    public String toString()
    {
        return String.format("%s %s", this.getApellido(), this.getNombre());
    }

    protected void setDNI(int valor)
    {
        this.pDNI = (valor > 0 ? valor : 0);
    }
    
    protected void setApellido(String valor)
    {
        this.pApellido = (valor.length() > 0 ? valor : null);
    }

    protected void setNombre(String valor)
    {
        this.pNombre = (valor.length() > 0 ? valor : null);
    }

    protected void setFechaNacimiento(LocalDate valor)
    {
        this.pFechaNacimiento = valor;
    }

    protected void setSexo(eSexo valor)
    {
        this.pSexo = valor;
    }

    public int getDNI()
    {
        return this.pDNI;
    }

    public String getApellido()
    {
        return this.pApellido;
    }

    public String getNombre()
    {
        return this.pNombre;
    }

    public LocalDate getFechaNacimiento()
    {
        return this.pFechaNacimiento;
    }

    /**
     * Apellido y nombre del alumno.
     * @return Devuelve un objecto String que concatena el apellido y el nombre del alumno, separados por una coma.
     */
    public String getAyN()
    {
        return String.format("%s, %s", this.pApellido, this.pNombre);
    }

    /**
     * Permite conocer la edad de la persona a través de un cálculo obtenido de la fecha de nacimiento.
     * @return Devuelve un valor int que representa la edad.
     */
    public int getEdad() // a la forma antigua
    {
        Calendar hoy, nacimiento;

        if(this.pFechaNacimiento != null)
        {
            int nAux;

            hoy = Calendar.getInstance();
            nacimiento = Calendar.getInstance();

            hoy.set(LocalDate.now().getYear(), LocalDate.now().getMonthValue(), LocalDate.now().getDayOfMonth());
            nacimiento.set(this.getFechaNacimiento().getYear(), this.getFechaNacimiento().getMonthValue(), this.getFechaNacimiento().getDayOfMonth());

            // Obtenemos la edad según los años transcurridos.
            nAux = hoy.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);

            // Si el año de la fecha de nacimiento y de la fecha actual son distindos...
            if(hoy.get(Calendar.YEAR) != nacimiento.get(Calendar.YEAR))
            {
                // Si el mes de nacimiento es el mismo (o posterior) al mes de la fecha actual...
                if(nacimiento.get(Calendar.MONTH) <= hoy.get(Calendar.MONTH))
                {
                    // Si el día de nacimiento es el mismo (o posterior) al día de la fecha actual...
                    if(nacimiento.get(Calendar.DATE) <= hoy.get(Calendar.DATE))
                        return nAux; // Devolvemos la edad calculada en un principio.
                }
                
                return (nAux - 1);  // Sí no, devolvemos la edad calculada menos uno (-1), 
                                    // ya que no se cumple la condición de mismo mes/día de nacimiento.
            }
            else
                return 0; // Si los años son iguales, quiere decir que aún no cumplió años.
        }
        
        return -1;  // error :S
                    // this.pFechaNacimiento no fue instanciado
    }

    public eSexo getSexo()
    {
        return this.pSexo;
    }
}