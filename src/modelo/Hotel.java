package modelo;

public class Hotel {
    private String codigo;  // ---> PK
    private String nombre;
    private String ciudad;
    private int estrellas;
    private boolean mascotas;

    // Constructor
    public Hotel(String codigo, String nombre, String ciudad, int estrellas, boolean mascotas) {
        this.codigo = "";
        this.nombre = "";
        this.ciudad = "";
        this.estrellas = 0;
        this.mascotas = false;
    }

    public Hotel() {
        }

    // Getter and setter
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }
    
    public boolean isMascotas() {
        return mascotas;
    }

    public void setMascotas(boolean mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public String toString() {
        return "Hotel{" + "codigo=" + codigo + ", nombre=" + nombre + ", ciudad=" + ciudad + ", estrellas=" + estrellas + ", mascotas=" + mascotas + '}';
    }

    
}
