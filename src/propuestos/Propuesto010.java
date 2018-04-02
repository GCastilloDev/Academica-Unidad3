package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto010 {
    /*
    Determinar a qué lugar podrá ir de vacaciones una persona, considerando que
    la línea de autobuses “La tortuga” cobra por kilómetro recorrido. Se debe 
    considerar el costo del pasaje tanto de ida, como de vuelta; los datos que
    se conocen y que son fijos son: México, 750 km; P.V., 800 km; Acapulco, 
    1200 km, y Cancún, 1800 km. También se debe considerar la posibilidad de 
    tener que quedarse en casa. 
    */
    public float costoViajeMexico(float costoKm){
        float costoMexico = (costoKm * 750) * 2;
        return costoMexico;
    }
    
    public float costoViajePV(float costoKm){
        float costoPV = (costoKm * 800) * 2;
        return costoPV;
    }
    
    public float costoViajeAcapulco(float costoKm){
        float costoAcapulco = (costoKm * 1200) * 2;
        return costoAcapulco;
    }
    
    public float costoViajeCancun(float costoKm){
        float costoCancun = (costoKm * 1800) * 2;
        return costoCancun;
    }
    
    public void decidirLugar(float costoKm, float presupuesto){
        if(presupuesto >= costoViajeCancun(costoKm)){
            System.out.println("\nPuedes viajar a Cancún");
        }
        else if(presupuesto >= costoViajeAcapulco(costoKm)){
            System.out.println("\nPuedes viajar a Acapulco");
        }
        else if(presupuesto >= costoViajePV(costoKm)){
            System.out.println("\nPuedes viajar a Puerto Vallarta");
        }
        else if(presupuesto >= costoViajeMexico(costoKm)){
            System.out.println("\nPuedes viajar a México");
        }
        else{
            System.out.println("\nPresupuesto insuficiente, disfruta de tu hogar");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("*** Progra que ayuda a elegir el lugar a viajar ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIntroduce el costo por km $");
        float costoKm = n.nextFloat();
        System.out.print("Introduce tu prespuesto para el viaje $");
        float presupuesto = n.nextFloat();
        
        Propuesto010 obj = new Propuesto010();
        
        obj.decidirLugar(costoKm, presupuesto);
    }
}
