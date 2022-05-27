package Java.A10_01_PracticaGuiadaEjercicios.E09_ActualizarPrecio;

import java.math.BigDecimal;
import java.util.List;

import Java.A99_99_Extras.Producto;

public class ejercicio09
{
    public static void main(String[] args)
    {
        List<Producto> catalogo = List.of(
            new Producto("Tomate x 1 kg", "Alimento", new BigDecimal(250000.00)),
            new Producto("Yerba x 1/2 kg", "Alimento", new BigDecimal(175000.00)),
            new Producto("Fernet Bronca x 1 Lts", "Bebida", new BigDecimal(1234567.89)),
            new Producto("Alfajor CHCLTE", "Alimento", new BigDecimal(9876.54))
        );

        catalogo.stream().forEach(Producto -> Producto.setPrecioUnitario(Producto.getPrecioUnitario().multiply(new BigDecimal(1.15))));
        catalogo.stream().forEach(Producto -> System.out.println(Producto));
    }

}
