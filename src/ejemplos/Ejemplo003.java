package ejemplos;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo003 {
    /*
    Determinar cuánto se debe pagar por equis cantidad de lápices considerando
    que si son 1000 o más el costo es de 85¢; de lo contrario, el precio es de
    90¢.
    */
    public static void main(String[] args) {
        System.out.println("*** Calcular el precio de los lápices ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIntroduce la cantidad de lapices comprados: ");
        int cantidad = n.nextInt();
        
        float precio = cantidad>=1000?cantidad*0.85f:cantidad*0.90f;
        
        DecimalFormat f = new DecimalFormat("#.00");
        
        System.out.println("La cantidad a pagar es: $" + f.format(precio));
    }
}
