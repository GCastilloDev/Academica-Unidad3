package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto002 {
    /*
    Determinar el sueldo semanal de un trabajador con base en las horas
    trabajadas y el pago por hora, considerando que después de las 40 horas cada
    hora se considera como excedente y se paga el doble. 
    */
    public float calcularSueldo(int horasT, float sueldoH){
        float sueldoTotal = horasT>40?((horasT-40)*(sueldoH*2))+(sueldoH*40):horasT*sueldoH;
        return sueldoTotal;       
    }
    
    public static void main(String[] args) {
        System.out.println("*** Calcular sueldo de un trabajador ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Ingresa las horas trabajadas: ");
        int horasT = n.nextInt();
        System.out.print("Ingresa tu sueldo por hora: $");
        float sueldoH = n.nextFloat();
        
        Propuesto002 obj = new Propuesto002();
        
        System.out.println("Tu pago es de $" + obj.calcularSueldo(horasT, sueldoH));
    }
}
