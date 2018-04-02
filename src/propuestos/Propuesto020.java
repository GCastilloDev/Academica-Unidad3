package propuestos;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto020 {
    /*
    Una fábrica de pantalones desea calcular cuál es el precio final  de venta y
    cuánto ganará por los N pantalones que produzca con el corte de alguno de
    sus modelos, para esto se cuenta con la siguiente información:
    a) Tiene dos modelos A y B, tallas 30, 32 y 36 para ambos modelos.
    b) Para el modelo A se utiliza 1.50 m de tela, y para el B 1.80 m. 
    c) Al modelo A se le carga 80 % del costo de la tela, por mano de obra.
       Al modelo B se le carga 95 % del costo de la tela, por el mismo concepto.
    d) A las tallas 32 y 36 se les carga 4 % del costo generado por mano de obra
       y tela, sin importar el modelo.
    e) Cuando se realiza el corte para fabricar una prenda sólo se hace de un
       solo modelo y una sola talla.
    f) Finalmente, a la suma de estos costos se les carga 30%, que representa
       la ganancia extra de la tienda.
    */
    
    public float costoPantalon(float precioTela, char modelo, int talla){
        
        float costoPantalon;
        
        if (modelo == 'a' && (talla == 32 || talla == 36)){
            float costoTela = precioTela * 1.50f;
            float costoMO = costoTela * 0.80f;
            float cargoEspecial = (costoTela + costoMO) * 0.04f;
            costoPantalon = costoTela + costoMO + cargoEspecial;
        }
        else if(modelo == 'b' && (talla == 32 || talla == 36)){
            float costoTela = precioTela * 1.80f;
            float costoMO = costoTela * 0.95f;
            float cargoEspecial = (costoTela + costoMO) * 0.04f;
            costoPantalon = costoTela + costoMO + cargoEspecial;
        }
        else if(modelo == 'a' && talla == 30){
            float costoTela = precioTela * 1.50f;
            float costoMO = costoTela * 0.80f;
            costoPantalon = costoTela + costoMO;
        }
        else{
            float costoTela = precioTela * 1.80f;
            float costoMO = costoTela * 0.95f;
            costoPantalon = costoTela + costoMO;
        }
        
        return costoPantalon;
    }
    
    public float calcularGanancia(float precioTela, char modelo, int talla){
        float ganancia = costoPantalon(precioTela,modelo,talla) * 0.30f;
        return ganancia;
    }
    
    public boolean validarDatos(char modelo, int talla){
        
        boolean validacion = false;
        
        if ((modelo == 'a' || modelo == 'b') && 
           (talla == 30 || talla == 32 || talla == 36)){
            validacion = true;
        }
        return validacion;
    }
    
    public void imprimirReporteIndividual(float precioTela, char modelo, int talla){
        
        DecimalFormat f = new DecimalFormat("#0.00");
        
        if(validarDatos(modelo,talla) == true){
            System.out.println("\n***** Costo individual pantalón modelo " + 
                    "\"" + modelo + "\" talla " + talla + " *****");
            System.out.println("El costo del pantalón es de \t\t$" + 
                    f.format(costoPantalon(precioTela,modelo,talla)));
            System.out.println("La ganancia del pantalón es de \t\t$" + 
                    f.format(calcularGanancia(precioTela,modelo,talla)));
            System.out.println("El precio de venta es \t\t\t$" + 
                    f.format(costoPantalon(precioTela,modelo,talla) + 
                            calcularGanancia(precioTela,modelo,talla)));
        }
        else{
            System.out.println("\nModelo y/o talla no existente.");
        }    
    }
    
    public void imprimirReportePedido(float precioTela, char modelo, int talla, int pedido){
        
        DecimalFormat f = new DecimalFormat("#0.00");
        
        if(validarDatos(modelo,talla) == true){
            System.out.println("\n***** Costo por el pedido de " + pedido + " pantalones"
                    + " modelo \"" + modelo + "\" talla " + talla + " *****");
            System.out.println("El costo de los pantalones \t\t$" + 
                    f.format(costoPantalon(precioTela,modelo,talla) * pedido));
            System.out.println("La ganancia de los pantalnes \t\t$" + 
                    f.format(calcularGanancia(precioTela,modelo,talla) * pedido));
            System.out.println("El precio de venta es \t\t\t$" + 
                    f.format((costoPantalon(precioTela,modelo,talla) + 
                            calcularGanancia(precioTela,modelo,talla)) * pedido));
        }         
    }
    
    public static void main(String[] args) {
        System.out.println("**Programa que calcula el costo, ganancia y precio de venta"
                + " de un pantalón**");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngresa el costo del metro de tela $");
        float precioTela = n.nextFloat();
        System.out.print("Ingresa el modelo que deseas (\"A\" o \"B\"): ");
        char modelo = Character.toLowerCase(n.next().charAt(0));
        System.out.print("Ingrese la talla (30, 32 o 36): ");
        int talla = n.nextInt();
        System.out.print("Ingrese la cantidad de pantalones que desea obtener los datos: ");
        int cantidad = n.nextInt();
        
        Propuesto020 obj = new Propuesto020();
        obj.imprimirReporteIndividual(precioTela, modelo, talla);
        obj.imprimirReportePedido(precioTela, modelo, talla, cantidad);
    }
}
