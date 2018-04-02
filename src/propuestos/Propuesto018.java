package propuestos;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto018 {
    /*
    Determinar la cantidad del bono navideño que recibirá un empleado de una 
    tienda, considerando que si su antigüedad es mayor a cuatro años o su sueldo 
    es menor de dos mil pesos, le corresponderá 25 % de su sueldo, y en caso 
    contrario sólo le corresponderá 20 % de éste. 
    */
    public float calcularBonoN(int antiguedad, float salario){
        float bono = 0.0f;
        if (antiguedad > 4 || salario < 2000)  bono = salario * 0.25f;
        else bono  = salario * 0.20f;
        return bono;
    }
    
    public static void main(String[] args) {
        System.out.println("***Programa que calcula el bono navideño***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngresa tu antigüedad: ");
        int antiguedad = n.nextInt();
        System.out.print("Ingresa tu sueldo $");
        float sueldo = n.nextFloat();
        
        Propuesto018 obj = new Propuesto018();
        DecimalFormat f = new DecimalFormat("#0.00");
        
        System.out.println("\nBono correspondiente $" + 
                f.format(obj.calcularBonoN(antiguedad, sueldo)));
    }
}
