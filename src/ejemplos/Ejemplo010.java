package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo010 {
    /*
    Una compañía de viajes cuenta con tres tipos de autobuses (A, B y C), cada
    uno tiene un precio por kilómetro recorrido por persona, los costos
    respectivos son $2.0, $2.5 y $3.0. Se requiere determinar el costo total y
    por persona del viaje considerando que cuando éste se presupuesta debe haber
    un mínimo de 20 personas, de lo contrario el cobro se realiza con base en
    este número límite. 
    */
    
    public float obtenerCostoKilometro (char tipo){
        float costoKilometro;
        
        switch (tipo){
            case 'a':costoKilometro = 2;
                     break;
            case 'b':costoKilometro = 2.50f;
                     break;
            case 'c':costoKilometro = 3f;
                     break;
            default: costoKilometro = 0;
        }
        return costoKilometro;
    }
    
    public int obtenerCantidadPersonas(int personas){
        int cantidadPersonas = personas<20?20:personas;
        return cantidadPersonas;        
    }
    
    public float obtenerCostoTotal(char tipo, int personas,int kilometros){
        float costoTotal = obtenerCostoKilometro(tipo) * obtenerCantidadPersonas(personas) 
                * kilometros;
        return costoTotal;
    }
    
    public float obtenerCostoIndividual(char tipo, int personas,int kilometros){
        float costoIndividual = obtenerCostoTotal(tipo, personas, kilometros) / personas;
        return costoIndividual;
    }
    
    public static void main(String[] args) {
        System.out.println("*** Calula el costo individual y global de un viaje ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngresa el tipo de camión (A, B o C): ");
        char tipo = Character.toLowerCase(n.next().charAt(0));
        System.out.print("Ingrese la cantidad de personas que viajaran: ");
        int personas = n.nextInt();
        System.out.print("Ingresa el kilometraje que se recorrerá: ");
        int km = n.nextInt();
        
        Ejemplo010 obj = new Ejemplo010();
        
        System.out.println("El costo por persona es de $" + obj.obtenerCostoIndividual(tipo,
                personas, km));
        System.out.println("El costo total del viaje es de $" + obj.obtenerCostoTotal(tipo,
                personas, km));
    }
}
