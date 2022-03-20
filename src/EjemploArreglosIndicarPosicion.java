import java.util.Scanner;

public class EjemploArreglosIndicarPosicion {
    public static void main(String[] args) {

        //Cuando se trata de insertar un elemento nuevo a un espacio del arreglo, dicho espacio debe estár vacio. por eso cuando
        //iteramos el arreglo, añadimos 8 elementos en lugar de 9 elementos

        int[] numeros = new int[10];
        //Necesitamos el elemento y la posicion para poder realizar el cambio de posicion en el arreglo a la posicion que queramos
        int elemento, posicion;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < numeros.length-1; i++) {
            /* Forma para que inserte los números el usuario
            System.out.print("Ingrese el número: ");
            numeros[i] = s.nextInt();*/

            //Forma automatica para insertar números
            numeros[i] = i+1;
        }

        System.out.println("Nuevo elemento: ");
        elemento = s.nextInt();

        System.out.println("Posicion donde agregar el elemento (0 a 9)");
        posicion = s.nextInt();

        //numeros.length (length = 10 - 2 = 8); i mayor o igual a la posicion que indique el usuario (será la cantidad de veces
        // que itere nuestro for)
        for (int i = numeros.length -2 ; i >= posicion ; i--) {
            numeros[i+1] = numeros[i];
        }

        numeros[posicion] = elemento;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("indice " + i + " del número: " + numeros[i]);
        }
    }

}
