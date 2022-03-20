import java.util.Scanner;

public class EjemploArrPractica {
    public static void main(String[] args) {
        int[] a = new int[10];
        int posicion, elemento;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length - 1; i++) {
            a[i] = i+1;
        }

        System.out.println("Indique un número:");
        elemento = s.nextInt();
        System.out.println("Indique una posicion:");
        posicion = s.nextInt();

        for (int i = a.length -2; i >= posicion; i--) {
            a[i+1] = a[i];
        }

        a[posicion] = elemento;

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[i] = " + a[i]);
        }

    }
}
