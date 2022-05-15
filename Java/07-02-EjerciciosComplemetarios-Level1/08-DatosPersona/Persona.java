package DatosPersona;

public class Persona
{
    private String pNombreApellido;
    private int pEdad;
    private String pDireccion;
    private String pCiudad;

    public Persona(String strNombreApellido, int nEdad, String strDireccion, String strCiudad)
    {
        this.setNombreApellido(strNombreApellido);
        this.setEdad(nEdad);
        this.setDireccion(strDireccion);
        this.setCiudad(strCiudad);
    }

    public String toString()
    {
        return String.format("%s - %s - %d - %s", this.getCiudad(), this.getDireccion(), this.getEdad(), this.getNombreApellido());
    }

    protected void setCiudad(String valor)
    {
        this.pCiudad = (valor.length() > 0 ? valor : null);
    }

    protected void setDireccion(String valor)
    {
        this.pDireccion = (valor.length() > 0 ? valor : null);
    }

    protected void setEdad(int valor)
    {
        this.pEdad = (valor >= 0 ? valor : 0);
    }

    protected void setNombreApellido(String valor)
    {
        this.pNombreApellido = (valor.length() > 0 ? valor : null);
    }

    public String getCiudad()
    {
        return this.pCiudad;
    }

    public String getDireccion()
    {
        return this.pDireccion;
    }

    public int getEdad()
    {
        return this.pEdad;
    }

    public String getNombreApellido()
    {
        return this.pNombreApellido;
    }
}