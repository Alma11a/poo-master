import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DemoExcepcionVerificada {
    public static void main(String[] args) {
        try {
            FileInputStream f=new FileInputStream("Hola.txt");
        }catch (FileNotFoundException objetoExcepcion){
            System.out.println("Ha ocurrido el siguiente error: "+objetoExcepcion.getMessage());
        }
    }
}
