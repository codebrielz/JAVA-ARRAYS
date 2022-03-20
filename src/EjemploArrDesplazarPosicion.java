import java.util.Scanner;

public class EjemploArrDesplazarPosicion {
    public static void desplazarPosicion(int[] numeros){
        int ultimo;
        ultimo = numeros[numeros.length - 1];

        for (int i = numeros.length -2 ; i >= 0 ; i--) {
            numeros[i+1] = numeros[i];
        }

        numeros[0] = ultimo;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros = " + numeros[i]);
        }
    }
    public static void main(String[] args) {

        int[] numeros = new int[10];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número: ");
            numeros[i] = s.nextInt();
        }
        System.out.println();
        desplazarPosicion(numeros);
        System.out.println();
        desplazarPosicion(numeros);
        System.out.println();
        desplazarPosicion(numeros);

    }
}
