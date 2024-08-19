public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);

        System.out.println("Elementos en la lista:");
        lista.recorrer();

        System.out.println("¿La lista está vacía? " + lista.estaVacia());
        lista.eliminar(20);
        System.out.println("Elementos después de eliminar 20:");
        lista.recorrer();
    }
}
