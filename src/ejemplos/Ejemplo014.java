package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo014 {
    /*
    Una compañía de paquetería internacional tiene servicio en algunos países de
    América del Norte, América Central, América del Sur, Europa y Asia. El costo
    por el servicio de paquetería se basa en el peso del paquete y la zona a la
    que va dirigido.
    Zona 1 América del Norte $11.00/gr.
    Zona 2 América Central $10.00/gr.
    Zona 3 América del Sur $12.00/gr.
    Zona 4 Europa $24.00/gr.
    Zona 5 Asia $27.00/gr.
    Parte de su política implica que los paquetes con un peso superior a 5 kg no
    son transportados, esto por cuestiones de logística y de seguridad. 
    */
    public float obtenerCostoEnvio(int zona, float peso){
        float costoEnvio;
        
        switch (zona) {
            case 1:
                costoEnvio = peso * 11;
                break;
            case 2:
                costoEnvio = peso * 10;
                break;
            case 3:
                costoEnvio = peso * 12;
                break;
            case 4:
                costoEnvio = peso * 24;
                break;
            case 5:
                costoEnvio = peso * 27;
                break;
            default:   
                costoEnvio = 0;
                break;
        }
        return costoEnvio;
    }
    
    public void imprimirCobro(int zona, float peso){
        if (peso>5000) System.out.println("No se da el servicio con este peso " + peso);
        else System.out.println("El costo en envío de su paquete es $" 
                + obtenerCostoEnvio(zona,peso));
    }
    
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula costo de envío de una paquetería ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.println("\nZona \tUbicación \t\tCosto/gramo"
                + "\n1 \tAmérica del Norte \t$11.00/gr."
                + "\n2 \tAmérica Central \t$10.00/gr."
                + "\n3 \tAmérica del Sur \t$12.00/gr."
                + "\n4 \tAmérica Central \t$24.00/gr."
                + "\n5 \tAsia \t\t\t$27.00/gr.");
        System.out.print("\nIngrese la zona a la que desea enviar el paquete: ");
        int zona = n.nextInt();
        System.out.print("Ingrese el peso del paquete en gramos: ");
        float peso = n.nextFloat();
        
        Ejemplo014 obj = new Ejemplo014();
        
        obj.imprimirCobro(zona, peso);
    }
}
