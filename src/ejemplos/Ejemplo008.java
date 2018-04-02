package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo008 {
    /*
    El director de una escuela está organizando un viaje de estudios, y requiere
    determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la
    compañía de viajes por el servicio. La forma de cobrar es la siguiente: si
    son 100 alumnos o más, el costo por cada alumno es de $65.00; de 50 a 99
    alumnos, el costo es de $70.00, de 30 a 49, de $95.00, y si son menos de 30,
    el costo de la renta del autobús es de $4000.00, sin importar el número de
    alumnos.
    */
    
    public int obtenerCostoAlum(int alumnos){
        int costo = 0;
        if (alumnos >= 100) costo = 65;
            else if (alumnos >= 50) costo = 70;
                    else if (alumnos >= 30) costo = 95;
        return costo;
    }
    
    public int obtenerCostoViaje(int alumnos){
        int costoAu = 0;
        if (alumnos < 30) costoAu = 4000;
        else costoAu = obtenerCostoAlum(alumnos) * alumnos;
        return costoAu;
    }
    
    
    public static void main(String[] args) {
        System.out.println("*** Calcular costo de un viaje para alumnos ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngresa la cantidad de alumnos que iran al viaje: ");
        int alumnos = n.nextInt();
        
        Ejemplo008 obj = new Ejemplo008();
        System.out.println("El costo del viaje es de: $" + obj.obtenerCostoViaje(alumnos));
    }
}
