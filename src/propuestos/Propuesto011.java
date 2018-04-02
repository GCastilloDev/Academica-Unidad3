package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto011 {
    /*
    Se les  dará un bono por antigüedad a los empleados de una tienda. Si tienen
    un año, se les dará $100; si tienen 2 años, $200, y así sucesivamente hasta 
    los 5 años. Para los que tengan más de 5, el bono será de $1000. 
    */
    public int calcularBono(int antiguedad){
        int bono;
        if(antiguedad <= 5) bono = antiguedad * 100;
        else bono = 1000;
        return bono;
    }
    public static void main(String[] args) {
        System.out.println("***Programa que calcula bono de antigüedad***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngresa tu antigüedad: ");
        int antiguedad = n.nextInt();
        
        Propuesto011 obj = new Propuesto011();
        
        System.out.println("\nTu bono es de $" + obj.calcularBono(antiguedad));
    }
}
