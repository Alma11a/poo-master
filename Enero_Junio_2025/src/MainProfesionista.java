public class MainProfesionista {
    public static void main(String[] args) {
        Profesionista p1=new Profesionista();
        p1.setProfesion("Ingenieria Industrial");
        p1.setUniversidad("Tecnologico de Veracruz");
        p1.setCedula(20895615);
        System.out.println(p1);

        Profesionista p2=new Profesionista();
        p2.setProfesion("Medico Cirujano");
        p2.setUniversidad("Universad de Veracuz");
        p2.setCedula(89651233);
        System.out.println(p2);


    }
}
