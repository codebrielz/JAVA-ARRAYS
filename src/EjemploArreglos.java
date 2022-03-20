import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7];
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

        int count = productos.length;
        System.out.println("====Usando for====");
        for (int i = 0; i < count; i++) {
            System.out.println("Para indice " + i + ": " + productos[i]);
        }
        System.out.println("====Usando foreach====");
        for (String producto: productos) {
            System.out.println("producto = " + producto);
        }
        System.out.println("====Usando while====");
        int i = 0;
        while (i < count){
            System.out.println("producto = " + productos[i]);
            i++;
        }
        System.out.println("====Usando do while====");
        int j = 0;
        do {
            System.out.println("producto = " + productos[j]);
            j++;
        }while (j < count);



        int[] numeros = new int[4]; //reserva en memoria un espacio para 4 elementos comenzando en 0 (0,1,2,3)
        for (int k = 0; k < numeros.length; k++) {
            if(k % 2 == 0){
                numeros[k] = k ;
                System.out.println("numero par = " + numeros[k]);
            }else if(k % 2 == 1){
                numeros[k] = k * 3;
                System.out.println("numero impar = " + numeros[k]);
            }
        }
        Arrays.sort(numeros);
        System.out.println("Numeros ordenados");
        for (int k = 0; k < numeros.length; k++) {
            System.out.println("numero = " + numeros[k]);
        }

        /*
        try{
            numeros[0] = 10;
            numeros[1] = Integer.valueOf("2"); //<-- autoboxing
            numeros[2] = 39;
            numeros[3] = 8;
            //Forzar un nuevo elemento al arreglo en un espacio inexistente
            //numeros[4] = 5; <-- No se puede
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Se ha superado el limite de valores que se pueden guardar en este arreglo!");
            System.exit(-1);
        }

        //Tambien podemos ordenar numeros con Arrays.sort()
        Arrays.sort(numeros);

        for (int m = 0; m < numeros.length; m++) {
            System.out.println("numero " + (m + 1) + ": " + numeros[m]);
        }

        System.out.println("numeros[numeros.length - 1] = " + numeros[numeros.length - 1]);
        */
    }
}
