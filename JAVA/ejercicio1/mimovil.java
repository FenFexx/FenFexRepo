package JAVA.ejercicio1;
import java.util.Scanner;
public class mimovil {
    public static movil movil = new movil();
    public static Scanner  lector = new Scanner(System.in);
    public static void main(String[] args) {
        for(int i=1; i<3;i++){
            System.out.println("---- MOVIL " + i + "----");
            System.out.println("Que marca es tu movil?");
            movil.marca= lector.nextLine();
            lector.nextLine();
            System.out.println("Que modelo es tu movil?");
            movil.modelo = lector.nextLine();
            System.out.println("Cuánto almacenamiento tiene?");
            movil.almacenamiento = lector.nextInt();
            movil.marca();
            movil.resultado();
        }
    }
}
