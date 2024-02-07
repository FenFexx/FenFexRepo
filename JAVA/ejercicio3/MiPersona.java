package JAVA.ejercicio3;
import java.util.Scanner;
public class MiPersona {
    public static Scanner lector = new Scanner(System.in);
    public static persona persona = new persona();
    
    public static String[] nombres(int cantidad){
        String [] nombres = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce el nombre de la persona " + (i+1));
            nombres[i] =  lector.nextLine();
        }
        return nombres;
       }
       public static String[] generos(int cantidad, String[] nombres){
        String [] generos = new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce el genero de " + nombres[i]);
            char genero =lector.next().charAt(0);
            if(genero == 'H') generos[i] = "Hombre";
            else if (genero == 'M') generos[i] = "Mujer";

        }
        return generos;
       }
       public static int[] edades(int cantidad, String[] nombres){
        int [] edades = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce la edad de " + nombres[i]);
            edades[i] = lector.nextInt();
        }
        return edades;
       }

       public static String[] empleos(int cantidad, String[] nombres){
        String [] empleos = new String[cantidad]; 
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce el empleo de " + nombres[i]);
            lector.nextLine();
            empleos[i] = lector.nextLine();
        }
        return empleos;
       }
       public static void main(String[] args)  {
       System.out.println("--------------");
       System.out.println("Programa de registro de usuarios:"); 
       System.out.println("--------------");
       System.out.println("¿Cuántas personas deseas registrar?");
       int cantidad = lector.nextInt();
       lector.nextLine();

        String [] nombres =nombres(cantidad);
        String [] generos =generos(cantidad, nombres);
        int [] edades = edades(cantidad, nombres);
        String [] empleos = empleos(cantidad, nombres);

    persona.Persona(empleos,edades,nombres,generos, cantidad);
    persona.semanas(edades);
    persona.mayormenor(edades);
    }
}
