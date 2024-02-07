package JAVA.ejercicio3;

public class persona {

    public void Persona(String[] empleos, int[] edades, String[] nombres, String[] generos, int cantidad) {
        System.out.print("\033[H\033[2J");  
        for (int i = 0; i < cantidad; i++) {
            System.out.println(nombres[i] + " tiene " + edades[i] + " se dedica a " + empleos[i] + " y es " +  generos[i] + "\n");
        }
    }
    void semanas(int [] edades){
        int contadorsem = 0;
        for (int i = 0; i < edades.length; i++) {
            int semanas = edades[i] * 52;
            contadorsem += semanas;
            System.out.println("La edad de " + edades[i] + " años son " + semanas + " semanas");
        }
    System.out.println("Las semanas totales de  son: " + contadorsem + " semanas");
    }
    void mayormenor(int [] edades){
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] < 18) {
                System.out.println("Es menor");
            }else{
                System.out.println("Es mayor");
            }
        }
    }
}
