package ejemplos;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo004 {
    /*
    Almacenes “El harapiento distinguido” tiene una promoción: a todos los
    trajes que tienen un precio superior a $2500.00 se les aplicará un descuento
    de 15 %, a todos los demás se les aplicará sólo 8 %. Determinar el precio
    final que debe pagar una persona por comprar un traje y de cuánto es el
    descuento que obtendrá. 
    */
    public static void main(String[] args) {
        System.out.println("*** Calcular el descuento de un traje ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Introduce el costo del traje: $");
        float costoTraje = n.nextFloat();
        
        float descuento = costoTraje>2500?costoTraje*0.15f:costoTraje*0.08f;
        
        DecimalFormat f = new DecimalFormat("#.00");
        
        System.out.println("El precio final a pagar es de: $" + f.format(costoTraje - descuento));
        System.out.println("El descuento aplicado fué de: $" + f.format(descuento));
    }
}
