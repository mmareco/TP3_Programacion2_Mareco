package tda.pila;

import java.util.Scanner;
import java.util.Stack;

public class InvertirCadena {
    public static String invertir(String texto) {
        Stack<Character> pila = new Stack<>();

        for (char c : texto.toCharArray()) {
            pila.push(c);
        }

        StringBuilder resultado = new StringBuilder();
        while (!pila.isEmpty()) {
            resultado.append(pila.pop());
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String entrada = sc.nextLine();
        System.out.println("Invertida: " + invertir(entrada));
    }
}

