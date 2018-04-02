package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto008 {
    /*
    Cierta empresa proporciona un bono mensual a sus trabajadores, el cual puede 
    ser por su antigüedad o bien por el monto de su sueldo (el que sea mayor),
    de la siguiente forma: Cuando la antigüedad es mayor a 2 años pero menor a 
    5, se otorga 20 % de su sueldo; cuando es de 5 años o más, 30 %. Ahora bien,
    el bono por concepto de sueldo, si éste es menor a $1000, se da 25 % de
    éste, cuando éste es mayor a $1000, pero menor o igual a $3500, se otorga
    15% de su sueldo, para más de $3500. 10%. 
    */
    
    public float aumentoAntiguedad(int antiguedad, float sueldo){
        if (antiguedad > 2 && antiguedad < 5) sueldo = sueldo * 0.20f;
        else if (antiguedad >= 5) sueldo = sueldo * 0.30f;
        else sueldo = 0;
        return sueldo;
    }
    
    public float aumentoSueldo(float sueldo){
        if (sueldo <= 1000) sueldo = sueldo * 0.25f;
        else if (sueldo > 1000 && sueldo <= 3500) sueldo = sueldo * 0.15f;
        else sueldo = sueldo * 0.10f;
        return sueldo;
    }
    
    public float determinarAumento(int antiguedad, float sueldo){
        if (aumentoAntiguedad(antiguedad,sueldo) > aumentoSueldo(sueldo)){
            sueldo = aumentoAntiguedad(antiguedad,sueldo);
        }
        else{
            sueldo = aumentoSueldo(sueldo);
        }
        return sueldo;
    }
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula el aumento de sueldo ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Ingresa tu antiguedad: ");
        int antiguedad = n.nextInt();
        System.out.print("Ingresas tu sueldo actual $");
        float sueldo = n.nextFloat();
        
        Propuesto008 obj = new Propuesto008();
        
        System.out.println("Tu sueldo actual es de $" + sueldo);
        System.out.println("Tu aumento es de $" + obj.determinarAumento(antiguedad, sueldo));
        System.out.println("Tu nuevo sueldo es $" + (sueldo+obj.determinarAumento(antiguedad, sueldo)));
    }
}
 