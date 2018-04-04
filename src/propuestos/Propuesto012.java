package propuestos;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto012 {
    /*
    Determinar el sueldo semanal de un trabajador con base en las horas 
    trabajadas y el pago por hora, considerando que a partir de la hora número
    41 y hasta la 45, cada hora se le paga el doble, de la hora 46 a la 50, 
    el triple, y que trabajar más de 50 horas no está permitido. 
    */
    public float calcularSalario(int horasT, float costoH){
        float sueldo,
              horaS = costoH * 40,
              horaD = ((5 * costoH)*2) + horaS;
        if(horasT <= 40) sueldo = horasT * costoH;
        else if(horasT <= 45) sueldo = (((horasT - 40) * 2) * costoH) + horaS;
        else if(horasT <= 50) sueldo = (((horasT - 45) * 3) * costoH) + horaD;
        else sueldo = 0;
        return sueldo;
    }
    
    public void obtenerSalario(int horasT, float costoH){
        DecimalFormat f = new DecimalFormat("#0.00");
        if (horasT > 50){
            System.out.println("\nNo está permitido trabajar mas de 50 horas");
        }
        else{
            System.out.println("\nTu sueldo es de $" +
                    f.format(calcularSalario(horasT,costoH)));
        }
    }
    public static void main(String[] args) {
        System.out.println("***Programa que calcula el sueldo de un trabajador***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngresa las horas trabajadas: ");
        int horasT = n.nextInt();
        System.out.print("Ingresa tu pago por hora $");
        float costoH = n.nextFloat();
        
        Propuesto012 obj = new Propuesto012();
        obj.obtenerSalario(horasT, costoH);
    }
}
