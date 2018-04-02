package propuestos;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto009 {
    /*
    Una compañía de seguros para autos ofrece dos tipos de póliza: cobertura 
    amplia (A) y daños a terceros (B). Para el plan A, la cuota base es de
    $1,200, y para el B, de $950. A ambos planes se les carga 10% del costo si 
    la persona que conduce tiene por hábito beber alcohol, 5% si utiliza lentes,
    5% si padece alguna enfermedad –como deficiencia cardiaca o diabetes–, y si
    tiene más de 40 años, se le carga 20%, de lo contrario sólo 10%. Todos estos 
    cargos se realizan sobre el costo base.
    */
    public int costoSeguro(char tipoPoliza){
        int costoSeguro = tipoPoliza=='a'?1200:950;
        return costoSeguro;
    }
    
    public float primaAlcohol(char alcohol, char tipoPoliza){
        float primaAlcohol = alcohol=='s'?costoSeguro(tipoPoliza)*0.10f:0;
        return primaAlcohol;
    }
    
    public float primaLentes(char lentes, char tipoPoliza){
        float primaLentes = lentes=='s'?costoSeguro(tipoPoliza)*0.05f:0;
        return primaLentes;
    }
    
    public float primaEnfermedad(char enfermedad, char tipoPoliza){
        float primaEnfermedad = enfermedad=='s'?costoSeguro(tipoPoliza)*0.05f:0;
        return primaEnfermedad;
    }
    
    public float primaEdad(int edad, char tipoPoliza){
        float primaEdad = edad>40?costoSeguro(tipoPoliza)*0.20f:costoSeguro(tipoPoliza)*0.10f;
        return primaEdad;
    }
    
    public float totalSeguro(char tipoPoliza, char alcohol, char lentes, char enfermedad, int edad){
        float totalSeguro =
                costoSeguro(tipoPoliza) +
                primaAlcohol(lentes, tipoPoliza) +
                primaLentes(lentes, tipoPoliza) +
                primaEnfermedad(enfermedad, tipoPoliza) +
                primaEdad(edad,tipoPoliza);
        return totalSeguro;
    }
    
    public static void main(String[] args) {
        System.out.println("*** Costo póliza de seguro de auto ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngresa el tipo de póliza que deseas \"A\" para cobertura amplia "
                + "\"B\" para daños a terceros: ");
        char tipoPoliza = Character.toLowerCase(n.next().charAt(0));
        System.out.print("¿Consume alcohol? \"S\" para sí \"N\" para no: ");
        char alcohol = Character.toLowerCase(n.next().charAt(0));
        System.out.print("¿Usa lentes? \"S\" para sí \"N\" para no: ");
        char lentes = Character.toLowerCase(n.next().charAt(0));
        System.out.print("¿Padece alguna enfermedad como: Deficiencia cardiaca o diabetes?"
                + " \"S\" para sí \"N\" para no: ");
        char enfermedad = Character.toLowerCase(n.next().charAt(0));
        System.out.print("Ingrese su edad: ");
        int edad = n.nextInt();
        
        Propuesto009 obj = new Propuesto009();
        DecimalFormat f = new DecimalFormat("#0.00");
        
        System.out.println("\nEl costo de su póliza base es de \t$" + 
                f.format(obj.costoSeguro(tipoPoliza)));
        System.out.println("Prima de alcohol \t\t\t$" +
                f.format(obj.primaAlcohol(alcohol, tipoPoliza)));
        System.out.println("Prima de lentes \t\t\t$" +
                f.format(obj.primaLentes(lentes, tipoPoliza)));
        System.out.println("Prima enfermedad \t\t\t$" +
                f.format(obj.primaEnfermedad(enfermedad, tipoPoliza)));
        System.out.println("Prima edad \t\t\t\t$" + 
                f.format(obj.primaEdad(edad, tipoPoliza)));
        System.out.println("Costo total póliza \t\t\t$" + 
                f.format(obj.totalSeguro(tipoPoliza, alcohol, lentes, enfermedad, edad)));
    }
}
