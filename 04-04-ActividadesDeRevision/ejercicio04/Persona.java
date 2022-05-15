package ejercicio04;

public class Persona
{
    private String pApellido;
    private String pNombre;

    public Persona(String strApellido, String strNombre)
    {
        this.setApellido(strApellido);
        this.setNombre(strNombre);
    }

    public String toString()
    {
        return String.format("%s %s", this.getApellido(), this.getNombre());
    }

    protected void setApellido(String valor)
    {
        this.pApellido = (valor.length() > 0 ? valor : null);
    }

    protected void setNombre(String valor)
    {
        this.pNombre = (valor.length() > 0 ? valor : null);
    }

    public String getApellido()
    {
        return this.pApellido;
    }

    public String getNombre()
    {
        return this.pNombre;
    }

    /**
     * Apellido y nombre del alumno.
     * @return Devuelve un objecto String que concatena el apellido y el nombre del alumno, separados por una coma.
     */
    public String getAyN()
    {
        return String.format("%s, %s", this.pApellido, this.pNombre);
    }
}