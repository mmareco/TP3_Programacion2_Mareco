package tda.pila;
import java.util.Stack;

public class VerificarParentesis {
    public static boolean estaBalanceado(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (char c : expresion.toCharArray()) {
            if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                if (pila.isEmpty()) {
                    return false;
                }
                pila.pop();
            }
        }

        return pila.isEmpty(); // si esta vacía esta balanceado
    }

    public static void main(String[] args) {
        String ejemplo = "(a+b)*(c-d)";
        System.out.println("¿Está balanceado? " + estaBalanceado(ejemplo));
    }
}
