import java.util.ArrayList;
import java.util.List;

public class Ejercicio_Asistencia {

}

class Asistencia{
    private Alumno alumno;
    private boolean presente;

    public Asistencia(Alumno alumno,boolean presente){
        this.alumno=alumno;
        this.presente=presente;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public boolean isPresente() {
        return presente;
    }
}
class ListaAsistencia{
    private List<Alumno> alumnos;
    private List<Asistencia> asistencias;

    public ListaAsistencia(){
        this.alumnos=new ArrayList<>();
        this.asistencias=new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }

        }

