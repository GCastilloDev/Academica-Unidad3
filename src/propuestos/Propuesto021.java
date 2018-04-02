package propuestos;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto021 {
    /*
    El banco “Bandido de peluche” desea calcular para uno de sus clientes el
    saldo actual, el pago mínimo y el pago para no generar intereses. Los datos
    que se conocen son: saldo anterior del cliente, monto de las compras que
    realizó y el pago que depositó en el corte anterior. Para calcular el pago
    mínimo se debe considerar 15% del saldo actual, y para no generar intereses
    corresponde 85% del saldo actual, considerando que este saldo debe incluir
    12% de los intereses causados por no realizar el pago mínimo y $200 por
    multa por el mismo motivo. 
    */
    public float obtenerSaldoActual(float saldoAnterior, float montoCompras, float pagoAnterior){
        float saldoActual = saldoAnterior + montoCompras - pagoAnterior;
        return saldoActual;
    }
    
    public float obtenerPagoMinimo(float saldoAnterior, float montoCompras, float pagoAnterior){
        float pagoMinimo = obtenerSaldoActual(saldoAnterior,montoCompras,pagoAnterior) * 0.15f;
        return pagoMinimo;
    }
    
    public float obtenerPagoNoIntereses(float saldoAnterior, float montoCompras, float pagoAnterior){
        float intereses = obtenerSaldoActual(saldoAnterior,montoCompras,pagoAnterior) * 0.12f;
        float saldo = obtenerSaldoActual(saldoAnterior,montoCompras,pagoAnterior) * 0.85f;
        float pagoNoIntereses = saldo + intereses + 200;
        return pagoNoIntereses;
    }
    
    public void imprimirReporte(float saldoAnterior, float montoCompras, float pagoAnterior, int opcion){
        DecimalFormat f = new DecimalFormat("#0.00");
        switch (opcion) {
            case 1:
                System.out.println("\nSaldo actual $" + 
                        f.format(obtenerSaldoActual(saldoAnterior,montoCompras,pagoAnterior)));
                break;
            case 2:
                System.out.println("\nPago mínimo $" + 
                        f.format(obtenerPagoMinimo(saldoAnterior,montoCompras,pagoAnterior)));
                break;
            case 3:
                System.out.println("\nPago para no generar intereses $" +
                        f.format(obtenerPagoNoIntereses(saldoAnterior,montoCompras,pagoAnterior)));
                break;
            case 4:
                System.out.println("\nSaldo actual \t\t\t\t$" + 
                        f.format(obtenerSaldoActual(saldoAnterior,montoCompras,pagoAnterior)));
                System.out.println("Pago mínimo \t\t\t\t$" + 
                        f.format(obtenerPagoMinimo(saldoAnterior,montoCompras,pagoAnterior)));
                System.out.println("Pago para no generar intereses \t\t$" +
                        f.format(obtenerPagoNoIntereses(saldoAnterior,montoCompras,pagoAnterior)));
                break;
            default:
                System.out.println("\nOPCIÓN INVÁLIDA");
                break;
        }
    }
    public static void main(String[] args) {
        System.out.println("*** Programa que calcula saldo actual, pago mínimo y pago para no generar"
                + " intereses del banco \"Bandido de Peluche\" ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngrese su saldo anterior $");
        float saldoAnterior = n.nextFloat();
        System.out.print("Ingrese el monto de las compras realizadas en este ciclo $");
        float montoCompras = n.nextFloat();
        System.out.print("Ingrese el pago que realizó del corte anterior $");
        float pagoAnterior = n.nextFloat();
        System.out.print("\nBienvenido \n1) Saldo actual \n2) Pago mínimo "
                + "\n3) Pago para no generar intereses \n4) Todas las anteriores"
                + "\n\n¿Qué opción desea saber? ");
        int opcion = n.nextInt();        
        
        Propuesto021 obj = new Propuesto021();
        obj.imprimirReporte(saldoAnterior, montoCompras, pagoAnterior, opcion);
    }
}
