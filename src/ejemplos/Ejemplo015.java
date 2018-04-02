package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo015 {
    /*
    El banco “Pueblo desconocido” ha decidido aumentar el límite de crédito de
    las tarjetas de crédito de sus clientes, para esto considera que si su
    cliente tiene tarjeta tipo 1, el aumento será de 25 %; si tiene tipo 2, será
    de 35 %; si tiene tipo 3, de 40 %, y para cualquier otro tipo, de 50 %.
    Ahora bien, si la persona cuenta con más de una tarjeta, sólo se considera
    la de tipo mayor o la que el cliente indique. 
    */
    public float obtenerAumentoC(int tipoTarjeta, float limiteActual){
        float aumentoCredito;
        if (tipoTarjeta == 1) aumentoCredito = limiteActual * 0.25f;
        else if (tipoTarjeta == 2) aumentoCredito = limiteActual * 0.35f;
        else if (tipoTarjeta == 3) aumentoCredito = limiteActual * 0.40f; 
        else aumentoCredito = limiteActual * 0.50f; 
        
        return aumentoCredito;
    }
    
    public float obtnerLimiteN(int tipoTarjeta, float limiteActual){
        float limiteNuevo = limiteActual + obtenerAumentoC(tipoTarjeta,limiteActual);
        return limiteNuevo;
    }
    
    public static void main(String[] args) {
        System.out.println("*** Calcular limite de crédito nuevo ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngrese su tipo de tarjeta: ");
        int tipoTarjeta = n.nextInt();
        System.out.print("Ingrese su limite de crédito actual $");
        float limiteACtual = n.nextFloat();
        
        Ejemplo015 obj = new Ejemplo015();
    
        System.out.println("El aumento de crédito es de $" + obj.obtenerAumentoC(tipoTarjeta, limiteACtual));
        System.out.println("Nuevo límite de crédito es de $" + obj.obtnerLimiteN(tipoTarjeta, limiteACtual));
    }
}
