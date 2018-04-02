package propuestos;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto016 {
    /*
    El secretario de educación ha decidido otorgar un bono por desempeño a todos
    los profesores con base en la puntuación siguiente:
    0 - 100             1 salario mínimo
    101 - 150           2 salarios mínimos
    151 - en adelante   3 salarios mínimos
    Determine el monto de bono que percibirá un profesor (debe capturar el valor
    del salario mínimo y los puntos del profesor). 
    */
    public float calcularBono(float salarioM, int puntos){
        float bono;
        if(puntos <= 100) bono = salarioM;
        else if(puntos <= 150) bono = salarioM * 2;
        else bono = salarioM * 3;
        return bono;
    }
    public static void main(String[] args) {
        System.out.println("***Programa que calcula el bono de desempeño de un profesor***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngresa el monto del salario mínimo $");
        float salarioM = n.nextFloat();
        System.out.print("Ingresa los puntos: ");
        int puntos = n.nextInt();
        
        Propuesto016 obj = new Propuesto016();
        DecimalFormat f = new DecimalFormat("#0.00");
        System.out.println("\nBono correspondiente $" + f.format(obj.calcularBono(salarioM, puntos)));
    }
}
