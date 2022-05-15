import java.util.Scanner;

public class ejercicio09
{   
    public static void main(String[] args)
    {
        String texto = "";
        char letra;
        int nContador;
        Scanner scan = new Scanner(System.in);

        System.out.print("\nPor favor, escriba una palabra o un texto: ");
        texto = scan.nextLine();

        System.out.print("Ahora ingrese una letra que desee contar las veces que aparece en el texto: ");
        letra = scan.next().charAt(0);

        scan.close();

        nContador = 0;
        for(int i = 0; i <= texto.length() - 1; i++)
            if(texto.charAt(i) == letra)
                nContador++;

        System.out.println(String.format("La letra %s se repite %d veces en el texto ingresado.", letra, nContador));
    }

}