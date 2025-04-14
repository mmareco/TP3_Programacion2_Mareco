package tda.pila;

public class PilaLista {
    private Nodo tope;

    public PilaLista() {
        tope = null;
    }

    //agregar al tope
    public void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    // sacar del tope
    public int pop() {
        if (isEmpty()) {
            System.out.println("Pila vacía");
            return -1;
        }
        int valor = tope.dato;
        tope = tope.siguiente;
        return valor;
    }

    // ver el tope sin sacar
    public int peek() {
        if (isEmpty()) {
            System.out.println("Pila vacía");
            return -1;
        }
        return tope.dato;
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public void vaciar() {
        tope = null;
    }

    public int size() {
        int contador = 0;
        Nodo actual = tope;
        while (actual != null) {
            contador++;
            actual = actual.siguiente;
        }
        return contador;
    }
}
