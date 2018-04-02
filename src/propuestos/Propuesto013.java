package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto013 {
    /*
    Los alumnos de una escuela desean realizar un viaje de estudios, pero
    requieren determinar cuánto les costará el pasaje, considerando que las 
    tarifas del autobús son las siguientes: si son más de 100 alumnos, el costo
    es de $20; si son entre 50 y 100, $35; entre 20 y 49, $40, y si son menos 
    de 20 alumnos, $70 por cada uno. 
    */
    public int determinarCosto(int alumnos){
        int costo;
        if(alumnos > 100) costo = 20;
        else if(alumnos >= 50) costo = 35;
        else if(alumnos >= 20) costo = 40;
        else costo = 70;
        return costo;
    }
    public static void main(String[] args) {
        System.out.println("***Programa que calcula costo de un viaje***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngresa la cantidad de alumnos que viajaran: ");
        int alumnos = n.nextInt();
        
        Propuesto013 obj = new Propuesto013();
        
        System.out.println("\nCosto individual \t$" + obj.determinarCosto(alumnos));
        System.out.println("Costo grupal \t\t$" + (obj.determinarCosto(alumnos) * alumnos));
    }
    
}
