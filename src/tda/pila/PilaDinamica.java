package tda.pila;

public class PilaDinamica implements PilaTDA{

    private class Nodo {
        int dato;
        Nodo siguiente;

        Nodo(int dato) {
            this.dato = dato;
        }
    }

    private Nodo tope;

    @Override
    public void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return -1;
        }
        int valor = tope.dato;
        tope = tope.siguiente;
        return valor;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return -1;
        }
        return tope.dato;
    }

    @Override
    public boolean isEmpty() {
        return tope == null;    }

    @Override
    public int size() {
        int contador = 0;
        Nodo actual = tope;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;    }

    @Override
    public void vaciar() {
        tope = null;
    }
}
