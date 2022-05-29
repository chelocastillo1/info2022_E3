package Java.A07_02_EjerciciosComplemetarios.Level02;

import Java.A99_99_Extras.Persona;

public class Empleado extends Persona
{
    private int pHorasTrabajadas;
    private int pValorHora;

    public Empleado(int nDNI, String strApellido, String strNombre, int nHorasTrabajadas, int nValorHora)
    {
        super(nDNI, strApellido, strNombre);

        this.setHorasTrabajadas(nHorasTrabajadas);
        this.setValorHora(nValorHora);
    }

    public int calcularSueldo()
    {
        int nReturn = -1; // no se pudo calcular

        if(this.getHorasTrabajadas() > 0 && this.getValorHora() > 0)
            nReturn = (this.getHorasTrabajadas() * this.getValorHora());
        
        return nReturn;
    }

    /*  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
        MÉTODOS: SET
        +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+   */
    
    protected void setHorasTrabajadas(int valor)
    {
        if(valor >= 0)
            this.pHorasTrabajadas = valor;
    }

    protected void setValorHora(int valor)
    {
        if(valor >= 0)
            this.pValorHora = valor;
    }

    /*  +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
        MÉTODOS: GET
        +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+   */

    public int getHorasTrabajadas()
    {
        return this.pHorasTrabajadas;
    }

    public int getValorHora()
    {
        return this.pValorHora;
    }
}