public class Boleta {
    String nombre;
    int num_control;
    int calculo;
    int programacion;
    int algebra;
    int probabilidad;
    int contabilidad;

    int calcula_promedio(){
        return ((calculo+programacion+algebra+probabilidad+contabilidad)/5);
    }
    String obtenerDatos(){
        String cad="";
        cad=cad+"Nombre:"+nombre+" ";
        cad=cad+"NUMERO DE CONTROL: "+num_control+" ";
        cad=cad+"CALCULO: "+ calculo+" ";
        cad=cad+"PROGRAMACION: "+programacion+" ";
        cad=cad+"ALGEBRA: "+algebra+" ";
        cad=cad+"PROBABILIDAD: "+probabilidad+" ";
        cad=cad+"CONTABILIDAD: "+contabilidad+" ";
        return cad;
    }
}
