package Java.A99_99_Extras;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Funciones
{
    public static String toDecimalString(BigDecimal valor)
    {
        return new DecimalFormat("###,###,###,##0.00").format(valor);
    }
}
