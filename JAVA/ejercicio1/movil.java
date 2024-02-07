package JAVA.ejercicio1;

public class movil {
    String marca;
    String modelo;
    int almacenamiento;

    void marca(){
        System.out.println("La marca de su movil es: " + marca);
        System.out.println("El modelo del moil es: "  + modelo);
    }
    void resultado(){
        if(almacenamiento <= 128){
            System.out.println("Su movil no tiene suficiente espacio");
        }else System.out.println("Es lo suficientemente bueno");
    }
}
