public class MainBoleto {
    public static void main(String[] args) {
        Boleto b1=new Boleto();
        b1.setTipo("Boleto de Cine");
        b1.setPrecio(75);
        b1.setFecha("25 de Febrero");
        System.out.println(b1);

        Boleto b2=new Boleto();
        b2.setTipo("Boleto de concierto");
        b2.setPrecio(1200);
        b2.setFecha("4 de Abril");
        System.out.println(b2);
    }
}
