package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo006 {
    /*
    “La langosta ahumada” es una empresa dedicada a ofrecer banquetes; sus
    tarifas son las siguientes: el costo de platillo por persona es de $95.00,
    pero si el número de personas es mayor a 200 pero menor o igual a 300, el
    costo es de $85.00. Para más de 300 personas el costo por platillo es de
    $75.00. Se requiere un algoritmo que ayude a determinar el presupuesto que
    se debe presentar a los clientes que deseen realizar un evento. 
    */
    
    public int obtenerCosto(int cantidadPersonas){
        int costo = cantidadPersonas<=200?95:cantidadPersonas<=300?85:75;
        return costo;
    }
    
    public static void main(String[] args) {
        System.out.println("*** Obtener presupuesto de banquete ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Ingresar el número de invitados: ");
        int cantidadPersonas = n.nextInt();
        
        Ejemplo006 obj = new Ejemplo006();
        
        System.out.println("El presupuesto de su evento es de: $" 
                + obj.obtenerCosto(cantidadPersonas) * cantidadPersonas);
    }
    
}
