public class Boleto {
    private String tipo;
    private int precio;
    private String fecha;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Boleto{" +
                "tipo='" + tipo + '\'' +
                ", precio=" + precio +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
