package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto005 {
    /*
    Se tiene el nombre y la edad de tres personas. Se desea saber el nombre y la
    edad de la persona de menor edad. 
    */
    
    public int obtenerEdadMenor(int e1, int e2, int e3){
        int edadMenor;
        if(e1 < e2 && e1 < e3) edadMenor = e1;
        else if (e2 < e3) edadMenor = e2;
        else edadMenor = e3;
        
        return edadMenor;
    }
    
    public String obtenerNombreMenor(int e1, int e2, int e3, String n1, String n2,String n3){
        String nombreMenor;
        if(e1 < e2 && e1 < e3) nombreMenor = n1;
        else if (e2 < e3) nombreMenor = n2;
        else nombreMenor = n3;
        
        return nombreMenor;
    }
    public static void main(String[] args) {
        System.out.println("*** Obtener edad y nombre del mas chico ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("Ingresar la edad de la primera persona: ");
        int edad1 = n.nextInt();
        System.out.print("Ingresa el nombre de la primera persona: ");
        String nombre1 = n.next();
        System.out.print("Ingresar la edad de la seguna persona: ");
        int edad2 = n.nextInt();
        System.out.print("Ingresa el nombre de la segunda persona: ");
        String nombre2 = n.next();
        System.out.print("Ingresar la edad de la tercera persona: ");
        int edad3 = n.nextInt();
        System.out.print("Ingresa el nombre de la tercera persona: ");
        String nombre3 = n.next();
        
        Propuesto005 obj = new Propuesto005();
        
        System.out.println("El nombre de la persona mas chica es: " 
                + obj.obtenerNombreMenor(edad1, edad2, edad3, nombre1, nombre2, nombre3));
        System.out.println("La edad de la persona mas chica es: " 
                + obj.obtenerEdadMenor(edad1, edad2, edad3));
    }
    
}
