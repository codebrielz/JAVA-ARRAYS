import java.util.Scanner;

public class EjemploArreglosNumeroMayor {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner salida = new Scanner(System.in);
        System.out.println("Ingrese 5 números: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            a[i] = salida.nextInt();
        }

        int max = 0;
        //Algoritmo para obtener el número mayor
        for (int i = 1; i < a.length; i++) {
            max = (a[max] > a[i]) ? max : i;
        }
        System.out.println("El número mayor entre los 5 números indicados es = " + a[max]);

    }
}
