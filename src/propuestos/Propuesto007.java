package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto007 {
    /*
    El presidente de la república ha decidido estimular a todos los estudiantes
    de una universidad mediante la asignación de becas mensuales, para esto se
    tomarán en consideración los siguientes criterios: Para alumnos mayores de
    18 años con promedio mayor o igual a 9, la beca será de $2000.00; con
    promedio mayor o igual a 7.5, de $1000.00; para los promedios menores de 
    7.5 pero mayores o iguales a 6.0, de $500.00; a los demás se les enviará
    una carta de invitación incitándolos a que estudien más en el próximo ciclo
    escolar. A los alumnos de 18 años o menores de esta edad, con promedios
    mayores o iguales a 9, se les dará $3000; con promedios menores a 9 pero
    mayores o iguales a 8, $2000; para los alumnos con promedios menores a 8
    pero mayores o iguales a 6, se les dará $100, y a los alumnos que tengan
    promedios menores a 6 se les enviará carta de invitación. 
    */
    public void becaMayores(float promedio){
        if (promedio >= 9 ){
            System.out.println("Es acreedor a una beca de $2,000.00 MXN");
        }
        else if (promedio >= 7.5){
            System.out.println("Es acreedor a una beca de $1,000.00 MXN");
        }
        else if (promedio >= 6){
            System.out.println("Es acreedor a una beca de $500.00 MXN");
        }
        else{
            System.out.println("Se te invita a estudiar más en el próximo ciclo escolar,"
                    + " para que seas acreedor a una beca.");
        }
    }
    
    public void becaMenores(float promedio){
        if (promedio >= 9 ){
            System.out.println("Es acreedor a una beca de $3,000.00 MXN");
        }
        else if (promedio >=8){
            System.out.println("Es acreedor a una beca de $2,000.00 MXN");
        }
        else if (promedio >= 6){
            System.out.println("Es acreedor a una beca de $100.00 MXN");
        }
        else{
            System.out.println("Se te invita a estudiar más en el próximo ciclo escolar,"
                    + " para que seas acreedor a una beca.");
        }
    }
    
    public void elegirBeca(int edad, float promedio){
        if (edad > 18) becaMayores(promedio);
        else becaMenores(promedio);
    }
    
    public static void main(String[] args) {
        System.out.println("*** Programa que asigna becas ***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngresa tu edad: ");
        int edad = n.nextInt();
        System.out.print("Ingresa tu promedio: ");
        float promedio = n.nextFloat();
        
        Propuesto007 obj = new Propuesto007();
        
        obj.elegirBeca(edad, promedio);
    }
}
