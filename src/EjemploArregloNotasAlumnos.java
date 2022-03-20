import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {
        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumaNotasMatematicas=0, sumaNotasHistoria=0,sumaNotasLenguaje=0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner salida = new Scanner(System.in);
        System.out.println("Ingrese 7 notas para matematicas: ");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = salida.nextDouble();
        }

        System.out.println("Ingrese 7 notas para historia: ");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = salida.nextDouble();
        }

        System.out.println("Ingrese 7 notas para lenguaje: ");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = salida.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            sumaNotasMatematicas += claseMatematicas[i];
            sumaNotasHistoria += claseHistoria[i];
            sumaNotasLenguaje += claseLenguaje[i];
        }

        double promedioMatematicas = (sumaNotasMatematicas / claseMatematicas.length);
        double promedioHistoria = (sumaNotasHistoria / claseHistoria.length);
        double promedioLenguaje = (sumaNotasLenguaje / claseLenguaje.length);
        System.out.println("Promedio clase matematicas: " + promedioMatematicas);
        System.out.println("Promedio clase historia: " + promedioHistoria);
        System.out.println("Promedio clase lenguaje: " + promedioLenguaje);
        System.out.println("Promedio total del curso: " + (promedioMatematicas + promedioHistoria + promedioLenguaje)/3);

        System.out.println("Ingrese el identificador del alumno (de 0 a 6): ");
        int id = salida.nextInt();
        double promedioAlumno = (claseHistoria[id] + claseLenguaje[id] + claseMatematicas[id]);
        System.out.println("Promedio alumno Nro " + id + ": " + promedioAlumno);
    }
}
