package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo007 {
    /*
    La asociación de vinicultores tiene como política fijar un precio inicial al
    kilo de uva, la cual se clasifica en tipos A y B, y además en tamaños 1 y 2.
    Cuando se realiza la venta del producto, ésta es de un solo tipo y tamaño,
    se requiere determinar cuánto recibirá un productor por la uva que entrega
    en un embarque, considerando lo siguiente: si es de tipo A, se le cargan 20¢
    al precio inicial cuando es de tamaño 1; y 30¢ si es de tamaño 2. Si es de
    tipo B, se rebajan 30¢ cuando es de tamaño 1, y 50¢ cuando es de tamaño 2. 
    */
    
    public float obtenerFactor(char tipoUva, int tamaño, float kilos){
        float factor = 0.0f;
        
        if (tipoUva == 'a'){
            if (tamaño == 1) factor = 0.20f;
            else factor = 0.30f;            
        }
        else if (tipoUva == 'b'){
            if (tamaño == 1) factor = -0.30f;
            else factor = -0.50f;
        }
        return factor * kilos;
    }
    
    public static void main(String[] args) {
        System.out.println("*** Obtener precio para el vinicultor ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngresa la cantidad de kilos que esta entregando: ");
        float kilos = n.nextFloat();
        System.out.print("Ingresa el precio incial por kilo de uva: $");
        float precio = n.nextFloat();
        System.out.print("Indicar si la uva es tipa \"A\" o tipo \"B\": ");
        char tipo = Character.toLowerCase(n.next().charAt(0));
        System.out.print("Indicar si es de tamaño \"1\" ó \"2\": ");
        int tamaño = n.nextInt();
        
        Ejemplo007 obj = new Ejemplo007();
        
        float costoFinal = (kilos * precio) + obj.obtenerFactor(tipo, tamaño, kilos);
        
        System.out.println("El precio inicial de su embarque: $" + kilos * precio);
        System.out.println("El precio final de su embarque: $" + costoFinal);
        
    }
}
