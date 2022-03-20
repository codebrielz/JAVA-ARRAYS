import java.util.Scanner;

public class EjemploArreglosParesEImpares {
    public static void main(String[] args) {
        int[] a, pares, impares;
        a = new int[10];
        int totalPares = 0;
        int totalImpares = 0;
        Scanner salida = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = salida.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0){
                totalPares++;
            }else if(a[i] % 2 == 1){
                totalImpares++;
            }
        }
        pares = new int[totalPares];
        impares = new int[totalImpares];

        int contadorPares = 0;
        int contadorImpares = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                    pares[contadorPares++] = a[i];
            }else if(a[i]%2==1){
                    impares[contadorImpares++] = a[i];
            }
        }
        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++) {
                System.out.print(" " + pares[i] + " ");
        }

        System.out.println("\r\nimpares");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(" " + impares[i] + " ");
        }
    }
}
