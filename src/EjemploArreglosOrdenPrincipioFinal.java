public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {

        int[] numeros = new int[10];

        int[] a = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        int aux = 0;

        for (int i = 0; i < numeros.length/2; i++) {
            //Llenamos el arreglo a con el i-ésimo por el principio y con el i-ésimo por el final con una variable auxiliar
            a[aux++] = numeros[i];
            a[aux++] = numeros[numeros.length - 1 - i];
            //Mostramos el i-ésimo por el principio y el i-ésimo por el final
            //System.out.print(numeros[i] + " "); //del 1 al 5
            //System.out.println(numeros[numeros.length - 1 - i]); //del 10 al 6
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print("numero " + a[i] + " con el valor de: ");
            System.out.println(a[++i]);

        }
    }
}
