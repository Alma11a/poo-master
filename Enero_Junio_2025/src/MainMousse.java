public class MainMousse {
    public static void main(String[] args) {

        //instanciamiento
        Mousse m1=new Mousse("Logitech",255.2);
        Mousse m2=new Mousse("Verde","Hp");
        Mousse m3=new Mousse(163,"Negro");
        Mousse m4=new Mousse("hp",896);
        m1.setColor("Rosa");

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);


    }
}
