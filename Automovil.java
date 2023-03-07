
   public class Automovil {
      //Atributos
      private String marca;
      private String subMarca;
      private byte modelo;
      private Color color;

      //Metodos de acceso
      public String getmarca() {
         return marca;
      }

      public void setmarca(String marca) {
         marca = _marca;
      }

      public String getsubMarca() {
         return submarca;
      }

      public void setsubMarca(String subMarca) {
         subMarca = _subMarca;
      }

      public byte getmodelo() {
         return modelo;
      }

      public void setmodelo(byte modelo) {
         modelo = _modelo;
      }

      public Color getColor() {
         return color;
      }

      public void setColor(Color color) {
         color = _color;
      }

      //Metodos constructores por defecto y sobrecargados
      public Automovil(String marca, String submarca, byte modelo, Color color) {
         marca = _marca;
         subMarca = _subMarca;
         modelo = _modelo;
         color = _color;
      }

      public Automovil() {
      }

      // Metodo toString
      public String toString() {
         return "Automovil{" +
                 "marca='" + marca + '\'' +
                 ", submarca='" + submarca + '\'' +
                 ", modelo=" + modelo +
                 ", color=" + color +
                 '}';
      }

      public void acelerar(){
         System.out.println(submarca+" acelerando");
      }
      public void frenar(){
         System.out.println("frenando");
      }
      public void apagar(){
         System.out.println("apagando " + submarca);
      }
   }

}
