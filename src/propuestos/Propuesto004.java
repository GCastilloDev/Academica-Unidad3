package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto004 {
    /*
    Determinar cuánto debe cobrar por el uso del estacionamiento a sus clientes.
    Las tarifas que se tienen son las siguientes:
    *Las dos primeras horas a $5.00 c/u.
    *Las siguientes tres a $4.00 c/u.
    *Las cinco siguientes a $3.00 c/u.
    *Después de diez horas el costo por cada una es de dos pesos.
    */
    
    public float calcularCobro(int horas){
        float cobro;
        if (horas <= 2) cobro = horas * 5;
        else if (horas <= 5) cobro = ((horas-2)*4) + 10;
        else if (horas <= 10) cobro = ((horas-5)*3) + 22;
        else cobro = ((horas-10)*2) + 37;
        
        return cobro;
    }
    
    public static void main(String[] args) {
        System.out.println("*** Calcular pago estacionamiento ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Ingresa la cantidad de horas estacionado: ");
        int horas = n.nextInt();
        
        Propuesto004 obj = new Propuesto004();
        
        System.out.println("Su pago de estacionamiento es $" + obj.calcularCobro(horas));
    }
}
