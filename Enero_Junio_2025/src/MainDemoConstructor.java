public class MainDemoConstructor {
    public static void main(String[] args) {
        //Aqui estamos invocando al constructor
        DemoConstructor obj=new DemoConstructor();
        System.out.println(obj.atributo1);
        obj.atributo1="Nuevo valor";
        System.out.println(obj.atributo1);

        DemoConstructor obj2=new DemoConstructor("Este es es mi valor");
        System.out.println(obj2.atributo1);

        //new Alumno("Rebeca",18,"E200534567","Segundo");

        DemoConstructor obj3=new DemoConstructor("Valor Stirng",20.5);
        //DemoConstructor (double, String)
    }
}
