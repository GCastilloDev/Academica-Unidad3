package ejemplos;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Ejemplo012 {
    /*
    El consultorio del Dr. Lorenzo T. Mata Lozano tiene como política cobrar la
    consulta con base en el número de cita, de la siguiente forma:
    •	Las tres primeras citas a $200.00 c/u.
    •	Las siguientes dos citas a $150.00 c/u.
    •	Las tres siguientes citas a $100.00 c/u.
    •	Las restantes a $50.00 c/u, mientras dure el tratamiento.
    Se requiere determinar: 
    a) Cuánto pagará el paciente por la cita.
    b) El monto de lo que ha pagado el paciente por el tratamiento.
    */
    public int obtenerCostoCita(int numeroCita){
        int costoCita;
        
        if (numeroCita <= 3) costoCita = 200;
        else if (numeroCita <= 5) costoCita = 150;
        else if (numeroCita <= 8) costoCita = 100;
        else costoCita = 50;
        
        return costoCita;
    }
    
    public int obtenerCostoTratamiento(int numeroCita){
        int costoTratamiento;
        if (numeroCita <= 3){
            costoTratamiento = obtenerCostoCita(numeroCita) * numeroCita;
        }
        else if (numeroCita <= 5){
            costoTratamiento = (numeroCita-3) * 150 + 600;
        }
        else if (numeroCita <= 8){
            costoTratamiento = (numeroCita-5) * 100 + 900;
        }
        else{
            costoTratamiento = (numeroCita-8) * 50 + 1200;
        }
        return costoTratamiento;
    }
    
    public static void main(String[] args) {
        System.out.println("*** Calcular costo de cita y tratamiento del paciente ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngrese el número de cita a la que entrará: ");
        int numeroCita = n.nextInt();
        
        Ejemplo012 obj = new Ejemplo012();
        
        System.out.println("Costo de la cita $" + obj.obtenerCostoCita(numeroCita));
        System.out.println("Costo total del tratamiento $" + obj.obtenerCostoTratamiento(numeroCita));
    }
}
