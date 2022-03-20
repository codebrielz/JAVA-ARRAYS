import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {
        String[] productos = new String[7];
        int count = productos.length;
        
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        String prod1=productos[0],prod2=productos[1],prod3=productos[2],prod4=productos[3],prod5=productos[4],prod6=productos[5],prod7=productos[6];

        //La finalidad de esto es poder ordenar estos elementos del String[], es decir, realizar un sort (que ordene de
        // forma natural (de forma alfabetica)) los elementos del arreglo
        Arrays.sort(productos); //<-- Ordena los elementos del arreglo de forma alfabetica

        System.out.println("====Usando for====");
        for (int i = 0; i < count; i++) {
            System.out.println("Para indice " + i + ": " + productos[i]);
        }

        //Imprimiendo a la inversa los valores del arreglo
        System.out.println("====Usando for inverso====");
        for (int i = 0; i < count; i++) {
            System.out.println("para i = " + (count - 1 - i) + " valor: " + productos[count-1-i]); //count(7) - 1 = 6 - i(primer bucle es 0, despues 1,2...) = 6 (primer bucle
            // ), 5 (segundo bucle...)...
        }

        //otra forma de hacer un for inverso
        System.out.println("====Usando for inverso2====");
        for (int i = count -1; i >= 0 ; i--) {
            System.out.println("para i = " + i + " valor " + productos[i]);
        }

        //modificar el arreglo a la inversa
    }
}
