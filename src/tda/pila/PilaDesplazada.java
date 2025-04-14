package tda.pila;

public class PilaDesplazada {
    private int[] pila;
    private int tope;

    public PilaDesplazada(int capacidad) {
        pila = new int[capacidad];
        tope = 0;
    }

    // desplazar a la derecha
    public void push(int dato) {
        if (tope == pila.length) {
            System.out.println("Pila llena");
            return;
        }
        for (int i = tope; i > 0; i--) {
            pila[i] = pila[i - 1];
        }
        pila[0] = dato;
        tope++;
    }

    // desplazar a la izquierda
    public int pop() {
        if (isEmpty()) {
            System.out.println("Pila vacía");
            return -1;
        }
        int valor = pila[0];
        for (int i = 0; i < tope - 1; i++) {
            pila[i] = pila[i + 1];
        }
        tope--;
        return valor;
    }

    public boolean isEmpty() {
        return tope == 0;
    }

    public int size() {
        return tope;
    }
}

