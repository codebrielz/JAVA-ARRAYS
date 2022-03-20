public class EjemploArreglosCombinados {
    public static void main(String[] args) {
        int [] a,b,c;
        //Llenar el a y el b
        a = new int[12];
        b = new int[12];
        //y a partir de los elementos a y b poblar en el array c
        c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) * 5;
        }

        int aux = 0;

        /*for (int i = 0; i < c.length/2; i++) {
            c[aux++] = a[i];
            c[aux++] = b[i];
        }*/

        /*
        * Ahora vamos a guardar de dos en dos cada uno de los arreglos, por ejemplo, el arreglo c guardará 2 elementos del a y 2 elementos del b hasta llegar
        * a su alcance, puede copiar 2 o más elementos, pero tiene que el alcance de a y b tiene que ser multiplo de los elementos que queremos guardar.
        * por ejemplo si copiamos 3 elementos de a y de b por cada iteración, estos deben tener un alcance multiplo de 3 (por ejemplo un alcance de
        * 3 elementos o de 6 elementos o 9 ......)
        * */
        for (int i = 0; i < c.length/2; i+=3) { //Indicamos cuanto vale i por cada bucle (dependiendo de cuantos elementos queremos guardar por cada iteracion)
            for (int j = 0; j < 3; j++) {
                c[aux++] = a[i+j];
            }
            for (int j = 0; j < 3; j++) {
                c[aux++] = b[i + j];
            }
        }


        for (int i = 0; i < c.length; i++) {
            //System.out.println(c[i] + " = " + c[++i]);
            System.out.println(i + ": " + c[i]);
        }
    }
}
