public class celular {
    //atributos
    private String marca;
    private String modelo;
    private double precio;

    //Metodos constructores por defecto y sobrecargados
    public celular(String marca, String modelo, double precio) {

        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public celular() {
    }
    // Metodos de acceso

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Metodo toStrign

    public String toString() {
        return "celular{" +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void encender(){
        System.out.println(marca + " HELLO ");
    }
    public void llamadaentrante(){
        System.out.println("Contacto... le esta llamndo");
    }
    public void mostrardatos(){
        System.out.println("Su telefono es el modelo: "+modelo);


    }
}

