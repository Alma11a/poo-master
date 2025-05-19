import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
Crear un programa orientado  objetos para guardar en un archivo
(usando object i/o stream) objetos alumnos
 */
public class Demo_Alumno_Storage {
    public static void main(String[] args) {
        Alumno[] alumnos=new Alumno[3];
        alumnos[0]=new Alumno("Alma","24030257");
        alumnos[1]=new Alumno("Maria","524495963");
        alumnos[2]=new Alumno("Sofia","6489595649");


        try{
            ObjectOutputStream archivoAlumnos=new ObjectOutputStream(new FileOutputStream("archivoAlumnos"));
            archivoAlumnos.writeObject(alumnos);
            archivoAlumnos.close();

            ObjectInputStream recuperando_archAlumnos=new ObjectInputStream(new FileInputStream());
            Alumno[] alumno_recuperado=(Alumno[]) recuperando_archAlumnos.readObject();
            recuperando_archAlumnos.close();
            for(Alumno a:alumno_recuperado){
                System.out.println(a);
            }

            }catch (Exception e){
            
        }
    }
}
