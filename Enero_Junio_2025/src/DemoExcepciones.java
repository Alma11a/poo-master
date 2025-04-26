public class DemoExcepciones {
    public static void main(String[] args) {
        /*
        int a=10;
        int resultado=a/b;
        sout(resultado);

        String ruta="<Persona.java: ";
        FileInputStream f=new FileInputStream(ruta);
         */
        try {
            int arreglo[]=new int[10];
            arreglo[1]=20;
            int suma=10/0;
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Te pasaste de los limites del arreglo");
        }finally{
            System.out.println("Hasta luego");//se ejecuta siempre
        }

        PruebaExcepcion pe=new PruebaExcepcion();
        try{
            pe.creaArreglo();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Mi mensaje de excepcion");
        }

    }
}


class PruebaExcepcion{
    public void creaArreglo()throws IndexOutOfBoundsException{
        int arreglo[]=new int[10];
        arreglo[11]=30;
    }
}