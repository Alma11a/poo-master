public class Ejercicio_Interfaz {
    /*
    Crear una interfaz llamada conectable con los metodos:
        -conectarDerecha
        -conectarIzquierda

    Crear una clase concreta llamada Nodo que contenga los campos:
        -nombre
        -valor
    Implementar en la clase Nodo la interfaz, de tal manera que se un nodo
    en la izquierda se conecte con el nodo a la derecha y automaticamente el
    nodo a su derecha se conecte con el nodo izquierdo.
    De igual manera si el nodo a la derecha se conecta al de la izquierda
    automaticamente el nodo izquierdose conecta al nodo derecho.
    */

    public static void main(String[] args) {
        Nodo nodo1=new Nodo("A",10);
        Nodo nodo2=new Nodo("B",50);

        nodo1.conectarDerecha(nodo2);
        System.out.println(nodo1);
    }
}

interface Conectable{
    void conectarDerecha(Nodo nodo);
    void conectarIzquierda(Nodo nodo);
}

class Nodo implements Conectable{
    private String nombre;
    private int valor;
    private Nodo izquierda;
    private Nodo derecha;

    public Nodo(String nombre,int valor){
        this.nombre= nombre;
        this.valor=valor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    @Override
    public void conectarDerecha(Nodo nodo) {
        this.derecha=nodo;
        if(nodo.getIzquierda()!=this){
            nodo.conectarIzquierda(this);
        }

    }

    @Override
    public void conectarIzquierda(Nodo nodo) {
        this.izquierda=nodo;
        if(nodo.getDerecha()!=this){
            nodo.conectarDerecha(this);
        }
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "nombre='" + nombre + '\'' +
                ", valor=" + valor +
                ", izquierda=" + (izquierda != null ? izquierda.nombre : "null") +
                ", derecha=" + (derecha != null ? derecha.nombre : "null") +
                '}';
    }
}