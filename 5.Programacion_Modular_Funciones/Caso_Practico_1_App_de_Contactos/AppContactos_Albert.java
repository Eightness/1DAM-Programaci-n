import java.util.Scanner;

public class AppContactos_Albert {
    
    //Variables
    public static int contactosMAX = 100;                               //Número máximo de contactos
    public static int numContactos = 0;                                 //Número de contactos añadidos
    public static String[] contactos = new String[contactosMAX];        //Matriz de los contactos
    public static String[] nombres = new String[contactosMAX];          //Vector de los nombres
    public static String[] telefonos = new String[contactosMAX];        //Vector de los teléfonos
    public static String[] correos = new String[contactosMAX];          //Vector de los correos

    //Método para mostrar el menú
    public static void menu () {
        System.out.println();
        System.out.println("1. Ver contactos.");
        System.out.println("2. Agregar contactos.");
        System.out.println("3. Eliminar contactos.");
        System.out.println("4. Buscar por nombre.");
        System.out.println("5. Buscar por teléfono.");
        System.out.println("6. Buscar por correo.");
        System.out.println("7. Búsqueda global.");
        System.out.println("8. Salir.");
        System.out.println();
    }

    //Método para elegir opción
    public static int eleccion () {
        //Scanner
        Scanner input = new Scanner(System.in);

        //Preguntamos por la elección
        System.out.print("Elige opción: ");
        int eleccion = input.nextInt();

        return eleccion;
    }

    //Método para obtener datos
    public static String pedirDato () {
        //Scanner
        Scanner input = new Scanner(System.in);

        //Obtenemos el dato
        String dato = input.nextLine();
        
        return dato;
    }

    //Método para trabajar con la opción seleccionada
    public static void opcion (int eleccion) {

        //Switch para cada opción
        switch (eleccion) {

            //Ver contactos
            case 1:
            verContactos();
            break;

            //Agregar contactos
            case 2:
            agregarContacto();
            break;

            //Eliminar contactos
            case 3:
            eliminarContacto(eleccion);
            break;

            //Buscar por nombre
            case 4:
            buscarEspecifico(null, null);
            break;

            //Buscar por teléfono
            case 5:
            buscarEspecifico(null, null);
            break;

            //Buscar por correo
            case 6:
            buscarEspecifico(null, null);
            break;

            //Búsqueda global
            case 7:
            buscarGlobal(null, null);
            break;

            //Salir
            case 8:
            salir();
            break;
        }
    }

    //Método 1 Ver Contactos
    public static void verContactos (String[] contactos) {
        //Condicional para comprobar si hay algún contacto
        if (contactos[0] != null) {
            for (int i = 0; i < contactos.length; i++) {
                System.out.println(i + ". " + contactos[i]);
                System.out.println();
            }
        } else {
            System.out.println("No hay ningún contacto.");
        }

    }

    //Método 2 Agregar Contacto
    public static void agregarContacto (String[] contactos, String[] nombres, String[] telefonos, String[] correos, int numContactos) {
        System.out.print("Introduce nombre: ");
        nombres[numContactos] = "Nombre: " + pedirDato();

        System.out.print("Introduce teléfono: ");
        telefonos[numContactos] = "Telf: " + pedirDato();

        System.out.print("Introduce correos: ");
        correos[numContactos] = "Mail: " + pedirDato();

        contactos[numContactos] = nombres[numContactos] + "\t" + telefonos[numContactos] + "\t" + correos[numContactos];
    }

    //Método 3 Eliminar Contacto
    public static void eliminarContacto (int pos) {

    }

    //Método 4 Buscar por nombre 
    public static String buscarEspecifico (String[] array, String busqueda) {
        return resultado;
    }

    //Método 7 Búsqueda Global
    public static String buscarGlobal (String[] array, String busqueda) {
        return resultado;
    }

    //Método 8 Salir
    public static void salir () {
        System.exit(0);
    }

    //MAIN
    public static void main(String[] args) {

        menu();
        opcion(eleccion());
        
    }
}
