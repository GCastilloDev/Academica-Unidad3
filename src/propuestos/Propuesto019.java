package propuestos;
import java.util.Scanner;
/**
 *
 * @author Gustavo
 */
public class Propuesto019 {
    /*
    Determinar qué tipo de vacuna (A, B o C) debe aplicar a una persona, 
    considerando que si es mayor de 70 años, sin importar el sexo, se le aplica
    la tipo C; si tiene entre 16 y 69 años, y es mujer, se le aplica la B, y si
    es hombre, la A; si es menor de 16 años, se le aplica la tipo A, sin
    importar el sexo. 
    */
    public char tipoVacuna(int edad, char sexo){
        char tipoVacuna = ' ';
        if (edad >= 70) tipoVacuna = 'C';
        else if (edad < 16) tipoVacuna = 'A';
        else if((edad >= 16 && edad <= 69) && sexo == 'm') tipoVacuna = 'B';
        else tipoVacuna = 'A';
        return tipoVacuna;
    }
    
    public boolean verificarSexo(char sexo){
        boolean verificacion = false;
        if (sexo == 'h' || sexo == 'm') verificacion = true;
        return verificacion;
    }
    
    public void imprimirTipoVacuna(int edad, char sexo){
        if (verificarSexo(sexo) == true){
            System.out.println("\nVacuna correspondiente tipo \"" +
                tipoVacuna(edad, sexo) + "\".");
        }
        else{
            System.out.println("\nSexo incorrecto.");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("***Programa que determina que vacuna aplicar***");
        
        Scanner n = new Scanner(System.in);
        
        System.out.print("\nIngresa la edad: ");
        int edad = n.nextInt();
        System.out.print("Ingresa el sexo \"M\" para mujer y \"H\" para hombre: ");
        char sexo = Character.toLowerCase(n.next().charAt(0));
        
        Propuesto019 obj = new Propuesto019();
        obj.imprimirTipoVacuna(edad, sexo);
    }
   
}
