package JAVA.ejercicio2;

public class COrdenador {

String Marca;
String Procesador;
String Pantalla;
boolean OrdenadorEncendido;
boolean Presentación;

void EncenderOrdenador()
{
if (OrdenadorEncendido == true) // si está encendido...
System.out.println("El ordenador ya está encendido.");
else // si no está encendido, encenderlo.
{
OrdenadorEncendido = true;
System.out.println("El ordenador se ha encendido.");
}
}

void Estado()
{
System.out.println("\nEstado del ordenador:" +
"\nMarca " + Marca +
"\nProcesador " + Procesador +
"\nPantalla " + Pantalla + "\n");
if (OrdenadorEncendido == true) // si el ordenador está encendido...
System.out.println("El ordenador está encendido.");
else // si no está encendido...
System.out.println("El ordenador está apagado.");
}


void ApagarOrdenador(){
if (OrdenadorEncendido == false) // si está apagado...
System.out.println("El ordenador ya está apagado.");
else // si no está apagado, apagarlo.
{
OrdenadorEncendido = false;
System.out.println("El ordenador se ha apagado.");
}
}}