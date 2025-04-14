package tda.pila;
import java.util.Scanner;
import java.util.Stack;

public class DeshacerRehacer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> pilaDeshacer = new Stack<>();
        Stack<String> pilaRehacer = new Stack<>();
        StringBuilder documento = new StringBuilder();

        int opcion;
        do {
            System.out.println("\nDocumento actual: " + documento);
            System.out.println("1. Escribir texto");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Salir");
            System.out.print("Elegí una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingresá texto para escribir: ");
                    String texto = scanner.nextLine();
                    hacer(texto, pilaDeshacer, pilaRehacer, documento);
                    break;

                case 2:
                    deshacer(pilaDeshacer, pilaRehacer, documento);
                    break;

                case 3:
                    rehacer(pilaDeshacer, pilaRehacer, documento);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        scanner.close();
    }

    public static void hacer(String texto, Stack<String> deshacer, Stack<String> rehacer, StringBuilder documento) {
        documento.append(texto);
        deshacer.push(texto);
        rehacer.clear(); // Si se hace algo nuevo, se pierde lo que se podía rehacer
        System.out.println("Texto agregado: " + texto);
    }

    public static void deshacer(Stack<String> deshacer, Stack<String> rehacer, StringBuilder documento) {
        if (!deshacer.isEmpty()) {
            String texto = deshacer.pop();
            documento.delete(documento.length() - texto.length(), documento.length());
            rehacer.push(texto);
            System.out.println("Se deshizo: " + texto);
        } else {
            System.out.println("No hay nada para deshacer.");
        }
    }

    public static void rehacer(Stack<String> deshacer, Stack<String> rehacer, StringBuilder documento) {
        if (!rehacer.isEmpty()) {
            String texto = rehacer.pop();
            documento.append(texto);
            deshacer.push(texto);
            System.out.println("Se rehizo: " + texto);
        } else {
            System.out.println("No hay nada para rehacer.");
        }
    }
}

