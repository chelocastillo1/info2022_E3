package Java.A10_01_PracticaGuiadaEjercicios.E06_ListaMenores200k;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

import Java.A99_99_Extras.Producto;

public class ejercicio06
{
    private static final BigDecimal PRECIO_BUSQUEDA = new BigDecimal(200000.00);

    public static void main(String[] args)
    {
        List<Producto> catalogo = List.of(
            new Producto("Tomate x 1 kg", "Alimento", new BigDecimal(250000.00)),
            new Producto("Yerba x 1/2 kg", "Alimento", new BigDecimal(175000.00)),
            new Producto("Fernet Bronca x 1 Lts", "Bebida", new BigDecimal(1234567.89)),
            new Producto("Alfajor CHCLTE", "Alimento", new BigDecimal(9876.54))
        );

        List<Producto> productosBaratos = catalogo.stream()
                                            .filter(Producto -> PRECIO_BUSQUEDA.compareTo(Producto.getPrecioUnitario()) > 0)
                                            .collect(Collectors.toList());
        
        System.out.println(productosBaratos);
    }
}
