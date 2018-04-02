package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto015 {
    /*
    Con base en un número proporcionado (1-7), indique  el día de la semana que
    le corresponde (L-D). 
    */
    
    public void obtenerDia(int dia){
        switch (dia) {
            case 1:
                System.out.println("\n"+ dia + " Corresponde a Lunes");
                break;
            case 2:
                System.out.println("\n"+ dia + " Corresponde a Martes");
                break;
            case 3:
                System.out.println("\n"+ dia + " Corresponde a Miércoles");
                break;
            case 4:
                System.out.println("\n"+ dia + " Corresponde a Jueves");
                break;
            case 5:
                System.out.println("\n"+ dia + " Corresponde a Viernes");
                break;
            case 6:
                System.out.println("\n"+ dia + " Corresponde a Sábado");
                break;
            case 7:
                System.out.println("\n"+ dia + " Corresponde a Domingo");
                break;
            default:
                System.out.println("\n"+ dia + " No corresponde a ningún día");
        }
    }
    public static void main(String[] args) {
        System.out.println("***Programa que determina que día es***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngresa el número del cual deseas saber a que día corresponde: ");
        int dia = n.nextInt();
        
        Propuesto015 obj = new Propuesto015();
        obj.obtenerDia(dia);
    }
}
