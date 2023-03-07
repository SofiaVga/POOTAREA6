public class Monitor {
    //Atributos

    private String marca;
    private String modelo;
    private double pulgadas;


    //Metodos constructores por defecto y sobrecargados
    public Monitor(String marca, String modelo,double pulgadas) {
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
    }

    public Monitor() {
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

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }


    // Metodo toString
    @Override
    public String toString() {
        return "Monitor{" +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                "pulgadas=" + pulgadas +
                '}';
    }

    public void prender (){
        System.out.println(marca + " bienvenido");
    }
    public void cambiarcanal(){
        System.out.println("Ahora estas viendo");
    }
    public void volumen(){
        System.out.println("disminuyendo volumen../ aumentando volumen ");
    }
}

