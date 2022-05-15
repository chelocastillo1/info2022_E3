import java.time.LocalDate;

public class poo
{
    public static void main(String[] args)
    {
        Persona p;
        p = new Persona(31612475, "Castillo", "Marcelo", LocalDate.of(1985, 8, 25), eSexo.Masculino);

        System.out.println(String.format("La edad de %s es de %d años.", p, p.getEdad()));
    }
}
