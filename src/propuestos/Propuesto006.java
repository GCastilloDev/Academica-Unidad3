package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto006 {
    /*
    Determinar el costo y el descuento que tendrá un artículo. Considere que si
    su precio es mayor o igual a $200 se le aplica un descuento de 15%, y si su 
    precio es mayor a $100 pero menor a $200, el descuento es de 12%, y si es
    menor a $100, sólo 10%. 
    */
    
    public float obtenerDescuento(float precioA){
        float descuento;
        if (precioA <= 100) descuento = precioA * 0.10f;
        else if (precioA < 200) descuento = precioA * 0.12f;
        else descuento = precioA * 0.15f;
        return descuento;
    }
    
    public float obtenerCosto(float precioA){
        float costo = precioA - obtenerDescuento(precioA);
        return costo;
    }
    
    public static void main(String[] args) {
        System.out.println("*** Calcular el descuento de un artículo ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngresa el precio del artículo $");
        float precioA = n.nextFloat();
        
        Propuesto006 obj = new Propuesto006();
        
        System.out.println("El precio del artículo sin descuento es de $" + precioA);
        System.out.println("El descuento a aplicar es de $" + obj.obtenerDescuento(precioA));
        System.out.println("El precio a pagar es de $" + obj.obtenerCosto(precioA));
    }
}
