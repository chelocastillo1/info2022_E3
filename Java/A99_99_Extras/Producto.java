package Java.A99_99_Extras;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Producto
{
    private String pNombre;
    private String pTipo;
    private BigDecimal pPrecioU;

    public Producto(String strNombre, String strTipo, BigDecimal dPrecioU)
    {
        this.setNombre(strNombre);
        this.setTipo(strTipo);
        this.setPrecioUnitario(dPrecioU);
    }

    public String toString()
    {
        return String.format("%s $%s", this.pNombre, new DecimalFormat("###,###,###,##0.00").format(this.pPrecioU));
    }

    protected void setNombre(String valor)
    {
        this.pNombre = valor == null ? "" : valor.trim();
    }

    protected void setTipo(String valor)
    {
        this.pTipo = valor == null ? "" : valor.trim();
    }

    public void setPrecioUnitario(BigDecimal valor)
    {
        this.pPrecioU = valor == null ? new BigDecimal(0) : valor;
    }

    public String getNombre()
    {
        return this.pNombre;
    }

    public String getTipo()
    {
        return this.pTipo;
    }

    public BigDecimal getPrecioUnitario()
    {
        return this.pPrecioU;
    }
}
