package tda.pila;

public class PilaEstatica implements PilaTDA{

    private int[] pila;
    private int tope;
    private int capacidad;

    public PilaEstatica(int capacidad) {
        this.capacidad = capacidad;
        this.pila = new int[capacidad];
        this.tope = -1;
    }

    @Override
    public void push(int dato) {
        if (tope == capacidad - 1) {
            System.out.println("La pila está llena");
            return;
        }
        pila[++tope] = dato;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return -1;
        }
        return pila[tope--];
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return -1;
        }
        return pila[tope];
    }

    @Override
    public boolean isEmpty() {
        return tope == -1;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void vaciar() {
        tope = -1;
    }
}
