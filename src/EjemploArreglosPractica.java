import java.util.Scanner;

public class EjemploArreglosPractica {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Indica el número de usuarios que desea registrar: ");
        int numeroDeRegistros = Integer.valueOf(consola.next());
        RegistrarUsuario(numeroDeRegistros);
    }

    public static void RegistrarUsuario(int numeroDeRegistros){
        Scanner consola = new Scanner(System.in);
        String[] registrarUsuario = new String[numeroDeRegistros];
        for (int i = 0; i < registrarUsuario.length; i++){
            System.out.print("Indica el nombre del usuario que quiere registrar en la aplicación: ");
            registrarUsuario[i] = consola.next();
        }
        imprimirRegistroUsuarios(registrarUsuario);
    }

    public static void imprimirRegistroUsuarios(String[] registroUsuarios){
        Scanner consola = new Scanner(System.in);
        for (String nombre: registroUsuarios) {
            System.out.println("Registro de usuario = " + nombre);
        }
        System.out.print("Visualizar el primer y último registro de la aplicacion? v[yes] f[no]");
        String respuestaUsuario = consola.next();
        if(respuestaUsuario.toLowerCase().equals("v")){
            System.out.println("Has seleccionado la opción de visualizar el primer y ultimo registro de la aplicación");
            System.out.println(registroUsuarios[0]);
            System.out.println(registroUsuarios[registroUsuarios.length - 1]);
        }else if(respuestaUsuario.toLowerCase().equals("f")){
            System.out.println("Has seleccionado la opción de no revisar el primer y ultimo registro de la aplicación");
            System.exit(-1);
        }
    }
}
