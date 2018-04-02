package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto001 {
    /*
    Determinar si una persona puede votar con base en su edad en las próximas
    elecciones. 
    */
    public boolean puedeVotar(int edad){
        boolean puedeVotar = edad>=18?true:false;
        return puedeVotar;
    }
    
    public static void main(String[] args) {
        System.out.println("*** Programa que indica si puedes votar ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Ingresa tu edad: ");
        int edad = n.nextInt();
        
        Propuesto001 obj = new Propuesto001();
        
        System.out.println("Puedes votar: " + obj.puedeVotar(edad));
    }
}
