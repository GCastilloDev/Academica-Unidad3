package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto017 {
    /*
    Determinar qué paquete se puede comprar una persona con el dinero que
    recibirá en diciembre, considerando lo siguiente:
    • Paquete A. Si recibe $50,000 o más se comprará una televisión, un modular,
    tres pares de zapatos, cinco camisas y cinco pantalones.
    • Paquete B. Si recibe menos de $50,000 pero más (o igual) de $20,000, se
    comprará una grabadora, tres pares de zapatos, cinco camisas y cinco
    pantalones.
    • Paquete C. Si recibe menos de $20,000 pero más (o igual) de $10,000, se 
    comprará dos pares de zapatos, tres camisas y tres pantalones. 
    • Paquete D. Si recibe menos de $10,000, se tendrá que conformar con un par 
    de zapatos, dos camisas y dos pantalones.
    */
    public void imprimirPaquete(float sueldo){
        if (sueldo >= 50000){
            System.out.println("\nPuede comprar el paquete \"A\" que incluye:");
            System.out.println("• Una televisión \n• Un modular \n• Tres pares de zapatos "
                    + "\n• Cinco camisas \n• Cinco pantalones");
        }
        else if (sueldo >= 20000){
            System.out.println("\nPuede comprar el paquete \"B\" que incluye:");
            System.out.println("• Una grabadora \n• Tres pares de zapatos \n• Cinco camisas"
                    + "\n• Cinco pantalones");
        }
        else if (sueldo >= 10000){
            System.out.println("\nPuede comprar el paquete \"C\" que incluye:");
            System.out.println("• Dos pares de zapatos \n• Tres camisas"
                    + "\n• Tres pantalones");
        }
        else{
            System.out.println("\nPuede comprar el paquete \"D\" que incluye:");
            System.out.println("• Un par de zapatos \n• Dos camisas"
                    + "\n• Dos pantalones");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("***Programa que determina que paquete puede comprar una persona"
                + " con el dinero que obtendra en diciembre***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngresa la cantidad que recibiras en diciembre $");
        float sueldo = n.nextFloat();
        
        Propuesto017 obj = new Propuesto017();
        obj.imprimirPaquete(sueldo);
    }
}
