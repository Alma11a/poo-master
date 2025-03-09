public class Mousse {
    private String marca;                   //atributos
    private double precio;
    private String color;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
//constructores:
    public Mousse(String marca) {
        this.marca = marca;
    }

    public Mousse(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public Mousse(double precio, String color) {
        this.precio = precio;
        this.color = color;
    }

    public Mousse(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Mousse{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}
