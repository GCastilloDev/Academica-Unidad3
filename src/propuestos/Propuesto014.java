package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto014 {
    /*
    Con base en una calificación proporcionada (0-10), indique con letra la 
    calificación que le corresponde:
    10 es “A”
    9 es “B”
    8 es “C”
    7 y 6 son “D”
    de 5 a 0 son “F”. 
    */
    public char obtenerLetraCali(int calificacion){
        char letra = ' ';
        switch (calificacion) {
            case 10:
                letra = 'A';
                break;
            case 9:
                letra = 'B';
                break;
            case 8:
                letra = 'C';
                break;
            case 7:
            case 6:
                letra = 'D';
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                letra = 'F';
                break;
        }
        return letra;
    }
    
    public void imprimirLetraCali(int calificacion){
        if(calificacion < 0 || calificacion > 10){
            System.out.println("Calificación fuera de rango.");
        }
        else{
            System.out.println(calificacion + " es equivalente a: \"" + 
                    obtenerLetraCali(calificacion)+"\"");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("***Convertir calificación de númerica a alfabetica***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngresa la calificación: ");
        int calificacion = n.nextInt();
        
        Propuesto014 obj = new Propuesto014();
        obj.imprimirLetraCali(calificacion);
    }
}
