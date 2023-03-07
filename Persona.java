public class Persona {
    //Atributos
    private String nombre;
    private byte edad;
    private String genero;

    //Metodos constructores por defecto y  sobrecargados
    public Persona(String nombre, byte edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public Persona() {
    }

    //metodos de acceso
    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public double getedad() {
        return edad;
    }

    public void setedad(byte edad) {
        this.edad = edad;
    }



    public String getgenero() {
        return genero;
    }

    public void setgenero(String genero) {
        this.genero = genero;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                '}';
    }

    public void mostrarDatos(){
        System.out.println("su nombre es" +nombre);
        System.out.println("su edad es" +edad);
        System.out.println("su genero es" +genero);

    }
    public void cumpleanios(){
        edad++;
        System.out.println("Ahora usted tiene: " +edad);
    }
    public void mostrargenero(){
        System.out.println("su genero es" +genero);

    }
}

