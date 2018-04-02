package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto003 {
    /*
    El 14 de febrero una persona desea comprarle un regalo al ser querido que
    más aprecia en ese momento, su dilema radica en qué regalo puede hacerle,
    las alternativas que tiene son las siguientes:
    *Tarjeta $10.00 o menos
    *Chocolates $11.00 a $100.00
    *Flores $101.00 a $250.00
    *Anillo Más de $251.00 
    Determinar qué regalo se le puede comprar a ese ser tan especial por el día
    del amor y la amistad. 
    */
    public void elegirRegalo(float presupuesto){
        if (presupuesto <= 10){
            System.out.println("Puedes regalarle una Tarjeta");
        }
        else if (presupuesto <= 100){
            System.out.println("Puedes regalarle unos Chocolates");
        }
        else if (presupuesto <= 250){
            System.out.println("Puedes regalarle unas Flores");
        }
        else{
            System.out.println("Puedes regalarle un Anillo");
        }
    }
    public static void main(String[] args) {
        System.out.println("*** Determinar que regalo puedes dar ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngresa tu presupuesto $");
        float presupuesto = n.nextFloat();
        
        Propuesto003 obj = new Propuesto003();
        obj.elegirRegalo(presupuesto);
    }
}
