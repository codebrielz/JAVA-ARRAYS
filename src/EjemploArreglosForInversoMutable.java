import java.util.*;

public class EjemploArreglosForInversoMutable {
    public static void arregloInverso(String[] arreglo){
        int count2 = arreglo.length;// cont2 = 7
        int count = arreglo.length;
        for (int i = 0; i < count2/2 ; i++){ // count2/2= 3.5 (redondeado a 3)
            String actual = arreglo[i]; //elemento 0 a la variable actual
            String inverso = arreglo[count - 1 - i]; //count (7) - 1 = 6 - i (primer bucle comienza en 0); = a la ultima posicion del arreglo
            arreglo[i] = inverso; //arreglo[0] = al ultimo elemento del arreglo (6),(siguiente bucle) arreglo[1] = al penultimo (5)... hasta la pos 6 y el elemento 0
            arreglo[count - 1 - i] = actual; //Comenzando desde el ultimo elemento le añadimos el elemento actual
            //es decir, arreglo[6] = actual(arreglo[0]), arreglo[5] = arreglo[1]...
            count2--;
        }

    }
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

        Arrays.sort(productos);
        arregloInverso(productos);

        //Tambien podemos hacer con la API de collections de JAVA.UTIL
        //Collections.reverse(Arrays.asList(productos)); //<-- reverse requiere de un tipo LIST de JAVA, con Arrays.asList(productos) convertimos
        // el arreglo de tipo String productos a una list de tipo String

        System.out.println("====Usando for====");
        for (int i = 0; i < count; i++) {
            System.out.println("Para indice " + i + ": " + productos[i]);
        }
    }
}
