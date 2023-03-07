public class Main {
    public static void main(String[] args)

    //Clase Automovil
    Automovil automovil = new Automovil("FERRARI","ICONA",(byte)30, Color.RED);
        System.out.println(automovil);
        automovil.acelerar();
        automovil.frenar();
        automovil.apagar();
    //Clase Persona
    Persona persona = new Persona("Sofia",(byte)25, "FEMENINO ");
        System.out.println(persona);
        persona.mostrardatos();
        persona.cumpleanios();
        persona.mostragenero();

//Clase Monitor
Monitor monitor = new Monitor( "Sansui","led HD", 56);
        System.out.println(monitor);
        monitor.prender();
        monitor.cambiarcanal();
        monitor.volumen();

//Clase Celular
celular celular = new celular ("Apple", "Iphone 14 ProMax",23999);
System.out.println(celular);
celular.encender();
celular.llamadaentrante();
celular.mostrardatos();