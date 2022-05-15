public class Alumno extends Persona
{
    private int pGrado;

    public Alumno(String strApellido, String strNombre, int nGrado)
    {
        super(strApellido, strNombre);

        this.setGrado(nGrado);
    }

    /*  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
        MÉTODOS: SET
        +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+   */
    
    protected void setGrado(int valor)
    {
        if(valor != 0)
            this.pGrado = valor;
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
}