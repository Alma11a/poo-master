public class Ejercicio_Interfaz {
    public static void main(String[] args) {
        Nodo nodo1=new Nodo("A",10);
        Nodo nodo2=new Nodo("B",50);

        nodo1.conectarDerecha(nodo2);
        System.out.println(nodo1);
    }
}
/*
Crear una interfaz llamada conectable con los metodos:
    -conectarDerecha
    -conectarIzquierda

Crear una clase concreta llamada Nodo que contenga los campos:
    -nombre
    -valor
Implementar en la clase Nodo la interfaz, de tal manera que un nodo en la izquierda
se conecte con el nodo a la derecha y automaticamente el nodo a su derecha se conecte
con el nodo izquierdo.De igual manera si el nodo a la derecha se conecta al de la
izquierda automaticamente el nodo izquierdo se concte al derecho
 */

interface Conectable{
    public void conectarDerecha(Nodo nodo);
    public void conectarIzquierda(Nodo nodo);
}

class Nodo implements Conectable{
    public String nombre;
    public int valor;
    public Nodo izquierda;
    public Nodo derecha;

    public Nodo(String nombre,int valor){
        this.nombre=nombre;
        this.valor=valor;
    }

    public Nodo getDerecha() {

        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public void conectarDerecha(Nodo nodo) {
        this.derecha=nodo;
        if (nodo.getIzquierda()!=this){
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
                "nombre=" + nombre + '\''+
                ", valor=" + valor +
                "derecha=" + (derecha !=null?derecha.nombre:null) +
                ", izquierda=" + (izquierda !=null?izquierda.nombre:null) +
                '}';
    }
}