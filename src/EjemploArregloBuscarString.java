import java.util.Scanner;

public class EjemploArregloBuscarString {
    public static void main(String[] args) {
        String[] a = new String[4];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese un nombre: ");
            a[i] = s.next();
        }
        System.out.println("\r\nIngrese un nombre que quieras buscar: ");
        String nombre = s.next();
        int i = 0;
        while (i < a.length && !a[i].equalsIgnoreCase(nombre)){

            i++;
        }
        if(i == a.length){
            System.out.println("NO encontró el número");
        }else if(a[i].toLowerCase().compareTo(nombre.toLowerCase()) == 0){
            System.out.println("Encontrado en la posicion: " + i);
        }
    }
}