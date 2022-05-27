package Java.A10_01_PracticaGuiadaEjercicios.E04_ColeccionesStreams;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import Java.A99_99_Extras.Funciones;
import Java.A99_99_Extras.Producto;

public class ejercicio04
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

        Optional<Producto> productoBarato = catalogo.stream()
                                            .filter(Producto -> PRECIO_BUSQUEDA.compareTo(Producto.getPrecioUnitario()) > 0)
                                            .findFirst();
        
        if(productoBarato.isPresent())
            System.out.println(String.format("El primer producto encontrado con precio menor a $%s es: %s.", Funciones.toDecimalString(PRECIO_BUSQUEDA), productoBarato.get()));
        else
            System.out.println(String.format("No se ha encontrado un producto con precio menor a $%s.", Funciones.toDecimalString(PRECIO_BUSQUEDA)));
    }
}
