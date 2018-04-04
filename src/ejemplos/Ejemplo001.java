package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo001 {
    /*
    Determinar cuál de dos valores proporcionados es el mayor.
    */
    public static void main(String[] args) {
        System.out.println("*** Programa que determina el mayor de dos números ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngresa el primer número: ");
        float num1 = n.nextFloat();
        System.out.print("Ingresa el segundo número: ");
        float num2 = n.nextFloat();
        
        if (num1 > num2) System.out.println("El mayor es: " + num1);
        else System.out.println("El mayor es: " + num2);
    }
    
}
