package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo011 {
    /*
    “El náufrago satisfecho” ofrece hamburguesas sencillas, dobles y triples,
    las cuales tienen un costo de $20.00, $25.00 y $28.00 respectivamente. La
    empresa acepta tarjetas de crédito con un cargo de 5 % sobre la compra.
    Suponiendo que los clientes adquieren sólo un tipo de hamburguesa
    */
    public int obtenerPrecioHam(String tipo){
        int precioHam;
        
        if (tipo.equalsIgnoreCase("sencilla")) precioHam = 20;
        else if (tipo.equalsIgnoreCase("doble")) precioHam = 25;
        else precioHam = 28;
        
        return precioHam;
    }
    
    public int calcularSubTotal(String tipo, int cantidad){
        int subTotal = obtenerPrecioHam(tipo) * cantidad;
        return subTotal;
    }
    
    public float calcularCargoT(String tipo, int cantidad, String tipoPago){
        float cargoTarjeta;
        if (tipoPago.equalsIgnoreCase("tarjeta")){
                cargoTarjeta = calcularSubTotal(tipo,cantidad) * 0.05f;
        }
        else cargoTarjeta = 0;
        
        return cargoTarjeta;
    }
    
    public float calcularTotal(String tipo, int cantidad, String tipoPago){
        float total = calcularSubTotal(tipo,cantidad) + calcularCargoT(tipo,cantidad,tipoPago);
        return total;
    }
    public static void main(String[] args) {
        System.out.println("*** Calcular el pago de las hamburguesas ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngresa el tipo de Hamburguesa \"Sencilla\" \"Doble\" \"Triple\": ");
        String tipo = n.next();
        System.out.print("Introduce la cantidad de hamburguesas: ");
        int cantidad = n.nextInt();
        System.out.print("Introduce el tipo de pago \"Efectivo\" ó \"Tarjeta\": ");
        String tipoPago = n.next();
        
        Ejemplo011 obj = new Ejemplo011();
        System.out.println("\nPrecio de la hamburguesa " + tipo + " es de $" + obj.obtenerPrecioHam(tipo));
        System.out.println("El subtotal es de $" + obj.calcularSubTotal(tipo, cantidad));
        if (tipoPago.equalsIgnoreCase("tarjeta")){
        System.out.println("Cargo por uso de tarjeta $" + obj.calcularCargoT(tipo, cantidad, tipoPago));
        }
        else{
            System.out.println("El pago en efectivo no genera cargos extras");
        }
        System.out.println("Total de su consumo $" + obj.calcularTotal(tipo, cantidad, tipoPago));
    }
}
