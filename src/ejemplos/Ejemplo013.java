package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Ejemplo013 {
    /*
    Fábricas “El cometa” produce artículos con claves (1, 2, 3, 4, 5 y 6). Se
    requiere un algoritmo para calcular los precios de venta, para esto hay que
    considerar lo siguiente:
    *Costo de producción = materia prima + mano de obra + gastos de fabricación.
    *Precio de venta = costo de producción + 45 % de costo de producción.
    El costo de la mano de obra se obtiene de la siguiente forma:
    para los productos con clave 3 o 4 se carga 75 % del costo de la materia prima;
    para los que tienen clave 1 y 5 se carga 80 %,
    y para los que tienen clave 2 o 6, 85 %.
    Para calcular el gasto de fabricación se considera que si el artículo que se
    va a producir tiene claves 2 o 5, este gasto representa 30 % sobre el costo
    de la materia prima; si las claves son 3 o 6, representa 35 %;
    si las claves son 1 o 4, representa 28 %. La materia prima tiene el mismo
    costo para cualquier clave.
    */
    public float obtenerCostoMO(float costoMP, int clave){
        float costoMO;
        switch (clave) {
            case 3:
            case 4:
                costoMO = costoMP * 0.75f;
                break;
            case 1:
            case 5:
                costoMO = costoMP * 0.80f;
                break;
            default:
                costoMO = costoMP * 0.85f;
                break;
        }
        return costoMO;
    }
    
    public float obtenerGastoF(float costoMp, int clave){
        float gastoF;
        switch (clave) {
            case 2:
            case 5:
                gastoF = costoMp * 0.30f;
                break;
            case 3:
            case 6:
                gastoF = costoMp * 0.35f;
                break;
            default:
                gastoF = costoMp * 0.28f;
                break;
        }
        return gastoF;
    }
    
    public float obtenerCostoP(float costoMP, int clave){
        float costoProduccion = costoMP + obtenerCostoMO(costoMP,clave) + obtenerGastoF(costoMP,clave);
        return costoProduccion;
    }
    
    public float obtenerPrecioV(float costoMP, int clave){
        float precioVenta = obtenerCostoP(costoMP,clave) * 1.45f;
        return precioVenta;
    }
    
    public static void main(String[] args) {
        System.out.println("*** Calcular costo de producción y precio de venta ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngrese el costo de la materia prima: $");
        float costoMP = n.nextFloat();
        System.out.print("Ingrese la clave del producto (Del 1 al 6): ");
        int clave = n.nextInt();
        
        Ejemplo013 obj = new Ejemplo013();
        
        System.out.println("Costo de producción $" + obj.obtenerCostoP(costoMP, clave) );
        System.out.println("Precio de venta $ " + obj.obtenerPrecioV(costoMP, clave));
    }
}
