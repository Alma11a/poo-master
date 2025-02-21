public class Profesionista {
    private String profesion;
    private String universidad;
    private int cedula;

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Profesionista{" +
                "profesion='" + profesion + '\'' +
                ", universidad='" + universidad + '\'' +
                ", cedula=" + cedula +
                '}';
    }
}
