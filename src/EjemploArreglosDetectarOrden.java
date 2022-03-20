import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {
        int[] a = new int[7];

        Scanner salida = new Scanner(System.in);
        System.out.println("Ingrese 7 números");
        for (int i = 0; i < a.length; i++) {
            a[i] = salida.nextInt();
        }

        boolean ascendente = false;
        boolean descendente = false;
        for (int i = 0; i < a.length - 1 ; i++) {
            if(a[i] > a[i+1]){
                descendente = true;
            }
            if(a[i] < a[i+1]){
                ascendente = true;
            }
        }

        if(ascendente == true && descendente == true){
            System.out.println("Arreglo con todos los elementos desordenados");
        }
        if(ascendente == false && descendente == false){
            System.out.println("Arreglo con todos los elementos iguales");
        }
        if(ascendente == true && descendente == false){
            System.out.println("Arreglo con los elementos ascendentes");
        }
        if(ascendente == false && descendente == true){
            System.out.println("Arreglo con los elementos descendentes");
        }

    }
}
