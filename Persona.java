public class Persona {
    private String nombre;
    private Persona izquierda;
    private Persona derecha;

    public Persona(String nombre){
        this.nombre=nombre;
        this.izquierda=null;
        this.derecha=null;
    }

    public String getNombre() {
        return nombre;
    }

    public void tomarManoIzquierda(Persona persona){
        this.izquierda=persona;
        persona.derecha=this;
    }
    public void tomarManoDerecha(Persona persona){
        this.derecha=persona;
        persona.izquierda=this;
    }

    public void mostrarUnion(){
        String izq;
        if(izquierda!=null){
            izq=izquierda.getNombre();
        }else{
            izq="nadie";
        }

        String der;
        if(derecha!=null){
            der=derecha.getNombre();
        }else{
            der="nadie";
        }

        System.out.println(nombre+" esta agarrado a "+izq+" a su izquierda y con "+der+" a su derecha");
    }
}
