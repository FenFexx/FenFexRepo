package JAVA.ejercicio2;

import java.util.Scanner;

public class CMiOrdenador {
    public static  Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        

COrdenador MiOrdenador = new COrdenador();
MiOrdenador.Marca = "Mitac";
MiOrdenador.Procesador = "Intel Pentium";
MiOrdenador.Pantalla = "TFT";
System.out.println("Su equipo se encuentra apagado, desea encenderlo?(S/N) ");
char respuesta = lector.next().charAt(0);
if (respuesta == 'S')MiOrdenador.EncenderOrdenador();
else if ((respuesta != 'S') || (respuesta != 'N')) System.out.println("Respuesta inválida");
else MiOrdenador.ApagarOrdenador();
    
}
}

