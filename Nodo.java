class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

class ListaEnlazada {
    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    public void inicializar() {
        this.cabeza = null;
    }

    public void insertar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo nodoActual = cabeza;
            while (nodoActual.siguiente != null) {
                nodoActual = nodoActual.siguiente;
            }
            nodoActual.siguiente = nuevoNodo;
        }
    }

    public void eliminar(int dato) {
        Nodo nodoActual = cabeza;
        Nodo nodoAnterior = null;

        while (nodoActual != null && nodoActual.dato != dato) {
            nodoAnterior = nodoActual;
            nodoActual = nodoActual.siguiente;
        }

        if (nodoActual == null) {
            return; // El dato no se encontró
        }

        if (nodoAnterior == null) {
            cabeza = nodoActual.siguiente; // Eliminar la cabeza
        } else {
            nodoAnterior.siguiente = nodoActual.siguiente;
        }
    }

    public boolean buscar(int dato) {
        Nodo nodoActual = cabeza;
        while (nodoActual != null) {
            if (nodoActual.dato == dato) {
                return true;
            }
            nodoActual = nodoActual.siguiente;
        }
        return false;
    }

    public void recorrer() {
        Nodo nodoActual = cabeza;
        while (nodoActual != null) {
            System.out.print(nodoActual.dato + " -> ");
            nodoActual = nodoActual.siguiente;
        }
        System.out.println("null");
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    
}
