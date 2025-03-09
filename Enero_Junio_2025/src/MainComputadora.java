public class MainComputadora {
    public static void main(String[] args) {
        Computadora c1=new Computadora();
        c1.setMarca("Lenovo");
        c1.setMemoria("16GB");
        c1.setProcesador("Intel Core i9-14900KS");
        System.out.println(c1);

        Computadora c2=new Computadora();
        c2.setMarca("Acer");
        c2.setMemoria("8GB");
        c2.setProcesador("AMD Ryzen");
        System.out.println(c2);
    }
}
