public class DemoHerenciasConstructores {
    public static void main(String[] args) {
        Elefante dumbo=new Elefante("Elepahntidae","Mamifero","Asiatico",5000);
        System.out.println(dumbo);

        //Animal animal=new Animal("Canis Lupus","Mamifero");  -no se puede hacer porque animal es una clase abstracta
        //System.out.println(animal);
    }
}

abstract class Animal{
    private String especie;
    private String tipo_nacimiento;

    public Animal(){}

    public Animal(String especie, String tipo_nacimiento) {
        this.especie = especie;
        this.tipo_nacimiento = tipo_nacimiento;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTipo_nacimiento() {
        return tipo_nacimiento;
    }

    public void setTipo_nacimiento(String tipo_nacimiento) {
        this.tipo_nacimiento = tipo_nacimiento;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "especie='" + especie + '\'' +
                ", tipo_nacimiento='" + tipo_nacimiento + '\'' +
                '}';
    }
}

class Elefante extends Animal{
    private String raza;
    private double peso;

    public Elefante (){}

    //super: hacer referencia de los miembros de la super clase(clase padre)
    //this:hacer referencia a los miembros locales(atributos y metodos)

    public Elefante(String especie, String tipo_nacimiento, String raza, double peso) {
        super(especie, tipo_nacimiento);
        this.raza= raza;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Elefante{" +
                "especie=" + super.getEspecie() + '\'' +
                ", tipo=" + super.getTipo_nacimiento() + '\'' +
                ", peso=" + peso +
                ", raza='" + raza + '\'' +
                '}';
    }
}