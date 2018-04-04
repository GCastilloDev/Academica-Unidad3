package ejemplos;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo009 {
    /*
    La política de la compañía telefónica “chimefón” es: “Chismea + x -”. Cuando
    se realiza una llamada, el cobro es por el tiempo que ésta dura, de tal
    forma que los primeros cinco minutos cuestan $ 1.00 c/u, los siguientes
    tres, 80¢ c/u, los siguientes dos minutos, 70¢ c/u, y a partir del décimo
    minuto, 50¢ c/u. Además, se carga un impuesto de 3 % cuando es domingo, y si
    es día hábil, en turno matutino, 15 %, y en turno vespertino, 10 %. Realice
    un algoritmo para determinar cuánto debe pagar por cada concepto una persona
    que realiza una llamada. 
    */
    
    public float calcularPagoTiempo(float tiempo){
        float pagoTiempo;
        if (tiempo <= 5) pagoTiempo = tiempo * 1;
        else if (tiempo <= 8 ) pagoTiempo = (tiempo - 5) * 0.80f + 5;
        else if (tiempo <= 10 ) pagoTiempo = (tiempo - 8) * 0.70f + 7.40f;
        else pagoTiempo = (tiempo - 10) * 0.50f + 8.80f;
        
        return pagoTiempo;
    }
    
    public float calcularImpuesto(float tiempo, char dia, char turno){
        float impuesto;
        if (dia == 's') impuesto = calcularPagoTiempo(tiempo) * 0.03f;
        else if (turno == 'm') impuesto = calcularPagoTiempo(tiempo) * 0.15f;
        else impuesto = calcularPagoTiempo(tiempo) * 0.10f;
        
        return impuesto;
    }
    
    public float calcularPagoTotal(float tiempo, char dia, char turno){
        float pagoTotal = calcularPagoTiempo(tiempo) + calcularImpuesto(tiempo,dia,turno);
        
        return pagoTotal;       
    }
    
    public static void main(String[] args) {
        System.out.println("*** Cobro de llamada ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngrese el tiempo de la llamada: ");
        float tiempoLlamada = n.nextFloat();
        System.out.print("¿Es Domingo? \"S\" para sí y \"N\" para no: ");
        char dia = Character.toLowerCase(n.next().charAt(0));
        char turno = ' ';
        if (dia != 's'){
        System.out.print("Ingresa el turno \"M\" para matutino y \"V\" para vespertino: ");
        turno = Character.toLowerCase(n.next().charAt(0));
        }
        
        Ejemplo009 obj = new Ejemplo009();
        DecimalFormat f = new DecimalFormat("#0.00");
        
        System.out.println("***** Ticket de compra *****");
        System.out.println("Subtotal $" + f.format(obj.calcularPagoTiempo(tiempoLlamada)));
        System.out.println("Impuesto $" + f.format(obj.calcularImpuesto(tiempoLlamada, dia, 
                turno)));
        System.out.println("   Total $" + f.format(obj.calcularPagoTotal(tiempoLlamada, dia, 
                turno)));
    }
}
