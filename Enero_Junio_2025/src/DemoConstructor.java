/*vamos a agregar un constructor a nuestra clase
CONSTRUCTOR: Un metodo especial que es invocado
en el proceso de instanciamiento de la clase.
es publico, se llama igual que la clase y no tiene
tipo de retorno
 */

public class DemoConstructor {//Este es un constructor por default
    String atributo1;          //Aunque no lo veias existia
    double atributo2;

    public DemoConstructor(){
        System.out.println("Creando el objeto");
        atributo1="Valor del atributo 1";
    }

    public DemoConstructor(String valor){       //(String)
        atributo1=valor;
    }

    public DemoConstructor(String valor2, double valor1){   //(String double)
        atributo2=valor1;
        atributo1=valor2;
    }

    public DemoConstructor(double valor2, String valor1){    //(double String)
        atributo2=valor2;
        atributo1=valor1;
    }

    public DemoConstructor(double valor1){      //(double)
        atributo2=valor1;
    }
}
