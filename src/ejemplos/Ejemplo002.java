package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo002 {
    /*
    Determinar si un número es positivo o negativo. 
    */
    public static void main(String[] args) {
        System.out.println("*** Determina si un número es positivo o negativo ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIntroduzca el número: ");
        float num = n.nextFloat();
        
        String mayor = num>=0?"El número " + num +" es positivo":"El número " + num + " es negativo";
        
        System.out.println(mayor);
    }
}
