public class DemoString {
    public static void main(String[] args) {
        String nombre=new String("Shakira");
        System.out.println(nombre.charAt(0));         //obtiene el caracter en una posicion especifica
        System.out.println(nombre.length());        //obtener la longitud de una cadena
        for(int i=0;i<nombre.length();i++){
            System.out.println(nombre.charAt(i));
        }

        System.out.println(nombre.toUpperCase());   //Convierte a mayusculas
        System.out.println(nombre.toLowerCase());   //convierte a minusculas
        System.out.println(nombre);     //las cadenas son inmutables, imprime el original

        nombre=nombre.toUpperCase();
        System.out.println(nombre);

        System.out.println(nombre.equals("SHAKIRA"));   //compara la cadena con otro valor

        //Crear una rutina para dada una frase, buscar si existe la palabra "Amor"

        String frase="Leo anda en busca del amor";
        String [] resultado=frase.split(" ");    //separa la cadena

        for(String s:resultado){
            System.out.println(s.trim());   //elimina los espacios adicionales
        }
    }
}
