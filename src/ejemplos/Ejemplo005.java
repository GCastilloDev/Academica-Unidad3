package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo005 {
    /*
    Se requiere determinar cuál de tres cantidades proporcionadas es la mayor.
    */
    
    public float obtenerMayor(float a, float b, float c){
        float mayor = a>b&&a>c?a:b>c?b:c;
        return mayor;
    }
    
    public static void main(String[] args) {
        System.out.println("*** Obtener el mayor de tres números ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Ingresa los tres números separados por un espacio cada uno: ");
        float num1 = n.nextFloat();
        float num2 = n.nextFloat();
        float num3 = n.nextFloat();
        
        Ejemplo005 obj = new Ejemplo005();
        
        System.out.println("El mayor es: "+ obj.obtenerMayor(num1, num2, num3));
    }
    
}
