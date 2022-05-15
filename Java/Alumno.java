import java.time.LocalDate;

public class Alumno extends Persona
{
    private int pGrado;
    private int pGrupo;

    public Alumno(int nDNI, String strApellido, String strNombre, LocalDate dFechaNacimiento, eSexo cSexo, 
                        int nGrado, int nGrupo)
    {
        super(nDNI, strApellido, strNombre);

        this.setGrado(nGrado);
        this.setGrupo(nGrupo);
    }

    /*  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
        MÉTODOS: SET
        +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+   */
    
    protected void setGrado(int valor)
    {
        if(valor != 0)
            this.pGrado = valor;
    }

    protected void setGrupo(int valor)
    {
        if(valor != 0)
            this.pGrupo = valor;
    }

    /*  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
        MÉTODOS: GET
        +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+   */

    /**
     * Permite conocer el grado al que pertenece el alumno.
     * @return Devuelve un int que representa el número de grado en el que está el alumno.
     */
    public int getGrado()
    {
        return this.pGrado;
    }

    /**
     * Permite conocer el grupo en el que está el alumno.
     * @return Devuelve un int que representa el número de grupo asignado al alumno.
     */
    public int getGrupo()
    {
        return this.pGrupo;
    }
}