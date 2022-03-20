import java.util.Random;

public class EjemploArreglosPracticaDos {
    public static void main(String[] args) {
        String[] colores = {"Blue","Amarillo"};
        Random randomObj = new Random();
        double random1 = randomObj.nextInt(colores.length);
        random1 = Math.floor(random1);
        System.out.println("random1 = " + random1);
        System.out.println("colores[(int)random1] = " + colores[(int)random1]);
        double random2 = randomObj.nextInt(colores.length);
        random2 = Math.floor(random2);
        System.out.println("random2 = " + random2);
        System.out.println("colores[(int)random2] = " + colores[(int)random2]);
        double random3 = randomObj.nextInt(colores.length);
        random3 = Math.floor(random3);
        System.out.println("random3 = " + random3);
        System.out.println("colores[(int)random3] = " + colores[(int)random3]);

        if(random1 == random2 && random2 == random3){
            System.out.println("Los tres colores son iguales = " + "color 1: "+ colores[(int)random1] +
                    " color 2: "+ colores[(int)random2] +" color 3: "+colores[(int)random3]);
        }else{
            System.out.println("No coinciden ninguno de los tres colores :C");
        }
    }
}
