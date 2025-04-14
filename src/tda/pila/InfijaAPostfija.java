package tda.pila;

import java.util.Stack;

public class InfijaAPostfija {
    public static int precedencia(char op) {
        switch (op) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
        }
        return -1;
    }

    public static String convertir(String expresion) {
        Stack<Character> pila = new Stack<>();
        StringBuilder resultado = new StringBuilder();

        for (char c : expresion.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                resultado.append(c);
            } else if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                while (!pila.isEmpty() && pila.peek() != '(') {
                    resultado.append(pila.pop());
                }
                pila.pop(); // saca el '('
            } else { // operador
                while (!pila.isEmpty() && precedencia(c) <= precedencia(pila.peek())) {
                    resultado.append(pila.pop());
                }
                pila.push(c);
            }
        }

        while (!pila.isEmpty()) {
            resultado.append(pila.pop());
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        String expresion = "A+(B*C)";
        System.out.println("Postfija: " + convertir(expresion));
    }
}

