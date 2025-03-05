public class MainPersona {
    public static void main(String[] args) {
        Persona p1=new Persona("Juan");
        Persona p2=new Persona("Ana");
        Persona p3=new Persona("Maria");

        p1.tomarManoIzquierda(p2);
        p1.tomarManoDerecha(p3);

        p1.mostrarUnion();
        p2.mostrarUnion();
        p3.mostrarUnion();
    }
}
