public class CalificacionBoleta {
    public static void main(String[]args){
        Boleta p1=new Boleta(); //instanciamiento

        p1.nombre="Alma Janeth Montufa Peralta";
        p1.num_control=24020357;
        p1.calculo=95;
        p1.programacion=80;
        p1.algebra=100;
        p1.probabilidad=75;
        p1.contabilidad=100;
        System.out.println(p1.obtenerDatos());
        System.out.println("PROMEDIO:"+p1.calcula_promedio());

        Boleta p2=new Boleta();

        p2.nombre="Sofia Gomez Lara";
        p2.num_control=24020596;
        p2.calculo=85;
        p2.programacion=100;
        p2.algebra=95;
        p2.probabilidad=85;
        p2.contabilidad=70;
        System.out.println(p2.obtenerDatos());
        System.out.println("PROMEDIO:"+p2.calcula_promedio());


        Boleta p3=new Boleta();

        p3.nombre="Juan Rios Morales";
        p3.num_control=24020359;
        p3.calculo=95;
        p3.algebra=70;
        p3.programacion=93;
        p3.probabilidad=85;
        p3.contabilidad=76;
        System.out.println(p3.obtenerDatos());
        System.out.println("PROMEDIO:"+p3.calcula_promedio());


    }
}
