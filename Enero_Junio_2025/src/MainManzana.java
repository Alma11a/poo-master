public class MainManzana {
    public static void main(String[] args) {
        Manzana m1=new Manzana();
        m1.setColor("Rojo");
        m1.setCantidad(2);
        m1.setPeso(500);
        System.out.println(m1);

        Manzana m2=new Manzana();
        m2.setColor("Amarillo");
        m2.setCantidad(3);
        m2.setPeso(750);
        System.out.println(m2);
    }
}
